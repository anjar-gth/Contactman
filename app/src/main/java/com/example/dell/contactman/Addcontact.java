package com.example.dell.contactman;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Addcontact extends AppCompatActivity {
    EditText name,mobile_number,mail;
    Button save;
    DataHelper dataHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addcontact);
         dataHelper = new DataHelper(this);

        name=(EditText)findViewById(R.id.editText4);
        mobile_number=(EditText)findViewById(R.id.editText2);
        mail=(EditText)findViewById(R.id.editText3);
        save=(Button)findViewById(R.id.button5);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               boolean result= dataHelper.insertdata(name.getText().toString(),Integer.parseInt(mobile_number.getText().toString()),
                        mail.getText().toString());
                if (result)
                    Toast.makeText(Addcontact.this,"data is inserted ",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(Addcontact.this,"data is not inserted ",Toast.LENGTH_LONG).show();


            }
        });
    }
}
