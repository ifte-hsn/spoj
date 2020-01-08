package com.shishir.NSTEPS;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    BufferedReader br;
    StringTokenizer st;

    public void run() throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        int t = nextInt();

        while (t-->0) {
            int x = nextInt();
            int y = nextInt();
            int r;
            if(x==y) {
                if(x%2 == 0) {
                    r = x*2;
                } else {
                    r = ((x-1)*2)+1;
                }
                System.out.println(r);
            } else if(y == x-2) {
                if(x%2==0) {
                    r = x+y;
                } else {
                    r = (x+y)-1;
                }
                System.out.println(r);
            } else {
                System.out.println("No Number");
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
