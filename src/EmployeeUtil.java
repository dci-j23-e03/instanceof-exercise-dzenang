import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeUtil {
  public static final String programmerRole = Programmer.class.getSimpleName();
  public static final String managerRole = Manager.class.getSimpleName();

  public static Map<String, List<Employee>> sortEmployees(List<Employee> employeeList) {
    Map<String, List<Employee>> sortedMap = new HashMap<>();
    sortedMap.put(programmerRole, new ArrayList<>());
    sortedMap.put(managerRole, new ArrayList<>());
    // sorting with usage of instanceof
    employeeList.forEach(employee -> {
      if (employee instanceof Programmer programmer) {
        sortedMap.get(programmerRole).add(programmer);
      } else if (employee instanceof Manager manager) {
        sortedMap.get(managerRole).add(manager);
      }
    });

    return sortedMap;
  }

}
