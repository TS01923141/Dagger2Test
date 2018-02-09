package com.example.cartek.dagger2test.Module;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by CarTek on 2018/2/9.
 */

public class Car {
//    private Engine engine;
//    private Seat seat;
//    private Wheel wheel;
    @Inject
    Engine engine;
    @Inject
    Seat seat;
    @Inject
    Wheel wheel;
    public Car(){
//        engine = new Engine();
//        seat = new Seat();
//        wheel = new Wheel();
        DaggerCarComponent
                .builder()
                .carModule(new CarModule())
                .build()
                .inject(this);
        Log.e(Config.TAG, "new Car()");
    }
}
