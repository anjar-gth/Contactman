package com.example.dell.contactman;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class delite extends AppCompatActivity {
    EditText etdelite;
    Button etbutton;
    DataHelper dataHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delite);
        dataHelper =new DataHelper(this);
        etdelite=(EditText)findViewById(R.id.textView5);
        etbutton=(Button)findViewById(R.id.button7);
        etbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               dataHelper.delitedata(etdelite.getText().toString());

            }
        });
    }
}
