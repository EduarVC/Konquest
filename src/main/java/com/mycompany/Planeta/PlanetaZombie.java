package com.mycompany.Planeta;

import static com.mycompany.JFrame.JFramePrincipal.getListaJugadores;
import com.mycompany.Listas.NodoDoble;
import com.mycompany.Personaje.Jugador;
import java.awt.Color;

public class PlanetaZombie extends Planeta implements AtaquePlaneta{

    private int cantidadNavesMandar;
    private float porcentajeMuerte;
    private Color colorAsignado;
    
    public PlanetaZombie(){
        setCategoria("Zombie");
        setTipo("Zombie");
        setPath("/PlanetaZombie.png");
        setColorAsignado(Color.GREEN);
    }
    
    @Override
    public boolean posicionarPlaneta() {
        return true;
    }

    public int getCantidadNavesMandar() {
        return cantidadNavesMandar;
    }

    public void setCantidadNavesMandar(int cantidadNavesMandar) {
        this.cantidadNavesMandar = cantidadNavesMandar;
    }

    public float getPorcentajeMuerte() {
        return porcentajeMuerte;
    }

    public void setPorcentajeMuerte(float porcentajeMuerte) {
        this.porcentajeMuerte = porcentajeMuerte;
    }

    public Color getColorAsignado() {
        return colorAsignado;
    }

    public void setColorAsignado(Color colorAsignado) {
        this.colorAsignado = colorAsignado;
    }

    @Override
    public int atacar() {
        NodoDoble<Jugador> recorer = getListaJugadores().getInicio();
        NodoDoble<PlanetaJugador> obtener = recorer.getContenido().getPlanetasJugador().getInicio();
        int planetasTotal = 0;
        int numeroCasilla = 0;
        while(recorer != null){
        planetasTotal += recorer.getContenido().getPlanetasJugador().obtenerLongitud();
        recorer.getSiguiente();
        }
        recorer = getListaJugadores().getInicio();
        int [] casillasAtacar = new int[planetasTotal];
        
        for (int i = 0; i < casillasAtacar.length; i++) {
           casillasAtacar[i] = obtener.getContenido().getPosicion();
           obtener = obtener.getSiguiente();
           if(obtener == null){
               recorer.getSiguiente();
               if(recorer != null){
               obtener = recorer.getContenido().getPlanetasJugador().getInicio();
               }
           }
        }
        int casillaAtacar = (int)(Math.random()*casillasAtacar.length +1);
        for (int i = 0; i < casillasAtacar.length; i++) {
            if(i == casillaAtacar){
               numeroCasilla = casillasAtacar[i]; 
               break;
            }
        }
        return numeroCasilla;
    }
    
}
