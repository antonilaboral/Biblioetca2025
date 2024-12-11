/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.educastur.antonijl56.bibilioteca2025;

/**
 *
 * @author alu13d
 */
public class Prestamo {
    private Libro LibroPrest;
    private Usuario usuarioPrest;
    private LocalDate fechaprest;
    private LocalDate fechaDev;

    public Prestamo(Libro LibroPrest, Usuario usuarioPrest, LocalDate fechaprest, LocalDate fechaDev) {
        this.LibroPrest = LibroPrest;
        this.usuarioPrest = usuarioPrest;
        this.fechaprest = fechaprest;
        this.fechaDev = fechaDev;
    }

    public Libro getLibroPrest() {
        return LibroPrest;
    }

    public Usuario getUsuarioPrest() {
        return usuarioPrest;
    }

    public LocalDate getFechaprest() {
        return fechaprest;
    }

    public LocalDate getFechaDev() {
        return fechaDev;
    }

    public void setLibroPrest(Libro LibroPrest) {
        this.LibroPrest = LibroPrest;
    }

    public void setUsuarioPrest(Usuario usuarioPrest) {
        this.usuarioPrest = usuarioPrest;
    }

    public void setFechaprest(LocalDate fechaprest) {
        this.fechaprest = fechaprest;
    }

    public void setFechaDev(LocalDate fechaDev) {
        this.fechaDev = fechaDev;
    }
    

    @Override
    public String toString() {
        return LibroPrest + "-" + usuarioPrest + "-" + fechaprest + "-" + fechaDev;
    }
    
    
    
}
