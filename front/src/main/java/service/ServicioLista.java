/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entidad.Cliente;
import java.util.ArrayList;
import static service.ServicioGeneral.findAllCliente;

/**
 *
 * @author Usuario
 */
public class ServicioLista {
/**
 * METODO MUESTRA LA LISTA DE CLIENTES, CON EL NOMBRE Y PEDIDO.
 */
    public static void listadoClienteObjeto() {
        ArrayList<Cliente> listac = findAllCliente();
        System.out.println("LISTA CLIENTES:");
        System.out.println("");
        int cont = 0;
        for (Cliente cliente : listac) {
            System.out.println("************************************************");
            System.out.println("================================================");
            cont++;
            System.out.println(cont + "\nNOMBRE: " + cliente.getNombre() + "\nPEDIDO: " + cliente.getPedido());
            if (cliente.getListaCliente() != null) {
                System.out.println(cliente.getListaCliente());
            }
            if (cliente.getDespacho() != null) {
                System.out.println(cliente.getDespacho());
            }
            System.out.println("================================================");

        }
    }
}
