package com.DNURT;
import java.util.Arrays;
import java.util.Scanner;

public class MethodChoose {

    static Scanner scan = new Scanner(System.in);
    static byte methodScan;

    public static byte chooseMethod(){
        System.out.println("Hello, User! Please write a number of one item from item list, that you want to choose:");
        String[] methodMass=new String[3];
        methodMass[0]="1.Encrypt";
        methodMass[1]="2.Decode";
        methodMass[2]="3.Exit";
        Arrays.stream(methodMass).forEach(System.out::println);
        if(scan.hasNextByte())
        {
            methodScan=scan.nextByte();
            switch(methodScan)
            {
                case 1:
                    System.out.println("Your text is: ");
                    ReadFile.read();
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        }
        else
        {
            System.out.println("You were wrong!");
        }
        return methodScan;
    }
    public void chooseEncryptMethod(){
        System.out.println("Choose encoding method:");
        String[] methodChoose=new String[5];
        methodChoose[0]="1.Caesar;";
        methodChoose[1]="2.Permutation;";
        methodChoose[2]="3.Vizhinar;";
        methodChoose[3]="4.One-time notepad;";
        methodChoose[4]="5.Exit";
        if(scan.hasNextByte())
        {
            switch(scan.nextByte()){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }
        else
        {
            System.out.println("You were wrong!");
        }
    }
}
