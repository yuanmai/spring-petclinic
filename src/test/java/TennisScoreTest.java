import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: andy.lai
 * Date: 03/06/2017
 * Time: 10:05 AM
 */
public class TennisScoreTest {

    @Test
    public void test_1(){
        Assert.assertEquals("Fifteen Thirty",TennisDemo.calculateScore(1,2));
        Assert.assertEquals("Game to Server",TennisDemo.calculateScore(4,2));
        Assert.assertEquals("Game to Server",TennisDemo.calculateScore(4,0));
        Assert.assertEquals("Forty All",TennisDemo.calculateScore(3,3));
        Assert.assertEquals("Deuce",TennisDemo.calculateScore(5,5));

    }
}
