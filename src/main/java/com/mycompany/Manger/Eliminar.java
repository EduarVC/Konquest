package com.mycompany.Manger;

import static com.mycompany.JFrame.EliminarJugador.txtNumero;
import static com.mycompany.JFrame.JFramePrincipal.btnAñadirJugador;
import static com.mycompany.JFrame.JFramePrincipal.getListaJugadores;
import com.mycompany.Listas.ListaException;
import com.mycompany.Listas.TiposPlanetasDisponibles;
import javax.swing.JTable;

public class Eliminar {

    private ManagerMapa inicializarTabla;
    private TiposPlanetasDisponibles agregarTipo;

    public Eliminar() {
        agregarTipo = new TiposPlanetasDisponibles();
        inicializarTabla = new ManagerMapa();
    }

    public void EliminarJugador(JTable tblLista) throws ListaException {
        int indice = (Integer.parseInt(txtNumero.getText())) - 1;
        System.out.println(indice);
//        getListaJugadores().obtenerContenido(indice).getPlanetasJugador().obtenerContenido(0).getTipo();
// getListaJugadores().obtenerContenido(indice).getPlanetasJugador().obtenerContenido(0).getTipo();
        String tipoAgregar = getListaJugadores().buscarIndice(indice).getContenido().getPlanetasJugador().obtenerContenido(0).getTipo();
        System.out.println(tipoAgregar);
        agregarTipo.añadirTipoLista(tipoAgregar);
        getListaJugadores().eliminarElementoEnIndice(indice);
        inicializarTabla.InicializarTablaElimar(tblLista);
        btnAñadirJugador.setEnabled(true);
    }
}
