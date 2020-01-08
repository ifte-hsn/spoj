package com.shishir.FCTRL2;



import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    BufferedReader br;
    StringTokenizer st;

    public static void main(String[] args) throws java.lang.Exception{
        new Main().run();
    }

    private void run() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int t = nextInt();

        while(t --> 0) {
            int n = nextInt();

            int[] res = new int[158];
            int resSize = 1;
            res[0] = 1;

            factorial(n, resSize, res);
        }
    }

    private void factorial(int n, int resSize, int[] res) {
        for(int i = 2; i<=n; i++) {
            int carry = 0;
            for(int j = 0; j < resSize; j++) {
                int k = (res[j] * i) + carry;
                res[j] = k % 10;
                carry = k/10;
            }

            while(carry != 0) {
                res[resSize] = carry%10;
                carry = carry/10;
                resSize++;
            }
        }

        for(int i = resSize-1; i >=0; i--) {
            System.out.print(res[i]);
        }
        System.out.print("\n");
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
}
