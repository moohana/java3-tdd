
// Write a program to set up an array of places, Loop round and remove the vowels. Display the new
//words in console

package com.stackroute.unitTest;
import java.util.ArrayList;
public class ArrayOfplaces {
    public String[] check(String[] in) {
        if (in != null) {
            String[] out = new String[in.length];
            for (int i = 0; i < in.length; i++) {
                out[i] = "";
                for (int j = 0; j < in[i].length(); i++) {
                    if (!isVowel(in[i].charAt(j))) {
                        out[i] += in[i].charAt(j);
                    }
                }
            }

            return out;
        }
        return null;

    }

    static boolean isVowel (char c_in){

        switch(c_in){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': return true;
            default : return false;
        }

    }

}