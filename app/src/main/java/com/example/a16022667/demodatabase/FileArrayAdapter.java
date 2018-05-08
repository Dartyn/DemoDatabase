package com.example.a16022667.demodatabase;

import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class FileArrayAdapter extends ArrayAdapter<Task>{
    private ArrayList<Task> task;

    public FileArrayAdapter(Context context, int resource, ArrayList<Task> objects){
        super(context, resource, objects);

    }


}
