package com.mycompany.ControlJuego;

import static com.mycompany.JFrame.JFramePrincipal.getListaJugadores;
import static com.mycompany.JFrame.JFramePrincipal.getListaMapas;
import static com.mycompany.JFrame.JFramePrincipal.getMatriz;
import com.mycompany.Listas.NodoDoble;
import com.mycompany.Mapa.Mapa;
import com.mycompany.Personaje.Jugador;
import com.mycompany.Planeta.Planeta;
import com.mycompany.Planeta.PlanetaFantasma;
import com.mycompany.Planeta.PlanetaJugador;
import com.mycompany.Planeta.PlanetaNeutral;
import com.mycompany.Planeta.PlanetaZombie;
import javax.swing.JButton;

public class BusquedaPosiciones {

    //Se busca la posicion en x
    public int obtenerPosicionEnX(int posicion) {
        int contador = 1;
        int posicionX = 0;
        boolean encontrado = false;
        for (int i = 0; i < getMatriz().length; i++) {
            for (int j = 0; j < getMatriz()[i].length; j++) {
                if (contador == posicion) {
                    posicionX = i;
                    encontrado = true;
                    break;
                }
                contador++;
            }
            if (encontrado) {
                break;
            }
        }
        return posicionX;
    }
    //se busca la posicion en y

    public int obtenerPosicionEnY(int posicion) {
        int contador = 1;
        int posicionY = 0;
        boolean encontrado = false;
        for (int i = 0; i < getMatriz().length; i++) {
            for (int j = 0; j < getMatriz()[i].length; j++) {
                if (contador == posicion) {
                    posicionY = j;
                    encontrado = true;
                    break;
                }
                contador++;
            }
            if (encontrado) {
                break;
            }
        }
        return posicionY;
    }

    //se obtiene el tamaño del mapa
    public int ObtenertTamañoMapa() {
        int tamañoX = 0;
        int tamañoY = 0;
        for (int i = 0; i < getMatriz().length; i++) {
            for (int j = 0; j < getMatriz()[i].length; j++) {
                if (i == (getMatriz().length - 1) && j == (getMatriz()[i].length - 1)) {
                    tamañoX = i;
                    tamañoY = j;
                }
            }
        }
        return tamañoX + tamañoY;
    }
    //se obtiene el planeta de destino y el planeta origen
    public Planeta obtenerPlaneta(int casillaAtacar) {
        NodoDoble<Jugador> recorrer = getListaJugadores().getInicio();
        NodoDoble<PlanetaJugador> obtener = recorrer.getContenido().getPlanetasJugador().getInicio();
        Planeta planeta = new PlanetaJugador();
        int contador = 1;
        boolean encontrado = false;
        for (int i = 0; i < getMatriz().length; i++) {
            for (int j = 0; j < getMatriz()[i].length; j++) {
                if (contador == casillaAtacar) {
                    planeta = obtener.getContenido();
                    encontrado = true;
                    break;
                }
                obtener = obtener.getSiguiente();
                if (obtener == null) {
                    recorrer = recorrer.getSiguiente();
                    obtener = recorrer.getContenido().getPlanetasJugador().getInicio();
                }
            }
            if (encontrado) {
                break;
            }

        }
        return planeta;

    }
    //Se obtiene la posicion del boton
    public int obtenerCasilla(JButton boton) {
        int contador = 1;
        int casillaSeleccinada = 0;
        boolean encontrado = false;
        for (int i = 0; i < getMatriz().length; i++) {
            for (int j = 0; j < getMatriz()[i].length; j++) {
                if (getMatriz()[i][j] == boton) {
                    casillaSeleccinada = contador;
                    encontrado = true;
                    break;
                }
                contador++;
                System.out.println(contador);
            }
            if (encontrado) {
                break;
            }
        }
        
        return casillaSeleccinada;
    }
    //Se Obtiene el tipo de planeta
    public Planeta obtenerTipoPlaneta(int posicion) {
        NodoDoble<Jugador> recorerJugadores = getListaJugadores().getInicio();
        NodoDoble<Mapa> recorrerMapa = getListaMapas().getInicio();
        NodoDoble<PlanetaJugador> planeta = recorerJugadores.getContenido().getPlanetasJugador().getInicio();
        NodoDoble<PlanetaNeutral> neutral = recorrerMapa.getContenido().getListaPlanetaNeutral().getInicio();
        NodoDoble<PlanetaFantasma> fantasma = recorrerMapa.getContenido().getListaPlanetasFantasma().getInicio();
        NodoDoble<PlanetaZombie> zombie = recorrerMapa.getContenido().getListaPlanetasZombie().getInicio();
        Planeta planetaSeleccionado = null;

        while (recorerJugadores != null) {

            if (planeta.getContenido().getPosicion() == posicion) {
                planetaSeleccionado = new PlanetaJugador();
                planetaSeleccionado = planeta.getContenido();
                break;
            }
            planeta = planeta.getSiguiente();
            if (planeta == null) {
                recorerJugadores = recorerJugadores.getSiguiente();
                if (recorerJugadores != null) {
                    planeta = recorerJugadores.getContenido().getPlanetasJugador().getInicio();
                }
            }
        }
        
        if (planetaSeleccionado == null) {
            while (recorrerMapa != null) {
                if (neutral.getContenido().getPosicion() == posicion) {
                    planetaSeleccionado = new PlanetaNeutral();
                    planetaSeleccionado = neutral.getContenido();
                    break;
                }
                neutral = neutral.getSiguiente();
                if (neutral == null) {
                    recorrerMapa = recorrerMapa.getSiguiente();
                    if (recorrerMapa != null) {
                        neutral = recorrerMapa.getContenido().getListaPlanetaNeutral().getInicio();
                    }
                }
            }

        }
        
        if (planetaSeleccionado == null) {
            recorrerMapa = getListaMapas().getInicio();
            while (recorrerMapa != null) {
                if (fantasma.getContenido().getPosicion() == posicion) {
                    planetaSeleccionado = new PlanetaFantasma();
                    planetaSeleccionado = fantasma.getContenido();
                    break;
                }
                fantasma = fantasma.getSiguiente();
                if (fantasma == null) {
                    recorrerMapa = recorrerMapa.getSiguiente();
                    if (recorrerMapa != null) {
                        fantasma = recorrerMapa.getContenido().getListaPlanetasFantasma().getInicio();
                    }
                }
            }
        }
        if (planetaSeleccionado == null) {
            recorrerMapa = getListaMapas().getInicio();
            while (recorrerMapa != null) {
                if (zombie.getContenido().getPosicion() == posicion) {
                    planetaSeleccionado = new PlanetaZombie();
                    planetaSeleccionado = zombie.getContenido();
                    break;
                }
                zombie = zombie.getSiguiente();
                if (zombie == null) {
                    recorrerMapa = recorrerMapa.getSiguiente();
                    if (recorrerMapa != null) {
                        zombie = recorrerMapa.getContenido().getListaPlanetasZombie().getInicio();
                    }
                }
            }
        }
        return planetaSeleccionado;
    }
}
