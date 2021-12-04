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
//    public void displayInfo(View view){
//        TextView helloTxt = findViewById(R.id.helloTxt);
//        EditText name = findViewById(R.id.name);
//        helloTxt.setText("Hello "+name.getText().toString());
//    }//end displayNamebtn()

    public void register(View view){
        //get info
        EditText fNameIn = findViewById(R.id.firstNameInput),
                 lNameIn = findViewById(R.id.lastNameInput),
                 emailIn = findViewById(R.id.emailInput);

        //get where to display
        TextView fNameOut = findViewById(R.id.firstNameTxt),
                 lNameOut = findViewById(R.id.lastNameTxt),
                 emailOut = findViewById(R.id.emailTxt);

        //display info
        fNameOut.setText("First Name: "+fNameIn.getText().toString());
        lNameOut.setText("Last Name: "+ lNameIn.getText().toString());
        emailOut.setText("Email: "+ emailIn.getText().toString());
    }













}//end class