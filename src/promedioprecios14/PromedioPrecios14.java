/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedioprecios14;
/**
 * @author juanse
 * fecha inicio: sabado 06 de septiembre de 2025
 * Requerimientos: Un cliente compra varios productos. 
 * Pide el número de productos y, para cada uno, su precio unitario. 
 * Calcula y muestra el precio promedio de los productos comprados. 
 * Debe resolverse solo con for.
 */
import javax.swing.JOptionPane;
public class PromedioPrecios14 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO
        int cantidadProductos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos: "));
        int precioTotal = 0;
        for (int i=0; i<cantidadProductos; i++) {
            int precioUnidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del producto " + i));
            precioTotal = precioTotal + precioUnidad;
        }
        int promedio = precioTotal/cantidadProductos;
        JOptionPane.showMessageDialog(null, "El precio promedio de los productos \n es de: " + promedio);
    }
}
