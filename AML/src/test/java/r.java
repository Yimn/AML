import java.util.ArrayList;
import java.util.HashMap;

public class r {
    public static void main(String[] args) {
        ArrayList<String> dimensions = new ArrayList<>();
        ArrayList<ArrayList> source = new ArrayList<>();
        ArrayList sourceData = new ArrayList<>();

        HashMap<ArrayList<String>, ArrayList<ArrayList>> hashMap = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList();
        dimensions.add("name");
        dimensions.add("age");
        dimensions.add("profession");
        dimensions.add("date");
        sourceData.add("Krause");
        sourceData.add(41);
        sourceData.add("Engineer");
        sourceData.add(314);
        sourceData.add("2011-02-12");
        source.add(sourceData);
        hashMap.put(dimensions,source);

        ArrayList[][] data = new ArrayList[1][2];
        data[0][0] = dimensions;
        data[0][1] = source;
        System.out.println(data);
    }
}
