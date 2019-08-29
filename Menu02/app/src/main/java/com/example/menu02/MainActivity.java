package com.example.menu02;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView2;
EditText editText3,editText4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView2= findViewById(R.id.textView2);
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById((R.id.editText4));

        registerForContextMenu(editText3);
        registerForContextMenu(editText4);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        switch (v.getId()){
            case R.id.editText3:
                getMenuInflater().inflate(R.menu.edit_menu1, menu);
                break;
            case R.id.editText4:
                getMenuInflater().inflate(R.menu.edit_menu2, menu);
                break;
        }

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                break;
            case R.id.item2:
                break;
            case R.id.item3:
                break;
            case R.id.item4:
                break;
            case R.id.s1:
                break;
            case R.id.s2:
                break;

        }
        return true;
    }
}
