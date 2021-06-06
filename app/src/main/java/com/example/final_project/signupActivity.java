package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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

        database=FirebaseFirestore.getInstance();
        auth=FirebaseAuth.getInstance();

        email=findViewById(R.id.txtemail2);
        password=findViewById(R.id.txtpass2);
        name=findViewById(R.id.txtname);

        login2=findViewById(R.id.btnlogin2);
        signup2=findViewById(R.id.btnsignup2);

        signup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}