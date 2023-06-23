public class cadenaComprimida {
    public static void main(String[] args) {
        String cadena = "aaabbbbcc"; // Cambia esta cadena por la que desees comprimir

        String cadenaComprimida = comprimirCadena(cadena);
        System.out.println("Cadena comprimida: " + cadenaComprimida);
    }

    public static String comprimirCadena(String cadena) {
        StringBuilder cadenaComprimida = new StringBuilder();

        int contador = 1;
        for (int i = 0; i < cadena.length(); i++) {
            if (i + 1 < cadena.length() && cadena.charAt(i) == cadena.charAt(i + 1)) {
                contador++;
            } else {
                cadenaComprimida.append(cadena.charAt(i));
                cadenaComprimida.append(contador);
                contador = 1;
            }
        }

        return cadenaComprimida.toString();
    }
}
