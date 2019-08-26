package com.example.UIControl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.myapplication.R;

import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {
    EditText editText, editText2;
    ToggleButton toggleButton;
    RadioButton radioButton;
    CheckBox checkBox, checkBox2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        radioButton = (RadioButton) findViewById(R.id.radioButton);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);


    }
;
    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox)view).isChecked();

        switch(view.getId()){
            case R.id.checkBox:
                Toast.makeText(this,"MALE", LENGTH_SHORT).show();

                break;
            case R.id.checkBox2:
                Toast.makeText(this,"FEMALE", LENGTH_SHORT).show();


        }
    }
}


