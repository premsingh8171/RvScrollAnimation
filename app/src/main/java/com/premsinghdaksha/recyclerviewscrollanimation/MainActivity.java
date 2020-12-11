package com.premsinghdaksha.recyclerviewscrollanimation;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.premsinghdaksha.recyclerviewscrollanimation.adapter.MainAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public ArrayList<String> data = new ArrayList<>();
    private int val = 0;
    private RecyclerView Rv_Recycler;
    private MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Rv_Recycler = findViewById(R.id.Rv_Recycler);
        for (int i = 0; i < 100; i++) {
            if (val == 0) {
                data.add("prem singh");
                val = 1;
            } else {
                data.add("ajay");
                val = 0;
            }

        }
        rvdataSet(data);
    }

    private void rvdataSet(ArrayList<String> data) {
        mainAdapter = new MainAdapter(MainActivity.this, data);
        Rv_Recycler.setAdapter(mainAdapter);
    }
}