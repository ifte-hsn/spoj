package com.shishir.COINS;


import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    private BufferedReader br;
    private StringTokenizer st;
    static long TIME_START, TIME_END;

    private static final int length = 100000001;
    int[] cache = new int[length];


    public void run() throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        Runtime runtime = Runtime.getRuntime();
        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        TIME_START = System.currentTimeMillis();




        for (int i = 0; i < 12; i++) {
            cache[i] = i;
        }

        for (int i = 12; i < length; i++) {
            int val = cache[i / 2] + cache[i / 3] + cache[i / 4];
            if (val < i) {
                val = i;
            }
            cache[i] = val;
        }

        try {
            while (true) {
                int n = nextInt();
                System.out.println(calc(n));
            }
        } catch (Exception e){}

        TIME_END = System.currentTimeMillis();
        long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
        System.err.println("Memory increased: " + (usedMemoryAfter - usedMemoryBefore) / 1000000);
        System.err.println("Time used: " + (TIME_END - TIME_START) + ".");
    }

    private long calc(int n) {
        if (n < length) {
            return cache[n];
        }

        return calc(n / 2) + calc(n / 3) + calc(n / 4);
    }

    private String next() throws IOException {
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