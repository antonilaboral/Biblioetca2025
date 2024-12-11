/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.educastur.antonijl56.bibilioteca2025;

import java.util.ArrayList;

/**
 *
 * @author alu13d
 */
public class Bibilioteca2025 {
    private ArrayList <Libro> libros;
    private ArrayList <Usuario> Usuarios;
    private ArrayList <Prestamo> Prestamos;

    public Bibilioteca2025(ArrayList<Libro> libros, ArrayList<Usuario> Usuarios, ArrayList<Prestamo> Prestamos) {
        this.libros = new ArrayList ();
        this.Usuarios = new ArrayList ();
        this.Prestamos = new ArrayList ();
    }
    
    
    
    public static void main(String[] args) {
        Bibilioteca2025 b= new Bibilioteca2025();
        b.cargaDatos();
        b.menu();
    }
    private void cargaDatos() {
    }
    
    private void menu() {
        
    }
}
