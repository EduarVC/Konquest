package com.mycompany.ControlJuego;

import com.mycompany.Planeta.Planeta;

public class Ataque {
    private int cantidadTurno;
    private Planeta origen;
    private Planeta destino;
    private int cantidadNaves;

    public int getCantidadTurno() {
        return cantidadTurno;
    }

    public void setCantidadTurno(int cantidadTurno) {
        this.cantidadTurno = cantidadTurno;
    }

    public Planeta getOrigen() {
        return origen;
    }

    public void setOrigen(Planeta origen) {
        this.origen = origen;
    }

    public Planeta getDestino() {
        return destino;
    }

    public void setDestino(Planeta destino) {
        this.destino = destino;
    }

    public int getCantidadNaves() {
        return cantidadNaves;
    }

    public void setCantidadNaves(int cantidadNaves) {
        this.cantidadNaves = cantidadNaves;
    }
    
    
    
}
