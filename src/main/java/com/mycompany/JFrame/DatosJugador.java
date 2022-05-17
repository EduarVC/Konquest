package com.mycompany.JFrame;

import com.mycompany.Establecer.EstablecerImagen;
import static com.mycompany.JFrame.JFramePrincipal.btnCrearMapa;
import com.mycompany.Listas.ListaException;
import com.mycompany.Listas.TiposPlanetasDisponibles;
import com.mycompany.Manger.ObtenerDatosJugador;
import com.mycompany.Manger.RestriccionesYvalidaciones;
import com.mycompany.Manger.botonAcpDtsJugador;

public class DatosJugador extends javax.swing.JFrame {

    private ObtenerDatosJugador obtener;
    private botonAcpDtsJugador botonAceptar;
    private RestriccionesYvalidaciones restringir;
    private TiposPlanetasDisponibles iniciarCmbx;
    private EstablecerImagen establecerIMG;
    
    public DatosJugador() {
        initComponents();
        this.setLocationRelativeTo(this);
        iniciarCmbx = new TiposPlanetasDisponibles();
        restringir = new RestriccionesYvalidaciones();
        botonAceptar = new botonAcpDtsJugador();
        establecerIMG = new EstablecerImagen();
        establecerIMG.establecerImagen(lblFondo, "/FondoNave.jpg"); //establecemos la imagen de fondo
        btnGuardar.setEnabled(false);
        cmbModo.setEnabled(false);
        iniciarCmbx.definirTiposPrincipio(cmbTipoPlaneta);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        coloresSeleccion = new javax.swing.JColorChooser();
        jLabel1 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        panelColor = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();
        lblAvisoNombre = new javax.swing.JLabel();
        lblAvisoCmb = new javax.swing.JLabel();
        lblAvisoColor = new javax.swing.JLabel();
        cmbModo = new javax.swing.JComboBox<>();
        lblDificultad = new javax.swing.JLabel();
        cmbTipoPlaneta = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtNombrePlaneta = new javax.swing.JTextField();
        lblNombrePlaneta = new javax.swing.JLabel();
        lblAvisoNombrePlaneta = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtNombre.setBackground(new java.awt.Color(51, 51, 51));
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        coloresSeleccion.setBackground(new java.awt.Color(51, 51, 51));
        coloresSeleccion.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Nombre:");

        cmbTipo.setBackground(new java.awt.Color(153, 153, 153));
        cmbTipo.setForeground(new java.awt.Color(0, 0, 0));
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione tipo", "Humano", "Inteligencia Artificial" }));
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });
        cmbTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbTipoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbTipoKeyReleased(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Tipo:");

        btnCancelar.setBackground(new java.awt.Color(51, 51, 51));
        btnCancelar.setForeground(new java.awt.Color(204, 204, 204));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(51, 51, 51));
        btnGuardar.setForeground(new java.awt.Color(204, 204, 204));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Seleccione el color del jugador: ");

        btnSeleccionar.setBackground(new java.awt.Color(51, 51, 51));
        btnSeleccionar.setForeground(new java.awt.Color(204, 204, 204));
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        lblAvisoNombre.setForeground(new java.awt.Color(255, 0, 51));
        lblAvisoNombre.setText("*Campo obligatorio");

        lblAvisoCmb.setForeground(new java.awt.Color(255, 0, 51));
        lblAvisoCmb.setText("*Campo obligatorio");

        lblAvisoColor.setForeground(new java.awt.Color(255, 0, 51));
        lblAvisoColor.setText("*Campo Obligatorio");

        cmbModo.setBackground(new java.awt.Color(153, 153, 153));
        cmbModo.setForeground(new java.awt.Color(0, 0, 0));
        cmbModo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fácil", "Difícil" }));

        lblDificultad.setForeground(new java.awt.Color(204, 204, 204));
        lblDificultad.setText("Modo:");

        cmbTipoPlaneta.setBackground(new java.awt.Color(153, 153, 153));
        cmbTipoPlaneta.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Tipo de planeta: ");

        txtNombrePlaneta.setBackground(new java.awt.Color(51, 51, 51));
        txtNombrePlaneta.setForeground(new java.awt.Color(204, 204, 204));
        txtNombrePlaneta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombrePlanetaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombrePlanetaKeyTyped(evt);
            }
        });

        lblNombrePlaneta.setForeground(new java.awt.Color(204, 204, 204));
        lblNombrePlaneta.setText("Nombre del planeta:");

        lblAvisoNombrePlaneta.setForeground(new java.awt.Color(255, 0, 51));
        lblAvisoNombrePlaneta.setText("*Campo obligatorio");

        lblFondo.setBackground(new java.awt.Color(51, 51, 51));
        lblFondo.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(580, 580, 580)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(510, 510, 510)
                .addComponent(cmbTipoPlaneta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(lblDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(650, 650, 650)
                .addComponent(txtNombrePlaneta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(650, 650, 650)
                .addComponent(lblAvisoNombrePlaneta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(coloresSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(510, 510, 510)
                .addComponent(cmbModo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(panelColor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(lblAvisoColor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(lblAvisoCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(lblAvisoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(650, 650, 650)
                .addComponent(lblNombrePlaneta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(570, 570, 570)
                .addComponent(btnSeleccionar))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(570, 570, 570)
                .addComponent(btnGuardar))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(cmbTipoPlaneta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(lblDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(txtNombrePlaneta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(lblAvisoNombrePlaneta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(coloresSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(cmbModo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(panelColor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(lblAvisoColor))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(lblAvisoCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(570, 570, 570)
                .addComponent(btnCancelar))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblAvisoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblNombrePlaneta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        obtener = new ObtenerDatosJugador();
        obtener.obtenerColor(coloresSeleccion);
        restringir.validarColor();
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        restringir.limitarTamaño(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        restringir.validacionLbvVacio();
    }//GEN-LAST:event_txtNombreKeyReleased

    private void cmbTipoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbTipoKeyReleased

    }//GEN-LAST:event_cmbTipoKeyReleased

    private void cmbTipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbTipoKeyPressed

    }//GEN-LAST:event_cmbTipoKeyPressed

    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed

        restringir.validacionCombobox();
    }//GEN-LAST:event_cmbTipoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        restringir.reestablecerComponentes();
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        obtener.obtenerNombreJugador(txtNombre);
        obtener.obtenerTipoJugador(cmbTipo);
        try {
            botonAceptar.guardarDatosJugador();
        } catch (ListaException ex) {
            System.out.println("Algo paso");
        }
        restringir.reestablecerComponentes();
        btnCrearMapa.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombrePlanetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombrePlanetaKeyTyped
        restringir.limitarTamañoNombrePlaneta(evt);
    }//GEN-LAST:event_txtNombrePlanetaKeyTyped

    private void txtNombrePlanetaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombrePlanetaKeyReleased
        restringir.validacionTxtNombrePlaneta();
    }//GEN-LAST:event_txtNombrePlanetaKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    public static javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSeleccionar;
    public static javax.swing.JComboBox<String> cmbModo;
    public static javax.swing.JComboBox<String> cmbTipo;
    public static javax.swing.JComboBox<String> cmbTipoPlaneta;
    public static javax.swing.JColorChooser coloresSeleccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel lblAvisoCmb;
    public static javax.swing.JLabel lblAvisoColor;
    public static javax.swing.JLabel lblAvisoNombre;
    public static javax.swing.JLabel lblAvisoNombrePlaneta;
    private javax.swing.JLabel lblDificultad;
    private javax.swing.JLabel lblFondo;
    public static javax.swing.JLabel lblNombrePlaneta;
    public static javax.swing.JPanel panelColor;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtNombrePlaneta;
    // End of variables declaration//GEN-END:variables
}
