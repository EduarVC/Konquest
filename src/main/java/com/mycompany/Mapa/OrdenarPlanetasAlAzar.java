package com.mycompany.Mapa;

import static com.mycompany.JFrame.JFramePrincipal.cmbListaMapas;
import static com.mycompany.JFrame.JFramePrincipal.getListaJugadores;
import static com.mycompany.JFrame.JFramePrincipal.getListaMapas;
import static com.mycompany.JFrame.JFramePrincipal.getMatriz;
import static com.mycompany.JFrame.JFramePrincipal.setMatriz;
import com.mycompany.Listas.NodoDoble;
import com.mycompany.Personaje.Jugador;
import com.mycompany.Planeta.PlanetaFantasma;
import com.mycompany.Planeta.PlanetaJugador;
import com.mycompany.Planeta.PlanetaNeutral;
import com.mycompany.Planeta.PlanetaZombie;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class OrdenarPlanetasAlAzar {
    private int tamañoMapa;

    public OrdenarPlanetasAlAzar() {

    }

    public void oredenarPlanetasJugador() {
        NodoDoble<Jugador> recorrer = getListaJugadores().getInicio();
        NodoDoble<PlanetaJugador> obtener = recorrer.getContenido().getPlanetasJugador().getInicio();
        obtenerTamañoMatriz();
        System.out.println(getTamañoMapa());
        boolean agregada = false;
        int contador = 1;
        int casillaAleatoria = 0;
        while (recorrer != null) {
            System.out.println("1");
            while (obtener != null) {
                System.out.println("2");
                while (agregada == false) {
                    System.out.println("3");
                    System.out.println(getTamañoMapa());
                    casillaAleatoria = (int) (Math.random() * getTamañoMapa() + 1);
                    System.out.println(casillaAleatoria);
                    System.out.println(contador);
                    for (int i = 0; i < getMatriz().length; i++) {
                        for (int j = 0; j < getMatriz()[i].length; j++) {
                            if (contador == casillaAleatoria) {
                                if (!"".equals(getMatriz()[i][j].getText())) {
                                    getMatriz()[i][j].setText("");
                                    getMatriz()[i][j].setBackground(recorrer.getContenido().getColorAsignado());
                                    ImageIcon im = new ImageIcon(getClass().getResource(obtener.getContenido().getPath()));
                                    Icon imag = new ImageIcon(im.getImage().getScaledInstance(getMatriz()[i][j].getWidth(), getMatriz()[i][j].getHeight(), Image.SCALE_DEFAULT));
                                    getMatriz()[i][j].setIcon(imag);
                                    obtener.getContenido().setPosicion(contador);
                                    obtener = obtener.getSiguiente();
                                    setMatriz(getMatriz());
                                    agregada = true;
                                    if (obtener == null) {
                                        recorrer = recorrer.getSiguiente();
                                    }

                                }

                            }
                            if (agregada == true) {
                                contador = 1;
                                break;
                            } else {
                                contador++;
                            }
                        }
                        if (agregada == true) {
                            break;
                        }
                    }
                }
                if (recorrer != null) {
                    agregada = false;
                }
            }
            if (recorrer != null) {
                obtener = recorrer.getContenido().getPlanetasJugador().getInicio();
            }
        }
    }

    public void ordenarPlanetasNeutrals() {
        NodoDoble<Mapa> recorrer = getListaMapas().getInicio();
        NodoDoble<PlanetaNeutral> obtener = recorrer.getContenido().getListaPlanetaNeutral().getInicio();
        obtenerTamañoMatriz();
        boolean agregada = false;
        int contador = 1;
        int casillaAleatoria = 0;
        System.out.println("---------------");
        System.out.println(getTamañoMapa());
        while (recorrer != null) {
            System.out.println("10");
            while (obtener != null) {
                System.out.println("20");
                while (agregada == false) {
                    System.out.println("aa30");
                    casillaAleatoria = (int) (Math.random() * getTamañoMapa() + 1);
                    System.out.println(casillaAleatoria);
                    System.out.println(contador);
                    for (int i = 0; i < getMatriz().length; i++) {
                        for (int j = 0; j < getMatriz()[i].length; j++) {
                            if (contador == casillaAleatoria) {
                                if (!"".equals(getMatriz()[i][j].getText())) {
                                    getMatriz()[i][j].setText("");
                                    getMatriz()[i][j].setBackground(obtener.getContenido().getColorAsignado());
                                    ImageIcon im = new ImageIcon(getClass().getResource(obtener.getContenido().getPath()));
                                    Icon imag = new ImageIcon(im.getImage().getScaledInstance(getMatriz()[i][j].getWidth(), getMatriz()[i][j].getHeight(), Image.SCALE_DEFAULT));
                                    getMatriz()[i][j].setIcon(imag);
                                    obtener.getContenido().setPosicion(contador);
                                    obtener = obtener.getSiguiente();
                                    setMatriz(getMatriz());
                                    agregada = true;
                                    if (obtener == null) {
                                        recorrer = recorrer.getSiguiente();
                                    }

                                }

                            }
                            if (agregada == true) {
                                contador = 1;
                                break;
                            } else {
                                contador++;
                            }

                        }
                        if (agregada == true) {
                            break;
                        }
                    }
                }
                if (recorrer != null) {
                    agregada = false;
                }

            }
            if (recorrer != null) {
                obtener = recorrer.getContenido().getListaPlanetaNeutral().getInicio();
            }
        }
    }

    public void ordenarPlanetasFantasma() {
        NodoDoble<Mapa> recorrer = getListaMapas().getInicio();
        NodoDoble<PlanetaFantasma> obtener = recorrer.getContenido().getListaPlanetasFantasma().getInicio();
        obtenerTamañoMatriz();
        boolean agregada = false;
        int contador = 1;
        int casillaAleatoria = 0;
        while (recorrer != null) {
            System.out.println("100");
            while (obtener != null) {
                System.out.println("200");
                while (agregada == false) {
                    System.out.println("300");
                    casillaAleatoria = (int) (Math.random() * getTamañoMapa() + 1);
                    for (int i = 0; i < getMatriz().length; i++) {
                        for (int j = 0; j < getMatriz()[i].length; j++) {
                            if (contador == casillaAleatoria) {
                                if (!"".equals(getMatriz()[i][j].getText())) {
                                    getMatriz()[i][j].setText("");
                                    getMatriz()[i][j].setBackground(obtener.getContenido().getColorAsignado());
                                    ImageIcon im = new ImageIcon(getClass().getResource(obtener.getContenido().getPath()));
                                    Icon imag = new ImageIcon(im.getImage().getScaledInstance(getMatriz()[i][j].getWidth(), getMatriz()[i][j].getHeight(), Image.SCALE_DEFAULT));
                                    getMatriz()[i][j].setIcon(imag);
                                    obtener.getContenido().setPosicion(contador);
                                    obtener = obtener.getSiguiente();
                                    setMatriz(getMatriz());
                                    agregada = true;
                                    if (obtener == null) {
                                        recorrer = recorrer.getSiguiente();
                                    }
                                }

                            }
                            if (agregada == true) {
                                contador = 1;
                                break;
                            } else {
                                contador++;
                            }
                        }
                        if (agregada == true) {
                            break;
                        }
                    }
                }
                if (recorrer != null) {
                    agregada = false;
                }
            }
            if (recorrer != null) {
                obtener = recorrer.getContenido().getListaPlanetasFantasma().getInicio();
            }
        }
    }

    public void ordenarPlanetaZombie() {
        NodoDoble<Mapa> recorrer = getListaMapas().getInicio();
        NodoDoble<PlanetaZombie> obtener = recorrer.getContenido().getListaPlanetasZombie().getInicio();
        obtenerTamañoMatriz();
        boolean agregada = false;
        int contador = 1;
        int casillaAleatoria = 0;
        while (recorrer != null) {
            while (obtener != null) {
                while (agregada == false) {
                    casillaAleatoria = (int) (Math.random() * getTamañoMapa() + 1);
                    for (int i = 0; i < getMatriz().length; i++) {
                        for (int j = 0; j < getMatriz()[i].length; j++) {
                            if (contador == casillaAleatoria) {
                                if (!"".equals(getMatriz()[i][j].getText())) {
                                    getMatriz()[i][j].setText("");
                                    getMatriz()[i][j].setBackground(obtener.getContenido().getColorAsignado());
                                    ImageIcon im = new ImageIcon(getClass().getResource(obtener.getContenido().getPath()));
                                    Icon imag = new ImageIcon(im.getImage().getScaledInstance(getMatriz()[i][j].getWidth(), getMatriz()[i][j].getHeight(), Image.SCALE_DEFAULT));
                                    getMatriz()[i][j].setIcon(imag);
                                    obtener.getContenido().setPosicion(contador);
                                    obtener = obtener.getSiguiente();
                                    setMatriz(getMatriz());
                                    agregada = true;
                                    if (obtener == null) {
                                        recorrer = recorrer.getSiguiente();
                                    }
                                }

                            }
                            if (agregada == true) {
                                contador = 1;
                                break;
                            } else {
                                contador++;
                            }
                        }
                        if (agregada == true) {
                            break;
                        }
                    }
                }
                if (recorrer != null) {
                    agregada = false;
                }
            }
            if (recorrer != null) {
                obtener = recorrer.getContenido().getListaPlanetasZombie().getInicio();
            }
        }
    }

    public void obtenerTamañoMatriz() {
        NodoDoble<Mapa> recorrerMapa = getListaMapas().getInicio();
        int alto;
        int ancho;
        for (int i = 0; i < getListaMapas().obtenerLongitud(); i++) {
            if (recorrerMapa.getContenido().getNombreMapa() == cmbListaMapas.getSelectedItem()) {
                alto = recorrerMapa.getContenido().getAlto();
                ancho = recorrerMapa.getContenido().getAncho();
                setTamañoMapa(alto * ancho);
            }
            recorrerMapa = recorrerMapa.getSiguiente();
        }

    }

    public int getTamañoMapa() {
        return tamañoMapa;
    }

    public void setTamañoMapa(int tamañoMapa) {
        this.tamañoMapa = tamañoMapa;
    }

}
