package com.example.inclassassignment04_thomass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

    long digit;
    float fl;
    TextView display;
    int num;
    EditText inPut;
    TextView outPut;
    private Button mCopyButton;
    private Button mDoubleButton;
    private Button mUpButton;
    private Button mDownButton;
    String answer = "0sp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(MainActivity.this, R.string.welcome, Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_main);


        mUpButton = (Button) findViewById(R.id.upText);
        mUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.upText, Toast.LENGTH_SHORT).show();
                outPut.setText(inPut.getText());
                final Button upButton = (Button) findViewById(R.id.upText);
                final int[] size = {20}; //textsize in XML

                upButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        size[0] += 3;
                        outPut.setTextSize(size[0] + 4);
                    }
                });

            }
        });


        mDownButton = (Button) findViewById(R.id.downText);
        mDownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.downText, Toast.LENGTH_SHORT).show();
                outPut.setText(inPut.getText());
                final Button downButton = (Button) findViewById(R.id.downText);
                final int[] size = {12}; //textsize in XML

                downButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        size[0] = size[0] - 1;
                        outPut.setTextSize(size[0] - 1);
                    }
                });
            }
        });


    }


    public void copyText(View view) {
        EditText inPut = (EditText) findViewById(R.id.type_something); //EditText ID
        String s1 = inPut.getText().toString();
        //outPut = (TextView) findViewById(R.id.outcome_view); //TextView ID
        displayMessage(printOut(s1));
        Toast.makeText(MainActivity.this, R.string.copyText, Toast.LENGTH_SHORT).show();

    }

    public void doubleText(View view) {
        EditText inPut = (EditText) findViewById(R.id.type_something); //EditText ID
        String s1 = inPut.getText().toString();
        String it = answer + s1;
        //Somehow I double the text in this method
        displayMessage(printOut(it));
        Toast.makeText(MainActivity.this, R.string.doubleText, Toast.LENGTH_SHORT).show();
    }

    public void upText(View view) {
        EditText inPut = (EditText) findViewById(R.id.type_something); //EditText ID
        //Somehow I double the text in this method
        Toast.makeText(MainActivity.this, R.string.upText, Toast.LENGTH_SHORT).show();
        String s1 = inPut.getText().toString();
        displayMessage(sizeDown(s1));
    }

    public void downText(View view) {
        EditText inPut = (EditText) findViewById(R.id.type_something); //EditText ID
        String s1 = inPut.getText().toString();
        //final int[] size = {20}; //textsize in XML
        inPut.getTextSize();
        //Somehow I double the text in this method
        displayMessage(printOut(s1));
        Toast.makeText(MainActivity.this, R.string.downText, Toast.LENGTH_SHORT).show();
    }

    private void displayMessage(String message) { //This isn't a method. it is the textview connected to the submit button
        TextView priceTextView = (TextView) findViewById(R.id.outcome_view); //TextView
        priceTextView.setText(message);
    }

    private String printOut(String theText) {
        String twice = answer + theText;
        twice += answer;
        return twice;
    }


    public String sizeDown(String decrease) {
        int it = 4;
        String shrink = decrease + ;
        return shrink;

    }




    }
/*

        /*mCopyButton = (Button) findViewById(R.id.copyText);
        mCopyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.copyText, Toast.LENGTH_SHORT).show();
                outPut.setText(inPut.getText());
                outPut.setText(inPut.getText());


            }
        });


        mDoubleButton = (Button) findViewById(R.id.doubleText);
        mDoubleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.doubleText, Toast.LENGTH_SHORT).show();
                outPut.setText(inPut.getText().toString());
                final Button doubleButton = (Button) findViewById(R.id.doubleText);
                doubleButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        doubleButton.getText().toString();
                        inPut.setText(outPut.getText());

                    }
                });
            }
                });



    public void copyText(View View) { //Prints EditText to the TextView

    }

    public void doubleText(View view) { //Prints EditText to the TextView


    }

    public void upText(View V) { //Prints EditText to the TextView
        inPut = (EditText) findViewById(R.id.type_something); //EditText ID
        outPut = (TextView) findViewById(R.id.outcome_view); //TextView ID
        outPut.setText(inPut.getText()); //TextView ID getting the user text in EditText

        //final
        final Button upButton = (Button) findViewById(R.id.copyText);
        final float[] size = {12}; //textsize in XML

        upButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                size[0] += 1;
                inPut.setTextSize(size[0] + 4);
            }
        });
    }*/


// public void upText (String outCome){
//    EditText typeSomething = (EditText) findViewById(R.id.type_something);
//    typeSomething.setText(String.valueOf(savedApp));


//    public void copyText (View view){
//        EditText typeSomething = (EditText) findViewById(R.id.type_something);
//        TextView outcome = (TextView) findViewById(R.id.outcome_view);
//        typeSomething.getText().toString();
//        //TextView.set
//    }









































/*

        if (savedInstanceState != null) {  // If app has never been opened before, than null
            savedApp = savedInstanceState.getString(savedApp);
        }

    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        //TextView.getText(savedInstanceState.getString(savedApp));
    }

    // invoked when the activity may be temporarily destroyed, save the instance state here
    @Override
    public void onSaveInstanceState(Bundle outState) {
        // outState.putString(GAME_STATE_KEY, savedApp);
        //outState.putString(TEXT_VIEW_KEY, textView.getText());

        // call superclass to save any view hierarchy
        super.onSaveInstanceState(outState);

        // set user interface in the onCreate fragment
    }






        public void back(View view){
        startActivity(new Intent(this, Back_Button_Testing.class));
        }}


        */
