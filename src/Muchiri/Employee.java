package Muchiri;

public class Employee {

    double a,b,c;
    double bonus=0;


    void getInfo(double salary,double hours){
        this.a=salary;
        this.b=hours;


    }
    double addSal(){
        if (a<500){
            bonus+=10;
        }else {
            bonus=a;
        }
       return bonus;
    }

    double addWork(){
        if (b>6){
            bonus=+5;
        }else {
            bonus=a;
        }

        return bonus;
    }

}
class Wage{
    public  static void main(String[] args){
        Employee employee=new Employee();
        employee.a=200;
        employee.b=8;

        System.out.println(employee.addSal()+employee.addWork()+ employee.a);
    }
}
