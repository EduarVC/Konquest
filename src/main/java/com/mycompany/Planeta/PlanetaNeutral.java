package com.mycompany.Planeta;

import java.awt.Color;

public class PlanetaNeutral extends Planeta{
    private int produccion;
    private float porcentajeMuerte;
    private boolean mostrarNaves;
    private boolean mostrarEstadisticas;
    private Color colorAsignado;
    
    public PlanetaNeutral(){
        setCategoria("Neutral");
        setTipo("Neutro");
        setPath("/PlanetaNeutral.png");
        setColorAsignado(Color.darkGray);
    }
     @Override
    public String toString() {
        return "Nombre: " +getNombrePlaneta() + "\nTipo: " + getTipo() + "\nCategoria: " + getCategoria();
    }
    @Override
    public boolean posicionarPlaneta() {
       return true;
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

    public boolean isMostrarNaves() {
        return mostrarNaves;
    }

    public void setMostrarNaves(boolean mostrarNaves) {
        this.mostrarNaves = mostrarNaves;
    }

    public boolean isMostrarEstadisticas() {
        return mostrarEstadisticas;
    }

    public void setMostrarEstadisticas(boolean mostrarEstadisticas) {
        this.mostrarEstadisticas = mostrarEstadisticas;
    }

    public Color getColorAsignado() {
        return colorAsignado;
    }

    public void setColorAsignado(Color colorAsignado) {
        this.colorAsignado = colorAsignado;
    }
    
}
