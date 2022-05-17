package com.mycompany.ControlJuego;

import static com.mycompany.JFrame.JFrameDisMapa.getListaAtaques;
import com.mycompany.Planeta.Planeta;
import com.mycompany.Planeta.PlanetaJugador;

public class EnvioNaves {

    public void enviarNavesIA(PlanetaJugador planetaOrigen, PlanetaJugador planetaDestino){
        Ataque nuevoAtaque = new Ataque();
        int cantidadNaves = (int)(Math.random()*50+20);
        nuevoAtaque.setCantidadNaves(cantidadNaves);
        nuevoAtaque.setCantidadTurno(Turnos(planetaOrigen.getPosicion(), planetaDestino.getPosicion()));
        nuevoAtaque.setOrigen(planetaOrigen);
        nuevoAtaque.setDestino(planetaDestino);
        getListaAtaques().agregar(nuevoAtaque);
        
    }
    public void enviarNavesJugador(PlanetaJugador planetaOrigen, Planeta planetaDestino){
        
    }
    
    public int Turnos(int posicionOrigen, int posicionDestino){
        BusquedaPosiciones buscar = new BusquedaPosiciones();
        MotorJuego turnos = new MotorJuego();
        int posicionXOrigen = buscar.obtenerPosicionEnX(posicionOrigen);
        int posicionYOrigen = buscar.obtenerPosicionEnY(posicionOrigen);
        int posicionXDestino = buscar.obtenerPosicionEnX(posicionDestino);
        int posicionYDestino = buscar.obtenerPosicionEnY(posicionDestino);
        return turnos.obtenerTurnosQueTarda(posicionXOrigen, posicionYOrigen, posicionXDestino, posicionYDestino);
    }
}
