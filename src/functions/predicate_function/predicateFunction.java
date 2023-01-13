package functions.predicate_function;

import java.util.function.Predicate;

public class predicateFunction {
    Predicate<Employee> bonusLambda = (emp) -> emp.getRatings() > 10 ? true : false;
    Predicate<Employee> execLambda = emp -> emp.getId().startsWith("E99") ? true : false;

    /************ Composing predicates ****************/
    /** LOGICAL AND **/
    Predicate<Employee> bonusAndExec = bonusLambda.and(execLambda);

    /** LOGICAL OR **/
    Predicate<Employee> bonusOrExec = bonusLambda.or(execLambda);

    /** NEGATE **/
    Predicate<Employee> bonusNegateExec = bonusLambda.negate();

    /** EQUALS **/
    Predicate<Employee> bonusEqualsExec = Predicate.isEqual(bonusLambda);
    public static void main(String[] args) {

    }
}
