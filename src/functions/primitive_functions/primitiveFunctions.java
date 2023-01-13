package functions.primitive_functions;

import functions.predicate_function.Employee;

import java.util.function.*;

public class primitiveFunctions {

    Predicate<Integer> evenNumberPredicate = x -> x % 2 == 0;

    IntPredicate evenNumberPredicate2 = x -> x % 2 == 0;
    Predicate<Double> doublePredicate = x -> x > 10;
    DoublePredicate doublePredicate2 = x -> x > 10;

    // Consumer
    IntConsumer intConsumer = null;
    DoubleConsumer doubleConsumer = null;
    LongConsumer longConsumer = null;

    // Suppliers
    IntSupplier intSupplier = null;
    DoubleSupplier doubleSupplier = null;
    LongSupplier longSupplier =null;

    // Functions
    Function<Integer, Employee> employeeFunction = null;
    IntFunction<Employee> employeeIntFunction = null;
    DoubleFunction<Employee> doubleFunction = null;
    LongFunction<Employee> employeeLongFunction = null;

    private void testPredicate(int i) {
        System.out.println("Even number? " + evenNumberPredicate2.test(i));
    }

    public static void main(String[] args) {
        new primitiveFunctions().testPredicate(20);
    }
}
