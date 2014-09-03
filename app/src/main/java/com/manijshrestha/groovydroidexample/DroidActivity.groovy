package com.manijshrestha.groovydroidexample

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import groovy.transform.CompileStatic

@CompileStatic
public class DroidActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_droid);

        String messageText = "Hello Groovy!";
        def message = findViewById(R.id.message) as TextView
        message.text = messageText;
    }

}
