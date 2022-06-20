package com.example.algorithm.Programmers;

import java.util.HashMap;
import java.util.Iterator;

public class 위장 {
    public int solution(String[][] clothes) {
        int answer = 0;

        HashMap<String, Integer> map = new HashMap<>();
        for(String[] clothe : clothes) {
            String type = clothe[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        Iterator<Integer> it = map.values().iterator();
        answer = 1;

        while(it.hasNext()){
            answer *= it.next().intValue()+1;
        }

        return answer-1;
    }
}
