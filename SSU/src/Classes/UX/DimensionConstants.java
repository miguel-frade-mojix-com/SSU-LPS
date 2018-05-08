/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.UX;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author Miguel
 */
public class DimensionConstants {
    
    static GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    
    private static final int PC_WIDTH = gd.getDisplayMode().getWidth();
    private static final int PC_HEIGHT = gd.getDisplayMode().getHeight();
    
    public static int getMaxWidth(){return PC_WIDTH;}
    public static int getMaxHeight(){return PC_HEIGHT;}
    
    
    
    
}
