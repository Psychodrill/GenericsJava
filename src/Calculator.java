public class Calculator {

    public static <U extends Number, V extends Number> float sum(U first, V second){
        return first.floatValue()+second.floatValue();
    }
    public static <U extends Number, V extends Number> float multiply(U first, V second){
        return first.floatValue()*second.floatValue();
    }
    public static <U extends Number, V extends Number> float divide(U first, V second){
        return first.floatValue()/second.floatValue();
    }
    public static <U extends Number, V extends Number> float subtract(U first, V second){
        return first.floatValue()-second.floatValue();
    }


}
