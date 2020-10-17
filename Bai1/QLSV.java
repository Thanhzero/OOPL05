package De1_Bai1;

import java.io.*;
import java.util.*;

public class QLSV {
    public static ArrayList<Student> lists;
    public QLSV()
    {
        lists=new ArrayList<>();
    }
    public void inputList()
    {
        System.out.println("Nhạp s để dùng nhập thông tin!!");
        while (true)
        {
            Student st= new Student();
            st.Input();
            lists.add(st);
            if(new Scanner(System.in).nextLine().equalsIgnoreCase("s")) break;
        }
    }
    public  void outputList()
    {
        System.out.printf("|%30s|%15s|%30s|%10s|%20s|%30s|%10s|%4s|%4s|%10s|%10s|\n","Họ tên","Ngáy sinh","Địa chỉ","Giới tính","Mã sinh viên","Email","Lop","Toán","Tin","Tiếng Anh","Điểm TB");
        for (Student st:lists
             ) {
            st.Output();
        }
    }
    private void Swap(Student a,Student b)
    {
        Student c=a;
        a=b;
        b=c;
    }
    private int Pivot(int low, int high, int n)
    {
        low=0;
        high=lists.size()-2;
        Student pi=lists.get(lists.size()-1);
        while (true)
        {
            if(n == 1)
            {
                while (low<high && lists.get(low).getName().compareTo(pi.getName())<0) low++;
                while (low<high && lists.get(high).getName().compareTo(pi.getName())>0) high--;
            }
            else if ( n == 2)
            {
                while (low<high && lists.get(low).getDateOfBirth().compareTo(pi.getDateOfBirth())<0) low++;
                while (low<high && lists.get(high).getDateOfBirth().compareTo(pi.getDateOfBirth())>0) high--;
            }
            else  if (n== 3)
            {
                while (low<high && lists.get(low).getAddress().compareTo(pi.getAddress())<0) low++;
                while (low<high && lists.get(high).getAddress().compareTo(pi.getAddress())>0) high--;
            }
            else if (n == 4)
            {
                while (low<high && lists.get(low).getId().compareTo(pi.getId())<0) low++;
                while (low<high && lists.get(high).getId().compareTo(pi.getId())>0) high--;
            }
            else if(n == 5)
            {
                while (low<high && lists.get(low).getCclass().compareTo(pi.getCclass())<0) low++;
                while (low<high && lists.get(high).getCclass().compareTo(pi.getCclass())>0) high--;
            }
            else if(n == 6)
                {
                    while (low<high && lists.get(low).getMath() < pi.getMath()) low++;
                    while (low<high && lists.get(high).getMath() > pi.getMath()) high--;
                }
            else if(n == 7)
            {
                while (low<high && lists.get(low).getTin() < pi.getTin()) low++;
                while (low<high && lists.get(high).getTin() > pi.getTin()) high--;
            }
            else if(n == 8)
            {
                while (low<high && lists.get(low).getEnglish() < pi.getEnglish()) low++;
                while (low<high && lists.get(high).getEnglish() > pi.getEnglish()) high--;
            }
            else if(n == 9)
            {
                while (low<high && lists.get(low).Avg() < pi.Avg()) low++;
                while (low<high && lists.get(high).Avg() > pi.Avg()) high--;
            }
            if(low>=high) break;
            Swap(lists.get(low),lists.get(high));
            low++;
            high--;

        }
        Swap(lists.get(low),lists.get(high));
        return low;
    }
    public void QuickSort(int low,int high ,int n)
    {
        if (low<high)
        {
            int pi=Pivot(low,high,n);
            QuickSort(low,pi-1,n);
            QuickSort(pi+1,high,n);
        }
    }
    public void Search(int i)
    {
        if (i == 1)
        {
            System.out.println("Nhập tên Cần tìm");
            String ten=new  Scanner(System.in).nextLine();
            System.out.printf("|%30s|%15s|%30s|%10s|%20s|%30s|%10s|%4s|%4s|%10s|\n","Họ tên","Ngáy sinh","Địa chỉ","Giới tính","Mã sinh viên","Email","Lop","Toán","Tin","Tiếng Anh");
            for (Student student: lists)
            {
                if (student.getName().equalsIgnoreCase(ten))
                {
                    student.Output();
                }
            }
        }
        else if (i == 2)
        {
            System.out.println("Nhập Ngáy sinh Cần tìm");
            String _ngaysinh=new  Scanner(System.in).nextLine();
            System.out.printf("|%30s|%15s|%30s|%10s|%20s|%30s|%10s|%4s|%4s|%10s|\n","Họ tên","Ngáy sinh","Địa chỉ","Giới tính","Mã sinh viên","Email","Lop","Toán","Tin","Tiếng Anh");
            for (Student student: lists)
            {
                if (student.getDateOfBirth().equalsIgnoreCase(_ngaysinh))
                {
                    student.Output();
                }
            }
        }
        else if (i == 3)
        {
            System.out.println("Nhập Địa chỉ Cần tìm");
            String _diachi=new  Scanner(System.in).nextLine();
            System.out.printf("|%30s|%15s|%30s|%10s|%20s|%30s|%10s|%4s|%4s|%10s|\n","Họ tên","Ngáy sinh","Địa chỉ","Giới tính","Mã sinh viên","Email","Lop","Toán","Tin","Tiếng Anh");
            for (Student student: lists)
            {
                if (student.getAddress().equalsIgnoreCase(_diachi))
                {
                    student.Output();
                }
            }
        }
        else if (i == 4)
        {
            System.out.println("Nhập Mã sinh viên Cần tìm");
            String _masv=new  Scanner(System.in).nextLine();
            System.out.printf("|%30s|%15s|%30s|%10s|%20s|%30s|%10s|%4s|%4s|%10s|\n","Họ tên","Ngáy sinh","Địa chỉ","Giới tính","Mã sinh viên","Email","Lop","Toán","Tin","Tiếng Anh");
            for (Student student: lists)
            {
                if (student.getId().equalsIgnoreCase(_masv))
                {
                    student.Output();
                }
            }
        }
        else if (i == 5)
        {
            System.out.println("Nhập Lớp Cần tìm");
            String _lop=new  Scanner(System.in).nextLine();
            System.out.printf("|%30s|%15s|%30s|%10s|%20s|%30s|%10s|%4s|%4s|%10s|\n","Họ tên","Ngáy sinh","Địa chỉ","Giới tính","Mã sinh viên","Email","Lop","Toán","Tin","Tiếng Anh");
            for (Student student: lists)
            {
                if (student.getCclass().equalsIgnoreCase(_lop))
                {
                    student.Output();
                }
            }
        }
        else  if (i == 6)
        {
            System.out.println("Nhập Giới tính Cần tìm");
            String _gt=new  Scanner(System.in).nextLine();
            System.out.printf("|%30s|%15s|%30s|%10s|%20s|%30s|%10s|%4s|%4s|%10s|\n","Họ tên","Ngáy sinh","Địa chỉ","Giới tính","Mã sinh viên","Email","Lop","Toán","Tin","Tiếng Anh");
            for (Student student: lists)
            {
                if (student.getGender().equalsIgnoreCase(_gt))
                {
                    student.Output();
                }
            }
        }
    }
    public void DataOutput()
    {
        try
        {

                try
                {
                    File f=new File("D:\\Sinhvien.txt");

                    if (f.exists()) return;
                    else
                    {
                    f.createNewFile();
                    }
                }
                catch (Exception e)
                {
                    System.out.print("Loi:"+e);
                }

            FileOutputStream fos = new FileOutputStream("D:\\Sinhvien.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Student st: lists
                 ) {
                oos.writeObject(st);

            }
            oos.close();
            fos.close();
        }
        catch (Exception e)
        {
            System.out.print("Loi"+e);
        }
    }
    public void DataInput()
    {
        try
        {
            File f=new File("D:\\Sinhvien.txt");
            if (f.exists()==false)
                System.out.print("File Khong ton tai");

        }
        catch (Exception e)
        {
            System.out.print("Loi"+e);
        }
        try
        {
            FileInputStream fis= new FileInputStream("D:\\Sinhvien.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            while (ois.readObject()!=null)
            {
                lists.add((Student) ois.readObject());
            }
        }
        catch (Exception e)
        {
            System.out.print("Loi "+e);
        }
    }
    public int getSizelist()
    {
        return lists.size();
    }
    public void SearchMaxValue(int n)
    {
        if(n == 1)
        {
            float maxValue = lists.get(0).getMath();
            for (Student st: lists)
            {
               if (st.getMath() > maxValue) maxValue=st.getMath();
            }
            System.out.println("Sinh viên có điểm toán cao nhất");
            for (Student st: lists)
            {
                if (st.getMath() == maxValue) st.Output();
            }

        }
        if(n == 2)
        {
            float maxValue = lists.get(0).getTin();
            for (Student st: lists)
            {
                if (st.getTin() > maxValue) maxValue=st.getTin();
            }
            System.out.println("Sinh viên có điểm tin cao nhất");
            for (Student st: lists)
            {
                if (st.getTin() == maxValue) st.Output();
            }

        }
        if(n == 3)
        {
            float maxValue = lists.get(0).getEnglish();
            for (Student st: lists)
            {
                if (st.getEnglish() > maxValue) maxValue=st.getEnglish();
            }
            System.out.println("Sinh viên có điểm tiếng anh cao nhất");
            for (Student st: lists)
            {
                if (st.getEnglish() == maxValue) st.Output();
            }

        }
        if(n == 4)
        {
            float maxValue = lists.get(0).Avg();
            for (Student st: lists)
            {
                if (st.Avg() > maxValue) maxValue=st.Avg();
            }
            System.out.println("Sinh viên có điểm trung bình cao nhất");
            for (Student st: lists)
            {
                if (st.Avg() == maxValue) st.Output();
            }

        }
    }
}
