package com.DNURT;
import java.util.Arrays;
import java.util.Scanner;

public class MethodChoose {

    static Scanner scan = new Scanner(System.in);

    protected byte methodScan;
    protected byte encryptMethodSelect;

    public byte chooseMethod(){
        System.out.println("Hello, User! Please write a number of one item from item list, that you want to choose:");
        String[] methodMass=new String[3];
        methodMass[0]="1.Encrypt";
        methodMass[1]="2.Decode";
        methodMass[2]="3.Exit";
        Arrays.stream(methodMass).forEach(System.out::println);
        if(scan.hasNextByte())
        {
            methodScan=scan.nextByte();
        }
        else
        {
            System.out.println("You were wrong!");
        }
        return methodScan;
    }

    public byte chooseEncryptMethod(){
        System.out.println("Choose encoding method:");
        String[] encryptMethodChoose=new String[5];
        encryptMethodChoose[0]="1.Caesar;";
        encryptMethodChoose[1]="2.Permutation;";
        encryptMethodChoose[2]="3.Vizhinar's with random number generator;";
        encryptMethodChoose[3]="4.XOR;";
        encryptMethodChoose[4]="5.Exit";
        Arrays.stream(encryptMethodChoose).forEach(System.out::println);
        if(scan.hasNextByte())
        {
            encryptMethodSelect = scan.nextByte();
        }
        else
        {
            System.out.println("You were wrong!");
        }
        return encryptMethodSelect;
    }
}
