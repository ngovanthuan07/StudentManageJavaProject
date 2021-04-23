package students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Student extends Person {
    private String msv;
    private double dtb;
    private String email;

    public Student(String ten, String gioiTinh, String ngaySinh, String diaChi, String msv, double dtb, String email) {
        super(ten, gioiTinh, ngaySinh, diaChi);
        this.msv = msv;
        this.dtb = dtb;
        this.email = email;
    }
    public Student(){};
    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void inputInfo() {
        String emailreg = "^[\\w-]+@([\\w- ]+\\.)+[\\w-]+$";
        boolean emailCheck;
        do{
            System.out.println("Nhap vao ma sinh vien: ");
            msv = getKeyboard().nextLine();
            if(msv.length() != 8 || msv.contains(" ")){
                System.err.println("Nhap lai ma sinh vien");
            }
        }while (msv.length() != 8 || msv.contains(" "));
        super.inputInfo();

        do{
            try {
                System.out.println("Nhap vao diem trung binh:");
                dtb = Double.parseDouble(getKeyboard().nextLine());
            }
            catch (Exception e){
                System.out.println(""+ e.getMessage());
            }

            if(dtb < 0 || dtb > 10){
                System.err.println("Nhap lai diem trung binh");
            }
        }while (dtb < 0 || dtb > 10);

        do{

            System.out.println("Nhap vao Email: ");
            email = getKeyboard().nextLine();
            emailCheck = email.matches(emailreg);
            if((!emailCheck) == true){
                System.err.println("Nhap lai Email: ");
            }
        }while(!emailCheck);
    }

    @Override
    public void outputInfo() {
        System.out.println("Ma sinh vien: "+msv);
        super.outputInfo();
        System.out.println("Diem trung binh: "+dtb);
        System.out.println("Email: "+email);
    }
    public Student maxStudent(ArrayList<Student> student){
        Student maxSt = student.stream().max(Comparator.comparing(st ->{
            return st.getDtb();
        })).get();
        return maxSt;
    }
    public Student minStudent(ArrayList<Student> student){
        Student maxSt = student.stream().min(Comparator.comparing(st ->{
            return st.getDtb();
        })).get();
        return maxSt;
    }
    public ArrayList searchStudent(ArrayList<Student> student){
        System.out.println("Nhap van ten can tim: ");
        String name = getKeyboard().nextLine();
        ArrayList<Student> st = new ArrayList<>();
        st = (ArrayList<Student>) student.stream().filter(s -> {
            if(s.getTen().indexOf(name) != -1) {
                return true;
            }
            return false;
        }).collect(Collectors.toList());

        return st;
    }
}
