package com.mycompany.Mapa;

import com.mycompany.JFrame.JFrameDisMapa;
import static com.mycompany.JFrame.JFrameOrdenarPlanetas.lblJugador;
import static com.mycompany.JFrame.JFrameOrdenarPlanetas.lblPlaneta;
import static com.mycompany.JFrame.JFrameOrdenarPlanetas.lblTipoJugador;
import static com.mycompany.JFrame.JFrameOrdenarPlanetas.txtNumeroCasilla;
import static com.mycompany.JFrame.JFramePrincipal.cmbListaMapas;
import static com.mycompany.JFrame.JFramePrincipal.getListaJugadores;
import static com.mycompany.JFrame.JFramePrincipal.getListaMapas;
import static com.mycompany.JFrame.JFramePrincipal.getMatriz;
import static com.mycompany.JFrame.JFramePrincipal.setMatriz;
import com.mycompany.Listas.NodoDoble;
import com.mycompany.Personaje.Jugador;
import com.mycompany.Planeta.PlanetaJugador;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AccionBoton {

    private NodoDoble<Jugador> recorrer;
    private NodoDoble<PlanetaJugador> obtener;
    private int filas;
    private int columnas;
    private int tamaño;

    public AccionBoton() {
        recorrer = getListaJugadores().getInicio();
        setRecorrer(recorrer);
        obtener = getRecorrer().getContenido().getPlanetasJugador().getInicio();
        setObtener(obtener);
    }

    public void aumentoListaJugadores(JFrame ventana) {

        if (getObtener() == null && getRecorrer() != null) {
            recorrer = recorrer.getSiguiente();
            if (recorrer != null) {
                obtener = getRecorrer().getContenido().getPlanetasJugador().getInicio();
                setObtener(obtener);
            }
            establecerDatosJugador(ventana);
        }
    }

    public void establecerDatosJugador(JFrame ventana) {
        if (recorrer != null) {
            lblJugador.setText(recorrer.getContenido().getNombre());
            lblJugador.setForeground(recorrer.getContenido().getColorAsignado());
            lblPlaneta.setText(obtener.getContenido().getNombrePlaneta());
            lblPlaneta.setForeground(recorrer.getContenido().getColorAsignado());
            lblTipoJugador.setText(recorrer.getContenido().getTipo());
            lblTipoJugador.setForeground(recorrer.getContenido().getColorAsignado());
        }
        if (recorrer == null) {
            ventana.dispose();
            JFrameDisMapa mapa = new JFrameDisMapa();
            mapa.setVisible(true);
        }
    }

    public void verificar(JFrame ventana) {
        int casilla;
        try {
            casilla = Integer.parseInt(txtNumeroCasilla.getText());
            obtenerTamañoMapa();
            if (casilla > 0 && casilla <= getTamaño()) {
                agregar(casilla);
                aumentoListaJugadores(ventana);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Dato Incorrecto");
        }
        getMatriz();
    }

    public void agregar(int casilla) {

        int contador = 1;
        if (getRecorrer() != null) {
            for (int i = 0; i < getColumnas(); i++) {
                for (int j = 0; j < getFilas(); j++) {
                    if (contador == casilla) {
                        if ("".equals(getMatriz()[i][j].getText())) {
                            JOptionPane.showMessageDialog(null, "Esta posición no esta disponible");
                        } else {
                            getMatriz()[i][j].setText("");
                            getMatriz()[i][j].setBackground(recorrer.getContenido().getColorAsignado());
                            ImageIcon im = new ImageIcon(getClass().getResource(obtener.getContenido().getPath()));
                            Icon imag = new ImageIcon(im.getImage().getScaledInstance(getMatriz()[i][j].getWidth(), getMatriz()[i][j].getHeight(), Image.SCALE_DEFAULT));
                            getMatriz()[i][j].setIcon(imag);
                            obtener.getContenido().setPosicion(contador);
                            obtener = obtener.getSiguiente();
                            setObtener(obtener);
                            setMatriz(getMatriz());
                        }
                    }
                    contador++;
                }
            }
        }
    }

    public void obtenerTamañoMapa() {
        NodoDoble<Mapa> recorrer = getListaMapas().getInicio();
        for (int i = 0; i < getListaMapas().obtenerLongitud(); i++) {
            if (recorrer.getContenido().getNombreMapa() == cmbListaMapas.getSelectedItem()) {
                filas = recorrer.getContenido().getAlto();
                columnas = recorrer.getContenido().getAncho();
                tamaño = filas * columnas;
                setTamaño(tamaño);
                setFilas(filas);
                setColumnas(columnas);
                break;
            }
            recorrer = recorrer.getSiguiente();
        }
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public NodoDoble<Jugador> getRecorrer() {
        return recorrer;
    }

    public void setRecorrer(NodoDoble<Jugador> recorrer) {
        this.recorrer = recorrer;
    }

    public NodoDoble<PlanetaJugador> getObtener() {
        return obtener;
    }

    public void setObtener(NodoDoble<PlanetaJugador> obtener) {
        this.obtener = obtener;
    }

}
