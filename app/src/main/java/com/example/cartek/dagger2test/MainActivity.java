package com.example.cartek.dagger2test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cartek.dagger2test.Module.Car;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Car();
//        ((CarApp) this.getApplicationContext()).getCarComponent().inject();
    }
}
