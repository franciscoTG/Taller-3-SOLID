/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

/**
 *
 * @author Sexxxrvio
 */

public abstract class Menu {

    protected String nombrePlato;
    protected double valorInicial;
    protected double valorFinal;

    public Menu(String nombrePlato, double valorInicial) {
        this.nombrePlato = nombrePlato;
        this.valorInicial = valorInicial;
    }

    public abstract void calcularValorMenu();

    public double getValorMenu() {
        return valorFinal;
    }

    @Override
    public String toString() {
        return "Plato: " + nombrePlato + "\nValor Inicial: $" + String.format("%.2f", valorInicial)+ "\nValor Final: $" + String.format("%.2f", valorFinal);
    }
}
