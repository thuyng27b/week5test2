/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.task2;

/**
 *
 * @author Huy Hung
 */
public class Week5Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Circle tr= new Circle(3, "do",true);
       System.out.println( tr.toString());
       Rectangle cn= new Rectangle(2,4,"xanh", false);
       System.out.println(cn.toString());
   }
    
    
}
