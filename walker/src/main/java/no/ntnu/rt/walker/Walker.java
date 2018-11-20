/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.ntnu.rt.walker;

import java.io.IOException;

/**
 *
 * @author andreas
 */
class Walker {
    private final LeftFeet left;
    private final RightFeet right;
    Thread leftFoot;
    Thread rightFoot;
    
    
    public Walker() throws IOException {
        left = new LeftFeet("left");
        right = new RightFeet("right");
        leftFoot = new Thread(left);
        rightFoot = new Thread(right);
        
    }

    
    public boolean walk() {
        System.out.println("walking");
        leftFoot.start();
        rightFoot.start();
        
        return true;
    }
    
}
