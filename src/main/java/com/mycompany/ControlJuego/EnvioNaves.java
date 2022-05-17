package com.mycompany.ControlJuego;

import static com.mycompany.JFrame.JFrameDisMapa.getListaAtaques;
import static com.mycompany.JFrame.JFrameDisMapa.jtxtMensajes;
import static com.mycompany.JFrame.JFramePrincipal.getListaJugadores;
import com.mycompany.Listas.NodoDoble;
import com.mycompany.Personaje.Jugador;
import com.mycompany.Planeta.Planeta;
import com.mycompany.Planeta.PlanetaJugador;
import com.mycompany.Planeta.PlanetaZombie;
import java.awt.Color;
import javax.swing.JOptionPane;

public class EnvioNaves {

    public void enviarNavesIA(PlanetaJugador planetaOrigen, PlanetaJugador planetaDestino) {
        Ataque nuevoAtaque = new Ataque();
        int cantidadNaves = (int) (Math.random() * 50 + 20);
        nuevoAtaque.setCantidadNaves(cantidadNaves);
        nuevoAtaque.setCantidadTurno(Turnos(planetaOrigen.getPosicion(), planetaDestino.getPosicion()));
        nuevoAtaque.setOrigen(planetaOrigen);
        nuevoAtaque.setDestino(planetaDestino);
        getListaAtaques().agregar(nuevoAtaque);
        jtxtMensajes.setText(String.format("(%s) El planeta %s envio %d naves al planeta %s ", planetaOrigen.getConquistador(),planetaOrigen.getNombrePlaneta(), cantidadNaves, planetaDestino.getNombrePlaneta()));
        jtxtMensajes.setForeground(obtenerColor(planetaOrigen));
    }

    //se envian las naves del jugador
    public void enviarNavesJugador(PlanetaJugador planetaOrigen, Planeta planetaDestino) {
        Ataque nuevoAtaque = new Ataque();
        int cantidadDeNaves = 0;
        do {
            cantidadDeNaves = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de naves Que desee mandar"));
            if (cantidadDeNaves > planetaOrigen.getCantidadNavesInicial()) {
                JOptionPane.showMessageDialog(null, "No puede mandar esta cantidad de naves");
            }
        } while (cantidadDeNaves == 0 || cantidadDeNaves > planetaOrigen.getCantidadNavesInicial());
        nuevoAtaque.setCantidadNaves(cantidadDeNaves);
        nuevoAtaque.setCantidadTurno(Turnos(planetaOrigen.getPosicion(), planetaDestino.getPosicion()));
        nuevoAtaque.setOrigen(planetaOrigen);
        nuevoAtaque.setDestino(planetaDestino);
        getListaAtaques().agregar(nuevoAtaque);
        jtxtMensajes.setText(String.format("(%s) El planeta %s envio %d naves al planeta %s ", planetaOrigen.getConquistador(),planetaOrigen.getNombrePlaneta(), 
                                                                                                           cantidadDeNaves, planetaDestino.getNombrePlaneta()));
        jtxtMensajes.setForeground(obtenerColor(planetaOrigen));
    }

    //Se obtienen los turnos que tardan en llegar las naves
    public int Turnos(int posicionOrigen, int posicionDestino) {
        BusquedaPosiciones buscar = new BusquedaPosiciones();
        MotorJuego turnos = new MotorJuego();
        int posicionXOrigen = buscar.obtenerPosicionEnX(posicionOrigen);
        int posicionYOrigen = buscar.obtenerPosicionEnY(posicionOrigen);
        int posicionXDestino = buscar.obtenerPosicionEnX(posicionDestino);
        int posicionYDestino = buscar.obtenerPosicionEnY(posicionDestino);
        return turnos.obtenerTurnosQueTarda(posicionXOrigen, posicionYOrigen, posicionXDestino, posicionYDestino);
    }

    //Se envian las naves del planeta zombie
    public void enviarNavesZombie(PlanetaZombie planetaOrigen, PlanetaJugador planetaDestino) {
        Ataque nuevoAtaque = new Ataque();
        nuevoAtaque.setCantidadNaves(planetaOrigen.getCantidadNavesMandar());
        nuevoAtaque.setCantidadTurno(Turnos(planetaOrigen.getPosicion(), planetaDestino.getPosicion()));
        nuevoAtaque.setOrigen(planetaOrigen);
        nuevoAtaque.setDestino(planetaDestino);
        getListaAtaques().agregar(nuevoAtaque);
        jtxtMensajes.setText(String.format("(%s) El planeta %s envio %d naves al planeta %s ", planetaOrigen.getTipo(),planetaOrigen.getNombrePlaneta(),
                                                                           planetaOrigen.getCantidadNavesMandar() , planetaDestino.getNombrePlaneta()));
        jtxtMensajes.setForeground(planetaOrigen.getColorAsignado());

    }
    //Se obtiene la distancia entre los planetas
    public float distancia(int posicionOrigen, int posicionDestino) {
        BusquedaPosiciones buscar = new BusquedaPosiciones();
        MotorJuego turnos = new MotorJuego();
        int posicionXOrigen = buscar.obtenerPosicionEnX(posicionOrigen);
        int posicionYOrigen = buscar.obtenerPosicionEnY(posicionOrigen);
        int posicionXDestino = buscar.obtenerPosicionEnX(posicionDestino);
        int posicionYDestino = buscar.obtenerPosicionEnY(posicionDestino);
        return turnos.calcularDistancia(posicionXOrigen, posicionYOrigen, posicionXDestino, posicionYDestino);
    }
    
    public Color obtenerColor(PlanetaJugador planeta){
        NodoDoble<Jugador> recorrer = getListaJugadores().getInicio();
        Color color = null;
        while(recorrer != null){
            if(recorrer.getContenido().getNombre().equals(planeta.getConquistador())){
                color = recorrer.getContenido().getColorAsignado();
            }
            recorrer = recorrer.getSiguiente();
        }
        return color;
    }
    
}
