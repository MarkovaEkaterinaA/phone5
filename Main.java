public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();

        // Добавление сотрудников
        directory.addEmployee(new Employee(1, "123-456-7890", "Alice", 5));
        directory.addEmployee(new Employee(2, "987-654-3210", "Bob", 3));
        directory.addEmployee(new Employee(3, "555-666-7777", "Charlie", 5));

        // Поиск по табельному номеру
        System.out.println("Поиск по табельному номеру 1:");
        System.out.println(directory.findByEmployeeId(1));

        // Поиск по стажу
        System.out.println("\nПоиск сотрудников со стажем 5 лет:");
        List<Employee> experiencedEmployees = directory.findByExperience(5);
        for (Employee employee : experiencedEmployees) {
            System.out.println(employee);
        }

        // Поиск номера телефона по имени
        System.out.println("\nПоиск номера телефона по имени Bob:");
        List<String> phoneNumbers = directory.findPhoneByName("Bob");
        for (String phone : phoneNumbers) {
            System.out.println(phone);
        }

        // Список всех сотрудников
        System.out.println("\nВсе сотрудники:");
        directory.printAllEmployees();
    }
}
