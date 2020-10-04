package com.shishir.PALIN;


import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    private BufferedReader br;
    private StringTokenizer st;
    static long TIME_START, TIME_END;

    public void run() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        Runtime runtime = Runtime.getRuntime();
        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        TIME_START = System.currentTimeMillis();


        solve();



        TIME_END = System.currentTimeMillis();
        long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
//        System.err.println("Memory increased: " + (usedMemoryAfter - usedMemoryBefore) / 1000000);
//        System.err.println("Time used: " + (TIME_END - TIME_START) + ".");
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
    
    private void solve() throws Exception{
    	int t = nextInt();
    	
    	while(t-->0) {
    		String numStr = next();
    		int[] numArr = new int[numStr.length()];
    		int length = numStr.length();
    		
    		for(int i = 0; i<length; i++) {
    			numArr[i] = Character.getNumericValue(numStr.charAt(i));  
    		}
    		
    		if(all9(numArr, length)) {
    			System.out.print("1");
    			for(int i = 0; i < length-1; i++) {
    				System.out.print("0");
    			}
    			System.out.print("1\n");
    		}else {
    			generateNextPalindrome(numArr, length);
    		}
    		
    	}
    }
    
    public void generateNextPalindrome(int[] num, int length) {
    	int mid = length / 2; 
    	int i = mid - 1; 
    	int j = (length%2 == 0) ? mid : mid+1;
    	boolean leftSmaller = false;
    	
    	while(i>=0 && num[i]==num[j]) {
    		i--;
    		j++;
    	}
    	
    	if(i<0 || num[i]<num[j])  {
    		leftSmaller = true;
    	}
    	
    	while(i>=0) {
    		num[j++] = num[i--]; 
    	}
    	
    	
    	
    	if(leftSmaller) {
    		int carry = 1;
    		
    		if(length%2 == 1) {
    			num[mid] += 1;
    			carry = num[mid]/10;
    			num[mid] %= 10;
    		}
    		i = mid - 1; 
        	j = (length%2 == 0) ? mid : mid+1;
        	
        	while(i >= 0 && carry>0) {
        		num[i] = num[i]+1;
        		carry = num[i]/10;
        		num[i] %= 10;
        		num[j] = num[i];
        		i--;
        		j++;
        	}
    	}
    	
    	
    	printArray(num);
    	
    }
    
    public void printArray(int[] num) {
    	for(int i : num) {
    		System.out.print(i);
    	}
    	System.out.print("\n");
    }
    
    public boolean all9(int[] num, int length) {
    	for(int i = 0; i<length; i++) {
    		if(num[i] != 9) return false;
    	}
    	return true;
    }
    
    
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}
