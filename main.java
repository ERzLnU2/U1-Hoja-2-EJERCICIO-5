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
       
        // declaracion y asignacion de variables:
        String precio; // el precio se mete por user luego será String para un printf
        int iva=21;
        float valor;   // estos valores srán del tipo float (decimal pequeño)
        float precioIva;
        float precioIvaDescontado;
        float precioFinalPagar;
        
        // ENTRADA/ SALIDAS:
        precio=JOptionPane.showInputDialog("🚀 Meter el precio: \n");
        valor=Float.parseFloat(precio);  // aqui pasa el Striing a Float..
        System.out.printf("\n\t- El precio sin IVA es: %,.2f", valor);  // sale con MASCARA (formateado)     
        precioIva=valor+(valor*0.21f);  // sacando el 21% (*0.21)!!
        System.out.printf("\n\t- El precio con el porcentaje del 21 de IVA es: %,.2f", precioIva); 
        precioFinalPagar=precioIva-(precioIva*0.10f); // y saca el descuento
        System.out.printf("\n\t- El precio despues de aplicar un porcentaje de 10 de descuento es: %,.2f \n\n",precioFinalPagar); 
     
    }
}
