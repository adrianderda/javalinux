package HO;

import java.util.Arrays;

public class Comparision<T> {

    public boolean compare(T[] x, T y) {
        return Arrays.asList(x).contains(y);
    }
}


