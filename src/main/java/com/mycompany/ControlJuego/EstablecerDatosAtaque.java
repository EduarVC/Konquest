package com.mycompany.ControlJuego;

import static com.mycompany.JFrame.JFrameDisMapa.lblNombreJugador;
import com.mycompany.Personaje.Jugador;

public class EstablecerDatosAtaque {

    private MotorJuego datos;

    public EstablecerDatosAtaque() {
        datos = new MotorJuego();
    }

    public void establecerDatosTurnoInicial() {
        Jugador jugador = new Jugador();
        jugador = datos.TurnoInicial();
        if (!"Inteligencia Artificial".equals(jugador.getTipo())) {
            lblNombreJugador.setText(jugador.getNombre());
            lblNombreJugador.setForeground(jugador.getColorAsignado());
            
        }else{
            AtaqueIA nuevoAtaque = new AtaqueIA();
            nuevoAtaque.ataqueIA(jugador);
            establecerDatosTurno();
        }

    }
    public void establecerDatosTurno() {
        Jugador jugador = new Jugador();
        jugador = datos.cambiarTurnos();
        if (!"Inteligencia Artificial".equals(jugador.getTipo())) {
            lblNombreJugador.setText(jugador.getNombre());
            lblNombreJugador.setForeground(jugador.getColorAsignado());
            
        }else{
            AtaqueIA nuevoAtaque = new AtaqueIA();
            nuevoAtaque.ataqueIA(jugador);
            establecerDatosTurno();
        }

    }
    
}
