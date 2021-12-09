package com.example.albertotarea5di;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Activity1 extends AppCompatActivity {
    CalendarView calendar;
    Button butback;
    TextView txt;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);
        txt = findViewById(R.id.textView2);
        calendar = (CalendarView) findViewById(R.id.calendarView);
        butback = findViewById(R.id.butback);
       // calendar.setDate(1);
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
        final String[] date = {sdf.format(calendar.getDate())};
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                txt.setText(i +" - " + i1 + " - " + i2);

            }
        });

        butback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Activity1.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });



    }
}
