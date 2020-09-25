import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        System.out.println("START");

        //Add feature 1
        //Add feature 2
        //Add feature 3
        RestAdapter.withTest();

        try{
            log.info("*************************** INFO1 **************************************");
            throw new Exception("Test exception");
        } catch (Exception e) {
            String text = "text";
            log.error("*** ERROR MESSAGE = {} ***", text, e);
            e.printStackTrace();
        }

        System.out.println("STOP");
    }
}
