package ro.pub.cs.systems.eim.practicaltest02.model;

public class AlarmInformation {

    private String minutes;
    private String hours;
    private String alarm;


    public AlarmInformation() {
        this.minutes = null;
        this.hours = null;
        this.alarm = null;
    }

    public AlarmInformation(String minutes, String hours) {
        this.minutes = minutes;
        this.hours = hours;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }
//
//    public String getAlarm() {
//        return hours + ':' +minutes;
//    }

    public void setAlarm(String minutes, String hours) {
        this.minutes = minutes;
        this.minutes = hours;
    }

    public void setAlarm(String alarm) {
        this.minutes = alarm;
    }

    public String getAlarm() {
        return alarm;
    }

    public void reset() {
        this.minutes = null;
        this.minutes = null;
        this.alarm = null;
    }

    @Override
    public String toString() {
        return "AlarmInformation{" +
                "hours='" + hours + '\'' +
                ", minutes='" + minutes + '\'' +
                '}';
    }

}
