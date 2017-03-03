package com.example.dell.contactman;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/*import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient; */

public class MainActivity extends AppCompatActivity {

    DataHelper dataHelper;
    Button add ,search,upgrade,delite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataHelper = new DataHelper(this);
        search = (Button) findViewById(R.id.button);
       add = (Button) findViewById(R.id.button2);
        upgrade = (Button) findViewById(R.id.button3);
        delite = (Button) findViewById(R.id.button4);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Addcontact.class);
                startActivity(intent);

            }

                });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, searchcontact.class);
                startActivity(intent);
            }


 /*   private class DatabaseHelper {
    } */
            });
        delite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,delite.class);
                startActivity(intent);
            }
        });
        upgrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Upgradecontact.class);
                startActivity(intent);


            }
        });


           };
    }
