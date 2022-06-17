package com.example.algorithm.Programmers;

import java.util.HashMap;

public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        HashMap<String ,Integer> player = new HashMap<String ,Integer>();

        for(String name : participant){
            if(player.get(name)==null){
                player.put(name,1);
            }else{
                player.put(name,player.get(name)+1);
            }
        }

        for(String name : completion){
//            if(player.get(name)!=0){
                player.put(name, player.get(name)-1);
//            }
        }

        for(String key : player.keySet()){
            if(player.get(key)!=0){
                return key;
            }
        }

        return "";
    }
}