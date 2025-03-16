package model;

public class Controller {

    private int arrNum[];



    public Controller() {
        arrNum = new int[]{1, 2, 2, 3, 4, 4, 4, 5, 6, 6};
    }


    public String orderValues(){
        //Victor es un falso

        return ""; //retorna array.toString() de numeros ordenados de arrNum.
    }

    public boolean palindrome(String word){
        //Hacer metodo que analiza si es palindromo, si si es, devuelve true, si no devuelve false
        return false;
    }
    public int bitCounter(String bits){
        int count = 0;
        for (char bit : bits.toCharArray()) {   //Complejidad O(n). Depende de la longitud de cadena enviada.
                                                //Mejor caso = O(n), Peor caso O(n). Siempre recorrerá longitud entera de cadena
            if (bit == '1') {
                count++;
            }
        }
        return count; //metodo que retorna conteo de 1s en una cadena de bits
    }
}
