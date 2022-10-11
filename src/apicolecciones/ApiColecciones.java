/*
Trabajo con Collections.
 */
package apicolecciones;

import java.util.*;


/**
 *
 * @author Juan Labandeira
 */
public class ApiColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List ar = new ArrayList();
        
        ar.add("Lunes");
        ar.add("Martes");
        ar.add("Miércoles");
        ar.add("Jeves");
        ar.add("Viernes");
        ar.add("Sábado");
        ar.add("Domingo");
        
        //Recorer el Array Lis con un forEach
        
        for(Object elemento: ar){
            System.out.println("ArrayList "+elemento);
        }
        
        //Salto de linea
        System.out.println("\n");
        
        
        //HashSet
        Set st = new HashSet();
        st.add("Lunes");
        st.add("Martes");
        st.add("Miércoles");
        st.add("Jeves");
        st.add("Viernes");
        st.add("Sábado");
        st.add("Domingo");
        
        imprimir(st);
       
        
        
        System.out.println("\n");
     /*   
        
        //Salto de linea
        System.out.println("\n");
        
        //TreeSet
        Set tr = new TreeSet();
        tr.add("Lunes");
        tr.add("Martes");
        tr.add("Miércoles");
        tr.add("Jeves");
        tr.add("Viernes");
        tr.add("Sábado");
        tr.add("Domingo");
        
         for(Object tree: tr){
            
            System.out.println("TreeSet "+tree);
        }
         
         //Salto de linea
         System.out.println("\n");
         
         //LinkedHashSet
        Set lhs = new LinkedHashSet();
        lhs.add("Lunes");
        lhs.add("Martes");
        lhs.add("Miércoles");
        lhs.add("Jeves");
        lhs.add("Viernes");
        lhs.add("Sábado");
        lhs.add("Domingo");
        
         for(Object linked: lhs){
            
            System.out.println("LinkedHashSet "+linked);
        }
         */
         
         //HashMap
         Map alumnos = new HashMap();
         
         alumnos.put("Juan", "valor1");
         alumnos.put("Pablo", "valor2");
         alumnos.put("José", "valor3");
         
         //para obtener un valor concreto del map
         String elm = (String) alumnos.get("valor1");
         System.out.println("elm = " + elm);
         
         System.out.println("\n");
         
         //todas las claves de nuestro map
         imprimir(alumnos.keySet());
         
         System.out.println("\n");
         
         //Mostramos los valores de nuestro map
         imprimir(alumnos.values());
         
         
    }
    
    //forEach con la coleccion Set
     public static void imprimir(Collection coleccion){
            coleccion.forEach(elm ->{
            System.out.println("coleccion = " + coleccion);
        });
     }
}
