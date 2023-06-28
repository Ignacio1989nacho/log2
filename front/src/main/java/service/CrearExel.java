/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entidad.Cliente;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import static service.ServicioGeneral.findAllCliente;


public class CrearExel {
/**
 * METODO CREA EL ARCHIVO EXEL EN EL ESCRITORIO, TAMBIEN SETEA LOS DATOS OBTENIDOS DEL OBJETO CLIENTE PARA GUARDARLOS
 * EN EL MISMO EXEL.
 */
    public void crearExel() {
        ArrayList<Cliente> listac = findAllCliente();
        Workbook libro = new XSSFWorkbook();
        final String nombreArchivo = "DespachoDelDia.xlsx";
        Sheet hoja = libro.createSheet("Hoja 1");

        String[] encabezados = {"Cliente", "Pedido", "Fecha Despacho", "Total", "ID"};
        int indiceFila = 0;

        Row primeraFila = hoja.createRow(indiceFila);
        for (int i = 0; i < encabezados.length; i++) {
            String encabezado = encabezados[i];
            Cell celda = primeraFila.createCell(i);
            celda.setCellValue(encabezado);
        }
        indiceFila++;
        for (int i = 0; i < listac.size(); i++) {
            primeraFila = hoja.createRow(indiceFila);
            Cliente c = listac.get(i);
            int longitudLista = c.getListaCliente().size();
            primeraFila.createCell(0).setCellValue(c.getNombre());
            primeraFila.createCell(1).setCellValue((int) c.getPedido());
            if (c.getDespacho() != null) {
                primeraFila.createCell(2).setCellValue(c.getDespacho().getFechaDespacho());
            } else {
                primeraFila.createCell(2).setCellValue("0");
            }
            primeraFila.createCell(3).setCellValue(c.getListaCliente().get(longitudLista - 1).getTotal());
            primeraFila.createCell(4).setCellValue(c.getId());
            indiceFila++;
        }

//guardar
//        File directorioActual = new File(".");
//        String ubicacion = directorioActual.getAbsolutePath();
//        String ubicacionArchivoSalida = ubicacion.substring(0, ubicacion.length() - 1) + nombreArchivo;
//        FileOutputStream outputStream;
        String ubicacionArchivoSalida = System.getProperty("user.home") + File.separator + "Desktop" + File.separator + nombreArchivo;
        FileOutputStream outputStream;
        try {
            outputStream = new FileOutputStream(ubicacionArchivoSalida);
            libro.write(outputStream);
            libro.close();
            System.out.println("Libro guardado correctamente");
        } catch (FileNotFoundException ex) {
            System.out.println("Error de filenotfound");
        } catch (IOException ex) {
            System.out.println("Error de IOException");
        }

    }

}
