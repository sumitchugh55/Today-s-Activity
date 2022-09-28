package sumit;

import java.util.*;


class Employee
{
    int Emp_id;
     
    
     
    double salary;
     
    public Employee(int id,  double salary) 
    {
        this.Emp_id = id;
       
        this.salary = salary;
    }
     
    public int getEmp_id() 
    {
        return Emp_id;
    }
     
    
     
   
   
    public double getSalary() 
    {
        return salary;
    }
     
    
    public String toString() 
    {
        return "Emp_id : "+Emp_id
               
                +", Salary : "+salary;
    }

public static void main(String[] args) {
List<Employee> employeeList = new ArrayList<Employee>();
         
employeeList.add(new Employee(111,  25000.0));
employeeList.add(new Employee(122, 13500.0));
employeeList.add(new Employee(133,  18000.0));
employeeList.add(new Employee(144,  32500.0));
employeeList.add(new Employee(155, 22700.0));
    
//Second highest salary

Optional <Employee> emp = employeeList.stream()
.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();

System.out.println(emp.get());


}
}
