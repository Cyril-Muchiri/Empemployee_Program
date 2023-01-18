package Muchiri;

import java.util.Scanner;

public class Employee {

    double a,b,c;
    double bonus=0;


    void getInfo(double salary,double hours){
        this.a=salary;
        this.b=hours;


    }
    double addSal(){
        if (a<500){
            bonus=10;
        }else {
            bonus=0;
        }
       return bonus;
    }

    double addWork(){
        if (b>6){
            bonus= 5;
        }else {
            bonus=0;
        }

        return bonus;
    }

}
class Wage{
    public  static void main(String[] args){
        Employee employee=new Employee();

        System.out.println(" Enter Employees salary: ");
        Scanner scan= new Scanner(System.in);
        employee.a= scan.nextDouble();

        System.out.println("Enter total no of hours: ");
        employee.b= scan.nextDouble();

        System.out.println((employee.addSal()+employee.addWork()) + employee.a);

    }
}
