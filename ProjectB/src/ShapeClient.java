/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author taruc
 */

//import ShapeService.*;

public class ShapeClient {
    public static void main(String[] args){
        //Circle objC = new Circle();
        //objC.draw();
        
        //FacadeDraw f = new FacadeDraw();
        //f.drawSquare();

        //Singleton --> Only one object 
        FacadeDraw fds = FacadeDraw.getInstance();

        fds.drawCircle();
        fds.drawRectangle();
        fds.drawSquare();
    }
}
