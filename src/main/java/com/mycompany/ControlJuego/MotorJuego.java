package com.mycompany.ControlJuego;

import static com.mycompany.JFrame.JFrameDisMapa.lblNombreJugador;
import static com.mycompany.JFrame.JFramePrincipal.getListaJugadores;
import static com.mycompany.JFrame.JFramePrincipal.getListaMapas;
import static com.mycompany.JFrame.JFramePrincipal.getMatriz;
import com.mycompany.Listas.ListaDobleEnlazada;
import com.mycompany.Listas.NodoDoble;
import com.mycompany.Mapa.Mapa;
import com.mycompany.Personaje.Jugador;
import com.mycompany.Planeta.Planeta;
import com.mycompany.Planeta.PlanetaJugador;
import com.mycompany.Planeta.PlanetaZombie;

public class MotorJuego {

    private ListaDobleEnlazada<Ataque> turnosEnCola;
    private int contadorTurnos;
    private NodoDoble<Jugador> recorerJugadores;
    private NodoDoble<Planeta> obtenerPlaneta;
    private NodoDoble<Mapa> recorrerMapa;
    private NodoDoble<PlanetaZombie> obtenerZombie;
    private int posicionXOrigen;
    private int posicionYOrigen;
    private int posicionXDestino;
    private int posicionYDestino;
    private BusquedaPosiciones buscar;

    public MotorJuego() {
        contadorTurnos = 0;
        turnosEnCola = new ListaDobleEnlazada<>();
        recorerJugadores = getListaJugadores().getInicio();
        buscar = new BusquedaPosiciones();
    }

    public void establecerDatosJugadorTurno() {
        if (getContadorTurnos() == 2) {
            while (getRecorrerMapa() != null) {
                int casillaAtacar; 
                casillaAtacar = getObtenerZombie().getContenido().atacar();
                Planeta planetaDestino = new PlanetaJugador();
                planetaDestino = buscar.obtenerPlanetaDestino(casillaAtacar);
                posicionXOrigen = buscar.obtenerPosicionEnX(getObtenerZombie().getContenido().getPosicion());
                posicionYOrigen = buscar.obtenerPosicionEnY(getObtenerZombie().getContenido().getPosicion());
                posicionXDestino = buscar.obtenerPosicionEnX(casillaAtacar);
                posicionYDestino = buscar.obtenerPosicionEnY(casillaAtacar);
                int cantidadTurnos = obtenerTurnosQueTarda(posicionXOrigen, posicionYOrigen, posicionXDestino, posicionYDestino);
                Ataque nuevoTurno = new Ataque();
                nuevoTurno.setCantidadTurno(cantidadTurnos);
                nuevoTurno.getOrigen().agregar(getObtenerZombie().getContenido());
                nuevoTurno.getDestino().agregar(planetaDestino);
                turnosEnCola.agregar(nuevoTurno);
                
                enviarNaves(casillaAtacar);
                setRecorrerMapa(getRecorrerMapa().getSiguiente());
                setContadorTurnos(0);
                
            }
        } else {
            if (getRecorerJugadores() != null) {
                lblNombreJugador.setText(getRecorerJugadores().getContenido().getNombre());
                lblNombreJugador.setForeground(getRecorerJugadores().getContenido().getColorAsignado());
                setContadorTurnos(contadorTurnos + 1);
                
            }
        }
    }

    public Jugador TurnoInicial(){
        Jugador jugadorEnrutno = new Jugador();
        jugadorEnrutno = recorerJugadores.getContenido();
        return jugadorEnrutno;
    }
    public void cambiarTurnos() {
        if (getRecorerJugadores() != null) {
            recorerJugadores = recorerJugadores.getSiguiente();
            setRecorerJugadores(recorerJugadores);
            if (getRecorerJugadores() != null) {
                establecerDatosJugadorTurno();
            }
        }
        if (getRecorerJugadores() == null) {
            recorrerMapa = getListaMapas().getInicio();
            obtenerZombie = recorrerMapa.getContenido().getListaPlanetasZombie().getInicio();
        }
    }

    public NodoDoble<Jugador> getRecorerJugadores() {
        return recorerJugadores;
    }

    public void setRecorerJugadores(NodoDoble<Jugador> recorerJugadores) {
        this.recorerJugadores = recorerJugadores;
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

    private void enviarNaves(int casillaAtacar) {
        int contador = 1;
        for (int i = 0; i < getMatriz().length; i++) {
            for (int j = 0; j < getMatriz()[i].length; j++) {
                if(contador == casillaAtacar){
                    
                }
            }
            
        }
    }
    
   
    //se calculan los turnos que tardaran las naves en llegar
    public int obtenerTurnosQueTarda(int posicionX, int posicionY, int posicionXPlanetaDestino, int posicionYPlanetaDestino) {
        int distancia = calcularDistancia(posicionX, posicionY, posicionXPlanetaDestino, posicionYPlanetaDestino);
        double turnos = Math.ceil(distancia);
        return (int)turnos;
    }
    //Se calcula la distancia entr planetas
    public int calcularDistancia(int posicionX, int posicionY, int posicionXPlanetaDestino, int posicionYPlanetaDestino) {
        int sumaPosicionesOrigen = posicionX + posicionY;
        int sumaPosicionesDestino = posicionXPlanetaDestino + posicionYPlanetaDestino;
        int diferenciaEntrePosiciones = (Math.abs(sumaPosicionesOrigen - sumaPosicionesDestino));
        int tamañoMapa = buscar.ObtenertTamañoMapa(); 
        int distancia = (diferenciaEntrePosiciones * tamañoMapa)/ 30;
        return  distancia;
    } 
    
    
}
