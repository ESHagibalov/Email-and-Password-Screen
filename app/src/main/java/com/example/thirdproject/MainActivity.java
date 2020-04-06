package com.example.thirdproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView img;
    private Button btn;
    private EditText email, password;

    private static final String email_txt = "example@gmail.com";
    private static final String pass = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login();
    }

    public void login(){
        img = (ImageView)findViewById(R.id.imageView3);
        btn = (Button)findViewById(R.id.button);
        email = (EditText)findViewById(R.id.editText);
        password = (EditText)findViewById(R.id.editText2);

        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(email_txt.equals(String.valueOf(email.getText())) && pass.equals(String.valueOf(password.getText())))
                            img.setImageResource(R.drawable.yes_icon_128413);
                        else
                           img.setImageResource(R.drawable.no_icon_128419);
                    }
                }
        );
    }


}
