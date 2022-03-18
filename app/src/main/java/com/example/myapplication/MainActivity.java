package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends FragmentActivity implements
        DatePickerFragment.DatePickedListener, TimePickerFragment.TimePickedListener {

    TextView dateView, timeView;
    String date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dateView = (TextView) findViewById(R.id.dateTextID);
        timeView = (TextView) findViewById(R.id.timeTextID);
//        showDatePickerDialog();
        showTimePickerDialog();
    }

    @Override
    public void onDatePicked(String date) {
        dateView.setText(date);
    }

    @Override
    public void onTimePicked(String time) {
        timeView.setText(time);
    }

    public void showDatePickerDialog() {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }

    public void showTimePickerDialog() {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), "timePicker");
    }
}