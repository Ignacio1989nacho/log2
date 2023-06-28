/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.ArrayList;


public class Cliente {
    
    private String nombre;
    private Integer id;
    private Integer pedido;
    private Despacho despacho;
    private ArrayList<Linea> listaCliente;

    public Cliente(String nombre, Integer id, Integer pedido, Despacho despacho, ArrayList<Linea> listaCliente) {
        this.nombre = nombre;
        this.id = id;
        this.pedido = pedido;
        this.despacho = despacho;
        this.listaCliente = listaCliente;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPedido() {
        return pedido;
    }

    public void setPedido(Integer pedido) {
        this.pedido = pedido;
    }

    public Despacho getDespacho() {
        return despacho;
    }

    public void setDespacho(Despacho despacho) {
        this.despacho = despacho;
    }

    public ArrayList<Linea> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<Linea> listaCliente) {
        this.listaCliente = listaCliente;
    }

   

    @Override
    public String toString() {
        return "Cliente:\n"
                + "  Nombre: " + nombre + "\n"
                + "  ID: " + id + "\n"
                + "  Pedido: " + pedido + "\n"
                + "  Despacho: " + despacho + "\n"
                + "  Linea de trabajo: " + listaCliente;
    }

    
}
