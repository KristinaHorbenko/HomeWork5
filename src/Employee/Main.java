package Employee;

public class Main {
    static String fullName;
    static String position;
    static String email;
    static String phone;
    static int age;
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