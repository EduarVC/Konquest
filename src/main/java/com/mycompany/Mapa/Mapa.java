package com.mycompany.Mapa;

import com.mycompany.Listas.ListaDobleEnlazada;
import com.mycompany.Personaje.Jugador;
import com.mycompany.Planeta.PlanetaFantasma;
import com.mycompany.Planeta.PlanetaNeutral;
import com.mycompany.Planeta.PlanetaZombie;

public class Mapa {
    private String nombreMapa;
    private int alto;
    private int ancho;
    private int cantidadPlanetasNeutrales;
    private int cantidadPlanetasFantasma;
    private int cantidadPlanetasZimbie;
    private boolean mapaCiego;
    private boolean alAzar;
    private boolean produccionAcumulativa;
    private ListaDobleEnlazada<Jugador> listaJugadores;
    private ListaDobleEnlazada<PlanetaFantasma> listaPlanetasFantasma;
    private ListaDobleEnlazada<PlanetaZombie> listaPlanetasZombie;
    private ListaDobleEnlazada<PlanetaNeutral> listaPlanetaNeutral;
    
    public Mapa(){
        listaJugadores = new ListaDobleEnlazada<>();
        listaPlanetaNeutral = new ListaDobleEnlazada<>();
        listaPlanetasFantasma = new ListaDobleEnlazada<>();
        listaPlanetasZombie = new ListaDobleEnlazada<>();
    }

    public String getNombreMapa() {
        return nombreMapa;
    }

    public void setNombreMapa(String nombreMapa) {
        this.nombreMapa = nombreMapa;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getCantidadPlanetasNeutrales() {
        return cantidadPlanetasNeutrales;
    }

    public void setCantidadPlanetasNeutrales(int cantidadPlanetasNeutrales) {
        this.cantidadPlanetasNeutrales = cantidadPlanetasNeutrales;
    }

    public int getCantidadPlanetasFantasma() {
        return cantidadPlanetasFantasma;
    }

    public void setCantidadPlanetasFantasma(int cantidadPlanetasFantasma) {
        this.cantidadPlanetasFantasma = cantidadPlanetasFantasma;
    }

    public int getCantidadPlanetasZimbie() {
        return cantidadPlanetasZimbie;
    }

    public void setCantidadPlanetasZimbie(int cantidadPlanetasZimbie) {
        this.cantidadPlanetasZimbie = cantidadPlanetasZimbie;
    }

    public boolean isMapaCiego() {
        return mapaCiego;
    }

    public void setMapaCiego(boolean mapaCiego) {
        this.mapaCiego = mapaCiego;
    }

    public boolean isAlAzar() {
        return alAzar;
    }

    public void setAlAzar(boolean alAzar) {
        this.alAzar = alAzar;
    }

    public boolean isProduccionAcumulativa() {
        return produccionAcumulativa;
    }

    public void setProduccionAcumulativa(boolean produccionAcumulativa) {
        this.produccionAcumulativa = produccionAcumulativa;
    }

    public ListaDobleEnlazada<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ListaDobleEnlazada<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public ListaDobleEnlazada<PlanetaFantasma> getListaPlanetasFantasma() {
        return listaPlanetasFantasma;
    }

    public void setListaPlanetasFantasma(ListaDobleEnlazada<PlanetaFantasma> listaPlanetasFantasma) {
        this.listaPlanetasFantasma = listaPlanetasFantasma;
    }

    public ListaDobleEnlazada<PlanetaZombie> getListaPlanetasZombie() {
        return listaPlanetasZombie;
    }

    public void setListaPlanetasZombie(ListaDobleEnlazada<PlanetaZombie> listaPlanetasZombie) {
        this.listaPlanetasZombie = listaPlanetasZombie;
    }

    public ListaDobleEnlazada<PlanetaNeutral> getListaPlanetaNeutral() {
        return listaPlanetaNeutral;
    }

    public void setListaPlanetaNeutral(ListaDobleEnlazada<PlanetaNeutral> listaPlanetaNeutral) {
        this.listaPlanetaNeutral = listaPlanetaNeutral;
    }
    
}
