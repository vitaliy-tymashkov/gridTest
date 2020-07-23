

public abstract class RestAdapter {

    public static void withTest(){
        System.out.println("abstract static method");

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
