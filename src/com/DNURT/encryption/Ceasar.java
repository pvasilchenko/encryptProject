package com.DNURT.encryption;

import java.util.List;
import java.util.Scanner;

public class Ceasar{


    public void encryptCeasar(List<String> massOriginText){
        short shift;
        shift=ceasarShift();
        char[] c = new char[0];
        for(int i=0; i< massOriginText.size();i++) {
            //  String[] tmp = massOriginText.get(i).split(" ");
            c= massOriginText.get(i).toCharArray();
            for(int j=0; j<massOriginText.get(i).length();j++)
            {
                int counter=0;

                while(counter<c.length)
                {
                    char tmp;
                    tmp=(char)((int)c[counter]+shift);
                    c[counter]=tmp;
                }

            }
            System.out.println(c);
        }

    }
    private short ceasarShift(){
        short shift1,shift=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input shift variable, which >0 and <224:");
        if(sc.hasNextShort())
        {
            shift1=sc.nextShort();
            if(shift1>0&&shift1<224)
            {
                shift=shift1;
            }
            else
            {
                System.out.println("Variable has to be bigger then 0 and less then 224!");
            }
        }
        else
        {
            System.out.println("Sorry, you were wrong!");
        }
        return shift;
    }
}
