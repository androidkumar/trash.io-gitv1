package com.example.myapplicationreceiptify1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;



public class SignUpGoogle extends AppCompatActivity {

    private GoogleSignInClient mGoogleSignInClient;
    private final static int RC_SIGN_IN = 10;
    private FirebaseAuth fAuth;
    CallbackManager mcallbackmanager;
    private long backPressesTime;
    private static final int TIME_DELAY= 2000;
    private static long back_pressed;
    
    @Override
    protected void onStart() {
        super.onStart();

        FirebaseUser user = fAuth.getCurrentUser();
        if(user!=null){
            Intent intent = new Intent(getApplicationContext(),Profile.class);
            startActivity(intent);
        }
    }

    EditText username, password;
    ImageView googleSignIn;
    TextView backSymbol;
    DBHelper DB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_google);
        username = (EditText) findViewById(R.id.signUpUser);
        password = (EditText) findViewById(R.id.signUpPass);
        googleSignIn = (ImageView) findViewById(R.id.googleSignIn);
        backSymbol = (TextView) findViewById(R.id.backSymbol);
        DB = new DBHelper(this);
        fAuth = FirebaseAuth.getInstance();
        createRequest();

        findViewById(R.id.google_signIn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signIn();
            }
        });
    }

    private void createRequest() {
        // Configure Google Sign In
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        // Build a GoogleSignInClient with the options specified by gso.
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

    }

    private void signIn() {
        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent, RC_SIGN_IN);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        mcallbackmanager.onActivityResult(requestCode,resultCode,data);

        // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                // Google Sign In was successful, authenticate with Firebase
                GoogleSignInAccount account = task.getResult(ApiException.class);

                firebaseAuthWithGoogle(account.getIdToken());
            } catch (ApiException e) {
                // Google Sign In failed, update UI appropriately
                // ...
                Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void firebaseAuthWithGoogle(String idToken) {
        AuthCredential credential = GoogleAuthProvider.getCredential(idToken, null);
        fAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            FirebaseUser user = fAuth.getCurrentUser();
                            Intent intent= new Intent(getApplicationContext(),Profile.class);
                            startActivity(intent);
                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(SignUpGoogle.this,"sorry auth failed", Toast.LENGTH_SHORT ).show();

                        }

                        // ...
                    }
                });
    }
    

}


