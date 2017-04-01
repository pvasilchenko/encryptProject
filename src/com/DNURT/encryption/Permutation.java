package com.DNURT.encryption;



import java.util.List;
import java.util.Scanner;

public class Permutation {
    Scanner scan = new Scanner(System.in);
    public void encryptPermutation(List<String> massOriginText){
        char[] f=new char[0];
        byte[] userEnterNumber;
        userEnterNumber=userEnter();
        for(int i=0; i< massOriginText.size();i++) {
          //  String[] tmp = massOriginText.get(i).split(" ");
            f= massOriginText.get(i).toCharArray();
            for(int j=0; j<massOriginText.get(i).length();j++)
            {
                int counter=0;
                while(counter<f.length-4)
                {

                    char tmp0,tmp1,tmp2,tmp3;
                    tmp0=f[counter];
                    tmp1=f[counter+1];
                    tmp2=f[counter+2];
                    tmp3=f[counter+3];
                    f[counter+userEnterNumber[0]]=tmp0;
                    f[counter+userEnterNumber[1]]=tmp1;
                    f[counter+userEnterNumber[2]]=tmp2;
                    f[counter+userEnterNumber[3]]=tmp3;

                    counter+=4;
                }

            }
            System.out.println(f);
        }

    }
    private byte[] userEnter() {
        byte outputStringMass=0;
        byte[] userEnterNumber= new byte[4];
        System.out.println("Please, input values from 0 to 3: ");
        String[] numberLine = new String[4];
        numberLine[0]="[1]= ";
        numberLine[1]="[2]= ";
        numberLine[2]="[3]= ";
        numberLine[3]="[4]= ";
        while(outputStringMass<numberLine.length)
        {
            System.out.println(numberLine[outputStringMass]);
            if(scan.hasNextByte())
            {
                byte a = scan.nextByte();
                if(a<4) {
                    userEnterNumber[outputStringMass] = a;
                }
            }
            else
            {
              System.out.println("Value should be from 0 to 3");
            }
            outputStringMass++;
        }
        return userEnterNumber;
    }
}
