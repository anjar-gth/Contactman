package com.example.dell.contactman;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class searchcontact extends AppCompatActivity {
    EditText search;
    Button submit;
    TextView etname,etmail;
    DataHelper dataHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchcontact);
        dataHelper =new DataHelper(this);
        search=(EditText)findViewById(R.id.editText);
        submit=(Button)findViewById(R.id.button6);
        etname=(TextView)findViewById(R.id.editText4);
        etmail=(TextView)findViewById(R.id.textView5);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor cursor= dataHelper.getdata(search.getText().toString());
                while (cursor.moveToNext());{
                    etname.setText(cursor.getString(1));
                    etmail.setText(cursor.getString(3));



                }



            }
        });


    }
}
