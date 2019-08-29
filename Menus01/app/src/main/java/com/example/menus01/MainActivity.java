package com.example.menus01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText e1, e2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 =  findViewById(R.id.e1);
        e2=  findViewById(R.id.e2);

        registerForContextMenu(e1);
        registerForContextMenu(e2);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu1:
                break;
            case R.id.menu2:
                break;
            case R.id.menu3:
                break;
        }


        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        switch (v.getId()) {
            case R.id.e1:
                getMenuInflater().inflate(R.menu.edit0_menu, menu);
                break;
            case R.id.e2:
                getMenuInflater().inflate(R.menu.edit1_menu, menu);
                break;
//            case R.id.menu2:
//                break;
//            case R.id.menu4:
//                break;
//            case R.id.menu5:
//                break;
//            case R.id.menu6:
//                break;
        }
        //return;
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case (R.id.menu):
            break;
            case (R.id.menu1):
                break;
            case(R.id.menu2):
                break;
            case (R.id.menu3):
                break;
            case (R.id.menu4):
                break;
            case (R.id.menu5):
                break;
            case (R.id.menu6):
                break;
            case (R.id.age):
                break;
            case (R.id.colour):
                break;

        }
        return true;
    }
}
