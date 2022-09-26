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
public class Juanka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   //instanciar productos
        
        Tienda miTienda = new Tienda();
       
        
        Producto p1 = new Producto ();
        p1.setNombre("Libreta");
        System.out.println("El nombre de el producto es: " + p1.getNombre());
        p1.setPrecioBase(5500);
        System.out.println("El precio de " + p1.getNombre() + " es de " + p1.getPrecioBase());
        p1.setCantidadActual(23);
        System.out.println("La cantidad de " + p1.getNombre() + " en bodega es de " + p1.getCantidadActual());
        p1.setNumeroMinimo(13);
        System.out.println("La cantidad minima de " + p1.getNombre() + " es de " + p1.getNumeroMinimo());
        p1.setUnidadesVendidas(87);
        System.out.println("La cantidad de " + p1.getNombre() + " vendidas es de " + p1.getUnidadesVendidas());
        
        Producto p2 = new Producto ();
        p2.setNombre("Bolsa de leche 1 Litro");
        System.out.println("El nombre de el producto es: " + p2.getNombre());
        p2.setPrecioBase(2100);
        System.out.println("El precio de " + p2.getNombre() + " es de " + p2.getPrecioBase());
        p2.setCantidadActual(150);
        System.out.println("La cantidad de " + p2.getNombre() + " en bodega es de " + p2.getCantidadActual());
        p2.setNumeroMinimo(30);
        System.out.println("La cantidad minima de " + p2.getNombre() + " es de " + p2.getNumeroMinimo());
        p2.setUnidadesVendidas(30);
        System.out.println("La cantidad de " + p2.getNombre() + " vendidas es de " + p2.getUnidadesVendidas());
        
        Producto p3 = new Producto ();
        p3.setNombre("Jabon en polvo");
        System.out.println("El nombre de el producto es: " + p3.getNombre());
        p3.setPrecioBase(4200);
        System.out.println("El precio de " + p3.getNombre() + " es de " + p3.getPrecioBase() + " el kilo");
        p3.setCantidadActual(15);
        System.out.println("La cantidad de " + p3.getNombre() + " en bodega es de " + p3.getCantidadActual());
        p3.setNumeroMinimo(50);
        System.out.println("La cantidad minima de " + p3.getNombre() + " es de " + p3.getNumeroMinimo());
        p3.setUnidadesVendidas(80);
        System.out.println("La cantidad de " + p3.getNombre() + " vendidas es de " + p3.getUnidadesVendidas());
        
        Producto p4 = new Producto ();
        p4.setNombre("Aspirina");
        System.out.println("El nombre de el producto es: " + p4.getNombre());
        p4.setPrecioBase(2400);
        System.out.println("El precio de " + p4.getNombre() + " es de " + p4.getPrecioBase() + " la caja de 12 unidades");
        p4.setCantidadActual(60);
        System.out.println("La cantidad de " + p4.getNombre() + " en bodega es de " + p4.getCantidadActual());
        p4.setNumeroMinimo(100);
        System.out.println("La cantidad minima de " + p4.getNombre() + " es de " + p4.getNumeroMinimo());
        p4.setUnidadesVendidas(200);
        System.out.println("La cantidad de " + p4.getNombre() + " vendidas es de " + p4.getUnidadesVendidas());
        
        p1.setPorcentajeIva(p1.getPrecioBase()+(p1.getPrecioBase()*Producto.IVA_PAPEL));
        p2.setPorcentajeIva(p2.getPrecioBase()+(p2.getPrecioBase()*Producto.IVA_MERCADO));
        p3.setPorcentajeIva(p3.getPrecioBase()+(p3.getPrecioBase()*Producto.IVA_MERCADO));
        p4.setPorcentajeIva(p4.getPrecioBase()+(p4.getPrecioBase()*Producto.IVA_FARMACIA));
        
        int Caja;
        Caja = (int) (p1.getUnidadesVendidas()*p1.getPorcentajeIva()+p2.getUnidadesVendidas()*p2.getPorcentajeIva()+p3.getUnidadesVendidas()*p3.getPorcentajeIva()+p4.getUnidadesVendidas()*p4.getPorcentajeIva());
        miTienda.setDineroEnCaja(Caja);
        System.out.println("Dinero en caja: " + miTienda.getDineroEnCaja());
        
        p1.setTipo(Producto.PAPELERIA);
        System.out.println("El tipo de producto que es libreta es: " + p1.getTipo());
        miTienda.setP1(p1);
        
        p2.setTipo(Producto.SUPERMERCADO);
        System.out.println("El tipo de producto que es leche es: " + p2.getTipo());
        miTienda.setP2(p2);
        
        p3.setTipo(Producto.SUPERMERCADO);
        System.out.println("El tipo de producto que es jabon es: " + p3.getTipo());
        miTienda.setP3(p3);
        
        p4.setTipo(Producto.DROGUERIA);
        System.out.println("El tipo de producto que es aspirina es: " + p4.getTipo());
        miTienda.setP4(p4);
        
        System.out.println("EVALUACION EXPRESIONES ARITMETICAS");
        System.out.println("Leche " + (p2.getCantidadActual()-p2.getNumeroMinimo()));
        System.out.println("Aspirina "+ (p2.getPrecioBase()/(p2.getCantidadActual()*12)));
        System.out.println("Jabon " + (p3.getUnidadesVendidas()+p3.getCantidadActual())*(p3.getPrecioBase()+(p3.getPrecioBase()* Producto.IVA_MERCADO)));
        System.out.println("Libreta " + p1.getPrecioBase()*p1.getCantidadActual()/p1.getNumeroMinimo());
        System.out.println("Leche " + p2.getPrecioBase()*p2.getUnidadesVendidas()*Producto.IVA_MERCADO);
        System.out.println("Aspirina " + p4.getPrecioBase()*(1+Producto.IVA_FARMACIA)*p4.getUnidadesVendidas()/p4.getCantidadActual());
        System.out.println("La tienda " + (p1.getPrecioBase()+p2.getPrecioBase()+p3.getPrecioBase()+p4.getPrecioBase())/4);
        System.out.println("La tienda " + (p1.getCantidadActual()-p1.getNumeroMinimo())*(p1.getPrecioBase()*(1+p1.getPorcentajeIva())));
        System.out.println("La tienda " + (miTienda.calcularDineroCaja()-p1.getNumeroMinimo())*p2.getPrecioBase());
        System.out.println("La tienda " + p3.getUnidadesVendidas()*(1+p3.getPorcentajeIva()));
        
        System.out.println("CREACION EXPRESIONES");
        System.out.println("Libreta " + p1.getPrecioBase()+(p1.getPrecioBase()*Producto.IVA_PAPEL));
        System.out.println("Leche " + (p2.getCantidadActual()-p2.getNumeroMinimo()));
        System.out.println("Jabon " + (p3.getUnidadesVendidas()%p3.getNumeroMinimo()));
        System.out.println("Aspirina " + p4.getCantidadActual()/10 );
        System.out.println("Mi tienda " + (miTienda.calcularDineroCaja()+(miTienda.calcularDineroCaja()*0.25)));
        System.out.println("Mi tienda " + ((p1.getUnidadesVendidas()*(p1.getPrecioBase()*Producto.IVA_PAPEL))+(p2.getUnidadesVendidas()*(p2.getPrecioBase()*Producto.IVA_MERCADO))+(p3.getUnidadesVendidas()*(p3.getPrecioBase()*Producto.IVA_MERCADO))+(p4.getUnidadesVendidas()*(p4.getPrecioBase()*Producto.IVA_FARMACIA))));
        System.out.println("Mi tienda y jabon " + (miTienda.calcularDineroCaja()%p3.getPrecioBase()));
        
        
        System.out.println("EVALUAR EXPRESIONES CON OPERADORES RELACIONALES");
        if (p1.getTipo()==Producto.PAPELERIA){
            System.out.println("Libreta es de tipo papeleria?: True ");
        }
            else{
                    System.out.println("Libreta es de tipo papeleria?: False");
                    }
        if (p1.getTipo()==Producto.DROGUERIA){
            System.out.println("Libreta es de tipo drogueria?: True ");
        }
            else{
                    System.out.println("Libreta es de tipo drogueria?: False");
                    }
        if(p2.getNumeroMinimo()<=p2.getCantidadActual()){
            System.out.println("La cantidad minima de leche es menor o igual a su cantidad en bodega? true");
        }
        else{
            System.out.println("La cantidad minima de leche es menor o igual a su cantidad en bodega? False");
        }
        if(p3.getPrecioBase()<=1000){
            System.out.println("El valor unitario de jabon es menor o igual a 1000?  True");
        }
        else{
            System.out.println("El valor unitario de jabon es menor o igual a 1000?  False");
        }
        if(p4.getCantidadActual()-p4.getNumeroMinimo()!=p4.getUnidadesVendidas()){
            System.out.println("la cantidad en bodega de aspirrina menos el numero minimo es diferente al total de productos vendidos?  True");
        }
        else{
            System.out.println("la cantidad en bodega de aspirrina menos el numero minimo es diferente al total de productos vendidos?  False");
        }
        if(p3.getCantidadActual()*p3.getPrecioBase()==p3.getUnidadesVendidas()*Producto.IVA_PAPEL){
            System.out.println("cantidadBodega * valorUnitario ==  totalProductosVendidos * IVA_PAPEL? True");
        }
        else{
            System.out.println("cantidadBodega * valorUnitario ==  totalProductosVendidos * IVA_PAPEL? False");
        }
        if(p1.getUnidadesVendidas()+p2.getUnidadesVendidas()>p3.getUnidadesVendidas()){
            System.out.println("p1.getUnidadesVendidas()+p2.getUnidadesVendidas()>p3.getUnidadesVendidas()? true");
        }
        else{
            System.out.println("p1.getUnidadesVendidas()+p2.getUnidadesVendidas()>p3.getUnidadesVendidas()? False");
        }
        if(miTienda.calcularDineroCaja()<=p4.getUnidadesVendidas()*((1+Producto.IVA_FARMACIA)*p4.getPrecioBase())){
            System.out.println("miTienda.calcularDineroCaja()<=p4.getUnidadesVendidas()*((1+Producto.IVA_FARMACIA)*p4.getPrecioBase())? True");
        }
        else{
            System.out.println("miTienda.calcularDineroCaja()<=p4.getUnidadesVendidas()*((1+Producto.IVA_FARMACIA)*p4.getPrecioBase())? False");
        }
        if((p1.getCantidadActual()+p2.getCantidadActual()+p3.getCantidadActual()+p4.getCantidadActual())<=1000){
            System.out.println("(p1.getCantidadActual()+p2.getCantidadActual()+p3.getCantidadActual()+p4.getCantidadActual())<=1000? True");
        }
        else{
            System.out.println("(p1.getCantidadActual()+p2.getCantidadActual()+p3.getCantidadActual()+p4.getCantidadActual())<=1000? False");
        }
        if(miTienda.calcularDineroCaja()*Producto.IVA_PAPEL>p1.getUnidadesVendidas()*p1.getPrecioBase()){
            System.out.println("miTienda.calcularDineroCaja()*Producto.IVA_PAPEL>p1.getUnidadesVendidas()*p1.getPrecioBase()? True");
        }
        else{
            System.out.println("miTienda.calcularDineroCaja()*Producto.IVA_PAPEL>p1.getUnidadesVendidas()*p1.getPrecioBase()? False");     
        }
        
        System.out.println("CREACION DE EXPRESIONES RELACIONALES");
        
        System.out.println("¿El tipo no es PAPELERIA?");
        if(p1.getTipo()!=Producto.PAPELERIA){
            System.out.println("P1 True");
        }
        else{
            System.out.println("P1 False");
        }
        if(p2.getTipo()!=Producto.PAPELERIA){
            System.out.println("P2 True");
        }
        else{
            System.out.println("P2 False");
        }
        if(p3.getTipo()!=Producto.PAPELERIA){
            System.out.println("P3 True");
        }
        else{
            System.out.println("P3 False");
        }
        if(p4.getTipo()!=Producto.PAPELERIA){
            System.out.println("P4 True");
        }
        else{
            System.out.println("P4 False");
        }
        
        System.out.println("¿El total de productos vendidos, es  igual a la cantidad en bodega?");
        if(p1.getUnidadesVendidas()==p1.getCantidadActual()){
            System.out.println("P1 True");
        }
        else{
            System.out.println("P1 False");
        }
        if(p2.getUnidadesVendidas()==p2.getCantidadActual()){
            System.out.println("P2 True");
        }
        else{
            System.out.println("P2 False");
        }
        if(p3.getUnidadesVendidas()==p3.getCantidadActual()){
            System.out.println("P3 True");
        }
        else{
            System.out.println("P3 False");
        }
        if(p4.getUnidadesVendidas()==p4.getCantidadActual()){
            System.out.println("P4 True");
        }
        else{
            System.out.println("P4 False");
        }
        
        System.out.println("¿El nombre del producto comienza por el carácter ‘a’?");
        System.out.println("P1 False");
        System.out.println("P2 False");
        System.out.println("P3 False");
        System.out.println("P4 True");
        
        System.out.println("¿El nombre del producto 2 es “aspirina”?");
        if("Aspirina".equals(p2.getNombre())){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
        System.out.println("¿La cantidad mínima del producto 4 es  una quinta parte de la cantidad de  productos vendidos?");
        if(p4.getNumeroMinimo()/5==p4.getUnidadesVendidas()){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
        System.out.println("¿El valor obtenido por los productos  vendidos (incluyendo el IVA) es menor  a un tercio del dinero en caja?");
        System.out.println("False");
        
        System.out.println("¿El promedio de unidades vendidas de  todos los productos es mayor al  promedio de unidades en bodega de  todos los productos?");
        double PromedioVentas; 
        PromedioVentas=(p1.getUnidadesVendidas()+p2.getUnidadesVendidas()+p3.getUnidadesVendidas()+p4.getUnidadesVendidas())/4;
        double PromedioBodega; 
        PromedioBodega=(p1.getCantidadActual()+p2.getCantidadActual()+p3.getCantidadActual()+p4.getCantidadActual())/4;
        if(PromedioVentas>PromedioBodega){
            System.out.println("True");
        } 
        else{
            System.out.println("False");
        }
        System.out.println("hola");
        
        
        }
        
        
        
    }
