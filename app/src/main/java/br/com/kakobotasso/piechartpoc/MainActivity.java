package br.com.kakobotasso.piechartpoc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.txusballesteros.widgets.AnimationMode;
import com.txusballesteros.widgets.FitChart;
import com.txusballesteros.widgets.FitChartValue;

import java.util.ArrayList;
import java.util.Collection;

public class MainActivity extends AppCompatActivity {

    FitChart fitChart;
    TextView porcentual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fitChart = (FitChart) findViewById(R.id.fitChart);
        porcentual = (TextView) findViewById(R.id.porcentagem);

        fitChart.setValue(100f);
        porcentual.setText("100%");
    }

    public void liga100(View view) {
        Collection<FitChartValue> values = new ArrayList<>();
        values.add(new FitChartValue(100f, 0xFF0e35be));
        fitChart.setValues(values);
        porcentual.setText("100%");
    }

    public void liga50(View view) {
        Collection<FitChartValue> values = new ArrayList<>();
        values.add(new FitChartValue(50f, 0xFFffd652));
        fitChart.setValues(values);
        porcentual.setText("50%");
    }

    public void liga25(View view) {
        Collection<FitChartValue> values = new ArrayList<>();
        values.add(new FitChartValue(25f, 0xFFff4b4b));
        fitChart.setValues(values);
        porcentual.setText("25%");
    }
}
