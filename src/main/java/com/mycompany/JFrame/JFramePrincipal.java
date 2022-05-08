package com.mycompany.JFrame;

import static com.mycompany.Establecer.EstablecerImagen.establecerImagen;
import com.mycompany.Listas.ListaDobleEnlazada;
import com.mycompany.Listas.TiposPlanetasDisponibles;
import com.mycompany.Personaje.Jugador;

/**
 *
 * @author Eduardo Vásquez
 */
public class JFramePrincipal extends javax.swing.JFrame {

    private static ListaDobleEnlazada<Jugador> listaJugadores;
    private TiposPlanetasDisponibles listaTipos;
    static String[] listaTiposPlanetas;

    public JFramePrincipal() {
        
        initComponents();
        this.setLocationRelativeTo(this);
        listaTipos = new TiposPlanetasDisponibles();
        listaJugadores = new ListaDobleEnlazada<>();
        establecerImagen(jlbFondo,"src/main/java/com/mycompany/Imagenes/FondoNave.jpg"); //establecemos la imagen de fondo
        setListaTiposPlanetas(listaTipos.getTipos());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbListaMapas = new javax.swing.JComboBox<>();
        btnAñadirJugador = new javax.swing.JButton();
        btnEditarMapa = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnGuardarSalir = new javax.swing.JButton();
        btnIniciarPartida = new javax.swing.JButton();
        cmbListaJugadores = new javax.swing.JComboBox<>();
        btnEliminarJugador = new javax.swing.JButton();
        btnCrearMapa = new javax.swing.JButton();
        lblElegirMapa = new javax.swing.JLabel();
        lblListaJugadores = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbListaMapas.setBackground(new java.awt.Color(0, 25, 11));
        cmbListaMapas.setForeground(new java.awt.Color(204, 204, 204));
        cmbListaMapas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mapas" }));

        btnAñadirJugador.setBackground(new java.awt.Color(0, 25, 11));
        btnAñadirJugador.setForeground(new java.awt.Color(204, 204, 204));
        btnAñadirJugador.setText("Añadir jugador");
        btnAñadirJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirJugadorActionPerformed(evt);
            }
        });

        btnEditarMapa.setBackground(new java.awt.Color(0, 25, 11));
        btnEditarMapa.setForeground(new java.awt.Color(204, 204, 204));
        btnEditarMapa.setText("Editar");

        btnReportes.setBackground(new java.awt.Color(0, 25, 11));
        btnReportes.setForeground(new java.awt.Color(204, 204, 204));
        btnReportes.setText("Reportes");

        btnGuardarSalir.setBackground(new java.awt.Color(0, 25, 11));
        btnGuardarSalir.setForeground(new java.awt.Color(204, 204, 204));
        btnGuardarSalir.setText("Salir y guardar");

        btnIniciarPartida.setBackground(new java.awt.Color(0, 25, 11));
        btnIniciarPartida.setForeground(new java.awt.Color(204, 204, 204));
        btnIniciarPartida.setText("Iniciar partida");

        cmbListaJugadores.setBackground(new java.awt.Color(0, 25, 11));
        cmbListaJugadores.setForeground(new java.awt.Color(204, 204, 204));
        cmbListaJugadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jugadores" }));

        btnEliminarJugador.setBackground(new java.awt.Color(0, 25, 11));
        btnEliminarJugador.setForeground(new java.awt.Color(204, 204, 204));
        btnEliminarJugador.setText("Eliminar jugador");
        btnEliminarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarJugadorActionPerformed(evt);
            }
        });

        btnCrearMapa.setBackground(new java.awt.Color(0, 25, 11));
        btnCrearMapa.setForeground(new java.awt.Color(204, 204, 204));
        btnCrearMapa.setText("Crear Mapa");
        btnCrearMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearMapaActionPerformed(evt);
            }
        });

        lblElegirMapa.setForeground(new java.awt.Color(255, 255, 255));
        lblElegirMapa.setText("Elegir mapa para editar");

        lblListaJugadores.setForeground(new java.awt.Color(255, 255, 255));
        lblListaJugadores.setText("Lista de jugadores");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("KONQUEST");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(lblElegirMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(cmbListaMapas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnEditarMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(btnCrearMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblListaJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnIniciarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(btnGuardarSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(cmbListaJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnEliminarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnAñadirJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jlbFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblElegirMapa)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbListaMapas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btnCrearMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblListaJugadores)
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIniciarPartida)
                    .addComponent(btnGuardarSalir)))
            .addGroup(layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(btnReportes))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(cmbListaJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(btnEliminarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(btnAñadirJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jlbFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static String[] getListaTiposPlanetas() {
        return listaTiposPlanetas;
    }

    public static void setListaTiposPlanetas(String[] listaPlanetas) {
        JFramePrincipal.listaTiposPlanetas = listaPlanetas;
    }

    public static ListaDobleEnlazada<Jugador> getListaJugadores() {
        return listaJugadores;
    }
    private void btnAñadirJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirJugadorActionPerformed

        DatosJugador añadirDatos = new DatosJugador();
        añadirDatos.setVisible(true);
    }//GEN-LAST:event_btnAñadirJugadorActionPerformed

    private void btnCrearMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearMapaActionPerformed
        JFrameMapa nuevoMapa = new JFrameMapa();
        nuevoMapa.setVisible(true);
    }//GEN-LAST:event_btnCrearMapaActionPerformed

    private void btnEliminarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarJugadorActionPerformed
        EliminarJugador eliminar = new EliminarJugador();
        eliminar.setVisible(true);
    }//GEN-LAST:event_btnEliminarJugadorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAñadirJugador;
    private javax.swing.JButton btnCrearMapa;
    private javax.swing.JButton btnEditarMapa;
    private javax.swing.JButton btnEliminarJugador;
    private javax.swing.JButton btnGuardarSalir;
    private javax.swing.JButton btnIniciarPartida;
    private javax.swing.JButton btnReportes;
    public static javax.swing.JComboBox<String> cmbListaJugadores;
    private javax.swing.JComboBox<String> cmbListaMapas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlbFondo;
    private javax.swing.JLabel lblElegirMapa;
    private javax.swing.JLabel lblListaJugadores;
    // End of variables declaration//GEN-END:variables
}
