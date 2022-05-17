package com.mycompany.JFrame;

import com.mycompany.Establecer.EstablecerImagen;
import com.mycompany.Manger.ManagerMapa;
import com.mycompany.Mapa.CapturaDatosMapa;
import com.mycompany.Mapa.GenerarDatosAlAzar;


public class JFrameMapa extends javax.swing.JFrame {
    private final ManagerMapa inicializarTabla;
    private EstablecerImagen establecerIMG;
    
    public JFrameMapa() {
        initComponents();
        this.setLocationRelativeTo(this);
        inicializarTabla = new ManagerMapa();
        establecerIMG = new EstablecerImagen();
        inicializarTabla.inicializarTabla(tblJugadores);
        establecerIMG.establecerImagen(lblFondo, "/FondoNave.jpg"); //establecemos la imagen de fondo
        btnAceptar.setEnabled(false);
        btnGuardar.setEnabled(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        checkMapaCiego = new javax.swing.JCheckBox();
        checkProduccionAcumulativa = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        checkMostrarNaves = new javax.swing.JCheckBox();
        checkMostrarEstadisticas = new javax.swing.JCheckBox();
        lblTituloNeutrales = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJugadores = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        spPlanetasNeutrales = new javax.swing.JSpinner();
        spAnchura = new javax.swing.JSpinner();
        spAltura = new javax.swing.JSpinner();
        spProdiccion = new javax.swing.JSpinner();
        spPorcentageMuerte = new javax.swing.JSpinner();
        lblPlanetasNeu = new javax.swing.JLabel();
        lblAnchura = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        lblProtcentajeMuertes = new javax.swing.JLabel();
        lblProduccion = new javax.swing.JLabel();
        chkbAlAzar = new javax.swing.JCheckBox();
        txtNombreMapa = new javax.swing.JTextField();
        lvlNombreMapa = new javax.swing.JLabel();
        spPlanetasZombie = new javax.swing.JSpinner();
        spCantidadNavesZombie = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spPlanetasFantasma = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblTituloOpcciones = new javax.swing.JLabel();
        lblTituloJugadores = new javax.swing.JLabel();
        lblTituloMapa = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        chekDistribucion = new javax.swing.JCheckBox();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DISEÑO DE MAPAS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        checkMapaCiego.setForeground(new java.awt.Color(0, 0, 0));
        checkMapaCiego.setText("Mapa ciego");

        checkProduccionAcumulativa.setForeground(new java.awt.Color(0, 0, 0));
        checkProduccionAcumulativa.setText("Producción acumulativa");
        checkProduccionAcumulativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkProduccionAcumulativaActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(191, 195, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        checkMostrarNaves.setText("Mostrar naves");

        checkMostrarEstadisticas.setText("Mostrar estadísticas");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(checkMostrarNaves)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(checkMostrarEstadisticas)
                        .addContainerGap(48, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(checkMostrarNaves)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(checkMostrarEstadisticas)
                .addGap(40, 40, 40))
        );

        lblTituloNeutrales.setForeground(new java.awt.Color(204, 204, 204));
        lblTituloNeutrales.setText("Neutrales");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(checkMapaCiego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(checkProduccionAcumulativa, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                            .addComponent(lblTituloNeutrales, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(checkMapaCiego)
                .addGap(18, 18, 18)
                .addComponent(checkProduccionAcumulativa)
                .addGap(18, 18, 18)
                .addComponent(lblTituloNeutrales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(220, 47));

        tblJugadores.setBackground(new java.awt.Color(51, 51, 51));
        tblJugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(tblJugadores);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(54, 54, 54))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        spPlanetasNeutrales.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        spAnchura.setModel(new javax.swing.SpinnerNumberModel(10, 10, 21, 1));

        spAltura.setModel(new javax.swing.SpinnerNumberModel(5, 5, 10, 1));

        spProdiccion.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        spPorcentageMuerte.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.001f), Float.valueOf(0.001f), Float.valueOf(0.999f), Float.valueOf(0.001f)));

        lblPlanetasNeu.setForeground(new java.awt.Color(204, 204, 204));
        lblPlanetasNeu.setText("Planetas neutrales:");

        lblAnchura.setForeground(new java.awt.Color(204, 204, 204));
        lblAnchura.setText("Anchura:");

        lblAltura.setForeground(new java.awt.Color(204, 204, 204));
        lblAltura.setText("Altura:");

        lblProtcentajeMuertes.setForeground(new java.awt.Color(204, 204, 204));
        lblProtcentajeMuertes.setText("Porcentaje de muertes:");

        lblProduccion.setForeground(new java.awt.Color(204, 204, 204));
        lblProduccion.setText("Producción:");

        chkbAlAzar.setText("Al azar");
        chkbAlAzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbAlAzarActionPerformed(evt);
            }
        });

        txtNombreMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreMapaActionPerformed(evt);
            }
        });
        txtNombreMapa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreMapaKeyReleased(evt);
            }
        });

        lvlNombreMapa.setForeground(new java.awt.Color(204, 204, 204));
        lvlNombreMapa.setText("Nombre del mapa:");

        spPlanetasZombie.setModel(new javax.swing.SpinnerNumberModel(1, 1, 4, 1));

        spCantidadNavesZombie.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Planetas zombie:");

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Planetas fantasma:");

        spPlanetasFantasma.setModel(new javax.swing.SpinnerNumberModel(1, 1, 3, 1));

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Cantidad de naves:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblAltura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblAnchura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spAnchura, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lvlNombreMapa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombreMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblProduccion)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chkbAlAzar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(spProdiccion))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblProtcentajeMuertes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spPorcentageMuerte, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblPlanetasNeu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spPlanetasNeutrales, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spPlanetasFantasma)
                            .addComponent(spPlanetasZombie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(spCantidadNavesZombie, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lvlNombreMapa)
                            .addComponent(txtNombreMapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPlanetasNeu)
                            .addComponent(spPlanetasNeutrales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spAnchura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAnchura))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAltura)
                            .addComponent(spAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spPorcentageMuerte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProtcentajeMuertes))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProduccion)
                            .addComponent(spProdiccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spPlanetasZombie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spCantidadNavesZombie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spPlanetasFantasma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(chkbAlAzar)
                .addContainerGap())
        );

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        lblTituloOpcciones.setForeground(new java.awt.Color(204, 204, 204));
        lblTituloOpcciones.setText("Opciones");

        lblTituloJugadores.setForeground(new java.awt.Color(204, 204, 204));
        lblTituloJugadores.setText("Jugadores");

        lblTituloMapa.setForeground(new java.awt.Color(204, 204, 204));
        lblTituloMapa.setText("Mapa");

        btnGuardar.setText("Guardar");

        chekDistribucion.setText("Distribución al azar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(530, 530, 530)
                .addComponent(lblTituloOpcciones, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(620, 620, 620)
                .addComponent(chekDistribucion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(530, 530, 530)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(lblTituloMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnAceptar))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(btnCancelar))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblTituloJugadores))
            .addComponent(lblFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTituloOpcciones))
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(chekDistribucion))
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(btnGuardar))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTituloMapa))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(btnAceptar))
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(btnCancelar))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTituloJugadores))
            .addComponent(lblFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkProduccionAcumulativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkProduccionAcumulativaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkProduccionAcumulativaActionPerformed

    private void chkbAlAzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbAlAzarActionPerformed
        GenerarDatosAlAzar generarDatos = new GenerarDatosAlAzar();
        generarDatos.AlAzar(spPlanetasNeutrales, spPlanetasFantasma, spPlanetasZombie, spProdiccion, spPorcentageMuerte, spCantidadNavesZombie);
    }//GEN-LAST:event_chkbAlAzarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        CapturaDatosMapa guardarDatos = new CapturaDatosMapa();
        guardarDatos.capturarDatosMapaNuevo();
        DatosPlanetasJugador datosPJ = new DatosPlanetasJugador();
        datosPJ.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtNombreMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreMapaActionPerformed
       
    }//GEN-LAST:event_txtNombreMapaActionPerformed

    private void txtNombreMapaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreMapaKeyReleased
        if(txtNombreMapa.getText().isEmpty()){
           btnAceptar.setEnabled(false);
       }else {
            btnAceptar.setEnabled(true);
        }
    }//GEN-LAST:event_txtNombreMapaKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    public static javax.swing.JButton btnGuardar;
    public static javax.swing.JCheckBox checkMapaCiego;
    public static javax.swing.JCheckBox checkMostrarEstadisticas;
    public static javax.swing.JCheckBox checkMostrarNaves;
    public static javax.swing.JCheckBox checkProduccionAcumulativa;
    public static javax.swing.JCheckBox chekDistribucion;
    public static javax.swing.JCheckBox chkbAlAzar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblAnchura;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblPlanetasNeu;
    private javax.swing.JLabel lblProduccion;
    private javax.swing.JLabel lblProtcentajeMuertes;
    private javax.swing.JLabel lblTituloJugadores;
    private javax.swing.JLabel lblTituloMapa;
    private javax.swing.JLabel lblTituloNeutrales;
    private javax.swing.JLabel lblTituloOpcciones;
    private javax.swing.JLabel lvlNombreMapa;
    public static javax.swing.JSpinner spAltura;
    public static javax.swing.JSpinner spAnchura;
    public static javax.swing.JSpinner spCantidadNavesZombie;
    public static javax.swing.JSpinner spPlanetasFantasma;
    public static javax.swing.JSpinner spPlanetasNeutrales;
    public static javax.swing.JSpinner spPlanetasZombie;
    public static javax.swing.JSpinner spPorcentageMuerte;
    public static javax.swing.JSpinner spProdiccion;
    public static javax.swing.JTable tblJugadores;
    public static javax.swing.JTextField txtNombreMapa;
    // End of variables declaration//GEN-END:variables
}
