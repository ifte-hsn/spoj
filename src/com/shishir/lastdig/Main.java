package com.shishir.lastdig;

import java.util.*;
public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int a=sc.nextInt()%10,b=sc.nextInt();int res=0;
			if(b==0) {System.out.println(1); continue;};
			
			switch (a){
			case 0:
			case 1:
			case 6:
			case 5:
				res=a;
				break;
			case 2:
				if(b%4==0) res=6;
				else res=(int) Math.pow(a,b%4)%10;
				break;
			case 3:
			case 7:
			case 8:
				res=(int)Math.pow(a,b%4)%10;
				break;
			case 4:
				if(b%2==0) res=6;
				else res=4;
				break;
			case 9:
				if(b%2==0) res = 1;
				else res = 9;
				break;
			}
			System.out.println(res);
		}
	}
}
