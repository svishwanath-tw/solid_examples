package com.dnivra26;

public interface I_Clock {
    public void setTime();
    public int getTime();
    public void setAlarm();
    public void getAlarm();
    public void setRadio();
    public void getRadio();
}

class AlarmClock implements Clock{

    @Override
    public void setTime() {
        // does not apply
    }

    @Override
    public int getTime() {
        return 0;
    }

    @Override
    public void setAlarm() {
        //actual function
    }

    @Override
    public void getAlarm() {
        // return alarm
    }

    @Override
    public void setRadio() {
        // does not apply
    }

    @Override
    public void getRadio() {
        // does not apply
    }
}