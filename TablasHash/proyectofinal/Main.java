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
        Map<String, Estrudiante> lista = new HashMap<String, Estrudiante>(); //Inicializar objeto lista Map de tipo HashMap
        lista.put("Segundo", e2);
        lista.put("Primero", e1); //elementos de la lista 
       
        System.out.println(lista.values()); //manera de imprimir los elementos de la lista 
        
         for(Entry<String, Estrudiante> entry : lista.entrySet()){
             System.out.println("Clave: " + entry.getKey()+" - "+ entry.getValue());
         } //Mejor manera de imprimir los elementos de una lista
     
        Estrudiante eNuevo = lista.get("Segundo");
        System.out.println(eNuevo); //otorgar los datos de un elemento a otro en funcion de su clave
        
        System.out.println();
        System.out.println(lista.getOrDefault("Pr", e3)); // lo mismo pero si la clave es invalida en lugar de otorgar un null otorga un valor por default
        
        System.out.println();
  
        System.out.println(lista.size()); // entrega el tamaño de la lista int 
        lista.remove("Primero"); //remueve un elemento de la lista en funcion a su clave 
        System.out.println(lista.size()); 
        
        System.out.println();
        
        System.out.println(lista.containsKey("Segundo")); // confirma si un elemento pertene a la lista Boolean
        
        lista.clear(); // limpia la lista
        System.out.println(lista.isEmpty()); // Confirma si la lista está vacia Boolean
        
    }
    
}
