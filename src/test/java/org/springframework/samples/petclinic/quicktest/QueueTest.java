package org.springframework.samples.petclinic.quicktest;

import com.google.common.collect.Queues;
import org.junit.Assert;
import org.junit.Test;

import java.util.Queue;

/**
 * Created by raymond on 2017/6/3.
 */
public class QueueTest {

    @Test
    public void size_should_be_zero_if_queue_is_empty() {
        Queue<Integer> queue = Queues.newSynchronousQueue();
        Assert.assertTrue(queue.size() == 0);
    }

//    @Test
//    public void size_should_be_increase_after_pushing_element() {
//        Queue<Integer> queue = Queues.newSynchronousQueue();
//        queue.add(1);
//        Assert.assertTrue(queue.size() == 1);
//    }

    public void element_should_be_drain_by_pushing_order() {
        Queue<Integer> queue = Queues.newSynchronousQueue();
        queue.add(1);
        queue.add(2);

    }

}
