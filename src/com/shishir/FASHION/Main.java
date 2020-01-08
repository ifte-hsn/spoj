package com.shishir.FASHION;

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
            int n = nextInt();
            int[] m = new int[n];
            int[] f = new int[n];

            for(int i = 0; i<n; i++) {
                m[i] = nextInt();
            }

            Arrays.sort(m);

            for(int i = 0; i<n; i++) {
                f[i] = nextInt();
            }

            Arrays.sort(f);

            int mmd = 0;
            for(int i = 0; i<n; i++) {
                mmd += m[i]*f[i];
            }

            System.out.println(mmd);
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