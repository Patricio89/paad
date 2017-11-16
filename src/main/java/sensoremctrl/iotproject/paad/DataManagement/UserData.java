package sensoremctrl.iotproject.paad.DataManagement;


/**
 * This class set's up values that the user want's to get notified for.
 */


public class UserData {

    private String email;
    private int temperature;
    private int humidity;


    public UserData(String email, int temperature, int humidity) {
        this.email = email;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
