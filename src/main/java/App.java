import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);
//    Logger log = LoggerFactory.getLogger(getClass());
//    static Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        System.out.println("START");

        //Add feature 1
        //Add feature 2
        //Add feature 3
        log.info("*************************** INFO1 **************************************");
        RestAdapter.withTest();

        System.out.println("STOP");
    }
}
