/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import clienteInterfaces.ClienteInterface;
import entidad.Cliente;
import entidad.Despacho;
import entidad.Linea;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public abstract class ServicioGeneral implements ClienteInterface {

    private static ArrayList<Cliente> listaCliente = new ArrayList();
    private Scanner LEER = new Scanner(System.in).useDelimiter("\n");

     /**
     * METODO AGREGA EL CLIENTE RECIBIDO POR PARAMETRO A LA LISTA.
     *
     * @param c CLIENTE.
     */
    public static void addCliente(Cliente c) {listaCliente.add(c);}
     /**
     * METODO OBTIENE LA LISTA DE CLIENTES, Y LA DEVUELVE.
     *
     * @return ARRAYLIST DE CLIENTE
     */
    public static ArrayList<Cliente> findAllCliente() {return listaCliente;
    }  
       /**
     * METODO RECIBE COMO PARAMETRO LINEA 1, LINEA 2, el numero de cliente
     * seleccionado, y la descripcion para setearlo dentro de la clase LINEA.
     *
     * @param linea1 int
     * @param linea2 int
     * @param cliente int
     * @param desc string
     */
    public static void updateFicha(int linea1, int linea2, int cliente, String desc) {
        ArrayList<Cliente> listac = findAllCliente();
        Cliente c = listac.get(cliente - 1);
        ArrayList<Linea> lineaLista = new ArrayList();
        Linea l = new Linea();
        l.setLineaUno(linea1);
        l.setLineaDos(linea2);
        ArrayList<String> descripcion = new ArrayList();
        descripcion.add(desc);
        l.setDescrip(descripcion);
        l.setArmado(l.getLineaUno() + l.getLineaDos());
        l.setTotal(l.getTotal() + l.getArmado());
        l.setFaltante(c.getPedido() - l.getTotal());
        if (c.getListaCliente() == null) {
            lineaLista.add(l);
        } else {
            for (int i = 0; i < c.getListaCliente().size(); i++) {
                Linea lineacliente = c.getListaCliente().get(i);
                l.setFaltante(c.getListaCliente().get(i).getFaltante() - l.getArmado());
                l.setTotal(c.getListaCliente().get(i).getTotal() + l.getArmado());
                lineaLista.add(lineacliente);
            }
            lineaLista.add(l);
        }
        if (c.getPedido() <= l.getTotal()) {
            c.setDespacho(despacho());
        }
        c.setListaCliente(lineaLista);
    } 
    /**
     * Metodo crea el objeto despacho
     *
     * @return Despacho
     */
    public static Despacho despacho() {
        Despacho d = new Despacho();
        d.setCodigo(Long.MAX_VALUE);
        d.setFechaDespacho(new Date());
        return d;
    } 
     /**
     * Metodo muestra lista de cliente, con total del pedido preparado, y si fue
     * despachado o no.
     */
    public static void readClienteDespacho() {
        ArrayList<Cliente> listac = findAllCliente();
        System.out.println("LISTA CLIENTES:");
        System.out.println("");
        for (Cliente cliente : listac) {
            if (cliente.getListaCliente() != null) {
                int comp = cliente.getListaCliente().size() - 1;
                System.out.println("Nombre:" + cliente.getNombre() + "\nTOTAL: " + cliente.getListaCliente().get(comp).getTotal());
                if (cliente.getDespacho() != null) {
                    System.out.println("DESPACHO: Si");
                } else {
                    System.out.println("DESPACHO: No");
                }
            } else {
                System.out.println("Nombre:" + cliente.getNombre() + "\nTOTAL: 0");
            }
        }
        System.out.println("====================================");
    }

}
