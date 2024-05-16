import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {

    Employee emp = new Manager("Mickey Mouse", 1000, 500);
    Employee emp1 = new Manager("Minnie Mouse", 2000, 500);
    Employee emp2 = new Programmer("Mickey Junior", 5000, 100);
    Employee emp3 = new Manager("Robot Manager", 10000, 5000);
    Employee emp4 = new Programmer("Donald Duck", 5000, 200);
    Employee emp5 = new Programmer("Goofey", 5000, 500);
    Employee emp6 = new Programmer("Mickey Junior2", 5000, 500);
    Employee emp7 = new Manager("Robot 2", 1000, 500);
    Employee emp8 = new Programmer("Donald Duck Junior", 5000, 500);
    Employee emp9 = new Programmer("Donald Duck Junior2", 5000, 500);
    List<Employee> employeeList = List.of(emp, emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9);

    Map<String, List<Employee>> sortedEmployees = EmployeeUtil.sortEmployees(employeeList);

    printEmplees(sortedEmployees.get(EmployeeUtil.managerRole), EmployeeUtil.managerRole);
    printEmplees(sortedEmployees.get(EmployeeUtil.programmerRole), EmployeeUtil.programmerRole);
  }

  public static void printEmplees(List<Employee> employeeList, String employeeType) {
    System.out.println(employeeType + "s: ");
    employeeList.forEach(employee -> System.out.println("Name: " + employee.getName() + " Salary: " + employee.calculateSalary()));
  }
}
