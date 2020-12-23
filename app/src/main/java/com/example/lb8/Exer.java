package com.example.lb8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Exer extends Activity {

    private Button btnActTwo;
    private EditText EXER;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.exer);
            btnActTwo = (Button) findViewById(R.id.btnActTwo);
            EXER = (EditText) findViewById(R.id.EXER);

        }
        public void goNewView(View v){
            switch (v.getId()){
                case R.id.btnActTwo:
                    Intent intent = new Intent(this, Actex.class);
                    intent.putExtra("Exersise", EXER.getText().toString());
                    startActivity(intent);
                    break;
                default:
                    break;
            }
        }
}
