package uz.mahmudxon.collapsecalendar.manager;

import androidx.annotation.NonNull;

import org.joda.time.LocalDate;


public interface Formatter {

    String getDayName(@NonNull LocalDate date);

    String getHeaderText(int type, @NonNull LocalDate from, @NonNull LocalDate to);

}