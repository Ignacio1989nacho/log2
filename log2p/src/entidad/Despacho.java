/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;
import java.util.Date;

public class Despacho {

    private Date fechaDespacho;
    private Long codigo;
    private ArrayList<String> descripcion;

    public Despacho() {
    }

    public Despacho(Date fechaDespacho, Long codigo, ArrayList<String> descripcion) {

        this.fechaDespacho = fechaDespacho;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public Date getFechaDespacho() {
        return fechaDespacho;
    }

    public void setFechaDespacho(Date fechaDespacho) {
        this.fechaDespacho = fechaDespacho;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public ArrayList<String> getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(ArrayList<String> descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Despacho:\n"
                + "  Fecha de Despacho: " + fechaDespacho + "\n"
                + "  Código: " + codigo + "\n"
                + "  Descripción: " + descripcion;
    }

}
