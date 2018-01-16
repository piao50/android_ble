package com.example.gushi.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        edit = findViewById(R.id.editText);
        findViewById(R.id.button_Test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                edit.setText("OK
                edit.setText(getResources().getString(R.string.msg));
            }
        });
    }
}
