package com.mycompany.Listas;

import com.mycompany.Personaje.Jugador;

public class ListaJugadores {
   private ListaDobleEnlazada<Jugador> listaJugadores;
   
   public ListaJugadores(){
       listaJugadores = new ListaDobleEnlazada<>();
   }

    public ListaDobleEnlazada getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ListaDobleEnlazada<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }
   
}
