/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22;

import java.util.ArrayList;

/**
 *
 * @author aparcerozas
 */
public class Boletin22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Correo> lista = new ArrayList<>();
        Buzon obx = new Buzon(lista);
        Correo a = new Correo("Como Pedro por su casa",true);
        Correo b = new Correo("El que las da, las toma",true);
        Correo c = new Correo("Van dos y se cae el de en medio",true);
        Correo d = new Correo("El que parte y reparte, se lleva la mejor parte",true);
        obx.engade(a);
        obx.engade(b);
        obx.engade(c);
        obx.engade(d);
        System.out.println(obx.numeroDeCorreos());
        System.out.println(obx.porLer());
        System.out.println(obx.amosa(2));
        System.out.println(obx.amosaPrimerNoLeido());
        obx.elimina(1);
        System.out.println(obx.numeroDeCorreos());
    }
    
}
