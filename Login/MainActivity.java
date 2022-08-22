package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    EditText username,password;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.usernm);
        password=(EditText)findViewById(R.id.passd);

        b1=(Button)findViewById(R.id.reset);
        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                username.setText("");
                password.setText("");
            }
        });

        b2=(Button)findViewById(R.id.sub);
        b2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                String us=username.toString();
                String ps=password.toString();
                t1=(TextView) findViewById(R.id.result);
                t1.setText("Username is:"+username.getText()+"\nPassword is:"+password.getText());
            }
        });

    }
}