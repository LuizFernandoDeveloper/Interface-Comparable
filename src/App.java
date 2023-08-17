import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> list  = new ArrayList<>() ;
        String path  = "/home/luiz/wk/udemy/java/interface/interface001/interface-comparable/names/names.txt";

        try (BufferedReader br  = new BufferedReader(new FileReader(path))){
            String name = br.readLine();
            while(name != null){
                list.add(name);
                name = br.readLine();
            }
            Collections.sort(list);
            for (String s : list){
                System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
