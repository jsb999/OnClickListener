package com.example.onclicklistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggle;
    int[] ids;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ids = new int[]{R.id.toggleButton,R.id.toggleButton2,R.id.toggleButton3,R.id.toggleButton4,R.id.toggleButton5};
    }
    public void onClick(View v){
        boolean checked = ((ToggleButton) v).isChecked();
        switch(v.getId()) {
            case R.id.toggleButton:
                if(checked){
                    Log.i("logOutput", "toggle1 is checked on");

                } else{
                    Log.i("logOutput", "toggle1 is checked off");
                }
                setOff(v.getId());
                break;
            case R.id.toggleButton2:
                if(checked){
                    Log.i("logOutput", "toggle2 is checked on");
                } else{
                    Log.i("logOutput", "toggle2 is checked off");
                }
                setOff(v.getId());
                break;
            case R.id.toggleButton3:
                if(checked){
                    Log.i("logOutput", "toggle3 is checked on");
                } else{
                    Log.i("logOutput", "toggle3 is checked off");
                }
                setOff(v.getId());
                break;
            case R.id.toggleButton4:
                if(checked){
                    Log.i("logOutput", "toggle4 is checked on");
                } else{
                    Log.i("logOutput", "toggle4 is checked off");
                }
                setOff(v.getId());
                break;
            case R.id.toggleButton5:
                if(checked){
                    Log.i("logOutput", "toggle5 is checked on");
                } else{
                    Log.i("logOutput", "toggle5 is checked off");
                }
                setOff(v.getId());
                break;
        }
    }

    public void setOff(int id){

        for (int i = 0; i < ids.length; i++) {
            if(ids[i] != id) {
                ((ToggleButton) findViewById(ids[i])).setChecked(false);
            }
        }
    }
}