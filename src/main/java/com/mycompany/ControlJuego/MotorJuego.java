package com.mycompany.ControlJuego;

import static com.mycompany.JFrame.JFrameDisMapa.getRecorrerJugadores;
import static com.mycompany.JFrame.JFrameDisMapa.setRecorrerJugadores;
import static com.mycompany.JFrame.JFramePrincipal.getListaJugadores;
import com.mycompany.Listas.NodoDoble;
import com.mycompany.Mapa.Mapa;
import com.mycompany.Personaje.Jugador;
import com.mycompany.Planeta.PlanetaZombie;

public class MotorJuego {

    private int contadorTurnos;
    private NodoDoble<Jugador> recorerJugadores;
    private NodoDoble<Mapa> recorrerMapa;
    private NodoDoble<PlanetaZombie> obtenerZombie;
    private BusquedaPosiciones buscar;
    private Jugador jugadorTurno;

    public MotorJuego() {
        contadorTurnos = 0;
        recorerJugadores = getRecorrerJugadores();
        recorerJugadores = getListaJugadores().getInicio();
        buscar = new BusquedaPosiciones();
        jugadorTurno = new Jugador();
    }

    //Turno inicial
    public Jugador TurnoInicial() {
        Jugador jugadorEnturtno = new Jugador();
        jugadorEnturtno = getRecorrerJugadores().getContenido();
        return jugadorEnturtno;
    }

    //Se cambia de turno
    public Jugador cambiarTurnos() {
        Jugador jugadorEnturno = new Jugador();
        if (getRecorrerJugadores() == null) {
            recorerJugadores = getRecorrerJugadores();
            recorerJugadores = getListaJugadores().getInicio();
            setRecorrerJugadores(recorerJugadores);
        } 
        if (getRecorrerJugadores() != null) {
            recorerJugadores = getRecorrerJugadores();
            recorerJugadores = recorerJugadores.getSiguiente();
            jugadorEnturno = getRecorrerJugadores().getContenido();
            setRecorrerJugadores(recorerJugadores);
        }

        setJugadorTurno(jugadorEnturno);
        return jugadorEnturno;
    }

    public NodoDoble<Mapa> getRecorrerMapa() {
        return recorrerMapa;
    }

    public void setRecorrerMapa(NodoDoble<Mapa> recorrerMapa) {
        this.recorrerMapa = recorrerMapa;
    }

    public NodoDoble<PlanetaZombie> getObtenerZombie() {
        return obtenerZombie;
    }

    public void setObtenerZombie(NodoDoble<PlanetaZombie> obtenerZombie) {
        this.obtenerZombie = obtenerZombie;
    }

    public int getContadorTurnos() {
        return contadorTurnos;
    }

    public void setContadorTurnos(int contadorTurnos) {
        this.contadorTurnos = contadorTurnos;
    }

    public Jugador getJugadorTurno() {
        return jugadorTurno;
    }

    public void setJugadorTurno(Jugador jugadorTurno) {
        this.jugadorTurno = jugadorTurno;
    }

    //se calculan los turnos que tardaran las naves en llegar
    public int obtenerTurnosQueTarda(int posicionX, int posicionY, int posicionXPlanetaDestino, int posicionYPlanetaDestino) {
        int distancia = calcularDistancia(posicionX, posicionY, posicionXPlanetaDestino, posicionYPlanetaDestino);
        double turnos = Math.ceil(distancia);
        return (int) turnos;
    }

    //Se calcula la distancia entr planetas
    public int calcularDistancia(int posicionX, int posicionY, int posicionXPlanetaDestino, int posicionYPlanetaDestino) {
        int diferenciaX =(Math.abs( posicionX - posicionXPlanetaDestino));
        int diferenciaY = (Math.abs(posicionY - posicionYPlanetaDestino));
        int sumaDeDiferencias = (Math.abs(diferenciaX + diferenciaY));
        int tamañoMapa = buscar.ObtenertTamañoMapa();
        
        int distancia = (sumaDeDiferencias * tamañoMapa) / 20;
        return distancia;
    }

}
