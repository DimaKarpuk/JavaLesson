package org.example;

public class Main {

    public static void main(String[] args) {
        int a =100;
        int c = 127;

        byte b = (byte) (a + 27);
        byte e = (byte) (c+20);

        double x = a + 10.5;
        double y = 1000.2323 + x;
        System.out.println("double равен x " + x);
        System.out.println("double равен y " + y);


        System.out.println("предельное значение byte " +b);
        System.out.println("переполненный byte " +e);

        boolean checkByteC = c+20 < 127;
        boolean checkByteB = a+27 <= 127;

        System.out.println(checkByteC);
        System.out.println(checkByteB);

        String java = "Java";
        String cool = "cool";
        System.out.println(java + " " + cool);
    }
}