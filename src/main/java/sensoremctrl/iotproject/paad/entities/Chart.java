package sensoremctrl.iotproject.paad.entities;

public class Chart {

    private int id;
    private String time_stamp;
    private String date_stamp;

    public Chart() {
    }

    public Chart(int id, String time_stamp, String date_stamp) {
        this.id = id;
        this.time_stamp = time_stamp;
        this.date_stamp = date_stamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(String time_stamp) {
        this.time_stamp = time_stamp;
    }

    public String getDate_stamp() {
        return date_stamp;
    }

    public void setDate_stamp(String date_stamp) {
        this.date_stamp = date_stamp;
    }

    @Override
    public String toString() {
        return "Chart{" +
                "id=" + id +
                ", time_stamp='" + time_stamp + '\'' +
                ", date_stamp='" + date_stamp + '\'' +
                '}';
    }
}
