package org.springframework.samples.petclinic;

/**
 * Created by alan.ye on 6/3/17.
 */
public class Tennis {
    public String judge(int server, int receiver) {
        String result = "";
        if (server == receiver) {
            result = handleEqual(server, receiver);
        }
        if (server > receiver && server > 4) {
            result = "a-s";
        }
        if (server < receiver && receiver > 4) {
            result = "a-r";
        }
        if (server > receiver && server >= 4 && (server - receiver) == 2) {
            result = "s-w";
        }
        return result;
    }

    public String handleEqual(int server, int receiver) {
        String result;
        switch (server) {
            case 0:
                result = "love";
                break;
            case 1:
                result = "fifteen";
                break;
            case 2:
                result = "thirty";
                break;
            case 3:
                result = "forty";
                break;
            default:
                result = "deuce";

        }
        if (server < 4) {
            result = result + " all";
        }
        return result;
    }
}
