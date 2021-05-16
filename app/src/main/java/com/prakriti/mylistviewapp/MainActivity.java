package com.prakriti.mylistviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ListView myListView;
    ArrayAdapter<String> listAdapter; // populate list with data

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = findViewById(R.id.myListView);

        String[] planets = new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        // we need a list of items, so convert array to list

        ArrayList<String> myPlanetList = new ArrayList<>();
        myPlanetList.addAll(Arrays.asList(planets));

        // initialize adapter
        listAdapter = new ArrayAdapter<String>(this, R.layout.my_row, myPlanetList);
        // pass this (an instance of current activity), custom row layout file, & list of data
        // here, custom row xml file can only hold a single textview with no other UI component
            // bcoz in android, only textview can be passed as second arg for ArrayAdaptor

        myListView.setAdapter(listAdapter);

    }
}