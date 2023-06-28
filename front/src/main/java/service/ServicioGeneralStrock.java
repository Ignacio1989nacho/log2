/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ServicioGeneralStrock {
    
     public static void leerStrock(String busqueda) {
        ArrayList<String> listaStock = new ArrayList();
        String productoLista = "";
        boolean comprobacion = false;
        String primeraLinea = "";
        try {
            BufferedReader entrada = new BufferedReader(new FileReader("C:\\Users\\Usuario\\Desktop\\Stock2.txt"));
            String lectura;
            primeraLinea = entrada.readLine();

            while ((lectura = entrada.readLine()) != null) {
                lectura = lectura.replace("	", " ").replace("   ", " ");
                productoLista = lectura;
                listaStock.add(productoLista);
            }
            System.out.println("buscar...");
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }

        for (String string : listaStock) {
            for (int i = 0; i < string.length(); i++) {
                String busquedaLinea = "";
                String[] palabras = string.split(" ");
                busquedaLinea = palabras[0];
                if (busquedaLinea.equalsIgnoreCase(busqueda)) {

                    System.out.println(primeraLinea + "\n" + string);
                    comprobacion = true;
                    i = string.length();
                }
            }
        }
        if (!comprobacion) {
            System.out.println("NO SE ENCONTRO EL PRODUCTO EN EL STOCK...");
        }

    }

    
}
