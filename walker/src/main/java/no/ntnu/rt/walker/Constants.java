/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.ntnu.rt.walker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author andreas
 */
public class Constants {
    public static boolean walking = true;
    public static String serverAddress = "158.38.140.203";
    public static List<Integer> ports;
    public static Integer[] leftFootInit = new Integer[]{37, 50, 40, 100};
    public static Integer[] rightFootInit = new Integer[]{37, 50, 40, 100};
    public static Integer[] leftFootWalk0 = new Integer[]{37, 40, 170, 70};
    public static Integer[] leftFootWalk1 = new Integer[]{37, 60, 170, 90};
    public static Integer[] leftFootWalk2 = new Integer[]{37, 50, 130, 90};
    public static Integer[] setToZero = new Integer[]{37, 50, 30, 90};
    public static Integer[] sitPartlyDown = new Integer[]{37, 10, 180, 30};
    public static AtomicInteger state = new AtomicInteger(0);
    
    
    
}