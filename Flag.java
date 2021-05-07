/* Based on the ecs 100 template
 * Code for ??
 * Name:
 * Date:
 */


import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;





/** <description of class Flag>
 */
public class Flag{
    
    
    
    private final double STAFFHEIGHT = 100;
    private final double STAFFBASE = 800;
    private final double STAFFX = 500;
    final double HUNGARYRATIO = 2/3;
    
    
    /**     
    *   
    */
    public Flag(){
    UI.initialise();
    UI.addButton("Quit", UI::quit);
    }

    /**   CORE
     * Draw the flag of Hungary.
     * The flag has three vertical stripes;
     * The left is black, the middle is yellow, and the right is red.
     * The flag is 13/15 as high as it is wide (ratio 13:15).
     */
    public void drawHungaryFlag(double x, double y){
        UI.clearGraphics(); // clears pane
        
        // flagstaff
        UI.setColor(Color.black);
        UI.setLineWidth(20);
        UI.drawLine(STAFFX, STAFFHEIGHT, STAFFX, STAFFBASE);
        
        
        // sets flag ratio, width, height and colours
        
        UI.println("Hungarian Flag");
        UI.setLineWidth(1);
        double xcoord, ycoord, height, width;
        
        width = 250;
        height = width * HUNGARYRATIO;      
        
        xcoord = x;
        ycoord = y;
        
        UI.setColor(Color.red);                  // set colour to red
        UI.fillRect(xcoord, ycoord, width, height/3);
        UI.setColor(Color.white);                  // set colour to white
        UI.fillRect(xcoord, ycoord + (height/3), width, height/3);
        UI.setColor(Color.green);                  // set colour to green
        UI.fillRect(xcoord, ycoord + (height/3) * 2, width, height/3);
        
    }  

    public static void drawFlagPole(double width){
        
    }

}

