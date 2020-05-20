/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.ArrayList;

/**
 *
 * @author WinUser
 */
public class Socio extends Cliente{
  private Integer numeroSocio;
  private String nombreSocio;
  
  
  //CUANDO TENEMOS RELACIONES DE 1 a *
  //private ArrayList<Tarjeta> tarjetas;
  
  //CUANDO TENEMOS RELACIONES DE 1 A 1
  //CUANDO TENEMOS UNA ASOCIACION SIMPLE
  
  private Tarjeta tarjeta;
  
 public void alquilar(){
 }
 
 public void comprarPelicula(){
 }

 /*@Override
 public void alquilarPelicula(ArrayList<Pelicula> peliculas){
 }
 
 @Override
 public void listarPeliculasAlquiladas(ArrayList<Pelicula> peliculas){
 }*/

 public Socio (String nombre1, String apellido1, int numDoc ){
    super(nombre1, apellido1, numDoc);
    }
 
}

