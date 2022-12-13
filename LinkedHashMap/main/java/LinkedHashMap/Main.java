import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import objeto.Estudiante;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lopez
 */
public class Main {
    public static void main(String[] args) {
     Estudiante e1 = new Estudiante(47, "Angel", 19);
        Estudiante e2 = new Estudiante(58, "Diego", 16);
        Estudiante e3 = new Estudiante(62, "Cesar", 15);
        
        //TreeMap
        Map<String, Estudiante> lista = new LinkedHashMap<String, Estudiante>();
        
        lista.put("B", e1);
        lista.put("A", e2);
        /*
        System.out.println(lista.values());
        
        System.out.println(lista.containsValue(e1));
        
         for(Entry<String, Estudiante> entry : lista.entrySet()){
             System.out.println("Clave: " + entry.getKey()+" - "+ entry.getValue());
         }
         
         
        
        Estudiante eNuevo = lista.get("A");
        System.out.println(eNuevo);
        System.out.println(lista.getOrDefault("B", e3));


         lista.put("C", e3);
         System.out.println(lista.size());
         System.out.println(lista.containsValue(e2));
         lista.remove("A");
         System.out.println(lista.size());
         System.out.println(lista.containsValue(e2));
         System.out.println(lista.values());
*/
        System.out.println(lista.containsKey("B"));
        lista.clear();
        System.out.println(lista.isEmpty());

    }
}
