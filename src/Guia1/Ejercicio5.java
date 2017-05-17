package Guia1;

/**
 * Created by Gonzalo de Achaval. Guia 1.
 */
public class Ejercicio5 {

    /**
     * Simple for sentence that checks one by one for the target value
     * @param array array of integers where the target is looked for.
     * @param target the number looked for
     * @return true or false
     */

    public boolean checkForNumeroEntero(int[] array, int target){
        boolean b = false;
        for(int i=0; i<array.length; i++){
            if(array[i] == target) b = true;
        }
        return b;
    }

    public boolean checkForNumeroEnteroRecursive(int[] array, int target){
        return checkForNumeroEnteroRecursive(array, target, 0);
    }

    private boolean checkForNumeroEnteroRecursive(int[] array, int target, int i) {
        if(i==array.length) return false;
        if(array[i] == target) return true;
        return checkForNumeroEnteroRecursive(array, target, i+1);
    }
}
