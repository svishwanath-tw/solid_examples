package com;
import com.exceptions.InvalidOperationException;

public class K_Weekday{
    public String weekday_complex(int day) throws InvalidOperationException {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                throw new InvalidOperationException("day must be in range 1 to 7");
        }
    }

    public String weekday_kiss(int day) throws InvalidOperationException {
        if ((day < 1) || (day > 7)) throw new InvalidOperationException("day must be in range 1 to 7");
        String[] days = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
        };
        return days[day - 1];
    }
}