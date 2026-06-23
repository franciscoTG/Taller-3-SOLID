/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

/**
 *
 * @author Sexxxrvio
 */
public class MenuDia extends Menu {

    private double valorPostre;
    private double valorBebida;

    public MenuDia(String nombrePlato, double valorInicial,
            double valorPostre, double valorBebida) {

        super(nombrePlato, valorInicial);
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;

    }

    @Override
    public void calcularValorMenu() {
        valorFinal = valorInicial + valorPostre + valorBebida;
    }
    

    @Override
    public String toString() {
        return "\n--- MENU DIA ---"
                + "\nPlato: " + nombrePlato
                + "\nValor Inicial: $" + String.format("%.2f", valorInicial)
                + "\nPostre: $" + String.format("%.2f", valorPostre)
                + "\nBebida: $" + String.format("%.2f", valorBebida)
                + "\nValor Menu: $" + String.format("%.2f", valorFinal);
    }
}
