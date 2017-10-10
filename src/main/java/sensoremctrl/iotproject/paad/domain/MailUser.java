package sensoremctrl.iotproject.paad.domain;

public class MailUser {

    private String firstName;
    private String lastName;
    private String emailAddress;

    public MailUser(String email) {
        this.emailAddress = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
