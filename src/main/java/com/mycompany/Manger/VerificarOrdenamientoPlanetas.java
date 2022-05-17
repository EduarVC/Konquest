package com.mycompany.Manger;

import com.mycompany.JFrame.JFrameDisMapa;
import static com.mycompany.JFrame.JFrameMapa.chekDistribucion;
import com.mycompany.JFrame.JFrameOrdenarPlanetas;
import static com.mycompany.JFrame.JFramePrincipal.getListaJugadores;
import static com.mycompany.JFrame.JFramePrincipal.getListaMapas;
import com.mycompany.Listas.NodoDoble;
import com.mycompany.Mapa.GenerarMatriz;
import com.mycompany.Mapa.Mapa;
import com.mycompany.Mapa.OrdenarPlanetasAlAzar;
import com.mycompany.Personaje.Jugador;
import com.mycompany.Planeta.PlanetaFantasma;
import com.mycompany.Planeta.PlanetaJugador;
import com.mycompany.Planeta.PlanetaNeutral;
import com.mycompany.Planeta.PlanetaZombie;

public class VerificarOrdenamientoPlanetas {

    private OrdenarPlanetasAlAzar ordenar;
    private final GenerarMatriz matriz;
    public VerificarOrdenamientoPlanetas(){
        matriz = new GenerarMatriz();
       
    }

    public void verificar(){
        if(chekDistribucion.isSelected()){
            matriz.dibujarMatriz();
        }
        verificarAlAzarPlanetasJugador();
        verificarAlAzarPlanetasNeutrales();
        verificarAlAzarPlanetasFantasma();
        verificarAlAzarPlanetasZombie();
       
        if(chekDistribucion.isSelected()){
        JFrameDisMapa mapa = new JFrameDisMapa();
        mapa.setVisible(true);
        }
    }
    
    public void verificarAlAzarPlanetasJugador() {
        NodoDoble<Jugador> recorrer = getListaJugadores().getInicio();
        NodoDoble<PlanetaJugador> obtener = recorrer.getContenido().getPlanetasJugador().getInicio();
        if(obtener.getContenido().posicionarPlaneta()){
            ordenar = new OrdenarPlanetasAlAzar();
            ordenar.oredenarPlanetasJugador();
        }else{
            JFrameOrdenarPlanetas oredenarPlanetas = new JFrameOrdenarPlanetas();
            oredenarPlanetas.setVisible(true);
        }
    }
    
    public void verificarAlAzarPlanetasNeutrales(){
        NodoDoble<Mapa> recorrer = getListaMapas().getInicio();
        NodoDoble<PlanetaNeutral> obtener = recorrer.getContenido().getListaPlanetaNeutral().getInicio();
        if(obtener.getContenido().posicionarPlaneta()){
            ordenar = new OrdenarPlanetasAlAzar();
            ordenar.ordenarPlanetasNeutrals();
        }
    }
    public void verificarAlAzarPlanetasFantasma(){
        NodoDoble<Mapa> recorrer = getListaMapas().getInicio();
        NodoDoble<PlanetaFantasma> obtener = recorrer.getContenido().getListaPlanetasFantasma().getInicio();
        if(obtener.getContenido().posicionarPlaneta()){
            ordenar = new OrdenarPlanetasAlAzar();
            ordenar.ordenarPlanetasFantasma();
        }
    }
    public void verificarAlAzarPlanetasZombie(){
        NodoDoble<Mapa> recorrer = getListaMapas().getInicio();
        NodoDoble<PlanetaZombie> obtener = recorrer.getContenido().getListaPlanetasZombie().getInicio();
        if(obtener.getContenido().posicionarPlaneta()){
            ordenar = new OrdenarPlanetasAlAzar();
            ordenar.ordenarPlanetaZombie();
        }
    }
}
