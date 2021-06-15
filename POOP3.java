/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Date;
/**
 *
 * @author Karen Alin Segura Garduño.
 */
public class POOP3 {

    public static void main(String[] args) {
        /********* Arreglos *********/
        int [] nums;//Declarando
        int nums1 [];
        
        nums = new int[5];
        int [] nums2 = {1,2,3,4,5};
        /*********** for ***************/
        System.out.println("/***** for *****/");
        for (int i = 0; i < nums.length; i+=2) {
            int o = nums2[i];
            System.out.println(o);
        }
        /*********** for each***************/
        System.out.println("/***** for-each *****/");
        for (int o : nums2) {//Cada elemento de nums2 se guarda en o.
            System.out.println(o);
        }
        /*********** Manejo de cadenas ***************/
        System.out.println("/***** Manejo de cadenas *****/");
        
        String s = new String("Hola mundo");//Declaración.
        System.out.println(s); 
        String s1 = "Hola mundo 2";
        System.out.println(s1);
         /*********** Operador punto ***************/
        System.out.println("/****** Operador punto ******/");
        
        System.out.println("nums2 length = " + nums2.length);
        System.out.println("s length = " + s.length());
        System.out.println("s1 length = " + s1.length());
        
        /*********** Concatenar ***************/
        System.out.println("/****** Concatenar ******/");
        
        String nombre = "Alin";
        String apellido = "Segura";
        String nombreCompleto = nombre + " " +apellido;
        
        System.out.println(nombreCompleto);
        
         /*********** Wrapper y Autoboxing ***************/
        System.out.println("/****** Wrapper y Autoboxing ******/");
        
        Integer k = new Integer(22);//Asignamos el numero 2 a K
        Integer l = 22;
        int r =  2 + l;
        System.out.println(r);
        
        String entero = l + " ";
        String entero1 = l.toString();
        System.out.println(entero1);
        //String entero2 = r.
        System.out.println();
         /*********** Colecciones ***************/
        
        System.out.println("/****** Colecciones ******/");
            /*********** Array-List ***************/
        System.out.println("/****** Array-List ******/");
        
        ArrayList <Integer> miArraylist = new ArrayList<Integer>();
        miArraylist.add(50);
        miArraylist.add(22);
        for (Integer elemento : miArraylist) {
            System.out.println(elemento);
        }
        System.out.println("*********");
        miArraylist.add(0, 3);//(posicion , elemento)
        miArraylist.add(2, 99);
        for (Integer elemento : miArraylist ) {
            System.out.println(elemento);
        }
        System.out.println("Tamanio ArrayList: " + miArraylist.size());
        System.out.println("Elemento 2: " + miArraylist.get(2));
        
         /*********** Hashtable ***************/
        
        System.out.println("/****** Hashtable ******/");
        Hashtable<String,Integer>miTabla = new Hashtable<String,Integer>();
        miTabla.put("uno", 1);
        miTabla.put("dos", 2);
        miTabla.put("cinco", 5);
        
        System.out.println("La tabla contiene a siete? "+ miTabla.containsKey("siete"));
        System.out.println("El tamaño dela tabla: "+ miTabla.size());
        
        for( Integer valor : miTabla.values() ){
            System.out.println(valor);
        }
        for (String clave : miTabla.keySet()) {
            System.out.println(clave);
        }
        /*********** Enumeraciones ***************/
        
        System.out.println("/****** Enumeraciones ******/");
        
        String clave;
        Integer valor;
        
        Enumeration<String> claves = miTabla.keys();
        while(claves.hasMoreElements()){
            clave = claves.nextElement();
            valor = miTabla.get(clave);
            System.out.println("Clave: "+clave+" valor "+valor);
        }
         /*********** Bibliotecas ***************/
        
        /*********** Math ***************/
        
        System.out.println("/****** Math ******/");
        System.out.println(Math.pow(3, 2));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.PI);
        /*********** Date ***************/
        
        System.out.println("/****** Date ******/");
        Date hoy = new Date();//fecha de hoy
        System.out.println(hoy);
        System.out.println("/****** Calendario ******/");
        Calendar calendarioHoy = Calendar.getInstance();
        System.out.println(calendarioHoy);
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("u-dd-MM-yyyy");
        System.out.println(formatoFecha.format(hoy));
        
        String fechaActual = "Hoy es el dia ";
        fechaActual += calendarioHoy.get(Calendar.DAY_OF_MONTH) + " del mes ";
        fechaActual += calendarioHoy.get(Calendar.MONTH ) + " del anio ";
        fechaActual += calendarioHoy.get(Calendar.YEAR);
        
        System.out.println("Fecha de hoy");
        System.out.println(fechaActual);
     
    }  
}


    
