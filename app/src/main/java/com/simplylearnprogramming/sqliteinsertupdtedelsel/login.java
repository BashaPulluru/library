package com.simplylearnprogramming.sqliteinsertupdtedelsel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by BASHA PULLURU on 15-05-2017.
 */

public class login extends AppCompatActivity {
    TextView admin_tv1,admin_tv2,admin_tv3;
    EditText admin_et1,admin_et2;
    Button admin_bt1,admin_bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logpage);
        admin_tv1=(TextView)findViewById(R.id.admin_txt1);
        admin_tv2=(TextView)findViewById(R.id.admin_usertxt);
        admin_tv3=(TextView)findViewById(R.id.admin_passtv);
        admin_et1=(EditText)findViewById(R.id.admin_useret);
        admin_et2=(EditText)findViewById(R.id.adminpas_et);
        admin_bt1=(Button)findViewById(R.id.admin_login);
        admin_bt2=(Button)findViewById(R.id.admin_clear);
        admin_bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5=new Intent(login.this,MainActivity.class);
                startActivity(i5);
            }
        });
    }
}
