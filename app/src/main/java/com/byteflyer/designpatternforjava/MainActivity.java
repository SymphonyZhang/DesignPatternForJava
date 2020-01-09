package com.byteflyer.designpatternforjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.byteflyer.designpatternforjava.functions.ObserverActivity;
import com.byteflyer.designpatternforjava.functions.SingletonActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view){
        switch (view.getId()){
            case R.id.btn_singleton:
                goOtherActivity(SingletonActivity.class);
                break;
            case R.id.btn_observer:
                goOtherActivity(ObserverActivity.class);
                break;
        }
    }

    private void goOtherActivity(Class clzz){
        Intent intent = new Intent(MainActivity.this,clzz);
        startActivity(intent);
    }
}
