import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Palindromo {

    ///////////////////Constructor/////////////////////

    public Palindromo() {
    }

    ///////////////////Get and Set/////////////////////

    public String primerDigito(String cadena) {
        char[] caracteres = cadena.toCharArray();
        String primero = String.valueOf(caracteres[0]);
        System.out.println(primero);
        if (primero.matches("[a-z]")) {
            return "minuscula";
        } else if (primero.matches("[A-Z]")) {
            return "mayuscula";
        } else if (primero.matches("[0-9]")) {
            return "numero";
        }
        else {
            return "otro";
        }
    }

    public boolean casiPalindromo(String cadena) {
        String nueva = cadena.toLowerCase().replaceAll(" ","");
        String[] arreglo = nueva.split("");
        ArrayList<String> lista = new ArrayList<>(List.of(arreglo));
        Collections.reverse(lista);
        String fin = String.join("", lista);
        int cont=0;
        if (fin.equals(nueva)) {
            return false;
        }
        else {
            for(int i=0;i<arreglo.length;i++){
               if(!(String.valueOf(arreglo[i]).equals(lista.get(i)))){
                   System.out.println(lista.get(i)+"->"+arreglo[i]);
                   cont++;
               }

            }
            return cont < 3;

        }
    }
}
