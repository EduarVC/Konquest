package com.mycompany.Planeta;

import static com.mycompany.JFrame.JFrameMapa.chekDistribucion;

public class PlanetaJugador extends Planeta{
    private String conquistador;
    private int cantidadNavesInicial;
    private int produccion;
    private float porcentajeMuerte;
    
    public PlanetaJugador(){
        setCategoria("Normal");
    }
    
     @Override
    public String toString() {
        return "Nombre: " +getNombrePlaneta() + "\nTipo: " + getTipo() + "\nCategoria: " + getCategoria();
    }
    
    @Override
    public boolean posicionarPlaneta() {
        return chekDistribucion.isSelected();
    }

    public String getConquistador() {
        return conquistador;
    }

    public void setConquistador(String conquistador) {
        this.conquistador = conquistador;
    }

    public int getCantidadNavesInicial() {
        return cantidadNavesInicial;
    }

    public void setCantidadNavesInicial(int cantidadNavesInicial) {
        this.cantidadNavesInicial = cantidadNavesInicial;
    }

    public int getProduccion() {
        return produccion;
    }

    public void setProduccion(int produccion) {
        this.produccion = produccion;
    }

    public float getPorcentajeMuerte() {
        return porcentajeMuerte;
    }

    public void setPorcentajeMuerte(float porcentajeMuerte) {
        this.porcentajeMuerte = porcentajeMuerte;
    }
    
}
