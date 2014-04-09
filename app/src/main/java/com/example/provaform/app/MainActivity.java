package com.example.provaform.app;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {


    //costruzione del layout tramite file xml
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    //costruizione del layout in java
    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView label1 = new TextView(this);
        label1.setText("Nome:");
        EditText edit1 = new EditText(this);
        TextView label2 = new TextView(this);
        label2.setText("Cognome:");
        EditText edit2 = new EditText(this);
        TextView label3 = new TextView(this);
        label3.setText("Sesso:");
        RadioButton radio1 = new RadioButton(this);
        radio1.setText("M");
        RadioButton radio2 = new RadioButton(this);
        radio2.setText("F");
        RadioGroup radioGroup1 = new RadioGroup(this);
        radioGroup1.setOrientation(LinearLayout.HORIZONTAL);
        radioGroup1.setGravity(Gravity.CENTER);
        radioGroup1.addView(radio1);
        radioGroup1.addView(radio2);
        Button button1 = new Button(this);
        button1.setText("Salva");
        Button button2 = new Button(this);
        button2.setText("Annulla");
        TableRow row1 = new TableRow(this);
        row1.setGravity(Gravity.CENTER);
        row1.addView(label1);
        edit1.setGravity(Gravity.FILL);
        row1.addView(edit1);
        TableRow row2 = new TableRow(this);
        row2.setGravity(Gravity.CENTER);
        row2.addView(label2);
        row2.addView(edit2);
        TableRow row3 = new TableRow(this);
        row3.setGravity(Gravity.CENTER);
        row3.addView(label3);
        row3.addView(radioGroup1);
        TableLayout tableLayout = new TableLayout(this);
        tableLayout.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.TOP);
        tableLayout.addView(row1);
        tableLayout.addView(row2);
        tableLayout.addView(row3);
        tableLayout.setColumnShrinkable(0, true);
        tableLayout.setColumnStretchable(1, true);
        LinearLayout linearLayout1 = new LinearLayout(this);
        linearLayout1.setGravity(Gravity.CENTER);
        linearLayout1.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout1.addView(button1);
        linearLayout1.addView(button2);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setGravity(Gravity.CENTER);
        linearLayout2.setOrientation(LinearLayout.VERTICAL);
        linearLayout2.setPadding(5, 5, 5, 5);
        linearLayout2.addView(tableLayout);
        linearLayout2.addView(linearLayout1);
        setContentView(linearLayout2);
*//*
        setContentView(R.layout.activity_main);
*//*
    }*/


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
