package modelo;

import sv.Servicios;
import sv.Servicios_Service;


public class ConsumoServiciosSOaP {
    
    public static void main(String[] args) {
        
        // Iniciar y crear el Cliente
        
        Servicios_Service servicios = new Servicios_Service();
        Servicios cliente = servicios.getServiciosPort();
        
        // Login
        if (cliente.login("0105957922David", "Esteban1234")) {
            System.out.println("Credenciales Correctas");
        } else {
            System.out.println("!Revise sus credenciales!");
        }
        
        // Proceder al Pago
        if (cliente.procesarPago(50, 60) != -1) {
            System.out.println("Pago Realizado Satisfacotoriamente");
            System.out.println("Total a pagar: " + 50);
            System.out.println("Su pago: " + 25);
            System.out.println("Su vuelto es: " + cliente.procesarPago(50, 60));
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }
    
    
}
