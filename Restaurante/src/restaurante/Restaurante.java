/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurante;

import java.util.ArrayList;

/**
 *
 * @author Sexxxrvio
 */

     public class Restaurante {

        public static void main(String[] args) {

        Menu m1 = new MenuCarta("Lomo a la Plancha", 8.50, 1.50, 1.20, 10);
        Menu m2 = new MenuDia("Seco de Pollo", 4.00, 0.80, 0.70);
        Menu m3 = new MenuNiños("Nuggets con Papas y hamburguesa", 3.50, 1.00, 1.00);
        Menu m4 = new MenuEconomico("Arroz con huevo", 3.00, 15);

            Cuenta cuenta = new Cuenta("Maria");

            cuenta.agregarMenu(m1);
            cuenta.agregarMenu(m2);
            cuenta.agregarMenu(m3);
            cuenta.agregarMenu(m4);

            System.out.println(cuenta);
        }
    }