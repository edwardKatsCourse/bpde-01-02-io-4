package com.company.monitor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    private static final String PATH = "C:\\Users\\Edward\\Desktop\\BPDE-01-02. Java IO 3 - Serialization\\samsung.mon";

    public static void main(String[] args) {
        //Input/Output Stream -> byte []
        //Reader/Writer + BufferedReader/BufferedWriter -> char[] + String

        //Serialization/Deserialization

        //PART 1 - SERIALIZATION
        //Serialization - converting objects to be persisted outside of JVM.
        //Deserialization - converting persisted objects outside JVM into JVM classes.

        //Java Script Object Notation (JSON)
        //{"username":"value", "password":"value"} -> User

        //Serialization - object(person) -> byte[]
        //Deserialization - byte[] -> (person) object

        //PART 2 - Marker interface (Serializable)

        //m1              m2
        //dell            m1.getName()
        //name = lg       m2.getName() -> lg

        //cloneable
        //m1    -> (cloning)   m2
        //dell                 dell
        //name = lg            dell


        Monitor monitor = getMonitor();
        write(monitor);

        read();
    }

    private static Monitor getMonitor() {
        return new Monitor("Samsung", 27, 2018);
    }

    private static void write(Monitor monitor) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(PATH);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(monitor);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void read() {

        try (FileInputStream fis = new FileInputStream(PATH);
             ObjectInputStream ois = new ObjectInputStream(fis);) {

            Monitor monitor = (Monitor) ois.readObject();
            System.out.println(monitor.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}