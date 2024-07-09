import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class NumberOfOrders {
    public static void main(String[] args) {
        String orders = "app=edi_adapter_splitter wingtipsTrace=225debfbe6e5fac7 poiFileName=Integration_test_Contract INFO  LogUtils - POI file name: [Integration_test_Contract], total number of orders successfully processed: [2]";
        String NoOfOrders = extractOrders(orders);    
        System.out.println("No. of Orders: " + NoOfOrders);

    }

    public static String extractOrders(String orders){
        String ordersPattern = "\\[(\\d+)\\]";
        Pattern pattern = Pattern.compile(ordersPattern);
        Matcher matcher = pattern.matcher(orders);

        if (matcher.find()){
            String number = matcher.group(1); // Group 1 contains the number inside the brackets
            return number;
        }
        return null;
    }

}
