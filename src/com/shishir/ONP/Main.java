package com.shishir.ONP;

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    private BufferedReader br;
    private StringTokenizer st;
    PrintWriter pw;
    Stack<Character> stack;
    Map<Character, Integer> priorityMap;
    String expression;

    private void solve() throws NumberFormatException, IOException {
        int t = nextInt();
        priorityMap = new HashMap<Character, Integer>();
        //(^/*+-
        priorityMap.put('-', 1);
        priorityMap.put('+', 1);
        priorityMap.put('*', 2);
        priorityMap.put('/', 2);
        priorityMap.put('^', 3);
        priorityMap.put('(', 4);
        priorityMap.put(')', 4);

        while (t-- > 0) {
            String n = next();
            int length = n.length();
            stack = new Stack<Character>();
            expression = "";

            for (int i = 0; i < length; i++) {
                char ch = n.charAt(i);
                switch (ch) {
                    //(^/*+-
                    case '-':
                    case '+':
                    case '*':
                    case '/':
                    case '^':
                        push(ch);
                        break;
                    case '(':
                        stack.push(ch);
                        break;
                    case ')':
                        while (stack.peek() != '(') {
                            expression += stack.pop();
                        }
                        stack.pop();
                        break;
                    default:
                        expression += ch;
                        break;
                }
            }

            while (!stack.isEmpty()) {
                expression += stack.pop();
            }

            System.out.println(expression);
        }
    }

    private void push(Character ch) {
        if(stack.isEmpty()) {
            stack.push(ch);
        } else if(stack.peek() == '(') {
          stack.push(ch);
        } else if((priorityMap.get(stack.peek()) >= priorityMap.get(ch))) {
            expression += stack.pop();
            stack.push(ch);
        }
    }
    private void run() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(new BufferedOutputStream(System.out));
        solve();
    }

    private String next() throws IOException {
        if (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    private int nextInt() throws NumberFormatException, IOException {
        return Integer.parseInt(next());
    }

    public static void main(String[] args) throws java.lang.Exception {
        new Main().run();
    }
}