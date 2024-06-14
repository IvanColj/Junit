package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class functionsTest {

    functions functions = new functions();

    @Test
    public void test_true_privacy() {
        boolean privacy = functions.privacy(12);
        Assertions.assertTrue(privacy);
    }

    @Test
    public void test_false_privacy() {
        boolean privacy = functions.privacy(13);
        Assertions.assertFalse(privacy);
    }

    @Test
    public void test_smallest() {
        int smallest = functions.smallest(9);
        Assertions.assertEquals(3, smallest);
    }


}
