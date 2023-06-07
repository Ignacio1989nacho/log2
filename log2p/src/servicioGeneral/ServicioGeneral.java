package servicioGeneral;

import entidad.Cliente;
import entidad.Despacho;
import entidad.Linea;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ServicioGeneral {

    private ArrayList<Cliente> listaCliente = new ArrayList();
    private Scanner LEER = new Scanner(System.in).useDelimiter("\n");

    /**
     * Metodo crea el cliente con el pedido
     *
     * @return Cliente
     */
    private Cliente nuevoCliente() {
        Cliente c = new Cliente();
        System.out.println("CLIENTE:");
        c.setNombre(LEER.next());
        c.setId(1);
        System.out.println("PEDIDO:");
        c.setPedido(LEER.nextInt());
        return c;
    }

    /**
     * Metodo completa los atributos de Linea del objeto Cliente, con sus
     * respectivos datos seteados. (Linea, Despacho)
     *
     * @param c Cliente
     * @param op opcion del usuario del objeto donde desea crear la linea.
     */
    private void lineaPorDia(Cliente c, int op) {
        ArrayList<Linea> l = new ArrayList();
        Linea linea = new Linea();
        boolean comp = false;
        do {
            try {
                System.out.println("LINEA 1");
                linea.setLineaUno(LEER.nextInt());
                System.out.println("LINEA 2");
                linea.setLineaDos(LEER.nextInt());
                comp = true;
            } catch (Exception e) {
                System.out.println("INGRESA UN VALOR VALIDO..");
                LEER.nextLine();//LIMPIAR BUFFER
            }
        } while (!comp);
        linea.setArmado(linea.getLineaUno() + linea.getLineaDos());
        linea.setTotal(linea.getTotal() + linea.getArmado());
        linea.setFaltante(c.getPedido() - linea.getTotal());
        if (c.getListaCliente() == null) {
            l.add(linea);
        } else {
            for (int i = 0; i < c.getListaCliente().size(); i++) {
                Linea lineacliente = c.getListaCliente().get(i);
                linea.setFaltante(c.getListaCliente().get(i).getFaltante() - linea.getArmado());
                linea.setTotal(c.getListaCliente().get(i).getTotal() + linea.getArmado());
                l.add(lineacliente);
            }
            l.add(linea);
        }
        if (c.getPedido() <= linea.getTotal()) {
            c.setDespacho(despacho());
        }
        c.setListaCliente(l);
    }

    /**
     * Metodo crea el objeto despacho
     *
     * @return Despacho
     */
    private Despacho despacho() {
        Despacho d = new Despacho();
        d.setCodigo(Long.MAX_VALUE);
        d.setFechaDespacho(new Date());
        return d;
    }

    /**
     * Metodo muestra lista de cliente, con total del pedido preparado, y si fue
     * despachado o no.
     */
    private void mostrarListaClienteDespacho() {

        System.out.println("LISTA CLIENTES:");
        System.out.println("");
        for (Cliente cliente : listaCliente) {
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

    /**
     * Metodo muestra la lista de clientes
     */
    private void listadoClienteObjeto() {

        System.out.println("LISTA CLIENTES:");
        System.out.println("");
        int cont = 0;
        for (Cliente cliente : listaCliente) {
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

    /**
     * Metodo muestra menu para crear ficha del cliente. con despachi y lista de
     * ficha por dia
     */
    private void menuFichaCliente() {

        boolean log = false;
        do {
            try {
                System.out.println("============= MENU =============");
                System.out.println("1 - AGREGAR CLIENTE\n2 - FICHA CLIENTE LINEA Y DESPACHO \n3 - MOSTRAR LISTA CLIENTES\n4 - AGREGAR FICHA A CLIENTE\n5 - SALIR");
                int op = LEER.nextInt();
                switch (op) {
                    case 1:
                        listaCliente.add(nuevoCliente());
                        break;
                    case 2:
                        listadoClienteObjeto();
                        break;
                    case 3:
                        mostrarListaClienteDespacho();
                        break;
                    case 4:
                        int cont = 0;
                        for (Cliente cliente : listaCliente) {
                            cont++;
                            System.out.println(cont + "\nNOMBRE: " + cliente.getNombre() + "\nPEDIDO: " + cliente.getPedido());
                        }
                        System.out.println("ESCOGE UN CLIENTE PARA CREAR LA FICHA:");
                        int op2 = LEER.nextInt();
                        lineaPorDia(listaCliente.get(op2 - 1), op2);
                        break;
                    case 5:
                        log = true;
                        System.out.println("SALIENDO.............");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Ingresa un valor correcto...");
                LEER.nextLine();//LIMPIAR BUFFER...
            }
        } while (!log);
        System.out.println("===========================================");

    }

    /**
     * Metodo llama metodo statico de la clase SGS
     */
    private void menuStrock() {
        System.out.println("INGRESA EL CODIGO DE BUSQUEDA:");
        String busqueda = LEER.next();
        ServicioGeneralStrock.leerStrock(busqueda);
    }

    /**
     * Metodo general del menu, donde el usuario escoge la opcion necesaria
     */
    public void menu() {
        boolean log = false;
        do {
            try {
                System.out.println("MENU\n1 - Cliente Pedido\n2 - Lista clientes pedidos\n3 - STOCK\n4 - SALIR");
                int op = LEER.nextInt();
                switch (op) {
                    case 1:
                        menuFichaCliente();
                        break;
                    case 2:
                        if (listaCliente.isEmpty()) {
                            System.out.println("NO TIENES PEDIDOS DE CLIENTES...");
                        } else {
                            for (Cliente cliente : listaCliente) {
                                System.out.println("Cliente: " + cliente.getNombre() + "\nPedido: " + cliente.getPedido());
                            }
                        }
                        break;
                    case 3:
                        System.out.println("STOCK 2024:");
                        menuStrock();
                        break;
                    case 4:
                        System.out.println("SALIENDO DEL PROGRAMA....");
                        log = true;
                        break;
                }
            } catch (Exception e) {
                System.out.println("Opcion invalida");
                LEER.nextLine();//LIMPIAR BUFFER...
            }
        } while (!log);

    }

}
