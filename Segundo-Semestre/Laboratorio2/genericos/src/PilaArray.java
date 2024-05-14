import java.util.Arrays;
import java.util.NoSuchElementException;

public class PilaArray<E>{
    private E[] array;
    private int contador;

    public PilaArray(int size) {
        array = (E[]) new Object[size];
        contador = 0;
    }

    public boolean isEmpty(){
        return contador == 0;
    }

    public boolean add(E elemento){
        if(contador < array.length){
            array[contador] = elemento;
            contador++;
            return true;
        }
        return false;
    }

    public E first(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return array[contador - 1];
    }

    public E remove(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        contador--;
        return array[contador];
    }

    @Override
    public String toString() {
        return "PilaArray{" +
                "array=" + Arrays.toString(array) +
                ", contador=" + contador +
                '}';
    }
}
