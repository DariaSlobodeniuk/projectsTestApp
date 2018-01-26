package com.example.worldsevil.helloworld;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by World°s Evil on 12.01.2018.
 */

public class MyArrayAdapter extends ArrayAdapter {
    public MyArrayAdapter(@NonNull Context context, int resource) {
       // ArrayList actionList = new ArrayList() {}


        super(context, resource);
    }
}
