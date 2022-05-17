package com.mycompany.ControlJuego;

import static com.mycompany.JFrame.JFrameDisMapa.lblNombreJugador;
import static com.mycompany.JFrame.JFrameDisMapa.lblPlanetaDestino;
import static com.mycompany.JFrame.JFrameDisMapa.lblPlanetaOrigen;
import static com.mycompany.JFrame.JFramePrincipal.getMatriz;
import com.mycompany.Planeta.Planeta;
import com.mycompany.Planeta.PlanetaFantasma;
import com.mycompany.Planeta.PlanetaJugador;
import com.mycompany.Planeta.PlanetaNeutral;
import com.mycompany.Planeta.PlanetaZombie;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccionBotones implements ActionListener {

    private Planeta tipo;
    private PlanetaJugador origenJugador;
    private PlanetaZombie origenZombie;
    private PlanetaJugador destinoJugador;
    private PlanetaNeutral destinoNuetral;
    private PlanetaFantasma destinoFantasma;

    public AccionBotones() {
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < getMatriz().length; i++) {
            for (int j = 0; j < getMatriz()[i].length; j++) {
                if (e.getSource().equals(getMatriz()[i][j])) {
                    int posicion;
                    BusquedaPosiciones buscar = new BusquedaPosiciones();
                    posicion = buscar.obtenerCasilla(getMatriz()[i][j]);
                    if (!".".equals(getMatriz()[i][j].getText())) {
                        if(getDestinoFantasma() != null || getDestinoJugador() != null || getDestinoNuetral() != null){
                            setDestinoFantasma(null);
                            setDestinoJugador(null);
                            setDestinoNuetral(null);
                            setOrigenJugador(null);
                            setOrigenZombie(null);
                        }
                        tipo = buscar.obtenerTipoPlaneta(posicion);
                        if ("Normal".equals(tipo.getCategoria())) {
                            if(((PlanetaJugador) tipo).getConquistador().equals(lblNombreJugador.getText())){
                                setOrigenJugador((PlanetaJugador) tipo);
                                lblPlanetaOrigen.setText(getOrigenJugador().getNombrePlaneta());
                            } else {
                                setDestinoJugador((PlanetaJugador) tipo);
                                lblPlanetaDestino.setText(getDestinoJugador().getNombrePlaneta());
                            }

                        } else if ("Zombie".equals(tipo.getCategoria())) {
                            if (getOrigenZombie() == null) { // se verifica Planeta origen
                                setOrigenZombie((PlanetaZombie) tipo);
                            }
                        } else if ("Neutral".equals(tipo.getCategoria())) {
                            setDestinoNuetral((PlanetaNeutral) tipo);
                            System.out.println(getDestinoNuetral().getNombrePlaneta());
                            lblPlanetaDestino.setText(getDestinoNuetral().getNombrePlaneta());
                        } else if ("Fantasma".equals(tipo.getCategoria())) {
                            setDestinoFantasma((PlanetaFantasma) tipo);
                            System.out.println(getDestinoFantasma().getNombrePlaneta());
                            lblPlanetaDestino.setText(getDestinoFantasma().getNombrePlaneta());
                        }
                    }
                }

            }

        }
    }

    public PlanetaJugador getOrigenJugador() {
        return origenJugador;
    }

    public void setOrigenJugador(PlanetaJugador origenJugador) {
        this.origenJugador = origenJugador;
    }

    public PlanetaZombie getOrigenZombie() {
        return origenZombie;
    }

    public void setOrigenZombie(PlanetaZombie origenZombie) {
        this.origenZombie = origenZombie;
    }

    public PlanetaJugador getDestinoJugador() {
        return destinoJugador;
    }

    public void setDestinoJugador(PlanetaJugador destinoJugador) {
        this.destinoJugador = destinoJugador;
    }

    public PlanetaNeutral getDestinoNuetral() {
        return destinoNuetral;
    }

    public void setDestinoNuetral(PlanetaNeutral destinoNuetral) {
        this.destinoNuetral = destinoNuetral;
    }

    public PlanetaFantasma getDestinoFantasma() {
        return destinoFantasma;
    }

    public void setDestinoFantasma(PlanetaFantasma destinoFantasma) {
        this.destinoFantasma = destinoFantasma;
    }

}
