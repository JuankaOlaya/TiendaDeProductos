/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juanka;

/**
 *
 * @author SG701-06
 */
public class Producto {
    

    //constantes
    public final static int PAPELERIA=1;
    public final static int SUPERMERCADO=2;
    public final static int DROGUERIA=3;
    
    public final static double IVA_PAPEL = 0.16;
    public final static double IVA_FARMACIA = 0.12;
    public final static double IVA_MERCADO = 0.04;
    
    //Atributos
    
    private String nombre;
    private int tipo;
    private int cantidadActual;
    private int numeroMinimo;
    private double precioBase;
    private double porcentajeIva;
    private int unidadesVendidas;
    
    
    public Producto(){
        
    }
    

    public Producto(String nombre, int tipo, int cantidadActual, int numeroMinimo, double precioBase, double porcentajeIva, int unidadesVendidas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidadActual = cantidadActual;
        this.numeroMinimo = numeroMinimo;
        this.precioBase = precioBase;
        this.porcentajeIva = porcentajeIva;
        this.unidadesVendidas = unidadesVendidas;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getNumeroMinimo() {
        return numeroMinimo;
    }

    public void setNumeroMinimo(int numeroMinimo) {
        this.numeroMinimo = numeroMinimo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPorcentajeIva() {
        return porcentajeIva;
    }

    public void setPorcentajeIva(double porcentajeIva) {
        this.porcentajeIva = porcentajeIva;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }
    
    
    
}
