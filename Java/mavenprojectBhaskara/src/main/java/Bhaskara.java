/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Bhaskara {
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */import javax.swing.JOptionPane;
public class Bhaskara {
    //Pacote de extensão do núcleo de java
    public static void main(String args[]) {
        
     double a = 4;
    double b = 1;
    double c = 2;
    
    double Delta = ((b*b)-4*a*c);
   double RDelta = Math.sqrt(Delta);
    
    double x1 = (b + (RDelta))/2*a;
    double x2 = (-b + (RDelta))/2*a;
    
   System.out.println("X1 = " + x1+ "X2 = " + x2);
        
    }
}
