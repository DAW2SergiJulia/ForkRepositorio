/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author sergi
 */
public class Temperatura {
    //constructor vacio para reservar memoria dinamicamente
    public Temperatura(){
    }
    
    public double gr_fa (double gr) {
        double fa = (1.8*gr)+32;
        return fa;
    }
    
    public double fa_gr (double fa) {
        double gr = (fa-32)/1.8;
        return gr;
}
}

