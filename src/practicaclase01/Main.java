/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaclase01;

import javax.swing.JOptionPane;

/**
 *
 * @author danny
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instanciar objeto matriz
        Matriz matrix = new Matriz(5, 5);
        matrix.llenarMatriz();
        int option = 0;
        while (option != 6) {
            option = Integer.parseInt(JOptionPane.showInputDialog(
                    "Ingrese su opcion: \n"
                    + "1. Mostrar la Matriz\n"
                    + "2. Sumar Toda la Matriz\n"
                    + "3. Sumar la 2da Fila de la Matriz\n"
                    + "4. Sumar la 3ra Columna de la Matriz\n"
                    + "5. Sumar la Diagonal de la Matriz\n"
                    + "6. Salir\n"));
            switch (option) {
                case 1:
                    matrix.imprimirMatriz();
                    break;
                case 2:
                    System.out.println("Suma total de la Matriz: "
                            + matrix.sumaTotalMatriz());
                    break;
                case 3:
                    System.out.println("Suma de la 2da Fila de la Matriz: "
                            + matrix.suma2FilaMatriz());
                    break;
                case 4:
                    System.out.println("Suma de la 3era Columna de la Matriz: "
                            + matrix.suma3ColumnaMatriz());
                    break;
                case 5:
                    System.out.println("Suma de la Diagonal de la Matriz: "
                            + matrix.sumaDiagonalMatriz());
                    break;
            }

        }
    }
}
