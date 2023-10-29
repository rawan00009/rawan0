package com.example.myrr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

            EditText txtNum = (EditText) findViewById(R.id.txtNum);
            Button btnCall = (Button) findViewById(R.id.btnCall);

            Intent icall = new Intent(Intent.ACTION_CALL) ;
            icall.setData(Uri.parse("tel:" + txtNum.getText())) ;
            btnCall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(icall);
                }
            });

        }
    }
}