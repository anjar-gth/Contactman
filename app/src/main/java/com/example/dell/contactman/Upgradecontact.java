package com.example.dell.contactman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Upgradecontact extends AppCompatActivity {
     EditText search1,name1,email1;
    Button upgrade1;
    DataHelper dataHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upgradecontact);
        search1=(EditText)findViewById(R.id.editText6);
        name1=(EditText)findViewById(R.id.editText7);
        email1=(EditText)findViewById(R.id.editText8);
        upgrade1=(Button)findViewById(R.id.button8);
        upgrade1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataHelper.upgradedata(search1.getText().toString(),name1.getText().toString(),email1.getText().toString());

            }
        });
    }
}
