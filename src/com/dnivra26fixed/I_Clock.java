
package com.dnivra26;

interface Time {
    public void setTime();

    public int getTime();
}

interface Alarm {
    public void setAlarm();

    public void getAlarm();
}

interface Radio {
    public void setRadio();

    public void getRadio();
}

class AlarmClock implements Alarm {


    @Override
    public void setAlarm() {
        //actual function
    }

    @Override
    public void getAlarm() {
        // return alarm
    }
    
}