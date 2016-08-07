package com.lebedevas;

/**
 * Created by arty on 07-Aug-16.
 */
public class Walking implements Moving {
    public void Move(int distance) {
        System.out.println("Walk: " + distance);
    }
}
