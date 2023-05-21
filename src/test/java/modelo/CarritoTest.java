/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sobar
 */
public class CarritoTest {
    
    public CarritoTest() {
    }

    @Test
    public void testSetAndGetItem() {
        System.out.println("Setear y obtener Item");
        int expResult = 1;
        Carrito instance = new Carrito();
        instance.setItem(expResult);
        int result = instance.getItem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult) {
            fail("ERROR: Se esperaba el valor 1");
        }
    }
    
    @Test
    public void testSetAndGetIdProducto() {
        System.out.println("Setear y obtener IdProducto");
        int expResult = 10004567;
        Carrito instance = new Carrito();
        instance.setIdProducto(expResult);
        int result = instance.getIdProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult) {
            fail("ERROR: Se esperaba el valor 10004567");
    }
}
    
    @Test
    public void testSetAndGetNombres() {
        System.out.println("Setear y obtener Nombres");
        String expResult = "Producto 1";
        Carrito instance = new Carrito();
        instance.setNombres(expResult);
        String result = instance.getNombres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult)) {
            fail("ERROR: Se esperaba el valor Producto 1");
    }
}
    
    @Test
    public void testSetAndGetDescripcion() {
        System.out.println("Setear y obtener Descripcion");
        String expResult = "Descripcion producto 1";
        Carrito instance = new Carrito();
        instance.setDescripcion(expResult);
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult)) {
            fail("ERROR: Se esperaba el valor Descripcion producto 1");
    }
}
    
    @Test
    public void testSetAndGetPrecioCompra() {
        System.out.println("Setear y obtener PrecioCompra");
        double expResult = 20500;
        Carrito instance = new Carrito();
        instance.setPrecioCompra(expResult);
        double result = instance.getPrecioCompra();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult) {
            fail("ERROR: Se esperaba el valor 20500");
    }
}
    
    @Test
    public void testSetAndGetCantidad() {
        System.out.println("Setear y obtener Cantidad");
        int expResult = 1;
        Carrito instance = new Carrito();
        instance.setCantidad(expResult);
        int result = instance.getCantidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult) {
            fail("ERROR: Se esperaba la cantidad 1");
    }
}
    
    @Test
    public void testSetAndGetSubTotal() {
        System.out.println("Setear y obtener SubTotal");
        double expResult = 20990;
        Carrito instance = new Carrito();
        instance.setSubTotal(expResult);
        double result = instance.getSubTotal();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult) {
            fail("ERROR: Se esperaba el SubTotal 20990");
    }
}
    
}
