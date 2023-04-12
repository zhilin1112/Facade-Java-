/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import ShapeService.*;

public class FacadeDraw {
    private Circle c;
    private Rectangle r; 
    private Square s;
    
    //constructor - to link facade to main components 
    public FacadeDraw(){
        c = new Circle();
        r = new Rectangle();
        s = new Square();
    }
    
    public void drawCircle(){
        c.draw();
    }
    
    public void drawRectangle(){
        r.draw();
    }
    
    public void drawSquare(){
        s.draw();
    }
}
