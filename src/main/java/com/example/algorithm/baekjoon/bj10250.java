package com.example.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj10250 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){

            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int floor;
            int width;

            if(N%H==0){
                floor = H;
            } else {
                floor = N%H;
            }

            if(N%H==0){
                width = N/H;
            } else {
                width = (N/H)+1;
            }

            int answer = (floor*100)+width;

            System.out.println(answer);

        }

    }
}