package com.mycompany.Mapa;

import static com.mycompany.JFrame.JFrameMapa.chkbAlAzar;
import static com.mycompany.JFrame.JFrameMapa.spAltura;
import static com.mycompany.JFrame.JFrameMapa.spAnchura;
import static com.mycompany.JFrame.JFramePrincipal.getListaJugadores;
import com.mycompany.Listas.NodoDoble;
import com.mycompany.Personaje.Jugador;
import javax.swing.JSpinner;

public class GenerarAlAzar {

    private int cantidadPlanetas;

    public void AlAzar(JSpinner cantidadNeutral, JSpinner cantidadFantasma, JSpinner cantidadZombie, JSpinner cantidadProduccion, JSpinner porcentaje, JSpinner cantidadNaves) {
        if (chkbAlAzar.isSelected()) {
            generarCantidadPlanetasNeutrales(cantidadNeutral);
            generarCantidadPlanetasZombies(cantidadZombie);
            generarCantidadPlanetasFantasma(cantidadFantasma);
            generarProduccionNeutral(cantidadProduccion);
            porcentajeMuerte(porcentaje);
            generarCantidadNaves(cantidadNaves);

        } else {
            cantidadNeutral.setValue(1);
            cantidadNeutral.setEnabled(true);
            cantidadFantasma.setValue(1);
            cantidadFantasma.setEnabled(true);
            cantidadZombie.setValue(1);
            cantidadZombie.setEnabled(true);
            cantidadProduccion.setValue(1);
            cantidadProduccion.setEnabled(true);
            porcentaje.setValue(0.001);
            porcentaje.setEnabled(true);
            cantidadNaves.setValue(1);
            cantidadNaves.setEnabled(true);
            setCantidadPlanetas(0);
        }
    }

    public void generarCantidadPlanetasNeutrales(JSpinner cantidadNeutrales) {
        int cantidadEspacios;
        int tamañoMapa = (int) spAnchura.getValue() * (int) spAltura.getValue();
        int planetasJugadores = obtenerCantidadPlanetas();
        cantidadEspacios = (tamañoMapa - planetasJugadores) - 2;
        int cantidadPlanetasNeutrales;
        do {
            cantidadPlanetasNeutrales = (int) (Math.random() * cantidadEspacios + 1);
            cantidadNeutrales.setValue(cantidadPlanetasNeutrales);
        } while (cantidadPlanetasNeutrales > 10);
        setCantidadPlanetas(cantidadPlanetasNeutrales + planetasJugadores);
        cantidadNeutrales.setEnabled(false);
    }

    public void generarCantidadPlanetasFantasma(JSpinner cantidadFantasma) {
        int espaciosLibres;
        int tamañoMapa = (int) spAnchura.getValue() * (int) spAltura.getValue();
        espaciosLibres = tamañoMapa - getCantidadPlanetas() - 1;
        int cantidadPlanetasFantasmas;
        do {
            cantidadPlanetasFantasmas = (int) (Math.random() * espaciosLibres + 1);
            cantidadFantasma.setValue(cantidadPlanetasFantasmas);
        } while (cantidadPlanetasFantasmas > 10);
        setCantidadPlanetas(cantidadPlanetasFantasmas + getCantidadPlanetas());
        cantidadFantasma.setEnabled(false);
    }

    public void generarCantidadPlanetasZombies(JSpinner cantidadZombie) {
        int espacioLibre;
        int tamañoMapa = (int) spAnchura.getValue() * (int) spAltura.getValue();
        espacioLibre = tamañoMapa - getCantidadPlanetas();
        int cantidadPlanetasZombie;
        do {
            cantidadPlanetasZombie = (int) (Math.random() * espacioLibre + 1);
            cantidadZombie.setValue(cantidadPlanetasZombie);
        } while (cantidadPlanetasZombie > 10);
        setCantidadPlanetas(cantidadPlanetasZombie + getCantidadPlanetas());
        cantidadZombie.setEnabled(false);
    }

    public void generarProduccionNeutral(JSpinner produccion) {
        int produccionPlaneta = (int) (Math.random() * 30 + 1);
        produccion.setValue(produccionPlaneta);
        produccion.setEnabled(false);
    }

    public void porcentajeMuerte(JSpinner porcentajeMuerte) {
        float porcentaje;
        GenerarPlanetas generarPorcentaje = new GenerarPlanetas();
        porcentaje = generarPorcentaje.obtenerPorcentage();
        porcentajeMuerte.setValue(porcentaje);
        porcentajeMuerte.setEnabled(false);
    }

    public void generarCantidadNaves(JSpinner cantidadNaves) {
        int cantidadNavesaEnviar;
        cantidadNavesaEnviar = (int) (Math.random() * 60 + 1);
        cantidadNaves.setValue(cantidadNavesaEnviar);
        cantidadNaves.setEnabled(false);
    }

    public int obtenerCantidadPlanetas() {
        int cantidadPlanetas = 0;
        NodoDoble<Jugador> recorrer = getListaJugadores().getInicio();
        while (recorrer != null) {
            cantidadPlanetas += recorrer.getContenido().getCantidadPlanetas();
            recorrer = recorrer.getSiguiente();

        }
        return cantidadPlanetas;
    }

    public int getCantidadPlanetas() {
        return cantidadPlanetas;
    }

    public void setCantidadPlanetas(int cantidadPlanetas) {
        this.cantidadPlanetas = cantidadPlanetas;
    }

}
