package com.mycompany.ControlJuego;

import static com.mycompany.JFrame.JFramePrincipal.cmbListaMapas;
import static com.mycompany.JFrame.JFramePrincipal.getListaMapas;
import com.mycompany.Listas.NodoDoble;
import com.mycompany.Mapa.Mapa;
import com.mycompany.Planeta.Planeta;
import com.mycompany.Planeta.PlanetaJugador;
import com.mycompany.Planeta.PlanetaZombie;

public class AtaqueZombie {
    
    private NodoDoble<PlanetaZombie> obtenerZombie;
    private NodoDoble<Mapa> recorrerMapa;
    private PlanetaZombie planetaOrigen;
    private BusquedaPosiciones buscar;
    private Planeta planetaDestino;
    private Mapa mapaEnUso;
    
    public AtaqueZombie(){
        recorrerMapa = getListaMapas().getInicio();
        mapaEnUso = new Mapa();
        planetaOrigen = new PlanetaZombie();
        planetaDestino = new PlanetaJugador();
        
    }
    public void ataqueZombie(){
        while(recorrerMapa != null){
            if(recorrerMapa.getContenido().getNombreMapa() == cmbListaMapas.getSelectedItem()){
                obtenerZombie = recorrerMapa.getContenido().getListaPlanetasZombie().getInicio();
                int numeroAleatorio = (int) ( Math.random()* recorrerMapa.getContenido().getCantidadPlanetasZimbie()+1);
                int contador= 1;
                while(obtenerZombie != null){
                    if(contador == numeroAleatorio){
                        planetaOrigen = obtenerZombie.getContenido();
                    }
                    contador++;
                    obtenerZombie = obtenerZombie.getSiguiente();
                }
            }
            recorrerMapa = recorrerMapa.getSiguiente();
        }
        planetaDestino = buscar.obtenerPlaneta(planetaOrigen.atacar());
        EnvioNaves enviarNaves = new EnvioNaves();
        enviarNaves.enviarNavesZombie(planetaOrigen, (PlanetaJugador) planetaDestino);
    }
}
