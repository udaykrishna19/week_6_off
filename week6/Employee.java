public class Employee extends Person{
     protected double salary;
    protected  int yearOfJoin;
    protected  String ins_num;

     public Person getName(Person person){
        return person;
     }
     
     Employee(double salary,int yearOfJoin, String ins_num){
        this.salary = salary;
        this.yearOfJoin = yearOfJoin;
        this.ins_num = ins_num;
     }

     public double getSalary(){
        return salary;
     }

     public int getYearOfJoin(){
        return yearOfJoin;
     }

     public String getIns_Num(){
        return ins_num;
     }

}