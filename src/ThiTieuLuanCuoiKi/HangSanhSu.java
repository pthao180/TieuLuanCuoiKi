package ThiTieuLuanCuoiKi;

import java.util.*;

public class HangSanhSu extends HangHoa {
	private String nhasanxuat, ngaynhapkho; // nha san xuat, ngay nhap kho

	public HangSanhSu() {
		super();
		nhasanxuat = "ABC";
		ngaynhapkho = "12-03-2014";
	}

	public HangSanhSu(String maHanghoa, String tenHanghoa, int slTon, double donGia, double Gia, String nsx,
			String nnk) {
		super(maHanghoa, tenHanghoa, slTon, donGia, Gia);
		this.nhasanxuat = nhasanxuat;
		this.ngaynhapkho = ngaynhapkho;
	}

	public HangSanhSu(HangSanhSu obj) {
		super(obj.maHanghoa, obj.tenHanghoa, obj.slTon, obj.donGia, obj.Gia);
		nhasanxuat = obj.nhasanxuat;
		ngaynhapkho = obj.ngaynhapkho;
	}

	public void inPut() {
		Scanner x = new Scanner(System.in);
		super.inPut();
		System.out.printf("Nhap Nha San Xuat :");
		nhasanxuat = x.nextLine();
		System.out.printf("\nNhap Ngay Nhap Kho :");
		ngaynhapkho = x.nextLine();
	}

	public void outPut() {
		super.outPut();
		System.out
				.printf("\nNHA SAN XUAT :" + nhasanxuat + "\tNGAY NHAP KHO :" + ngaynhapkho + "\tTONG GIA = " + donGia);
	}

	public double TinhGia() {
		return donGia = slTon * (Gia + Gia * 0.1);
	}
}
