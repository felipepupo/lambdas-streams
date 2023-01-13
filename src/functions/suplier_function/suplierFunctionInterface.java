package functions.suplier_function;

import java.util.function.Supplier;

public class suplierFunctionInterface {
    Supplier<String[]> fruitSupplier = () -> new String[]{"Apple", "Orange"};

    private void testSuplier(){
        String[] fruits = fruitSupplier.get();

        for (String fruit : fruits){
            System.out.println(fruit);
        }
    }

    public static void main(String[] args) {
        new suplierFunctionInterface().testSuplier();
    }
}
