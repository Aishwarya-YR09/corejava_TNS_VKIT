package com.tnsif.constructorprogram;

public class Conexample {
    // Constructor with 1 parameter
    Conexample(int i) {
        System.out.println("Constructor with 1 parameter: " + i);
    }

    // Constructor with 2 parameters
    Conexample(int i, int j) {
        System.out.println("Constructor with 2 parameters: " + i + ", " + j);
    }

    // Constructor with 3 parameters (int, String, int)
    Conexample(int i, String g, int w) {
        System.out.println("Constructor with 3 parameters (int, String, int): " + i + ", " + g + ", " + w);
    }

    // Constructor with 3 parameters (int, String, float)
    Conexample(int i, String g, float w) {
        System.out.println("Constructor with 3 parameters (int, String, float): " + i + ", " + g + ", " + w);
    }

    public static void main(String[] args) {
        Conexample c1 = new Conexample(7, 9);                  // Calls constructor with 2 int parameters
        Conexample c2 = new Conexample(5);                     // Calls constructor with 1 int parameter
        Conexample c3 = new Conexample(7, "rash", 9.7f);       // Calls constructor with int, String, float
        Conexample c4 = new Conexample(7, "rash", 9);          // Calls constructor with int, String, int
    }
}