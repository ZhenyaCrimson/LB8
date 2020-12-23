package com.example.lb8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.FragmentTransaction;

public class Actex extends Activity {
    private TextView Ex;
    StopwatchFragment frag1;
    FragmentTransaction fTrans;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actex);
        frag1 = new StopwatchFragment();

        Ex = (TextView) findViewById(R.id.Ex);
        String Exname = getIntent().getStringExtra("Exersise");
        Ex.setText(Ex.getText().toString() + " " + Exname);
    }
    public void onClick(View v){
        fTrans = getFragmentManager().beginTransaction();
        switch (v.getId()) {
            case R.id.btn_st_frag:
                fTrans.add(R.id.frgmCont, frag1);
            default:
                break;
        }
        fTrans.commit();
    }
}
