
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
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
        Map<String, Estudiante> lista = new TreeMap<String, Estudiante>();
        
        lista.put("B", e1);
        lista.put("A", e2);

         System.out.println(lista.values());
         
         for(Entry<String, Estudiante> entry : lista.entrySet()){
             System.out.println("Clave: " + entry.getKey()+" - "+ entry.getValue());
         }
        
         System.out.println();
        
        Estudiante eNuevo = lista.get("C");
        System.out.println(eNuevo);
        
         System.out.println(lista.getOrDefault("1", e3));
      
         System.out.println();
         
         lista.put("C", e3);
         System.out.println(lista.size());
         lista.remove("B");
         System.out.println(lista.size());
         System.out.println(lista.values());

         System.out.println();
         
        System.out.println(lista.containsKey("E"));
        lista.clear();
        System.out.println(lista.isEmpty());
     }
}
