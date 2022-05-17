package com.mycompany.ControlJuego;

import static com.mycompany.JFrame.JFramePrincipal.getListaJugadores;
import com.mycompany.Listas.NodoDoble;
import com.mycompany.Personaje.Jugador;
import com.mycompany.Planeta.PlanetaJugador;

public class AtaqueIA {

    private PlanetaJugador planetaOrigenIA;
    private PlanetaJugador planetaDestino;
    private EnvioNaves enviarNaves;

    public AtaqueIA() {
        planetaOrigenIA = new PlanetaJugador();
        planetaDestino = new PlanetaJugador();
        enviarNaves = new EnvioNaves();
    }

    public void ataqueIA(Jugador jugadorIA) {
        NodoDoble<PlanetaJugador> recorrerIA = jugadorIA.getPlanetasJugador().getInicio();
        setPlanetaOrigenIA(recorrerIA.getContenido());
        NodoDoble<Jugador> recorrer = getListaJugadores().getInicio();
        NodoDoble<PlanetaJugador> obtener = recorrer.getContenido().getPlanetasJugador().getInicio();
        int cantidadJugadores = 0;
        while(recorrer != null){
            if(!"Inteligencia Artificial".equals(recorrer.getContenido().getTipo())){
                cantidadJugadores ++;
            }
            recorrer = recorrer.getSiguiente();
        }
        
        int[] planetasAtacar = new int[cantidadJugadores];

        while(recorrer != null){
            int cantidadPlanetas = 0;
            if (!"Inteligencia Artificial".equals(recorrer.getContenido().getTipo())) {
                while (obtener != null) {
                    planetasAtacar[cantidadJugadores] = obtener.getContenido().getPosicion();
                    cantidadPlanetas++;
                    obtener = obtener.getSiguiente();
                }
                recorrer = recorrer.getSiguiente();
                if (recorrer != null) {
                    obtener = recorrer.getContenido().getPlanetasJugador().getInicio();
                }
            }
        }
        int numeroPlanetaAtacar = (int) (Math.random() * planetasAtacar.length+1);
        recorrer = getListaJugadores().getInicio();
        obtener = recorrer.getContenido().getPlanetasJugador().getInicio();
        System.out.println(numeroPlanetaAtacar);
        System.out.println(obtener.getContenido().getPosicion());
        System.out.println(planetasAtacar.length);
        while (recorrer != null) {
            while (obtener != null) {
                if (obtener.getContenido().getPosicion() == planetasAtacar[numeroPlanetaAtacar-1]) {
                    setPlanetaDestino(obtener.getContenido());
                    enviarNaves.enviarNavesIA(getPlanetaOrigenIA(), getPlanetaDestino());
                    break;
                }
                obtener = obtener.getSiguiente();
            }
            recorrer = recorrer.getSiguiente();
            if (recorrer != null) {
                obtener = recorrer.getContenido().getPlanetasJugador().getInicio();
            }
        }
        
    }

    public PlanetaJugador getPlanetaOrigenIA() {
        return planetaOrigenIA;
    }

    public void setPlanetaOrigenIA(PlanetaJugador planetaOrigenIA) {
        this.planetaOrigenIA = planetaOrigenIA;
    }

    public PlanetaJugador getPlanetaDestino() {
        return planetaDestino;
    }

    public void setPlanetaDestino(PlanetaJugador planetaDestino) {
        this.planetaDestino = planetaDestino;
    }

}
