package com.mycompany.Mapa;

import static com.mycompany.JFrame.JFrameMapa.chekDistribucion;
import static com.mycompany.JFrame.JFrameOrdenarPlanetas.jspanelMapa;
import static com.mycompany.JFrame.JFrameOrdenarPlanetas.lblFondoMapa;
import static com.mycompany.JFrame.JFramePrincipal.cmbListaMapas;
import static com.mycompany.JFrame.JFramePrincipal.getListaMapas;
import static com.mycompany.JFrame.JFramePrincipal.setMatriz;
import com.mycompany.Listas.NodoDoble;
import java.awt.Color;
import javax.swing.JButton;

public class GenerarMatriz {
    private int filas;
    private int columnas;
    private int tamaño;
    private JButton [][] matriz;
    
    public GenerarMatriz(){
        obtenerTamañoFilasColumnas();
        matriz = new JButton[getColumnas()][getFilas()];
    }
    
    public void obtenerTamañoFilasColumnas(){
        NodoDoble<Mapa> recorrer = getListaMapas().getInicio();
        for (int i = 0; i < getListaMapas().obtenerLongitud(); i++) {
            if(recorrer.getContenido().getNombreMapa() == cmbListaMapas.getSelectedItem()){
                filas = recorrer.getContenido().getAlto();
                columnas = recorrer.getContenido().getAncho();
                tamaño = filas * columnas;
                setFilas(filas);
                setColumnas(columnas);
                setTamaño(tamaño);
                break;
            }
            recorrer = recorrer.getSiguiente();
        }
    }
    
    public void dibujarMatriz(){
        int contador = 1;
        int x = 10;
        int y = 10;
        for (int i = 0; i < getColumnas(); i++) {
            for (int j = 0; j < getFilas(); j++) {
                matriz[i][j] = new JButton();
                matriz[i][j].setBackground(Color.WHITE);
                matriz[i][j].setText(Integer.toString(contador));
                matriz[i][j].setBounds(x, y, 55, 55);
                if(!chekDistribucion.isSelected()){
                lblFondoMapa.add(matriz[i][j]);
                }
                y += 55;
                contador++;
            }
            x += 55;
            y = 10;
        }
            setMatriz(matriz);
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
    
}
