package students;

import java.util.Scanner;

public class Person {
    private Scanner keyboard = new Scanner(System.in);
    private String ten;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;

    public Person(String ten, String gioiTinh, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public Person() {
    }

    public Scanner getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Scanner keyboard) {
        this.keyboard = keyboard;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void inputInfo(){
        System.out.println("Nhap vao ten: ");
        ten = keyboard.nextLine();
        System.out.println("Nhap vao gioi tinh");
        gioiTinh = keyboard.nextLine();
        System.out.println("Nhap vao ngay sinh");
        ngaySinh = keyboard.nextLine();
        System.out.println("Nhap vao dia chi");
        diaChi = keyboard.nextLine();
    }
    public void outputInfo(){
        System.out.println("Tên : "+ ten);
        System.out.println("Gioi tinh: "+ gioiTinh);
        System.out.println("Ngay sinh: "+ ngaySinh);
        System.out.println("Dia chi: "+ diaChi);
    }

}
