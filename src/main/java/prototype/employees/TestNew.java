package prototype.employees;

import java.util.List;

public class TestNew {
    public static void main(String[] args) {



    Employees emp = new Employees();
    emp.loadData();
    List<String> list = emp.getEmpList();
        System.out.println(list);
        list.add ("Feodor");
        System.out.println(list);
        list.remove("Nick");
        list.remove("Feodor");
        System.out.println(list);


    }

}
