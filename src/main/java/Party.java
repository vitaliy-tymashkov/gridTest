import java.util.ArrayList;
import java.util.List;
//import lombok.Data;
//
//@Data
public class Party {
    @Override
    public String toString() {
        return "PartyList{" +
                "partySubIdList=" + partySubIdList +
                '}';
    }

    public List<PartySubId> partySubIdList = new ArrayList<>();
}
