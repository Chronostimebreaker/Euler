/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pvieuler;

import consola.Menu;
import consola.MenuCallback;
import metodos.EulerPVI;

/**
 *
 * @author Chrono's Laptop
 */
public class PVIEuler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Menu menu = new Menu();
        menu.setTitulo("Metodos Numericos");
        
                 menu.agregar("PVI: Euler", new MenuCallback(){
            public void ejecutar(){
                EulerPVI metodo =  new EulerPVI();
                metodo.consola();
            }
        });
                 menu.mostrar();
    }
    
}
