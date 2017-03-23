package com.DNURT;

import java.io.*;
import java.util.ArrayList;

import java.util.List;

public class ReadFile {

    static String line;
    private static List<OriginFile> mass=new ArrayList<OriginFile>();

    public static void read(){
        ReadFile test = new ReadFile();
        test.fileRead();
        for(OriginFile newOriginFile:test.mass)
            System.out.println(newOriginFile.key);

    }

    private static void fileRead(){
        MethodChoose Choose = new MethodChoose();

        BufferedReader readFromFile = null;
        try{
            readFromFile=new BufferedReader(new FileReader("resources//primaryTextForEncrypt.txt"));
            while((line=readFromFile.readLine())!=null)
            {
                OriginFile newOriginFile = new OriginFile();
                newOriginFile.key=line;
                mass.add(newOriginFile);
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
    }
    public static class OriginFile{
        public String key;
    }
}
