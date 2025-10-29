package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class StackTest {

    private Stack emptyStack;
    private Stack stack;

    @Before
    public void setUp(){
        emptyStack = new Stack(3);
        stack = new Stack(3);

        // fill up entire stack with elements
        for(int i = 1; i <= 3; i++){
            stack.push(i);
        }
    }


    /// Tests for isEmpty method ///
    @Test
    public void testIsEmptyFalse(){
        Assert.assertFalse(stack.isEmpty());
    }

    @Test
    public void testIsEmptyTrue(){
        Assert.assertTrue(emptyStack.isEmpty());
    }


    /// Tests for pop method ///
    @Test
    public void testPopElement(){
        Assert.assertEquals(3, stack.pop());
    }

    @Test
    public void testPopElementEmptyStack(){
        Assert.assertEquals(-1, emptyStack.pop());
    }


    /// Tests for push method ///
    @Test
    public void testPushElement(){
        emptyStack.push(5);
        Assert.assertEquals(5, emptyStack.pop());
    }

    @Test(expected = StackOverflowError.class)
    public void testPushElementOnFullStack(){
        stack.push(2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPushNegativeElement(){
        stack.push(-2);
    }


    /// Tests for size method ///
    @Test
    public void testSizeEmptyStack(){
        Assert.assertEquals(0, emptyStack.size());
    }

    @Test
    public void testSizeNotEmptyStack(){
        Assert.assertEquals(3, stack.size());
    }


    /// Tests for top method in test-driven manner ///
    @Test
    public void testTopElement(){
        Assert.assertEquals(3, stack.top());

        // test if element was not removed
        Assert.assertEquals(3, stack.top());
    }

    @Test
    public void testTopEmptyStack(){
        Assert.assertEquals(-1, emptyStack.top());
    }


}
