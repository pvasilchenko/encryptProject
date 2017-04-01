package com.DNURT.encryption;


import java.util.List;

public class Vizhinar{

    public void encryptVizhinar(List<String> massOriginText){
        char[] f = new char[0];
        for(int i=0; i< massOriginText.size();i++) {
            String[] tmp = massOriginText.get(i).split(" ");
            for(int j=0; j<tmp.length;j++)
            {
                f = tmp[j].toCharArray();
            }
        }

    }
}
