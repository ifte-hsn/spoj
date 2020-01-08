package com.shishir.ACPC10A;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    BufferedReader br;
    StringTokenizer st;

    public void run() throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        int a1, a2, a3;

        while (true) {
            a1 = nextInt();
            a2 = nextInt();
            a3 = nextInt();

            if((a1 == 0) && (a2 == 0) && (a3 == 0)) {
                break;
            }
           if((a2-a1) == (a3-a2)) {
               int next = a3+(a3-a2);
               System.out.println("AP "+next);
           } else {
               int next = a3*(a3/a2);
               System.out.println("GP "+next);
           }
        }

    }
    private String next() throws IOException{
        while(st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }
    private int nextInt() throws IOException, NumberFormatException{
        return Integer.parseInt(next());
    }
    public static void main(String[] args) throws java.lang.Exception{
        new Main().run();
    }
}