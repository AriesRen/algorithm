package org.renhj.linkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListLRUCacheTest {
    private LRUCache<String> lruCache;
    @Before
    public void before(){
        lruCache = new ListLRUCache<>();
    }

    @Test
    public void put() {
//        lruCache.put("test");
        lruCache.get("test");
        System.out.println(lruCache.Size());
    }

    @Test
    public void get() {

    }
}