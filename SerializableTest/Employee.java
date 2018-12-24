package javatest;

import java.io.Serializable;

public class Employee implements Serializable {

    private String name;
    private String address;
    private transient int ssn;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void mailCheck()
    {
        System.out.println("Mailing a check to " + name
                + " " + address);
    }
}
