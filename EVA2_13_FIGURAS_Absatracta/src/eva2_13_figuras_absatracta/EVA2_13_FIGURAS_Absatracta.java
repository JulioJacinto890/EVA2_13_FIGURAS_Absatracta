/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_13_figuras_absatracta;

/**
 *
 * @author hp
 */
public class EVA2_13_FIGURAS_Absatracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // figura figu=  new figura();
        
     Circulo circ = new Circulo();
     circ.setRadio(18);
     System.out.println(circ);
     
     Triangulo tri = new Triangulo();
     tri.setBase(12);
     tri.setAltura(45);
     System.out.println(tri);
     
    }
    
}