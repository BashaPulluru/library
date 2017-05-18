package com.simplylearnprogramming.sqliteinsertupdtedelsel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by BASHA PULLURU on 15-05-2017.
 */

public class Main2Activity extends AppCompatActivity {
   Button bt1,bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        bt1=(Button)findViewById(R.id.admin_btn);
        bt2=(Button)findViewById(R.id.user_btn);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main2Activity.this,login.class);
                startActivity(i);
            }
        });
    }
}
