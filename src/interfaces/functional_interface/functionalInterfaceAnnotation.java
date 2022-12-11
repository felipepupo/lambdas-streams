package interfaces.functional_interface;

public class functionalInterfaceAnnotation {

    @FunctionalInterface
    interface Cruncher{
        int crunch(int i, int j);
    }

    public int crunchService(int i, int j, Cruncher cruncher){
        return cruncher.crunch(i, j);
    }

    public static void main(String[] args) {
        functionalInterfaceAnnotation client = new functionalInterfaceAnnotation();

        //Client 1
        int ans = client.crunchService(3, 4, (p,q) -> p*q);
        System.out.println("Answer: " + ans);

        //Client 2
        ans = client.crunchService(5, 3, (p,q) -> p*q);
        System.out.println("Answer: " + ans);
    }
}
