package com.example.singleton;

public class ManualSingleton {

    // 1. Static variable to hold the single instance
    private static ManualSingleton instance;

    // 2. Private constructor to prevent instantiation
    private ManualSingleton() {
    }

    // 3. Public static method to access the instance
    public static synchronized ManualSingleton getInstance() {
        if (instance == null) {
            instance = new ManualSingleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Manual Singleton!");
    }
}