package com.lebedevas;

/**
 * Created by arty on 07-Aug-16.
 */
public abstract class Animal {
    private Moving movingType;

    public Animal(Environment environment) {
        switch (environment) {
            case Earth: {
                movingType = new Walking();
                break;
            }

            //TO DO Crawling

            case Water: {
                movingType = new Swimming();
                break;
            }
            case Air: {
                movingType = new Flying();
                break;
            }
        }
    }

    public abstract void eat();
}
