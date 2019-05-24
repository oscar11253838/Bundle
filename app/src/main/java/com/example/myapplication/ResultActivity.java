package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class ResultActivity extends AppCompatActivity {
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_result);
        tvResult = (TextView) findViewById(R.id.tvResult);
        showResults();
    }

    private  void showResults(){
        NumberFormat nf = NumberFormat.getInstance();
        Bundle bundle = getIntent().getExtras();
        int programming = bundle.getInt("programming");
        int dataStructure = bundle.getInt("dataStructure");
        int algorithm = bundle.getInt("algorithm");
        int sum = programming + dataStructure + algorithm;
        double average = sum / 3.0;
        String text = "programming = " + programming +
                "\ndataStructure = " + dataStructure +
                "\nalgorthim = " + algorithm +
                "\nsum = " + sum +
                "\naverage =  " + nf.format(average);
        tvResult.setText(text);
    }

    public void onBackClick(View view){ finish();}
}
