import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        List<Employee> list  = new ArrayList<>() ;
        String path  = "/home/luiz/wk/udemy/java/interface/interface001/interface-comparable/names/names.txt";

        try (BufferedReader br  = new BufferedReader(new FileReader(path))){
            String employeeCsv = br.readLine();
            while(employeeCsv != null){
                String [] fields =  employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }
            Collections.sort(list);
            for (Employee employee : list){
                System.out.println(employee.getName() + " , " + employee.getSalary());
            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
