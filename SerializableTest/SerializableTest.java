package javatest;

import java.io.*;

public class SerializableTest {
    private void serializable(FileOutputStream fos){
        Employee employee = new Employee();
        employee.setName("胡吉双");
        employee.setNumber(322);
        employee.setSsn(1000);
        employee.setAddress("吉林省");
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(fos);
            oos.writeObject(employee);
            oos.close();
            System.out.println("Serialized data is saved in /tmp/employee.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void antiSerializable(FileInputStream fis){
        Employee em = null;
        try {
            ObjectInputStream ois = new ObjectInputStream(fis);
            try {
                em = (Employee) ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + em.getName());
        System.out.println("Address: " + em.getAddress());
        System.out.println("SSN: " + em.getSsn());
        System.out.println("Number: " + em.getNumber());

    }
    public static void main(String[] args) {
        SerializableTest ser = new SerializableTest();
        try {
            FileOutputStream fos = new FileOutputStream("E:\\LocalRepository\\SerializableTest\\employee.ser");
            FileInputStream fis = new FileInputStream("E:\\LocalRepository\\SerializableTest\\employee.ser");
            ser.serializable(fos);
            ser.antiSerializable(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
