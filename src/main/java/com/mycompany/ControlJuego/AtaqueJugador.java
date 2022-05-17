package com.mycompany.ControlJuego;

import static com.mycompany.JFrame.JFrameDisMapa.getDestino;
import static com.mycompany.JFrame.JFrameDisMapa.getOrigen;
import static com.mycompany.JFrame.JFrameDisMapa.lblDistancia;
import com.mycompany.Planeta.Planeta;
import com.mycompany.Planeta.PlanetaJugador;

public class AtaqueJugador {
    private Planeta planetaOrigen;
    private Planeta planetaDestino;
    
    public AtaqueJugador(){
    }
    
    public void atacar(){    
//        MotorJuego obtenerJugador = new MotorJuego();
//        obtenerJugador.getJugadorTurno();
        BusquedaPosiciones buscar = new BusquedaPosiciones();
        System.out.println(getOrigen());
        System.out.println(getDestino());
        planetaOrigen = buscar.obtenerTipoPlaneta(getOrigen());
        planetaDestino = buscar.obtenerTipoPlaneta(getDestino());
        System.out.println(planetaOrigen);
        System.out.println(planetaDestino);
        EnvioNaves enviarNaves = new EnvioNaves();
        enviarNaves.enviarNavesJugador((PlanetaJugador) planetaOrigen, planetaDestino);
    }
    public void obtenreDistancia(){
        BusquedaPosiciones buscar = new BusquedaPosiciones();
        System.out.println(getOrigen());
        System.out.println(getDestino());
        planetaOrigen = buscar.obtenerTipoPlaneta(getOrigen());
        planetaDestino = buscar.obtenerTipoPlaneta(getDestino());
        System.out.println(planetaOrigen);
        System.out.println(planetaDestino);
        EnvioNaves calcular = new EnvioNaves();
        float distancia = calcular.distancia(planetaOrigen.getPosicion(), planetaDestino.getPosicion());
        lblDistancia.setText(Float.toString(distancia) + " Años luz");
    }
}
