package com.example.final_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.common.base.MoreObjects;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class signupActivity extends AppCompatActivity {

    FirebaseAuth auth;
    EditText email,password,name;
    Button login2,signup2;

    FirebaseFirestore  database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button btnlogin2 = findViewById(R.id.btnlogin2);
        btnlogin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(signupActivity.this,loginActivity.class));
            }
        });

        database=FirebaseFirestore.getInstance();
        auth=FirebaseAuth.getInstance();

        email=findViewById(R.id.txtemail2);
        password=findViewById(R.id.txtpass2);
        name=findViewById(R.id.txtname);

       // login2=findViewById(R.id.btnlogin2);
        signup2=findViewById(R.id.btnsignup2);

        signup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email2,pass2,name2;
                email2=email.getText().toString();
                pass2=password.getText().toString();
                name2=name.getText().toString();

                User user = new  User();
                user.setEmail(email2);
                user.setName(name2);
                user.setPass(pass2);

                auth.createUserWithEmailAndPassword(email2,pass2).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                             database.collection("Users")
                                     .document().set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                                 @Override
                                 public void onSuccess(Void aVoid) {
                                   startActivity(new Intent(signupActivity.this,loginActivity.class));
                                 }
                             });


                            Toast.makeText(signupActivity.this,"Your account is created !",Toast.LENGTH_SHORT).show();

                        }else{
                            Toast.makeText(signupActivity.this,task.getException().getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        }

                    }
                });
            }
        });
    }
}