/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

/**
 *
 * @author Sexxxrvio
 */
public class MenuCarta extends Menu {

    private double valorGuarnicion;
    private double valorBebida;
    private double porcServicio;

    public MenuCarta(String nombrePlato, double valorInicial,
            double valorGuarnicion, double valorBebida,
            double porcServicio) {

        super(nombrePlato, valorInicial);
        this.valorGuarnicion = valorGuarnicion;
        this.valorBebida = valorBebida;
        this.porcServicio = porcServicio;

        calcularValorMenu();
    }

    @Override
    public void calcularValorMenu() {
        valorFinal = valorInicial + valorGuarnicion
                + valorBebida
                + (valorInicial * porcServicio / 100);
    }

    @Override
    public String toString() {
        return "\n--- MENU CARTA ---"
                + "\nPlato: " + nombrePlato
                + "\nValor Inicial: $" + String.format("%.2f", valorInicial)
                + "\nGuarnicion: $" + String.format("%.2f", valorGuarnicion)
                + "\nBebida: $" + String.format("%.2f", valorBebida)
                + "\nServicio: " + porcServicio + "%"
                + "\nValor Final: $" + String.format("%.2f", valorFinal);
    }

}
