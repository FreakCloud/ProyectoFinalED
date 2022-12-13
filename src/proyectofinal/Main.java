/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import objeto.Estrudiante;

/**
 *
 * @author lopez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estrudiante e1 = new Estrudiante(47, "Angel", 19);
        Estrudiante e2 = new Estrudiante(58, "Diego", 16);
        Estrudiante e3 = new Estrudiante(62, "Cesar", 15);
        //HashMap
        Map<String, Estrudiante> lista = new HashMap<String, Estrudiante>();
        lista.put("Segundo", e2);
        lista.put("Primero", e1);
       
        System.out.println(lista.values());
        
         for(Entry<String, Estrudiante> entry : lista.entrySet()){
             System.out.println("Clave: " + entry.getKey()+" - "+ entry.getValue());
         }
     
        Estrudiante eNuevo = lista.get("Segundo");
        System.out.println(eNuevo);
        
        System.out.println();
        System.out.println(lista.getOrDefault("Pr", e3));
        
        System.out.println();
  
        System.out.println(lista.size());
        lista.remove("Primero");
        System.out.println(lista.size());
        
        System.out.println(lista.containsKey("Segundo"));
        
        lista.clear();
        System.out.println(lista.isEmpty());
        
    }
    
}
