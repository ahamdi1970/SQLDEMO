package com.openclassrooms.sqldemo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // references to buttons and other controls in the layout
    Button btn_add, btn_viewAll;
    EditText et_name, et_age;
    Switch sw_activeCustomer;
    ListView lv_customer_List;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        btn_add = findViewById ( R.id.btn_Add );
        btn_viewAll = findViewById ( R.id.btn_viewAll );
        et_age = findViewById ( R.id.et_age );
        et_name = findViewById ( R.id.et_name );
        sw_activeCustomer = findViewById ( R.id.sw_active );
        lv_customer_List = findViewById ( R.id.lv_customerList );

        // button listeners for the add and view all buttons

//        btn_add.setOnClickListener ( new View.OnClickListener () {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText ( MainActivity.this,"add", Toast.LENGTH_SHORT ).show ();
//            }
//        } );
//
//        btn_viewAll.setOnClickListener ( new View.OnClickListener () {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText ( MainActivity.this,"View all", Toast.LENGTH_SHORT ).show ();
//            }
//        } );

    }
}