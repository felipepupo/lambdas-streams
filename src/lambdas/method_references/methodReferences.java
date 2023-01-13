package lambdas.method_references;

interface IMovie{
    public boolean check(int id);
}

public class methodReferences {

    public void testMovieStaticMethodRef(){
        IMovie m1 = (i) -> i < 100 ? true : false;
        IMovie m2 = methodReferences::isClassic;
    }

    public void testMovieInstanceMethodRef(){
        methodReferences ref = new methodReferences();
        IMovie m1 = (i) -> i > 10 && i < 100 ? true : false;
        IMovie m2 = ref::isTop10;
    }

    public boolean isTop10(int movieId){
        return true;
    }

    public static boolean isClassic(int movieId){
        return true;
    }

    public static void main(String[] args) {

    }
}
