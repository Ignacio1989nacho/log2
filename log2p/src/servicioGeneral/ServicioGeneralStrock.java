/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioGeneral;

import java.io.BufferedReader;

import java.io.FileReader;

import java.util.ArrayList;

public class ServicioGeneralStrock {

    /**
     * Metodo busca en el stock el producto por codigo... de un archivo txt.
     *
     * @param busqueda
     */
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
