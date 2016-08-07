package com.lebedevas;

/**
 * Created by arty on 07-Aug-16.
 */
public class Flying implements Moving {
    public void Move(int distance) {
        System.out.println("Fly: " + distance);
    }
}
