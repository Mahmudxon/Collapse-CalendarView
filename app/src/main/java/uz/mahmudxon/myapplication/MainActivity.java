package uz.mahmudxon.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import org.joda.time.LocalDate;

import uz.mahmudxon.collapsecalendar.CollapseCalendarView;
import uz.mahmudxon.collapsecalendar.manager.CalendarManager;

public class MainActivity extends AppCompatActivity {
    private CollapseCalendarView mCalendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CalendarManager manager = new CalendarManager(LocalDate.now(), CalendarManager.State.MONTH, LocalDate.now(), LocalDate.now().plusYears(1));

        mCalendarView = (CollapseCalendarView) findViewById(R.id.calendar);
        mCalendarView.init(manager);
    }
}