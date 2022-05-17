package com.mycompany.ControlJuego;

import static com.mycompany.JFrame.JFrameDisMapa.getContador;
import static com.mycompany.JFrame.JFrameDisMapa.lblDistancia;
import static com.mycompany.JFrame.JFrameDisMapa.lblNombreJugador;
import static com.mycompany.JFrame.JFrameDisMapa.lblPlanetaDestino;
import static com.mycompany.JFrame.JFrameDisMapa.lblPlanetaOrigen;
import static com.mycompany.JFrame.JFrameDisMapa.setContador;
import com.mycompany.Personaje.Jugador;

public class EstablecerDatosAtaque {

    private MotorJuego datos;

    public EstablecerDatosAtaque() {
        datos = new MotorJuego();
    }

    public void establecerDatosTurno() {
        lblPlanetaDestino.setText("");
        lblPlanetaOrigen.setText("");
        lblDistancia.setText("");
        if(getContador() == 2){
            AtaqueZombie ata = new AtaqueZombie();
            ata.ataqueZombie();
            setContador(0);
        }
        Jugador jugador = new Jugador();
        jugador = datos.cambiarTurnos();
        
        System.out.println(jugador.getTipo());
        if (!"Inteligencia Artificial".equals(jugador.getTipo())) {
            lblNombreJugador.setText(jugador.getNombre());
            lblNombreJugador.setForeground(jugador.getColorAsignado());
            
        }else if ("Inteligencia Artificial".equals(jugador.getTipo())){
            System.out.println("aaaaaaaaaaaa");
            AtaqueIA nuevoAtaque = new AtaqueIA();
            nuevoAtaque.ataqueIA(jugador);
            establecerDatosTurno();
        }

    }
    
}
