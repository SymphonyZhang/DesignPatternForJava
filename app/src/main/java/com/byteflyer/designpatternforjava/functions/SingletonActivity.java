package com.byteflyer.designpatternforjava.functions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.byteflyer.designpatternforjava.R;
import com.byteflyer.designpatternforjava.singleton.Singleton1;
import com.byteflyer.designpatternforjava.singleton.Singleton2;
import com.byteflyer.designpatternforjava.singleton.Singleton3;
import com.byteflyer.designpatternforjava.singleton.Singleton4;
import com.byteflyer.designpatternforjava.singleton.Singleton5;
import com.byteflyer.designpatternforjava.singleton.Singleton6;

public class SingletonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);
    }

    public void singletonClick(View view){
        switch (view.getId()){
            case R.id.btn_singleton1:
                Singleton1 singleton1 = Singleton1.getInstance();
                break;
            case R.id.btn_singleton2:
                Singleton2 singleton2 = Singleton2.getInstance();
                break;
            case R.id.btn_singleton3:
                Singleton3 singleton3 = Singleton3.getInstance();
                break;
            case R.id.btn_singleton4:
                Singleton4 singleton4 = Singleton4.getInstance();
                break;
            case R.id.btn_singleton5:
                Singleton5 singleton5 = Singleton5.INSTANCE;
                break;
            case R.id.btn_singleton6:
                Singleton6 singleton6 = Singleton6.getInstance();
                break;
        }
    }
}
