/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

/**
 *
 * @author Sexxxrvio
 */
public class MenuEconomico extends Menu {

    private double porcentajeDescuento;

    public MenuEconomico(String nombrePlato, double valorInicial,
            double porcentajeDescuento) {

        super(nombrePlato, valorInicial);
        this.porcentajeDescuento = porcentajeDescuento;

        calcularValorMenu();
    }

    @Override
    public void calcularValorMenu() {
        valorFinal = valorInicial
                - (valorInicial * porcentajeDescuento / 100);
    }

    @Override
    public String toString() {
        return "\n--- MENU ECONOMICO ---"
                + "\nPlato: " + nombrePlato
                + "\nValor Inicial: $" + String.format("%.2f", valorInicial)
                + "\nDescuento: " + porcentajeDescuento + "%"
                + "\nValor Menu: $" + String.format("%.2f", valorFinal);
    }
}

