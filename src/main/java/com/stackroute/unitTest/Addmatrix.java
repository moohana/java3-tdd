//Write a program to compute the addition of two matrix, Read the number of rows and columns
//as input, also the values of each matrix

package com.stackroute.unitTest;
import java.util.Scanner;

public class Addmatrix {
    public int[][] checkmatrix(int[][] in1, int[][] in2) {
        int[][] out=null;
        if(in1 != null && in2 != null) {
            out = new int[in1.length][in1[0].length];

            for (int i = 0; i < in1.length; i++) {
                for (int j = 0; j < in1[i].length; j++) {
                    out[i][j] = in1[i][j] + in2[i][j];
                }
            }
            return out;
        }

        return null;
    }

}



