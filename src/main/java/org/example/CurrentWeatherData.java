package org.example;

public class CurrentWeatherData {
    //current weather data
    private String last_updated;
    private double temp_c;
    private int is_day;

    Condition condition;
    private double wind_kph;
    private String wind_dir;
    private double pressure_mb;
    private int humidity;
    private double feelslike_c;

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public double getTemp_c() {
        return temp_c;
    }

    public void setTemp_c(double temp_c) {
        this.temp_c = temp_c;
    }

    public int getIs_day() {
        return is_day;
    }

    public void setIs_day(int is_day) {
        this.is_day = is_day;
    }

    public String getCondition_text() {
        return condition.getText();
    }

    public void setCondition_text(String condition_text) {
        this.condition.setText(condition_text);
    }

    public String getCondition_icon() {
        return condition.getIcon();
    }

    public void setCondition_icon(String condition_icon) {
        this.condition.setIcon(condition_icon);
    }

    public double getWind_kph() {
        return wind_kph;
    }

    public void setWind_kph(double wind_kph) {
        this.wind_kph = wind_kph;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public void setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }

    public double getPressure_mb() {
        return pressure_mb;
    }

    public void setPressure_mb(double pressure_mb) {
        this.pressure_mb = pressure_mb;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getFeelslike_c() {
        return feelslike_c;
    }

    public void setFeelslike_c(double feelslike_c) {
        this.feelslike_c = feelslike_c;
    }

    @Override
    public String toString() {
        return "CurrentWeatherData{" +
                "last_updated='" + last_updated + '\'' +
                ", temp_c=" + temp_c +
                ", is_day=" + is_day +
                ", condition_text='" + condition.getText() + '\'' +
                ", condition_icon='" + condition.getIcon() + '\'' +
                ", wind_kph=" + wind_kph +
                ", wind_dir='" + wind_dir + '\'' +
                ", pressure_mb=" + pressure_mb +
                ", humidity=" + humidity +
                ", feelslike_c=" + feelslike_c +
                '}';
    }
}
