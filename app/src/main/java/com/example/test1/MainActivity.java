package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void displayNamebtn(View view){
        TextView helloTxt = findViewById(R.id.helloTxt);
        EditText name = findViewById(R.id.name);
        helloTxt.setText("Hello "+name.getText().toString());
    }//end displayNamebtn()

}//end class