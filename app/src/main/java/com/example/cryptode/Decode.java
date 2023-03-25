package com.example.cryptode;

import static java.lang.Math.pow;


public class Decode {
    public static String decrypt(String s){
        String invalid = "This code was not encrypted by Cryptode";
        String initializer = "111111111";
        Boolean flag = true;
        for (int i = 0; i < 8; i++) {
            if (initializer.charAt(i) != s.charAt(i)){
                flag = false;
                break;
            }
        }
        
        String data = "";
        for (int i = 8; i < s.length(); i++) {
            char temp = s.charAt(i);
            data = data.concat(String.valueOf(temp));
        }
        int asc[][] = new int[11101][8];
        int idx=1, idx2=0;
        for (int i = 0; i < data.length(); i++) {
            if (i%7==0) {
                idx++;
                idx2 = 0;
                char temp = data.charAt(i);
                asc[idx][idx2] = temp - '0';
                idx2++;
            }else {
                char temp = data.charAt(i);
                asc[idx][idx2] = temp - '0';
                idx2++;
            }
        }

        int num[] = new int[11111];
        int nidx=0, temp=0, count=0;
        for (int i = 0; i <= idx ; i++) {
            count = 0;
            temp = 0;
            for (int j = 6; j >=0 ; j--) {
                int temp1 = (int)pow(2,count);
                temp += (asc[i][j]*temp1);
                count++;
            }
            num[nidx++] = temp;

        }
        String rev = "";
        char ch;
        for (int i = 0; i < nidx; i++) {
            ch = (char)num[i];
            rev = rev.concat(String.valueOf(ch));
        }
        if (data.length() %7 == 0 && flag == true){
            return rev;
        }else{
            return invalid;
        }
    }
}
