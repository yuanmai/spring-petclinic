package org.springframework.samples.petclinic.quicktest;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by raymond on 2017/6/3.
 */
public class TennisDemoTest {

    @Test
    public void should_xxx_all_when_all_scores_small_than_4_and_equals() {
        Assert.assertEquals("Fifteen All", TennisDemo.calculateScore(1, 1));
    }

    @Test
    public void should_xxx_with_xxx_when_all_scores_small_than_4_and_not_equals() {
        Assert.assertEquals("Fifteen Thirty", TennisDemo.calculateScore(1, 2));
        Assert.assertEquals("Forty Thirty", TennisDemo.calculateScore(3, 2));
    }

    @Test
    public void should_deuce_when_all_scores_equals_or_bigger_than_4_and_equals() {
        Assert.assertEquals("Deuce", TennisDemo.calculateScore(4, 4));
        Assert.assertEquals("Deuce", TennisDemo.calculateScore(6, 6));
    }

    @Test
    public void should_advantage_server_when_server_equals_or_bigger_than_4_and_not_equals_and_subtract_equals_1() {
        Assert.assertEquals("Advantage Server", TennisDemo.calculateScore(4, 3));
        Assert.assertEquals("Advantage Server", TennisDemo.calculateScore(5, 4));
    }

    @Test
    public void should_advantage_receiver_when_server_equals_or_bigger_than_4_and_not_equals_and_subtract_equals_1() {
        Assert.assertEquals("Advantage Receiver", TennisDemo.calculateScore(3, 4));
        Assert.assertEquals("Advantage Receiver", TennisDemo.calculateScore(4, 5));
    }

    @Test
    public void should_game_to_server_when_one_of_score_bigger_than_4_and_subtract_equals_2() {
        Assert.assertEquals("Game to Receiver", TennisDemo.calculateScore(2, 4));
        Assert.assertEquals("Game to Server", TennisDemo.calculateScore(5, 3));
        Assert.assertEquals("Game to Server", TennisDemo.calculateScore(4, 0));
        Assert.assertEquals("Game to Receiver", TennisDemo.calculateScore(1, 4));
    }

}
