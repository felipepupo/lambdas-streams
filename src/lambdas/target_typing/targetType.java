package lambdas.target_typing;

public class targetType {

    public interface Email {
        String constructEmail(String name);
    }
    Email email = (String name) -> name + "@gmail.com";

    public String getEmail(String name, Email email) {
        return null;
    }

    public static void main(String[] args) {
        new targetType().getEmail("felipe", (String name) -> name + "@gmail.com");
    }
}
