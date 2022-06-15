package com.example.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj4948 {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



            while(true) {

                int N = Integer.parseInt(br.readLine());

                if(N==0){
                    break;
                }

                int cnt = 0;
                int[] prime = new int[2*N+1];

                for (int i = 0; i <= 2 * N; i++) {
                    prime[i] = i;
                }

                prime[0] = prime[1] = 0;

                for (int i = 2; i <= Math.sqrt(2 * N + 1); i++) {
                    if (prime[i] != 0) {
                        for (int j = i * i; j <= 2 * N; j += i) {
                            prime[j] = 0;
                        }
                    }
                }

                for (int i = N + 1; i <= 2 * N; i++) {
                    if (prime[i] != 0) {
                        cnt++;
                    }
                }

                System.out.println(cnt);
            }
    }
}
