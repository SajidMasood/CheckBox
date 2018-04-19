package com.mr_abdali.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatCheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //
    AppCompatCheckBox appCompatCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // reference
        appCompatCheckBox = (AppCompatCheckBox) findViewById(R.id.checkbox_id);
        appCompatCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                // your code
                //System.out.println(b);
                if (b){
                    //<code></code>
                    Toast.makeText(getApplicationContext(),"CheckBox is Enabled",Toast.LENGTH_LONG).show();
                } else {
                    //<code></code>
                    Toast.makeText(getApplicationContext(),"CheckBox is Disabled",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
