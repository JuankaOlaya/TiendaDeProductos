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
public class Tienda {
    
//public final static double DINEROCAJA = 350000;
    //Atributos
    private double ventasTotales;
    private int cantidadTotal;
    private Producto p1;
    private Producto p2;
    private Producto p3;
    private Producto p4;
    private int DineroEnCaja;

    public int getDineroEnCaja() {
        return DineroEnCaja;
    }

    public void setDineroEnCaja(int DineroEnCaja) {
        this.DineroEnCaja = DineroEnCaja;
    }

    public Tienda(int DineroEnCaja) {
        this.DineroEnCaja = DineroEnCaja;
    }
    
    public Tienda (){
        
   
    p1=new Producto();
    p2=new Producto();
    p3=new Producto();
    p4=new Producto();
   
        
    }
   

    public Tienda(double ventasTotales, int cantidadTotal) {
        this.ventasTotales = ventasTotales;
        this.cantidadTotal = cantidadTotal;
    }

    public Tienda(Producto p1, Producto p2, Producto p3, Producto p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        
    }

    

    public double getVentasTotales() {
        return ventasTotales;
    }

    public void setVentasTotales(double ventasTotales) {
        this.ventasTotales = ventasTotales;
    }

    public int getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(int cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public Producto getP1() {
        return p1;
    }

    public void setP1(Producto p1) {
        this.p1 = p1;
    }

    public Producto getP2() {
        return p2;
    }

    public void setP2(Producto p2) {
        this.p2 = p2;
    }

    public Producto getP3() {
        return p3;
    }

    public void setP3(Producto p3) {
        this.p3 = p3;
    }

    public Producto getP4() {
        return p4;
    }

    public void setP4(Producto p4) {
        this.p4 = p4;
    }
    
   
    public double calcularDineroCaja(){
        double DineroCaja = p1.getUnidadesVendidas()*p1.getPrecioBase() *(1+Producto.IVA_PAPEL)+p2.getUnidadesVendidas()*p2.getPrecioBase() *(1+Producto.IVA_MERCADO)+p3.getUnidadesVendidas()*p3.getPrecioBase() *(1+Producto.IVA_MERCADO)+p4.getUnidadesVendidas()*p4.getPrecioBase() *(1+Producto.IVA_FARMACIA);
        return DineroCaja;
  
    
    }
}
