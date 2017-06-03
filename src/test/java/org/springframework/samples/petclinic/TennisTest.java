package org.springframework.samples.petclinic;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by alan.ye on 6/3/17.
 */
public class TennisTest {
    Tennis tennis = new Tennis();

    @Test
    public void testDeuce() {
        Assert.assertEquals("deuce", tennis.judge(4, 4));
        Assert.assertEquals("deuce", tennis.judge(6, 6));
    }

    @Test
    public void testLessThan4() {
        Assert.assertEquals("fifteen all", tennis.judge(1, 1));
        Assert.assertEquals("forty all", tennis.judge(3, 3));
    }

    @Test
    public void testAdvantageServer() {
        Assert.assertEquals("a-s", tennis.judge(5, 4));
    }

    @Test
    public void testAdvantageReceiver() {
        Assert.assertEquals("a-r", tennis.judge(4, 5));
    }

    @Test
    public void testServerWin() {
        Assert.assertEquals("s-w", tennis.judge(4, 2));
        Assert.assertEquals("s-w", tennis.judge(5, 3));
        Assert.assertEquals("s-w", tennis.judge(6, 4));
    }
}
