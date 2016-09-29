package com.example.irfan.mobpro;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login, reg, fb, tw, gm;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button)findViewById(R.id.btnlogin);
        reg = (Button)findViewById(R.id.btnreg);
        fb = (Button)findViewById(R.id.btnfb);
        tw = (Button)findViewById(R.id.bntw);
        gm = (Button)findViewById(R.id.btngm);
        username = (EditText)findViewById(R.id.user);
        password = (EditText)findViewById(R.id.pass);

        reg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(in);
            }
        } );

            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    Intent in = new Intent(MainActivity.this, MenuUtama.class);
                    startActivity(in);
                    }
                    else {
                        Toast.makeText(MainActivity.this,"Salah username atau Password",Toast.LENGTH_LONG).show();
                    }
                }
            });

        fb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://facebook.com");
                Intent in = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(in);
            }
        } );

        tw.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://twitter.com");
                Intent in = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(in);
            }
        } );
        gm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://gmail.com");
                Intent in = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(in);
            }
        } );
    }
}
