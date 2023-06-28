/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package clienteInterfaces;

import entidad.Cliente;
import entidad.Despacho;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public interface ClienteInterface {
    
    public static void addCliente(Cliente c){};
    public static ArrayList<Cliente> findAllCliente(){return null;};
    public static void updateFicha(int linea1, int linea2, int cliente, String desc){};
    public static Despacho despacho(){return null;};
    public static void readClienteDespacho(){};
    
    
}
