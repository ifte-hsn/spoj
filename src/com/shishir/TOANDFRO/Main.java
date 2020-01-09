package com.shishir.TOANDFRO;


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
        try {
            while (true) {
                int n = nextInt();
                if(n == 0) {
                    break;
                }
                String str = next();

                char[] ch = str.toCharArray();
                int length = ch.length;
                int row = length/n;
                char[][] colArray = new char[length/n][n];

                int i = 0;
                while (i < length) {
                    for(int j=0; j< row; j++) {
                        if(j%2 == 0) {
                            for(int k = 0; k <n; k++) {
                                colArray[j][k] = ch[i];
                                i++;
                            }
                        } else {
                            for(int k = n-1; k >=0; k--) {
                                colArray[j][k] = ch[i];
                                i++;
                            }
                        }

                    }
                }

                for(i = 0; i < n; i++) {
                    for(int j = 0; j < row; j++) {
                        System.out.print(colArray[j][i]);
                    }
                }
                System.out.print("\n");
            }
        }catch (Exception e){}


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
