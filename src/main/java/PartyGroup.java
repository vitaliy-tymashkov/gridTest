import java.util.ArrayList;
import java.util.List;
//import lombok.Data;
//
//@Data
public class PartyGroup {
    @Override
    public String toString() {
        return "PartyGroup{" +
                "partyList=" + partyList +
                '}';
    }

    public List<Party> partyList = new ArrayList<>();
}
