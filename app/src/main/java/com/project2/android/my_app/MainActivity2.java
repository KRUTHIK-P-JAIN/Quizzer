package com.project2.android.my_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Pie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button ok = findViewById(R.id.chartOK) ;
        AnyChartView chart = findViewById(R.id.chart);
        Pie pie = AnyChart.pie();

        List<DataEntry> enteries = new ArrayList<>();
        enteries.add(new ValueDataEntry("Physics", 10));
        enteries.add(new ValueDataEntry("Chemistry", 10));
        enteries.add(new ValueDataEntry("Mathematics", 10));

        pie.data(enteries);
        chart.setChart(pie);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //result();
            }
        });

    }


}