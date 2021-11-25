package com.project.paynav;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.LegendModel;
import org.eazegraph.lib.models.PieModel;

public class HomeScreen extends AppCompatActivity {

    private PieChart pieChart;
    private int i1 = 93;
    private int i2 = 5;
    private int i3 = 2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        pieChart = findViewById(R.id.mypiechart);
         addToPieChart();

    }

    private void addToPieChart() {
        pieChart.addPieSlice(new PieModel("Interger 1",i1, Color.parseColor("#90EE90")));
        pieChart.addPieSlice(new PieModel("Interger 2",i2, Color.parseColor("#ffcccb")));
        pieChart.addPieSlice(new PieModel("Interger 3",i3, Color.parseColor("#fff000")));


        pieChart.startAnimation();

    }

    public void recents(View view) {

        Intent i = new Intent(this,SecondHome.class);
        startActivity(i);
    }
}