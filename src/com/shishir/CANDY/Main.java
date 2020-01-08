package com.shishir.CANDY;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    BufferedReader br;
    StringTokenizer st;

    public void run() throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        while ((n = nextInt()) != -1) {
            int[] arr = new int[n];
            int sum = 0;
            for(int i = 0; i < n; i++) {
                arr[i] = nextInt();
                sum += arr[i];
            }

            if(sum%n != 0) {
                System.out.println(-1);
            } else {
                int move = 0;
                int avg = (int) sum/n;

                for(int i = 0; i<n; i++) {
                    if(arr[i] < avg) {
                        move += (avg-arr[i]);
                    }
                }
                System.out.println(move);
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