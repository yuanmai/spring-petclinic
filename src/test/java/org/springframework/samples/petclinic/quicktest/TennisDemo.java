package org.springframework.samples.petclinic.quicktest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by raymond on 2017/6/3.
 */
public class TennisDemo {
    static Map<Integer, String> map = new HashMap<>();

    static {
        map.put(0, "Love");
        map.put(1, "Fifteen");
        map.put(2, "Thirty");
        map.put(3, "Forty");
    }

    public static String calculateScore(int serverScore, int receiveScore) {
        if (serverScore < 4 && receiveScore < 4) {
            if (serverScore != receiveScore) {
                return map.get(serverScore) + " " + map.get(receiveScore);
            } else {
                return map.get(serverScore) + " " + "All";
            }
        } else {
            if (serverScore == receiveScore) {
                return "Deuce";
            } else if (Math.abs(serverScore - receiveScore) == 1) {
                return serverScore > receiveScore ? "Advantage Server" : "Advantage Receiver";
            } else {
                return serverScore > receiveScore ? "Game to Server" : "Game to Receiver";
            }
        }
    }
}
