public class TestEmployee{
    public static void main(String [] args){
        Person pp = new Person();
        pp.setName("AChilles Neal");
        System.out.println(pp.getName());

        Employee emp = new Employee(1200000, 2075, "AOB145I1452");
        System.out.println(emp.getName(pp).getName());

        System.out.println("Salary: "+emp.getSalary());
        System.out.println("Year of Joining: "+emp.getYearOfJoin());
        System.out.println("Insurane number: "+emp.getIns_Num());
    }
}