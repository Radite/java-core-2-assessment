public class ContainsUUID {
    public static void main(String[] args) {
        String problemString = "app=edi_adapter_converter wingtipsTrace=8faeae6709355291 INFO  OrderCreateClient - action=EDIOrderSent originalFilename=Integration_test_Contract customerName=0005084863 orderUUID=d34149d8-88ab-4791-bb0a-46c96e034200 poNum=Test_TS5155079515 lineCount=3";
        boolean containsUUID = problemString.contains("orderUUID=");
        System.out.println(containsUUID);



    }
}
