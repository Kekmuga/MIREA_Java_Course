package Pract_20_ika.Task_2;

import java.util.Objects;

public class Calculator {
    static <T extends Number> T sum(T t1, T t2){
        if(t1 instanceof Integer){
            if(t2 instanceof Integer){
                return (T) Integer.valueOf(t1.intValue() + t2.intValue());
            }

            if(t2 instanceof Double){
                return (T) Double.valueOf(t1.intValue() + t2.doubleValue());
            }
        }

        if(t1 instanceof Double){
            if(t2 instanceof Integer){
                return (T) Integer.valueOf(t1.intValue() + t2.intValue());
            }

            if(t2 instanceof Double){
                return (T) Double.valueOf(t1.intValue() + t2.doubleValue());
            }
        }

        throw new IllegalArgumentException("Такой тип не умею");
    }

    static <T extends Number> T sub(T t1, T t2){
        if(t1 instanceof Integer){
            if(t2 instanceof Integer){
                return (T) Integer.valueOf(t1.intValue() - t2.intValue());
            }

            if(t2 instanceof Double){
                return (T) Double.valueOf(t1.intValue() - t2.doubleValue());
            }
        }

        if(t1 instanceof Double){
            if(t2 instanceof Integer){
                return (T) Integer.valueOf(t1.intValue() - t2.intValue());
            }

            if(t2 instanceof Double){
                return (T) Double.valueOf(t1.intValue() - t2.doubleValue());
            }
        }

        throw new IllegalArgumentException("Такой тип не умею");
    }

    static <T extends Number> T mul(T t1, T t2){
        if(t1 instanceof Integer){
            if(t2 instanceof Integer){
                return (T) Integer.valueOf(t1.intValue() * t2.intValue());
            }

            if(t2 instanceof Double){
                return (T) Double.valueOf(t1.intValue() * t2.doubleValue());
            }
        }

        if(t1 instanceof Double){
            if(t2 instanceof Integer){
                return (T) Integer.valueOf(t1.intValue() * t2.intValue());
            }

            if(t2 instanceof Double){
                return (T) Double.valueOf(t1.intValue() * t2.doubleValue());
            }
        }

        throw new IllegalArgumentException("Такой тип не умею");
    }

    static <T extends Number> T div(T t1, T t2) {
        if(Objects.equals(t2, 0) || Objects.equals(t2, 0.0))
            throw new ArithmeticException("На ноль низя");

        if (t1 instanceof Integer) {
            if (t2 instanceof Integer) {
                return (T) Integer.valueOf(t1.intValue() / t2.intValue());
            }

            if (t2 instanceof Double) {
                return (T) Double.valueOf(t1.intValue() / t2.doubleValue());
            }
        }

        if (t1 instanceof Double) {
            if (t2 instanceof Integer) {
                return (T) Integer.valueOf(t1.intValue() / t2.intValue());
            }

            if (t2 instanceof Double) {
                return (T) Double.valueOf(t1.intValue() / t2.doubleValue());
            }
        }

        throw new IllegalArgumentException("Такой тип не умею");
    }
}
