package lambdas;

public class lambda_sample {
    interface greeting{
        public String sayHello(String g);
    }

    public void testeGreeting(String a, greeting g){
        String result = g.sayHello(a);

        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {

        // (String s) -> "Hello, " + s;
        new lambda_sample().testeGreeting("Harry", (String s) -> "Hello, " + s);
        new lambda_sample().testeGreeting("Miss Pingu", (String s) -> "Hello, " + s);

        // unhappy path
        // (String p) -> !p.isEmpty()? "Howdy, " + p : "Did you miss something"?
        new lambda_sample().testeGreeting("Harry",
                (String p) -> !p.isEmpty()? "Hello, " + p : "Did you miss something?");

    }
}
