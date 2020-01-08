package com.shishir.SAMER08F;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    BufferedReader br;
    StringTokenizer st;

    public void run() throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        int s;
        while ((s = nextInt()) !=0) {
            int r = 0;
            while (s >= 1) {
                r += s*s;
                s--;
            }

            System.out.println(r);
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