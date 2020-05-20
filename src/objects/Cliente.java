/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author WinUser
 */
public class Cliente {
 
    private String nombre;
    private String apellido;
    private Integer numeroDocumento;
    //relacion cliente realiza un pedido
    private Pedido pedido;
    
    
    /*public Cliente(String nombre1, String apellido1, int numDoc){
    nombre = nombre1;
    apellido = apellido1;
    numeroDocumento = numDoc;
    }*/
    //Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String Apellido) {
        this.apellido = Apellido;
    }

    public Integer getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Integer numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    } 
    
    //Metodos u operaciones
    public void comprar() {
    }
    
    public void devolverCatalogo() {
    }

    //Constructor vacio
    public Cliente() {
    }

    //Constructor con parametros
    public Cliente(String nombre, String apellido, Integer numeroDocumento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
    }

    //ToString
    @Override
    public String toString() {
        return "\nNombre: " + nombre + "Apellido: " + apellido + "DNI: " + numeroDocumento;
    }
} 


