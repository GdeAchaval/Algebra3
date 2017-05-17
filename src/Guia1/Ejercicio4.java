package Guia1;

/**
 * Created by Gonzalo de Achaval. Guia 1.
 * @param <T> Class that contains an equals method.
 */
public class Ejercicio4 <T> {

    /**
     * Find if a certain array contains "mirrored" elements. Index from the right and index from the left that
     * are used to compare elements.
     * @param array the array to be analyzed
     * @return true or false
     */

    public boolean capicua(T[] array){
        boolean b = true;

        int indexLeft = 0;
        int indexRight = array.length-1;

        while(indexRight - indexLeft > 1){
            if(!array[indexLeft].equals(array[indexRight])) b = false;
            indexLeft ++;
            indexRight --;
        }
        return b;
    }


    public boolean capicuaRecursive(T[] array){
        return capicuaRecursive(array, 0, array.length-1);
    }

    private boolean capicuaRecursive(T[] array, int first, int last) {
        if(array[first] != array[last]) return false;
        if(first >= last) return true;
        return capicuaRecursive(array, first+1, last-1);
    }
}
