package com.DNURT;

import java.util.Scanner;
import java.io.File;
import javax.swing.JOptionPane;

public class Main {

    static Scanner scan;
    static String[][] m;

    public static void main(String[] args) {
        //System.out.println("Hello, User! Choose encoding method:");
        //scan= new  Scanner(System.in);
        //String[] methodChoose=new String[5];
        //methodChoose[1]="1.Caesar;";
        //methodChoose[2]="2.Permutation;";
        //methodChoose[3]="3.Vizhinar;";
        //methodChoose[4]="4.One-time notepad;";
        openFile();
        fileRead();
        out();
	// write your code here
    }
    private static void out(){
        for(int row=0; row<m.length;row++)
        {
            for(int col=0;col<m[row].length;col++)
            {
                System.out.print(m[row][col]);
            }
            System.out.println();
        }
    }

    private static void fileRead(){
            while(scan.hasNext())
            {
                for(int row=0; row<m.length;row++)
                {
                    for(int col=0;col<m[row].length;col++)
                    {
                        m[row][col]=scan.next();
                    }
                }
            }
    }
    private static void openFile(){
        try
        {
            scan=new Scanner(new File("resources//primaryText.txt"));

        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, "File can't be reached");
        }
    }
}
