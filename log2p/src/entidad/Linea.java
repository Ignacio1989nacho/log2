/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;
import java.util.Date;

public class Linea {

    private Integer lineaUno;
    private Integer lineaDos;
    private Integer paletArmado;
    private ArrayList<String> descrip;
    private Integer armado;
    private Integer faltante;
    private Integer total = 0;
    private Date dia;
    public Linea() {
        this.dia = new Date();
    }

    public Linea(Integer lineaUno, Integer lineaDos, Integer paletArmado, ArrayList<String> descrip, Integer armado, Integer faltante) {
        this.lineaUno = lineaUno;
        this.lineaDos = lineaDos;
        this.paletArmado = paletArmado;
        this.descrip = descrip;
        this.armado = armado;
        this.faltante = faltante;

    }

    public Integer getLineaUno() {
        return lineaUno;
    }

    public void setLineaUno(Integer lineaUno) {
        this.lineaUno = lineaUno;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getLineaDos() {
        return lineaDos;
    }

    public void setLineaDos(Integer lineaDos) {
        this.lineaDos = lineaDos;
    }

    public Integer getPaletArmado() {
        return paletArmado;
    }

    public void setPaletArmado(Integer paletArmado) {
        this.paletArmado = paletArmado;
    }

    public ArrayList<String> getDescrip() {
        return descrip;
    }

    public void setDescrip(ArrayList<String> descrip) {
        this.descrip = descrip;
    }

    public Integer getArmado() {
        return armado;
    }

    public void setArmado(Integer armado) {
        this.armado = armado;
    }

    public Integer getFaltante() {
        return faltante;
    }

    public void setFaltante(Integer faltante) {
        this.faltante = faltante;
    }

    @Override
    public String toString() {
        return "Linea:\n"
                + "  Linea Uno: " + lineaUno + "\n"
                + "  Linea Dos: " + lineaDos + "\n"
                + "  Descripción: " + descrip + "\n"
                + "  Resto del pedido: " + faltante + "\n"
                + "  Armado: " + armado + "\n"
                + "  Dia: " + dia;
                //+ "  Total: " + total;
    }

}
