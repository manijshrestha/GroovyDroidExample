package com.manijshrestha.groovydroidexample

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import groovy.transform.CompileStatic

@CompileStatic
public class SayHelloActivity extends Activity {

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle)
        setContentView(R.layout.activity_sayhello)

        def intent = getIntent()
        def name = intent.getStringExtra("NAME")

        def message = findViewById(R.id.message) as TextView
        message.text = "Hello ${name}!".toString()

        def closeBtn = findViewById(R.id.close_btn) as Button
        closeBtn.onClickListener = {
          finish()
        };
    }
}