package Employee;

public class Main {
    static String fullName;
    private static String position;
    private static String email;
    private static String phone;
    private static int age;
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setFullName("Tom");
        employee.setPosition("Manager");
        employee.setEmail("Manager@gamil.com");
        employee.setPhone("380 000 00 00");
        employee.setAge(25);

        fullName = employee.getFullName();
        position = employee.getPosition();
        email = employee.getEmail();
        phone = employee.getPhone();
        age = employee.getAge();



        System.out.println(fullName + '\n' + position + '\n' + email + '\n' + phone + '\n' + age);
    }
}

