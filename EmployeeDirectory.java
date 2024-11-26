import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {
    private final List<Employee> employees = new ArrayList<>();

    // Добавление нового сотрудника
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Поиск сотрудника по табельному номеру
    public Employee findByEmployeeId(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }
        return null;
    }

    // Поиск сотрудников по стажу
    public List<Employee> findByExperience(int experience) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getExperience() == experience) {
                result.add(employee);
            }
        }
        return result;
    }

    // Получение номера телефона по имени
    public List<String> findPhoneByName(String name) {
        List<String> phoneNumbers = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                phoneNumbers.add(employee.getPhoneNumber());
            }
        }
        return phoneNumbers;
    }

    // Печать всех сотрудников
    public void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
