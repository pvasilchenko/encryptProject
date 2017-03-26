package com.DNURT;

import com.DNURT.encryption.Encrypt;

import java.util.List;

public class Main {


    public static void main(String[] args){
        MethodChoose Choose = new MethodChoose();
        byte methodScan = Choose.chooseMethod();
        switch(methodScan)
        {
            case 1:
                byte encryptMethodSelect = Choose.chooseEncryptMethod();
                ReadFile read = new ReadFile();
                List <String> massOriginText = read.fileRead(methodScan);
                Encrypt en = new Encrypt();
                en.encryptFile(massOriginText,encryptMethodSelect);
                break;
            case 2:
                break;
            case 3:
                System.exit(0);
                break;
        }
    }


}
