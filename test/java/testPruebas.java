import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;

public class testPruebas {

     Palindromo palindromo = new Palindromo();

    @Test
    public void revisar(){
        assertAll(
                () -> {
            Assertions.assertEquals("numero", palindromo.primerDigito("2 de mis mejores amigos, están en Ch22"),()->"El primer digito no es numero"); },
                () -> {
            Assertions.assertEquals("mayuscula", palindromo.primerDigito("Hola Crayoli"),()->"El primer digino no es una mayusucla"); },
                () -> {
            Assertions.assertEquals("minuscula", palindromo.primerDigito("ya tengo hambrita"),()->"El primer digito no es minuscula"); },
                () -> {
            Assertions.assertEquals("otro", palindromo.primerDigito("#valen1000(base 10)"),()->"El primer digito no es otro"); });
        }


    @Test
    public void casi(){
        assertAll(() -> {
                    Assertions.assertFalse(palindromo.casiPalindromo("Oso"));},
                ()->{
                    Assertions.assertTrue(palindromo.casiPalindromo("ver"));},
                ()->{
                    Assertions.assertFalse(palindromo.casiPalindromo("Hola"));},
                ()->{
                    Assertions.assertTrue(palindromo.casiPalindromo("Ocho"));},
                ()->{
                    Assertions.assertFalse(palindromo.casiPalindromo("veronica"));},
                ()->{
                    Assertions.assertTrue(palindromo.casiPalindromo("Anita lavo la tina"));





        });

    }




}
