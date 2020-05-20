/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paradigmas.unidad1.practico1;

import objects.Cliente;
import objects.Socio;
import objects.Usuario;


/**
 *
 * @author WinUser
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Como declaro un objeto de la clase Cliente
        Cliente cliente;
        Cliente cliente1;
        
        Usuario usuario;
        Socio socio;
        Socio socio1;
        
        //Instanciar objetos // Instanciar objetos con valores
        cliente = new Cliente("Marcelo\n","Rodriguez\n",12312343);
        cliente1 = new Cliente ("Hugo\n","Chanampe\n", 20345765);
        usuario = new Usuario("Leonel\n","Lopez\n",23338323);
        socio = new Socio("Lucas\n","Diaz\n",23123123);
        socio1 = new Socio("Nicolas\n","Robles\n",41456079);
        /*cliente = new Cliente();
        cliente.setNombre("Marcelo\n");
        cliente.setApellido("Rodriguez\n");
        cliente.setNumeroDocumento(12312543);
        
        cliente1 = new Cliente();
        cliente1.setNombre("Raul\n");
        cliente1.setApellido("Cordoba\n");
        cliente1.setNumeroDocumento(23214576);*/
        
        
        
        
        //imprimir todos los atributos del objeto
        System.out.println(cliente); 
        System.out.println(cliente1);
        System.out.println(usuario);
        System.out.println(socio);
        System.out.println(socio1);
        //System.out.println(usuario);

        

    }
    
}
