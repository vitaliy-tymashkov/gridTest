import java.util.HashSet;
import java.util.Set;

public abstract class RestAdapter {

    public static void withTest(){
        System.out.println("abstract static method");

        Set<Integer> exec = new HashSet<>();

//        exec.add(1);
//        exec.add(2);
//        exec.add(3);

        Integer i = exec.stream().findFirst().orElse(22);
        System.out.println("exec.stream() = " + i);

    }
/*    public <T extends RestAdapter> T withTest(){
//        return (T) this;
        //Object o = this;
        //T t = new (T);
        Class<T> clazz = this;

        if (this instanceof T) {
            return (T) this;
        }
        return null;
    }*/
}
