package com.manijshrestha.groovydroidexample

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import groovy.transform.CompileStatic

@CompileStatic
public class DroidActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_droid);

        def name = findViewById(R.id.name_tv) as EditText

        def sayBtn = findViewById(R.id.submit_btn) as Button
        sayBtn.onClickListener = {
           def intent = new Intent(this, SayHelloActivity.class)
           intent.putExtra("NAME", name.text.toString())
           startActivity(intent)
        };
    }

}
