//import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;
//
//@Data
//@Getter
//@Setter
public class PartySubId {
    public String id;
    public PartySubIdTypeEnum idType;

    public void setId(String id1) {
        this.id = id1;
    }

    public PartySubId withId(String id1) {
        this.id = id1;
        return this;
    }


    public void setIdType(PartySubIdTypeEnum type1) {
        this.idType = type1;
    }

    public PartySubId withIdType(PartySubIdTypeEnum type1) {
        this.idType = type1;
        return this;
    }

    @Override
    public String toString() {
        return "PartySubId{" +
                "id='" + id + '\'' +
                ", idType=" + idType +
                '}';
    }
}
