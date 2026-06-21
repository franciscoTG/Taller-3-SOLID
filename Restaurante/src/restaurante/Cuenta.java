/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;


import java.util.ArrayList;
/**
 *
 * @author Sexxxrvio
 */
public class Cuenta {

    private String nombreCliente;
    private ArrayList<Menu> menus;

    private double subtotal;
    private double iva;
    private double total;

    public Cuenta(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        menus = new ArrayList<>();
    }

    public void agregarMenu(Menu m) {
        menus.add(m);
    }

    public void calcularSubtotal() {
        subtotal = 0;

        for (Menu m : menus) {
            subtotal += m.getValorMenu();
        }
    }

    public void calcularIva() {
        iva = subtotal * 0.15;
    }

    public void calcularTotal() {
        total = subtotal + iva;
    }

    @Override
    public String toString() {

        calcularSubtotal();
        calcularIva();
        calcularTotal();

        String cadena = "";

        for (Menu m : menus) {
            cadena += m + "\n";
        }

         return "CLIENTE: " + nombreCliente
                + "\n\nMENUS PEDIDOS:\n"
                + cadena
                + "\nSubtotal: $" + String.format("%.2f", subtotal)
                + "\nIVA: $" + String.format("%.2f", iva)
                + "\nTOTAL: $" + String.format("%.2f", total);
    }
}
