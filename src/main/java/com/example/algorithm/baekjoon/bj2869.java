package com.example.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        double A = Integer.parseInt(st.nextToken());
        double B = Integer.parseInt(st.nextToken());
        double V = Integer.parseInt(st.nextToken());

        int day = 1;

        day += Math.ceil((V-A)/(A-B));

        System.out.println(day);

    }

}
