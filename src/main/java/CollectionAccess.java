import java.util.ArrayList;
import java.util.List;

public class CollectionAccess {
    public static void run (){

        List<PartyGroup> partyGroupList = new ArrayList<>();

        String id1 = "id1";
        PartySubIdTypeEnum type1 = PartySubIdTypeEnum.CONTRA;

        PartySubId partySubId = new PartySubId();
        partySubId.setId(id1);
        partySubId.setIdType(type1);

        Party pl = new Party();
        pl.partySubIdList.add(partySubId);
        pl.partySubIdList.add(new PartySubId().withId("id2").withIdType(PartySubIdTypeEnum.NONE));


        PartyGroup partyGroup = new PartyGroup();
        partyGroup.partyList.add(pl);

        partyGroupList.add(partyGroup);
        partyGroupList.add(new PartyGroup());


        System.out.println("**************************");
        System.out.println("partyGroupList = " + partyGroupList);


        int indexInPartyList = 0;
        int indexInPartySubId = 1;

        PartySubId partySubIdToCheck0 = partyGroup.partyList.get(0).partySubIdList.get(0);
        System.out.println("Check partySubIdToCheck0 = " + partySubIdToCheck0);


        System.out.println("");
        String partySubId_Id_ToCheck0 = partyGroup.partyList.get(0).partySubIdList.get(0).id;
        PartySubIdTypeEnum partySubId_IdType_ToCheck0 = partyGroup.partyList.get(0).partySubIdList.get(0).idType;
        System.out.println("Check partySubId_Id_ToCheck0 = " + partySubId_Id_ToCheck0);
        System.out.println("Check partySubId_IdType_ToCheck0 = " + partySubId_IdType_ToCheck0);

        System.out.println("");
        indexInPartyList = 0;
        indexInPartySubId = 1;
//        String partySubId_Id_ToCheck0 = partyGroup.partyList.get(0).partySubIdList.get(0).id;
//        PartySubIdTypeEnum partySubId_IdType_ToCheck0 = partyGroup.partyList.get(0).partySubIdList.get(0).idType;
        PartySubId partySubIdFromChecker1 = IndexChecker.check(partyGroup, indexInPartyList, indexInPartySubId, "Part of the log message text " + indexInPartySubId);
        System.out.println("Check partySubId_Id_ToCheck" + indexInPartySubId + " = " + partySubIdFromChecker1.id);
        System.out.println("Check partySubId_IdType_ToCheck" + indexInPartySubId + " = " + partySubIdFromChecker1.idType);


        System.out.println("");
        indexInPartyList = 98;
        indexInPartySubId = 99;
        String partySubId_Id_ToCheck99 = null;
        PartySubIdTypeEnum partySubId_IdType_ToCheck99 = null;
        IndexChecker.check(partyGroup, indexInPartyList, indexInPartySubId, "Part of the log message text" + indexInPartySubId);


        System.out.println("");
        String partySubId_Id_ToCheck1 = null;
        PartySubIdTypeEnum partySubId_IdType_ToCheck1 = null;
        indexInPartyList = 0;
        indexInPartySubId = 1;
        PartySubId partySubIdFromChecker = IndexChecker.check(partyGroup, indexInPartyList, indexInPartySubId, "Part of the log message text " + indexInPartySubId);
        System.out.println("Check partySubId_Id_ToCheck" + indexInPartySubId + " = " + partySubIdFromChecker.id);
        System.out.println("Check partySubId_IdType_ToCheck" + indexInPartySubId + " = " + partySubIdFromChecker.idType);


        System.out.println("");
        PartySubId partySubIdFromChecker_0_0 = IndexChecker.check(partyGroup, 0, 0, "Part of the log message text");
        System.out.println("Check partySubId_Id_ToCheck 0 0 = " + partySubIdFromChecker_0_0.id);
        System.out.println("Check partySubId_IdType_ToCheck 0 0 = " + partySubIdFromChecker_0_0.idType);

    }
}
