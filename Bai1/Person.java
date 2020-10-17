package De1_Bai1;

import java.util.Scanner;

public class Person {
    private String name;
    private String dateOfBirth;
    private String Address;
    private String Gender;
    public Person()
    {
        name="";
        dateOfBirth="";
        Address="";
        Gender="";
    }
    public Person(String _name, String _dateOfBirth, String _address, String _gender) {
        name = _name;
        dateOfBirth = _dateOfBirth;
        Address = _address;
        Gender = _gender;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return Address;
    }

    public String getGender() {
        return Gender;
    }

    public void Input()
    {
        System.out.println("Nhập tên: ");
        name=new Scanner(System.in).nextLine();
        System.out.println("Nhập ngày sinh: ");
        dateOfBirth=new Scanner(System.in).nextLine();
        System.out.println("Nhập địa chỉ: ");
        Address=new Scanner(System.in).nextLine();
        System.out.println("Nhập giới tính: ");
        Gender=new Scanner(System.in).nextLine();
    }
    public void Output()
    {
        System.out.printf("|%30s|%15s|%30s|%10s|",getName(),getDateOfBirth(),getAddress(),getGender());
    }
}
