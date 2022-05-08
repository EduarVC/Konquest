package com.mycompany.Manger;

import static com.mycompany.JFrame.EliminarJugador.txtNumero;
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
        int indice = Integer.parseInt(txtNumero.getText()) - 1;
        System.out.println(indice);
        String tipoAgregar = getListaJugadores().buscarIndice(indice).getContenido().getPlanetasJugador().buscarIndice(0).getContenido().getTipo();
        agregarTipo.añadirTipoLista(tipoAgregar);
        getListaJugadores().eliminarElementoEnIndice(indice);
        inicializarTabla.InicializarTablaElimar(tblLista);
        
    }
}
