package com.shishir.JULKA;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;
    static long TIME_START, TIME_END;

    public void run() throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        Runtime runtime = Runtime.getRuntime();
        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        TIME_START = System.currentTimeMillis();
        
        
        int t = 10;
        
        while(t-->0) {
        	// TODO: start code from here
            BigInteger n = new BigInteger(next());
            BigInteger x = new BigInteger(next());
            BigInteger div = new BigInteger("2");
            
            n = n.subtract(x);
            
            n = n.divide(div);
            
            BigInteger y = n.add(x);
            
            System.out.println(y+" "+n);
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
