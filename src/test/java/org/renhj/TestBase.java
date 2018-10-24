package org.renhj;

import org.junit.After;
import org.junit.Before;

public class TestBase {
    @Before
    public void before(){
        System.out.println("Test before");
    }

    @After
    public void after(){
        System.out.println("Test after");
    }
}
