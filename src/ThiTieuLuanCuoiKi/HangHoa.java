package ThiTieuLuanCuoiKi;

import java.util.*;

abstract public class HangHoa {
    protected String maHanghoa, tenHanghoa;
    protected int slTon;
    protected double donGia, Gia;

    public HangHoa() {
        maHanghoa = "a01";
        tenHanghoa = "A";
        slTon = 10;
        donGia = 5000;
        Gia = 4900;
    }

    public HangHoa(String maHanghString, String tenHanghString, int slTon, double donGia, double Gia) {
        this.maHanghoa = maHanghoa;
        this.tenHanghoa = tenHanghoa;
        this.slTon = slTon;
        this.donGia = donGia;
        this.Gia = Gia;
    }

    public HangHoa(HangHoa obj) {
        maHanghoa = obj.maHanghoa;
        tenHanghoa = obj.tenHanghoa;
        slTon = obj.slTon;
        donGia = obj.donGia;
        Gia = obj.Gia;
    }

    public void inPut() {
        Scanner x = new Scanner(System.in);

        System.out.printf("Nhap Ma Hang Hoa :");
        maHanghoa = x.nextLine();
        System.out.printf("\nNhap Ten Hang Hoa :");
        tenHanghoa = x.nextLine();
        System.out.printf("\nNhap So Luong Ton Kho:");
        slTon = x.nextInt();
        System.out.printf("\nNhap Gia :");
        Gia = x.nextDouble();
    }

    public void outPut() {
        System.out.printf("\nMA HANG :" + maHanghoa + "\tTEN HANG :" + tenHanghoa + "\t SO LUONG TON :" + slTon
                + "\tGIA :" + Gia);
    }

    abstract double TinhGia();
}