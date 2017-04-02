package com.DNURT.encryption;

import java.util.List;


public class Encrypt {

    public void encryptFile(List<String> massOriginText,byte encryptMethodSelect)
    {
        Encrypt.encryptIntroductionText(massOriginText);
        switch (encryptMethodSelect)
        {
            case 1:
                //Caesar
                Ceasar ces = new Ceasar();
                ces.encryptCeasar(massOriginText);

                break;
            case 2:
                //Permutation
                Permutation per = new Permutation();
                per.encryptPermutation(massOriginText);
                break;
            case 3:
                //Vizhinar
                Vizhinar encr = new Vizhinar();
                encr.encryptVizhinar(massOriginText);
                break;
            case 4:
                //XOR

                break;
            case 5:
                //Exit
                System.exit(0);
                break;
        }

    }
    private static void encryptIntroductionText(List<String> massOriginText){
        System.out.println("Origin text array:");
        System.out.println(massOriginText);
    }
    private void encryptFileWrite(){

    }
}
