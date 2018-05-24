package com.company.car;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static String filename = "car.car";
    static String path = "C:\\Users\\Edward\\Desktop\\BPDE-01-02. Java IO 3 - Serialization\\";
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        List<Car> cars = Arrays.asList(
                new Car("Porshe", 2018),
                new Car("Mazda", 2012),
                new Car("Seat", 2014),
                new Car("Aston Martin", 2011)
                );
//        write(cars);

//        Car c = (Car) (Object) new ArrayList<Car>();
//        Integer i = (Integer) (Object) new String("abc");

//        List<Car> carList = new HashSet<Car>();

        read()
                .stream()
                .filter(x -> x.getYear() > 2015)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println();
    }

    private static void write(Collection<Car> cars) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(path + filename);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(cars);
        fileOutputStream.close();
        objectOutputStream.close();
    }

    private static List<Car> read() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path + filename);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Car> cars = (List<Car>) objectInputStream.readObject();

        return cars;
    }
}
