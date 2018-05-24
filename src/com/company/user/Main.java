package com.company.user;

import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

    static String filename = "user1.user";
    static String path = "C:\\Users\\Edward\\Desktop\\BPDE-01-02. Java IO 3 - Serialization\\";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User("user1", "123456");

//        write(Arrays.asList(user));
        readUsers().forEach(System.out::println);

    }

    private static void write(Collection<User> users) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(path + filename);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(users);
        fileOutputStream.close();
        objectOutputStream.close();
    }

    private static Collection<User> readUsers() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path + filename);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Collection<User> users = (Collection<User>) objectInputStream.readObject();

        return users;
    }
}
