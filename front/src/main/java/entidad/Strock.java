/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author Usuario
 */
public class Strock {
      private String numArticulo;
    private String descripcion;
    private String sector;
    private Integer cmdUno;
    private Integer cmdDos;
    private Integer ciudadela;
    private String fechaVencimientoUno;
    private String fechaVencimientoDos;
    private String fechaVencimientoCiudadela;
    private Integer total;

    public Strock() {
    }

    public String getNumArticulo() {
        return numArticulo;
    }

    public void setNumArticulo(String numArticulo) {
        this.numArticulo = numArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Integer getCmdUno() {
        return cmdUno;
    }

    public void setCmdUno(Integer cmdUno) {
        this.cmdUno = cmdUno;
    }

    public Integer getCmdDos() {
        return cmdDos;
    }

    public void setCmdDos(Integer cmdDos) {
        this.cmdDos = cmdDos;
    }

    public Integer getCiudadela() {
        return ciudadela;
    }

    public void setCiudadela(Integer ciudadela) {
        this.ciudadela = ciudadela;
    }

    public String getFechaVencimientoUno() {
        return fechaVencimientoUno;
    }

    public void setFechaVencimientoUno(String fechaVencimientoUno) {
        this.fechaVencimientoUno = fechaVencimientoUno;
    }

    public String getFechaVencimientoDos() {
        return fechaVencimientoDos;
    }

    public void setFechaVencimientoDos(String fechaVencimientoDos) {
        this.fechaVencimientoDos = fechaVencimientoDos;
    }

    public String getFechaVencimientoCiudadela() {
        return fechaVencimientoCiudadela;
    }

    public void setFechaVencimientoCiudadela(String fechaVencimientoCiudadela) {
        this.fechaVencimientoCiudadela = fechaVencimientoCiudadela;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

 

    @Override
    public String toString() {
        return "Strock{" + "numArticulo=" + numArticulo + ", descripcion=" + descripcion + ", sector=" + sector + ", cmdUno=" + cmdUno + ", cmdDos=" + cmdDos + ", ciudadela=" + ciudadela + ", fechaVencimientoUno=" + fechaVencimientoUno + ", fechaVencimientoDos=" + fechaVencimientoDos + ", fechaVencimientoCiudadela=" + fechaVencimientoCiudadela + ", total=" + total + '}';
    }
    
    
}
