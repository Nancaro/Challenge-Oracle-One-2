import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Mostrar las opciones disponibles al usuario
        Object[] options = { "Convertir Divisas", "Convertir Temperatura", "Salir" };
        int elige = JOptionPane.showOptionDialog(null, "¿Qué quieres hacer?", "Conversor", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        // Verificar la opción seleccionada
        if (elige == 2) {
            JOptionPane.showMessageDialog(null, "Programa cerrado");
            System.exit(0);
        }
        if (elige == 0) {
            DecimalFormat formatearDivisa = new DecimalFormat("#.##");
            boolean continuarPrograma = true;
            while (continuarPrograma) {
                // Mostrar las opciones de conversión de divisas
                String[] opciones = { "Pesos a Euros", "Pesos a Dólares", "Pesos a Libras", "Pesos a Yen",
                        "Pesos a Won", "Pesos a Reales" };
                String cambio = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                        "Conversor de Divisas", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                // Solicitar la cantidad de pesos a convertir
                String input = JOptionPane.showInputDialog(null, "Ingrese cantidad de Pesos");
                double pesos;
                try {
                    pesos = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido");
                    return;
                }

                // Realizar la conversión de acuerdo a la opción seleccionada
                if (cambio.equals("Pesos a Euros")) {
                    double euros = pesos * 0.0038;
                    JOptionPane.showMessageDialog(null,
                            pesos + " Pesos Argentinos son: " + formatearDivisa.format(euros) + " Euros.");
                } else if (cambio.equals("Pesos a Dólares")) {
                    double dolares = pesos * 0.0041;
                    JOptionPane.showMessageDialog(null,
                            pesos + " Pesos Argentinos son: " + formatearDivisa.format(dolares) + " Dólares.");
                } else if (cambio.equals("Pesos a Libras")) {
                    double libras = pesos * 0.0033;
                    JOptionPane.showMessageDialog(null,
                            pesos + " Pesos Argentinos son: " + formatearDivisa.format(libras) + " Libras.");
                } else if (cambio.equals("Pesos a Yen")) {
                    double yen = pesos * 0.57;
                    JOptionPane.showMessageDialog(null,
                            pesos + " Pesos Argentinos son: " + formatearDivisa.format(yen) + " Yen.");
                } else if (cambio.equals("Pesos a Won")) {
                    double won = pesos * 5.27;
                    JOptionPane.showMessageDialog(null,
                            pesos + " Pesos Argentinos son: " + formatearDivisa.format(won) + " Won.");
                } else if (cambio.equals("Pesos a Reales")) {
                    double reales = pesos * 0.020;
                    JOptionPane.showMessageDialog(null,
                            pesos + " Pesos Argentinos son: " + formatearDivisa.format(reales) + " Reales.");
                }

                // Confirmar si el usuario desea continuar o salir del programa
                int confirma = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                if (confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                }
            }
        }
        
        // Verificar la opción seleccionada
        if (elige == 1) {
            boolean seguirPrograma = true;
            while (seguirPrograma) {
                // Mostrar las opciones de conversión de temperatura
                String[] opciones = { "Celsius a Fahrenheit", "Fahrenheit a Celsius" };
                int opcion = JOptionPane.showOptionDialog(null, "Elija una opción",
                        "Conversor de Temperatura",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

                // Solicitar el valor a convertir
                String valorNominal = JOptionPane.showInputDialog(null, "Ingrese valor a convertir");
                double valor = 0.0;
                try {
                    valor = Double.parseDouble(valorNominal);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido");
                    System.exit(0);
                }
                
                // Realizar la conversión de acuerdo a la opción seleccionada
                double resultado = 0;
                if (opcion == 0) {
                    resultado = (valor * 9/5) + 32;
                    JOptionPane.showMessageDialog(null, valor + " Grados Celsius son: " + resultado + " Grados Fahrenheit.");
                } else if (opcion ==1) {
                    resultado = (valor - 32) * 5/9;
                    JOptionPane.showMessageDialog(null, valor + " Grados Fahrenheit" + resultado + " Grados Celsius son:");
                }
                
                // Confirmar si el usuario desea continuar o salir del programa
                int continuar = JOptionPane.showConfirmDialog(null, "¿Desea seguir usando el programa?", "", JOptionPane.YES_NO_OPTION);
                if (continuar == JOptionPane.NO_OPTION) {
                    seguirPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                }
            }
        }
    }
}
