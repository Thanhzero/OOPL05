package De1_Bai1;

import java.io.Serializable;
import java.util.Scanner;

public class Student extends Person implements Serializable
{
    private String id;
    private String email;
    private String cclass;
    private float math;
    private float tin;
    private float english;

    public Student(String id, String email, String aClass, float math, float tin, float english) {
        super();
        this.id = id;
        this.email = email;
        this.cclass = aClass;
        this.math = math;
        this.tin = tin;
        this.english = english;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getCclass() {
        return cclass;
    }

    public float getMath() {
        return math;
    }

    public float getTin() {
        return tin;
    }

    public float getEnglish() {
        return english;
    }

    public Student() {
    super();
    this.id = "";
    this.email = "";
    this.cclass = "";
    this.math = 0f;
    this.tin = 0f;
    this.english = 0f;
}

    @Override
    public void Input() {
        super.Input();
        System.out.println("Nhập Mã Sinh viên: ");
        id=new Scanner(System.in).nextLine();
        System.out.println("Nhập email: ");
        email=new Scanner(System.in).nextLine();
        System.out.println("Nhập lớp: ");
        cclass=new Scanner(System.in).nextLine();
        System.out.println("Nhập điểm Toán: ");
        math=new Scanner(System.in).nextFloat();
        System.out.println("Nhập điểm Tin: ");
        tin=new Scanner(System.in).nextFloat();
        System.out.println("Nhập điểm Tiếng Anh: ");
        english=new Scanner(System.in).nextFloat();
    }

    @Override
    public void Output() {
        super.Output();
        System.out.printf("%20s|%30s|%10s|%4.2f|%4.2f|%10.2f|&10.2f|\n",id,email,cclass,math,tin,english,Avg());
    }
    public float Avg()
    {
        return((math*3+tin*4+english*2)/9);
    }
}
