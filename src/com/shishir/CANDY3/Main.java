package com.shishir.CANDY3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private BufferedReader br;
    private StringTokenizer st;
    static long TIME_START, TIME_END;

    public void run() throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        Runtime runtime = Runtime.getRuntime();
        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        TIME_START = System.currentTimeMillis();


        long t = nextLong();
        
        
        
        while(t-->0) {
        
        	long n = nextLong();
        	long count = 0;
        	
        	for(long i = 1; i <= n; i++) {
        		long c = nextLong();
        		count = (count + c)%n;
        	}
        	
        	if(count == 0) {
        		System.out.println("YES");
        	} else {
        		System.out.println("NO");
        	}
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
    
    private Long nextLong() throws IOException, NumberFormatException{
        return Long.parseLong(next());
    }
    
    public static void main(String[] args) throws java.lang.Exception{
        new Main().run();
    }
}