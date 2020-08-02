public class IndexChecker {
    public static PartySubId check(PartyGroup partyGroup, int indexInPartyList, int indexInPartySubId, String partOfLogMessage){
        String partySubId_Id_ToCheck = null;
        PartySubIdTypeEnum partySubId_IdType_ToCheck = null;
        try {
            partySubId_Id_ToCheck = partyGroup.partyList.get(indexInPartyList).partySubIdList.get(indexInPartySubId).id;
            partySubId_IdType_ToCheck = partyGroup.partyList.get(indexInPartyList).partySubIdList.get(indexInPartySubId).idType;
            System.out.println("*In Checker* Check partySubId_Id_ToCheck partyList[" + indexInPartyList + "] partySubId[" + indexInPartySubId + "] = " + partySubId_Id_ToCheck);
            System.out.println("*In Checker* Check partySubId_IdType_ToCheck partyList[" + indexInPartyList + "] partySubId[" + indexInPartySubId + "] = " + partySubId_IdType_ToCheck);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("*In Checker* Exception while accessing indices partyList[" + indexInPartyList + "] partySubId[" + indexInPartySubId + "].\n [" + partOfLogMessage + "]\n" + e);
        }

        return new PartySubId().withId(partySubId_Id_ToCheck).withIdType(partySubId_IdType_ToCheck);
    }
}
