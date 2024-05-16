# instanceof-exercise

- Write class Employee with two String fields (name, role) and `calculateSalary` method which will just return 0 (double).

- Write class Manager which is extending Employee with two additional double fields (baseSalary, bonus). In the `calculateSalary` method return sum of baseSalary and bonus.

- Write class Programmer which is extending Employee with two additional double fields (baseSalary, overtimePay). In the `calculateSalary` method return sum of those two fields.

- Write class EmployeeUtil with static method `sortEmployees` which is accepting a list of Employee objects and returning a Map<String,
  List<Employee>> with string key representing type of employee (can use class name) and a list of employees of that type (Programmer -> List of Programmer objects). Might need to use instanceof operator to check the type.

In the Main class class create 10 Employee objects (some programmers, some managers), put them in the list and call EmployeeUtil.sortEmployees to sort.
Also create two static methods, `printProgrammers` and `printManagers` which are accepting a list of Employees to print all Programmers with some details, and the same for Managers in other method.
Call `printProgrammers` and `printManagers` from `main` method to demonstrate their behaviour.
