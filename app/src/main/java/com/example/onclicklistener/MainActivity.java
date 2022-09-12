package com.example.onclicklistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggle = (ToggleButton) findViewById(R.id.toggleButton);
    }
    public void onClick(View v){
        if(toggle.isChecked()){
            Log.i("logOutput", "toggle is checked on");
        } else {
            Log.i("logOutput", "toggle is checked off");
        }
    }


}