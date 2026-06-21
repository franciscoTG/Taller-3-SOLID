/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

/**
 *
 * @author Sexxxrvio
 */
public class MenuNiños extends Menu {

    private double valorHelado;
    private double valorPastel;

    public MenuNiños(String nombrePlato, double valorInicial,
            double valorHelado, double valorPastel) {

        super(nombrePlato, valorInicial);
        this.valorHelado = valorHelado;
        this.valorPastel = valorPastel;

        calcularValorMenu();
    }

    @Override
    public void calcularValorMenu() {
        valorFinal= valorInicial + valorHelado + valorPastel;
    }

    @Override
    public String toString() {
        return "\n--- MENU NINIOS ---"
                + "\nPlato: " + nombrePlato
                + "\nValor Inicial: $" + String.format("%.2f", valorInicial)
                + "\nHelado: $" + String.format("%.2f", valorHelado)
                + "\nPastel: $" + String.format("%.2f", valorPastel)
                + "\nValor Menu: $" + String.format("%.2f", valorFinal);
    }
}
