/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pmultiplo5;

import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class PMultiplo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int nota, m5, res, m0;
        m5 = 0;
        m0 = 0;

        for (int i = 0; i < 15; i++) {

            System.out.println("Introduce un número");

            res = tec.nextInt();
            res = res % 5;

            if (res == 0) {
                m5++;
            } else {
                m0++;
            }

        }

        System.out.println("Hay " + m5 + " números múltiplos de 5 y " + m0 + " números no múltiplos de 5");
    }

}
