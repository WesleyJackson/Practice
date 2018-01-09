package com.company.Katas;

import javafx.util.Pair;

import java.util.ArrayList;

public class TennisGame {
    public ArrayList<Pair> players;

    public TennisGame() {
        players = new ArrayList<>();
    }

    public void addPlayer(Pair newPlayer) {
        players.add(newPlayer);
    }

//    public void setScore(String name, int score) {
//        for (int i = 0; i < players.size(); i ++){
//            if(players.set())
//        }
//    }

    public String getScoreName(String playerName) {
        int temporaryScore = -1;

        for (int i = 0; i < players.size(); i ++){
            Pair temporaryPair = ((Pair) players.get(i));
            if(temporaryPair.getKey() == playerName) {
                temporaryScore = ((int) temporaryPair.getValue());
            }
        }

        if(temporaryScore == 0) {
            return "love";
        }
        else if(temporaryScore == 1){
            return "fifteen";
        }
        else if(temporaryScore == 2){
            return "thirty";
        }
        else if(temporaryScore == 3){
            return "forty";
        }
        return "Incorrect Player Name";
    }
}
