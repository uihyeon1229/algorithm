package com.example.algorithm.Programmers;

import java.util.Arrays;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] cut = Arrays.copyOfRange(array,commands[i][0]-1, commands[i][1]);
            Arrays.sort(cut);
            answer[i] = cut[commands[i][2]-1];
        }
        return answer;
    }
}
