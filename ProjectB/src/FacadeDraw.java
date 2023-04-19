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
    // public FacadeDraw(){
    //     c = new Circle();
    //     r = new Rectangle();
    //     s = new Square();
    // }


    //Singleton step 2: objevt as attributte
    //The only object fds is created
    private static FacadeDraw fds = new FacadeDraw(); 

    //singleton step 1 : private constructor 
    private FacadeDraw(){
        c = new Circle();
        r = new Rectangle();
        s = new Square();
    }

    //singleton step 3: Create entry point to access object
    public static FacadeDraw getInstance(){
        return fds;
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
