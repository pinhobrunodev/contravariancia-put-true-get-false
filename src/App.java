import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
    

        List<Object>myObjs = new ArrayList<Object>();
        myObjs.add("Bob");
        myObjs.add("Alex");
        List< ? super Number> list = myObjs;
        //PUT OK
        list.add(10);
        // GET ERROR
        //TIPO DESSA LISTA PODE SER UM TIPO QUE SEJA SUPERTIPO DE NUMBER
        //Number x = list.get(2);
       // System.out.println(x);

    }
}
