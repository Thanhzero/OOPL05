package De1_Bai1;

import java.awt.*;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args)
    {
        QLSV qlsv=new QLSV();

        while (true)
        {
            MenuMain();
            switch (new Scanner(System.in).nextInt())
            {
                case 1:
                    qlsv.inputList();
                    break;
                case 2:
                    qlsv.outputList();
                    break;
                case 3:
                    while (true)
                    {
                        MenuSearch();
                        int n = new Scanner(System.in).nextInt();
                        if (n == 7) break;
                        switch (n)
                        {
                            case 1:
                                qlsv.Search(1);
                                break;
                            case 2:
                                qlsv.Search(2);
                                break;
                            case 3:
                                qlsv.Search(3);
                                break;
                            case 4:
                                qlsv.Search(4);
                                break;
                            case 5:
                                qlsv.Search(5);
                                break;
                            case 6:
                                qlsv.Search(6);
                                break;
                            case 7:
                                break;
                            default:
                                System.out.println("Nhập lại");
                                break;
                        }
                    }
                    break;
                case 4:
                    while(true)
                    {
                        MenuSort();
                        int n = new Scanner(System.in).nextInt();
                        if (n == 10) break;
                        switch (n)
                        {
                            case 1:
                                qlsv.QuickSort(0,qlsv.getSizelist(),1);
                                System.out.println("Danh sach sau khi sap xep:");
                                qlsv.outputList();
                                break;
                            case 2:
                                qlsv.QuickSort(0,qlsv.getSizelist(),2);
                                System.out.println("Danh sach sau khi sap xep:");
                                qlsv.outputList();
                                break;
                            case 3:
                                qlsv.QuickSort(0,qlsv.getSizelist(),3);
                                System.out.println("Danh sach sau khi sap xep:");
                                qlsv.outputList();
                            case 4:
                                qlsv.QuickSort(0,qlsv.getSizelist(),4);
                                System.out.println("Danh sach sau khi sap xep:");
                                qlsv.outputList();
                            case 5:
                                qlsv.QuickSort(0,qlsv.getSizelist(),5);
                                System.out.println("Danh sach sau khi sap xep:");
                                qlsv.outputList();
                            case 6:
                                qlsv.QuickSort(0,qlsv.getSizelist(),6);
                                System.out.println("Danh sach sau khi sap xep:");
                                qlsv.outputList();
                            case 7:
                                qlsv.QuickSort(0,qlsv.getSizelist(),7);
                                System.out.println("Danh sach sau khi sap xep:");
                                qlsv.outputList();
                            case 8:
                                qlsv.QuickSort(0,qlsv.getSizelist(),8);
                                System.out.println("Danh sach sau khi sap xep:");
                                qlsv.outputList();
                            case 9:
                                qlsv.QuickSort(0,qlsv.getSizelist(),9);
                                System.out.println("Danh sach sau khi sap xep:");
                                qlsv.outputList();
                            case 10:
                                break;
                        }
                    }
                case 5:
                    MenuSearchMaxValue();
                    int n = new Scanner(System.in).nextInt();
                    if (n == 5) break;
                    switch (n)
                    {
                        case 1:
                            qlsv.SearchMaxValue(1);
                            break;
                        case 2:
                            qlsv.SearchMaxValue(2);
                            break;
                        case 3:
                            qlsv.SearchMaxValue(3);
                            break;
                        case 4:
                            qlsv.SearchMaxValue(4);
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("Moi nhập lại");
                    }
                    break;
                case 6:
                    qlsv.DataOutput();
                    break;
                case 7:
                    qlsv.DataInput();
                    break;
                case 8:
                    exit(0);
                    break;
            }
        }
    }
    public  static  void  MenuMain()
    {
        System.out.println("<---------*Menu*--------->");
        System.out.println("1. Chọn 1 đẻ nhập Student.");
        System.out.println("2. Chọn 2 để In danh sách.");
        System.out.println("3. Chọn 3 để Tìm Kiếm");
        System.out.println("4. Chọn 4 để Sắp xếp");
        System.out.println("5. Chọn 5 để Tìm kiếm giá trị lớn nhất");
        System.out.println("6. Chọn 6 để Lưu file");
        System.out.println("7. CHọn 7 để Đọc file");
        System.out.println("8. CHọn 8 để Thoát");
        System.out.println("<----------------------------->");
    }
    public  static  void MenuSearch() {
        System.out.println("<-----------*Search*---------->");
        System.out.println("1. Chọn 1 đẻ Tim kiếm theo Tên.");
        System.out.println("2. Chọn 2 để Tìm kiếm theo Ngày sinh.");
        System.out.println("3. Chọn 3 để Tìm Kiếm theo Địa chỉ");
        System.out.println("4. Chọn 4 để Tìm Kiếm theo Mã sinh viên");
        System.out.println("5. Chọn 5 để Tìm kiếm theo Lớp");
        System.out.println("6. Chọn 6 để Tìm kiếm theo Giới tính");
        System.out.println("7. CHọn 7 để Thoát");
        System.out.println("<----------------------------->");
    }
    public static void MenuSort()
    {
        System.out.println("<-----------*Sort*---------->");
        System.out.println("1. Chọn 1 đẻ Sắp xếp theo Tên.");
        System.out.println("2. Chọn 2 để Sắp xếp theo Ngày sinh.");
        System.out.println("3. Chọn 3 để Sắp xếp theo Địa chỉ");
        System.out.println("4. Chọn 4 để Sắp xếp theo Mã sinh viên");
        System.out.println("5. Chọn 5 để Sắp xếp theo Lớp");
        System.out.println("6. Chọn 6 để Sắp xếp theo Điểm Toán");
        System.out.println("7. Chọn 7 để Sắp xếp theo Điểm Tin");
        System.out.println("8. Chọn 8 để Sắp xếp theo Điểm Tiếng Anh");
        System.out.println("9. Chọn 9 để Sắp xếp theo Diểm Trung Bình ");
        System.out.println("10. CHọn 10 để Thoát");
        System.out.println("<----------------------------->");
    }
    public static  void  MenuSearchMaxValue()
    {
        System.out.println("<---------*MenuSearchMax*--------->");
        System.out.println("1. Chọn 1 đẻ Điểm toán cao nhất.");
        System.out.println("2. Chọn 2 để Điểm tin cao nhất.");
        System.out.println("3. Chọn 3 để Điểm Tiếng anh cao nhất");
        System.out.println("4. Chọn 4 để Điểm Trung bình cao nhất");
        System.out.println("5. Chọn 5 để Thoát");
        System.out.println("<----------------------------->");
    }
}
