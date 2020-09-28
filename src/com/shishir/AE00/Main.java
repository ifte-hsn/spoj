package com.shishir.AE00;

import java.util.*;
import java.io.*;

public class Main {

	private BufferedReader br;
	private StringTokenizer st;

	private String next() throws IOException {
		if (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine());
		}
		return st.nextToken();
	}

	private int nextInt() throws NumberFormatException, IOException {
		return Integer.parseInt(next());
	}

	private void run() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		solve();
	}

	private void solve() throws IOException {
		int[] cache = new int[10001];

		for (int i = 0; i <= 3; i++) {
			cache[i] = i;
		}

		for (int i = 4; i <= 10000; i++) {

			int j = 1;
			int count = 0;

			while (j <= Math.sqrt(i)) {
				if (i % j == 0)
					count++;
				j++;
			}

			cache[i] = cache[i - 1] + count;
		}

		int n = nextInt();

		System.out.println(cache[n]);

	}

	public static void main(String[] args) throws java.lang.Exception {
		new Main().run();
	}
}
