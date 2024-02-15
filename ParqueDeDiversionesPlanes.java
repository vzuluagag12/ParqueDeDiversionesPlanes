import javax.swing.JOptionPane;

public class ParqueDeDiversionesPlanes {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Ingresa tu edad:");
        int edad = Integer.parseInt(input);
        String[] planes = {"Plan A: Montaña Rusa (Mayores de 18)",
                           "Plan B: Carrusel (Menores de 10)",
                           "Plan C: Juegos Infantiles (Menores de 10)",
                           "Plan D: Tobogán Acuático (11 a 17 años)"};
        
        String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione un plan de juego:",
                                                "Planes de Juego Disponibles", JOptionPane.QUESTION_MESSAGE, 
                                                null, planes, planes[0]);

        if (edad >= 18 && seleccion.equals(planes[0])) {
            JOptionPane.showMessageDialog(null, "Este juego solo es permitido para mayores de edad");
        } else if (edad < 10 && (seleccion.equals(planes[1]) || seleccion.equals(planes[2]))) {
            JOptionPane.showMessageDialog(null, "Edad no permitida para este juego");
        } else if (edad >= 11 && edad <= 17 && seleccion.equals(planes[3])) {
            JOptionPane.showMessageDialog(null, "Bienvenido al juego");
        } else {
            JOptionPane.showMessageDialog(null, "Plan seleccionado no válido para la edad ingresada");
        }
    }
}