/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.ntnu.rt.walker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rasmu
 */
public class LeftCalculator extends Calculator implements Runnable {

    public LeftCalculator(String side) {
        super(side);

    }

    @Override
    public void walkingPattern() {

        try {
            if (!Constants.reset) {
                super.getWalk().calculate(createArray(Constants.currentFootStateLeft), Constants.l1, super.getSide(), 50);
                System.out.println("Left foot: " + timing());
                Thread.sleep(2000);
                
                super.getWalk().calculate(createArray(Constants.currentFootStateLeft), Constants.l2, super.getSide(), 50);
                System.out.println("Left foot: " + timing());
                Thread.sleep(1000);
                super.getWalk().calculate(createArray(Constants.currentFootStateLeft), Constants.l21, super.getSide(), 50);
                System.out.println("Left foot: " + timing());
                Thread.sleep(1500);
                super.getWalk().calculate(createArray(Constants.currentFootStateLeft), Constants.l3, super.getSide(), 15);
                System.out.println("Left foot: " + timing());
                Thread.sleep(1000);
                super.getWalk().calculate(createArray(Constants.currentFootStateLeft), Constants.l31, super.getSide(), 15);
                System.out.println("Left foot: " + timing());
                Thread.sleep(1000);
                super.getWalk().calculate(createArray(Constants.currentFootStateLeft), Constants.l4, super.getSide(), 15);
                System.out.println("Left foot: " + timing());
                Thread.sleep(1500);
                super.getWalk().calculate(createArray(Constants.currentFootStateLeft), Constants.l41, super.getSide(), 15);
                System.out.println("Left foot: " + timing());
                Thread.sleep(1000);
                super.getWalk().calculate(createArray(Constants.currentFootStateLeft), Constants.l42, super.getSide(), 15);
                System.out.println("Left foot: " + timing());
                Thread.sleep(1000);

                Thread.sleep(5000);
                super.getWalk().calculate(createArray(Constants.currentFootStateLeft), Constants.startValuesL, super.getSide(), 25);
            } else {
                super.getWalk().calculate(createArray(Constants.currentFootStateLeft), Constants.startValuesL, super.getSide(), 10);
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(LeftFoot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int[] createArray(AtomicIntegerArray at){
        int[] current = new int[5];
        for (int i = 0; i < 5; i++) {
            current[i] = at.get(i);
        }
        return current;
    }

}
