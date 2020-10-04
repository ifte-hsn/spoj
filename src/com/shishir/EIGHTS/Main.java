package com.shishir.EIGHTS;

import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {
    private BufferedReader br;
    private StringTokenizer st;
    static long TIME_START, TIME_END;

    public void run() throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        Runtime runtime = Runtime.getRuntime();
        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        TIME_START = System.currentTimeMillis();


        // TODO: start code from here
        int t = nextInt();
        
        while(t-->0) {
        	long k = Long.parseLong(next());
        	
        	System.out.println((192+(k-1)*250));
        }



        TIME_END = System.currentTimeMillis();
        long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
        System.err.println("Memory increased: " + (usedMemoryAfter - usedMemoryBefore) / 1000000);
        System.err.println("Time used: " + (TIME_END - TIME_START) + ".");
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
