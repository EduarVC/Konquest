package com.mycompany.Manger;

import static com.mycompany.JFrame.DatosPlanetasJugador.lblNombreJugador;
import static com.mycompany.JFrame.DatosPlanetasJugador.lblNombrePlaneta;
import static com.mycompany.JFrame.DatosPlanetasJugador.lblTipoJugador;
import static com.mycompany.JFrame.DatosPlanetasJugador.lblTipoPlaneta;
import static com.mycompany.JFrame.DatosPlanetasJugador.spNavesIniciales;
import static com.mycompany.JFrame.DatosPlanetasJugador.spPorcentajePlanetasJugador;
import static com.mycompany.JFrame.DatosPlanetasJugador.spProduccionPlanetasJugador;
import static com.mycompany.JFrame.JFramePrincipal.getListaJugadores;
import com.mycompany.Listas.NodoDoble;
import com.mycompany.Personaje.Jugador;
import com.mycompany.Planeta.PlanetaJugador;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CapturarDatosPlanetaJugador {

    private NodoDoble<Jugador> recorrer;
    private NodoDoble<PlanetaJugador> obtener;

    public CapturarDatosPlanetaJugador() {
        recorrer = getListaJugadores().getInicio();
        setRecorrer(recorrer);
    }

    public void establecerDatos() {
        obtener = recorrer.getContenido().getPlanetasJugador().getInicio();
        setObtener(obtener);
        lblNombrePlaneta.setText(getObtener().getContenido().getNombrePlaneta());
        lblTipoPlaneta.setText(getObtener().getContenido().getTipo());
        lblNombreJugador.setText(getRecorrer().getContenido().getNombre());
        lblTipoJugador.setText(getRecorrer().getContenido().getTipo());
        spNavesIniciales.setValue(0);
        spProduccionPlanetasJugador.setValue(0);
        spPorcentajePlanetasJugador.setValue(0.000);

    }

    public void obtenerDatos(JFrame ventana) {
        try {
            getObtener().getContenido().setCantidadNavesInicial((int) spNavesIniciales.getValue());
            getObtener().getContenido().setProduccion((int) spProduccionPlanetasJugador.getValue());
            getObtener().getContenido().setPorcentajeMuerte((float) spPorcentajePlanetasJugador.getValue());
            obtener = getObtener().getSiguiente();
            setObtener(obtener);
            if (getObtener() == null) {
                recorrer = getRecorrer().getSiguiente();
                setRecorrer(recorrer);
                if (getRecorrer() != null) {
                    establecerDatos();
                } else {
                    ventana.setVisible(false);
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos para poder continuar");
        }

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
