package ThiTieuLuanCuoiKi;

import java.util.*;

public class HangThucPham extends HangHoa {
	private String ngaysanxuat, ngayhethan, nhacungcap; // Ngay san xuat , ngay het han , nha cung cap

	public HangThucPham() {
		super();
		ngaysanxuat = "12-03-2000";
		ngayhethan = "12-03-2010";
		nhacungcap = "ABCD";
	}

	public HangThucPham(String maHanghoa, String tenHanghoa, int slTon, double donGia, double Gia, String ngaysanxuat,
			String ngayhethan,
			String nhacungcap) {
		super(maHanghoa, tenHanghoa, slTon, donGia, Gia);
		this.ngaysanxuat = ngaysanxuat;
		this.ngayhethan = ngayhethan;
		this.nhacungcap = nhacungcap;
	}

	public HangThucPham(HangThucPham obj) {
		super(obj.maHanghoa, obj.tenHanghoa, obj.slTon, obj.donGia, obj.Gia);
		ngaysanxuat = obj.ngaysanxuat;
		ngayhethan = obj.ngayhethan;
		nhacungcap = obj.nhacungcap;
	}

	public void inPut() {
		Scanner x = new Scanner(System.in);
		super.inPut();
		System.out.printf("Nhap Ngay San Xuat :");
		ngaysanxuat = x.nextLine();
		System.out.printf("\nNhap Ngay Het Han :");
		ngayhethan = x.nextLine();
		System.out.printf("\nNhap Nha Cung Cap :");
		nhacungcap = x.nextLine();
	}

	public void outPut() {
		super.outPut();
		System.out.printf(
				"\nNGAY SAN XUAT :" + ngaysanxuat + "\tNGAY HET HAN :" + ngayhethan + "\t NHA CUNG CAP :" + nhacungcap
						+ "\tTONG GIA = " + donGia);
		if (slTon > 0 && ngaysanxuat == ngayhethan) {
			System.out.printf("\nKho Ban !!");
		}
	}

	public double TinhGia() {
		return donGia = slTon * (Gia + Gia * 0.05);
	}
}