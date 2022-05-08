package com.mycompany.Personaje;

import com.mycompany.Listas.ListaDobleEnlazada;
import com.mycompany.Planeta.Planeta;
import java.awt.Color;

public class Jugador {
    private String nombre;
    private String tipo;
    private int cantidadPlanetas;
    private Color colorAsignado;
    private ListaDobleEnlazada<Planeta>  planetasJugador;
    
    public  Jugador(){
        planetasJugador = new ListaDobleEnlazada<>();
    }

     @Override
    public String toString() {
        return "Nombre: " + getNombre() + "\nTipo: " + getTipo() + "\nCantidad Planetas: " + getCantidadPlanetas() + "\nColor: " + getColorAsignado() + "\nPlanetas: " + getPlanetasJugador();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidadPlanetas() {
        return cantidadPlanetas;
    }

    public void setCantidadPlanetas(int cantidadPlanetas) {
        this.cantidadPlanetas = cantidadPlanetas;
    }

    public Color getColorAsignado() {
        return colorAsignado;
    }

    public void setColorAsignado(Color colorAsignado) {
        this.colorAsignado = colorAsignado;
    }

    public ListaDobleEnlazada<Planeta> getPlanetasJugador() {
        return planetasJugador;
    }

    public void setPlanetasJugador(ListaDobleEnlazada<Planeta> planetasJugador) {
        this.planetasJugador = planetasJugador;
    }
    
    
}
