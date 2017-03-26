package com.DNURT;

import java.io.*;
import java.util.ArrayList;

import java.util.List;

public class ReadFile {

    private String line;
    private  List<String> mass=new ArrayList<String>();


    public List<String> fileRead(byte methodScan){

        BufferedReader readFromFile = null;
        try{
                if(methodScan==1) {
                    readFromFile = new BufferedReader(new FileReader("resources//primaryTextForEncrypt.txt"));
                }
                else if(methodScan==2)
                {
                    readFromFile=new BufferedReader(new FileReader("resources//primaryTextDecode.txt"));
                }
                else
                {
                    System.exit(0);
                }
                while((line=readFromFile.readLine())!=null)
                {
                    mass.add(line);
                }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally {
            if (readFromFile != null)
            {
                try{
                    readFromFile.close();
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Your text is:");
        for(String originText:this.mass)
        {
            System.out.println(originText);
        }
        System.out.println();
        return mass;
    }

}
