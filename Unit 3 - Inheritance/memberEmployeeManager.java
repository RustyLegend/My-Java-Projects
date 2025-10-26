class member 
{
    String name;
    int age;
    long phone_number;
    String address;
    float salary;

    void printSalary()
    {
        System.out.println("Salary: " + salary);
    }

    member(String name , int age , long phone_number , String address , float salary)
    {
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
        this.address = address;
        this.salary = salary;
    }
}

class employee extends member
{
    String specialization;
    String department;
    employee(String name , int age , long phone_number , String address , float salary , String specialization , String department)
    {
        super(name, age, phone_number, address, salary);
        this.specialization = specialization;
        this.department = department;
    }
}

class manager extends member
{
    String specialization;
    String department;
    manager(String name , int age , long phone_number , String address , float salary , String specialization , String department)
    {
        super(name, age, phone_number, address, salary);
        this.specialization = specialization;
        this.department = department;
    }
}

public class memberEmployeeManager 
{
    public static void main(String[] args) 
    {
        employee e1 = new employee("Akhil Naidu", 27, 7842104287L, "Pulaganipalem Road", 50000, "Data Science", "Software Department");
        manager m1 = new manager("Rahul Gunturu", 35, 7893747166L, "Pulaganipalem Road", 100000, "Data Science", "Product Management");
        System.out.println("Employee Details: ");
        System.out.println("Name: " + e1.name);
        System.out.println("Age: " + e1.age);
        System.out.println("Phone number: " + e1.phone_number);
        System.out.println("Address: " + e1.address);
        System.out.println("Specialization: " + e1.specialization);
        System.out.println("Department: " + e1.department);
        e1.printSalary();
        System.out.println();
        System.out.println("Manager Details: ");
        System.out.println("Name: " + m1.name);
        System.out.println("Age: " + m1.age);
        System.out.println("Phone number: " + m1.phone_number);
        System.out.println("Address: " + m1.address);
        System.out.println("Specialization: " + m1.specialization);
        System.out.println("Department: " + m1.department);
        m1.printSalary();
    }
}
