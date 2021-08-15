package com.example.homework_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public
class MainActivity extends AppCompatActivity {

    private EditText email, subject, message;
    private Button button;

    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        email = findViewById( R.id.mail );
        subject = findViewById( R.id.subject );
        message = findViewById( R.id.message );
        button = findViewById( R.id.send );


        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public
            void onClick(View v) {
                Intent intent = new Intent( Intent.ACTION_SEND );
                intent.setType( "plane/text" );
                intent.putExtra( Intent.EXTRA_EMAIL, new String[]{
                        email.getText().toString()
                } );
                intent.putExtra( Intent.EXTRA_SUBJECT, subject.getText().toString() );
                intent.putExtra( Intent.EXTRA_TEXT, message.getText().toString() );
                startActivity( intent );
            }

        } );


    }
}