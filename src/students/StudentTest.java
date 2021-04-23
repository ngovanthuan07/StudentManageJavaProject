package students;

import java.util.*;
import java.util.stream.Collectors;

public class StudentTest {
    public ArrayList<Student> students = new ArrayList<>();

    public void input(){
        System.out.print("Nhap vao so luong sinh vien: ");
        int num = new Scanner(System.in).nextInt();
        for (int i = 0; i < num; i++ ){
            System.out.println("Sinh vien "+(i+1));
            Student st = new Student();
            st.inputInfo();
            students.add(st);
        }
    }
    public void output(){
        for(int i = 0; i < students.size(); i++){
            System.out.println("Sinh vien "+(i+1));
            students.get(i).outputInfo();
        }
    }
    public void maxDtb(){
        Student st = new Student();
        st = st.maxStudent(students);
        st.outputInfo();
    }
    public void minDtb(){
        Student st = new Student();
        st = st.minStudent(students);
        st.outputInfo();
    }
    public void sortStudents(){
//        Collections.sort(students,Helper::compareAver);
        Comparator<Student> comparator = ((o1, o2) -> (int) (o1.getDtb() - o2.getDtb()));
        Collections.sort(students,comparator);
        output();
    }
    public void seekStudent(){
        Student newStudent = new Student();
        ArrayList<Student> listStudent = new ArrayList<>();
        listStudent.addAll(newStudent.searchStudent(students));
        System.out.println("Sinh Vien Tim Thay");
        listStudent.forEach(s -> s.outputInfo());
    }

    public void menu(){
        System.out.println("*******************************************");
        System.out.println("Nhap Chuong Trinh Quan Ly Sinh Vien");
        System.out.println("**Chuc nang chinh cua chuong tring**");
        System.out.println("    1. Nhap danh sach sinh vien");
        System.out.println("    2. Xem danh sach sinh vien");
        System.out.println("    3. Sap xep danh sach sinh vien theo diem trung binh");
        System.out.println("    4. Tim sinh vien theo ten");
        System.out.println("    5. Hien thi sinh vien co diem cao nhat");
        System.out.println("    6. Hien thi sinh vien co diem thap nhat");
        System.out.println("    7. Thoat");
        System.out.println("*******************************************");
    }
    public StudentTest(){
        while (true){
            menu();
            System.out.print("Nhap vao vao chuc nang: ");
            int num = new Scanner(System.in).nextInt();
            switch (num){
                case 1:
                    input();
                    break;
                case 2:
                    output();
                    break;
                case 3:
                    sortStudents();
                    break;
                case 4:
                    seekStudent();
                    break;
                case 5:
                    maxDtb();
                    break;
                case 6:
                    minDtb();
                    break;
                default:
                    System.out.println("*********** Chuong trinh ket thuc ***********");
                    return;

            }
        }
    }

    public static void main(String[] args) {
        new StudentTest();
    }
}
