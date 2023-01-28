import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Hashtable<String, Integer> studentMarks = new Hashtable<>();

        studentMarks.put("Shehaan",98);
        studentMarks.put("Dinusha",99);
        studentMarks.put("Sandy",87);
        studentMarks.put("John",78);

        studentMarks.remove("John");

        for(String k : studentMarks.keySet()){
            System.out.println(k + "-> " + studentMarks.get(k) + "\t(" + studentMarks.keys().hashCode() % 100 + ")" );
        }

//        for(Integer i : studentMarks.values()){
//            System.out.println(i);
//        }



    }
}