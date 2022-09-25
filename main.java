/*
   📌 EJERCICIO 5, Hoja 2.
   
   🔴 Realizar un programa que declare una variable precio, le asigne el valor 62.5, 
      este valor debe ser pedido por pantalla (utiliza clase JOptionPane) y visualice:
     
        - El precio sin IVA es: 62,50
        - El precio con el porcentaje del 21 de IVA es: 75,63
        - El precio después de aplicar un porcentaje de 10 de descuento es: 68,06
*/
import javax.swing.JOptionPane;
public class Ejercicio5_Hoja2 {
    public static void main(String[] args) {
        
        String precio; 
        int iva=21;
        double valor; 
        double precioIva;
        double precioIvaDescontado;
        double precioFinalPagar;
        precio=JOptionPane.showInputDialog("🚀 Meter el precio: \n");
        valor=Double.parseDouble(precio); 
        System.out.printf("\n\t- El precio sin IVA es: %,.2f", valor);       
        precioIva=valor*iva/100;
        //System.out.printf("\n- el IVA sale: %,.2f", precioIva);      
        System.out.printf("\n\t- El precio con el porcentaje del 21 de IVA es: %,.2f", valor+precioIva); 
       
        /* ///////////////////////////////////////////
                      🚀 process.. 95%
        /////////////////////////////////////////// */
        
        //precioIvaDescontado=(valor+precioIva)*0.10;
                //System.out.printf("\n elprecio Iva Descontado sale: %,.2f", precioIvaDescontado);
        //precioFinalPagar=(precioIva+precioIvaDescontado);
        //System.out.printf("\n\t- El precio despues de aplicar un porcentaje de 10 de descuento es: %,.2f", precioFinalPagar+"\n\n");   
    }
}
