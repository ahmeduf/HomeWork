package UseOfArray;


import java.util.HashMap;
import java.util.Map;

public class HashMapCLass {
    public static void main(String[] args) {
        Map<Integer,String> table=new HashMap<>();
        table.put(100,"ahmed");
        table.put(102,"fahim vi");
        table.put(103,"nasir vi");
        for (Map.Entry<Integer,String> bus : table.entrySet()) {


            System.out.println("Id for student : "+bus.getKey()+ " for "+bus.getValue());
        }
    }
}
