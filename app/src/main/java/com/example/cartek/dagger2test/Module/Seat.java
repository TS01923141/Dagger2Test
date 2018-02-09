package com.example.cartek.dagger2test.Module;

import android.util.Log;

import static android.content.ContentValues.TAG;

/**
 * Created by CarTek on 2018/2/9.
 */

public class Seat {
    private Leather leather;
    public Seat(){
        Log.e(Config.TAG, "new Seat()");
    }
    public Seat(Leather leather){
        this.leather = leather;
        Log.e(Config.TAG,"new Seat(Leather)");
    }
}
