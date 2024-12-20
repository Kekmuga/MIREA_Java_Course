package Pract_20_ika.Task_1;

import java.io.Serializable;

public class TVK <T extends Comparable<String>, V extends Animal & Serializable, K>{
    T t;
    V v;
    K k;

    public TVK(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void getClasses(){
        System.out.println(t.getClass());
        System.out.println(v.getClass());
        System.out.println(k.getClass());
    }
}
