/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SP
 */
public class Helper {

    public static void mensaje(Component ventana, String mensaje, int tipo) {
        switch (tipo) {
            case 0:
                JOptionPane.showMessageDialog(ventana, mensaje, "Informacion", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    public static void limpiadoTabla(JTable tabla1) {
        int nf, nc;

        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla1.setValueAt("", i, j);
            }
        }
    }

    public static void porDefectoTabla(JTable tabla1) {
        DefaultTableModel tm;

        tm = (DefaultTableModel) tabla1.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);
    }

    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);
        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);
        }
    }

    public static void letraB(JTable tabla1, JTable tabla2) {

        int numfilas, numcolumnas, aux;

        numfilas = tabla1.getRowCount();
        numcolumnas = tabla1.getColumnCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if ((j == 0) || (i == 0 && j != numcolumnas - 1) || (i == numfilas / 2 && j != numcolumnas - 1) || (i == numfilas - 1 && j != numcolumnas - 1) || (j == numcolumnas - 1 && i != 0 && i != numfilas / 2 && i != numfilas - 1)) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraG(JTable tabla1, JTable tabla2) {
        int numfilas, numcolumnas, aux;

        numfilas = tabla1.getRowCount();
        numcolumnas = tabla1.getColumnCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || i == 0 || i == numfilas - 1 || j == numcolumnas - 1 && j / i <= 2 || i == numfilas / 3 || (j == numcolumnas - 1 && j / i >= numcolumnas - 1)) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }

    public static void letraJ(JTable tabla1, JTable tabla2) {
        int numfilas, numcolumnas, aux;

        numfilas = tabla1.getRowCount();
        numcolumnas = tabla1.getColumnCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || j == numcolumnas / 2 || i == numfilas - 1 && j < numcolumnas / 2 || j == 0 && i > numfilas / 2) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }

    public static void letraK(JTable tabla1, JTable tabla2) {
        int numfilas, numcolumnas, aux;

        numfilas = tabla1.getRowCount();
        numcolumnas = tabla1.getColumnCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || numfilas / 2 - i == j || i - j == numfilas / 2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraM(JTable tabla1, JTable tabla2) {
        int numfilas, numcolumnas, aux;

        numfilas = tabla1.getRowCount();
        numcolumnas = tabla1.getColumnCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || j == numcolumnas - 1 || (i == j && i + j <= numfilas) || (i + j == numfilas - 1 && i <= j)) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }

    public static void letraQ(JTable tabla1, JTable tabla2) {
        int numfilas, numcolumnas, aux;

        numfilas = tabla1.getRowCount();
        numcolumnas = tabla1.getColumnCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 && j != 0 && j != numfilas - 1 || (j == 0 && i <= numfilas / 2 && i != 0) || (((numfilas / 2 + 1) == i && j != 0 && j != numfilas - 1)) || (j == numcolumnas - 1 && i <= numfilas / 2 && i != 0) || (i == j && i > numfilas / 2)) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }

    public static void letraR(JTable tabla1, JTable tabla2) {
        int numfilas, numcolumnas, aux;

        numfilas = tabla1.getRowCount();
        numcolumnas = tabla1.getColumnCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if ((j == 0 || i == 0 || i == numfilas / 2) || (j == numcolumnas - 1 && j / i >= 2) || (i == j && i + j >= numfilas)) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }

    }

    public static void letraW(JTable tabla1, JTable tabla2) {
        int numfilas, numcolumnas, aux;

        numfilas = tabla1.getRowCount();
        numcolumnas = tabla1.getColumnCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || j == numcolumnas - 1 || (i == j && i + j >= numfilas) || numfilas - 1 - i == j && i >= j) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }

    public static void relojNumerico(JTable tabla1, JTable tabla3) {
        int numfilas, numcolumnas, aux;

        numfilas = tabla1.getRowCount();
        numcolumnas = tabla1.getColumnCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (((i >= j && numfilas - 1 - i <= j)) || (i <= j) && (numfilas - 1 - i >= j)) {
                    tabla3.setValueAt(aux, i, j);
                }

            }
        }
    }

    public static void relojNumericoInverso(JTable tabla1, JTable tabla3) {
        int numfilas, numcolumnas, aux;

        numfilas = tabla1.getRowCount();
        numcolumnas = tabla1.getColumnCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (((j >= i && numfilas - 1 - j <= i)) || (j <= i) && (numfilas - 1 - j >= i)) {
                    tabla3.setValueAt(aux, i, j);
                }

            }
        }
    }

    public static void Cruz(JTable tabla1, JTable tabla3) {
        int numfilas, numcolumnas, aux;

        numfilas = tabla1.getRowCount();
        numcolumnas = tabla1.getColumnCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == numcolumnas / 2 || j == (numcolumnas / 2) - 1 || i == numfilas / 2 || i == (numfilas / 2) - 1) {
                    tabla3.setValueAt(aux, i, j);
                }

            }
        }
    }

    public static void Rombo(JTable tabla1, JTable tabla3) {
        int numfilas, numcolumnas, aux;

        numfilas = tabla1.getRowCount();
        numcolumnas = tabla1.getColumnCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if ((i == j - numfilas / 2) || (numfilas / 2 - i == j) || (numfilas - i + numfilas / 2 - 1 == j) || (i == j + numfilas / 2)) {
                    tabla3.setValueAt(aux, i, j);
                }
//
            }
        }
    }

}
