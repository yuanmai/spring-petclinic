package org.springframework.samples.petclinic;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by alan.ye on 6/3/17.
 */
public class QueueTest {
    public Queue<String> q = new LinkedList<>();

    public QueueTest() {
        System.out.println("construction");
    }

    @Test
    public void size_of_empty_queue_should_be_zero() {
        Assert.assertEquals(q.size(), 0);
    }

    @Test
    public void size_should_increase_after_add_item() {
        q.add("item1");
        Assert.assertEquals(q.size(), 1);
    }

    @Test
    public void empty_queue_can_not_poll() {
        Assert.assertNull(q.poll());
    }

    @Test
    public void filo() {
        String firstItem = "item1";
        String latterIem = "item2";
        q.add(firstItem);
        q.add(latterIem);
        Assert.assertEquals(q.poll(), firstItem);
    }
}
