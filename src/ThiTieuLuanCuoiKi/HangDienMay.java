package ThiTieuLuanCuoiKi;

import java.util.*;

public class HangDienMay extends HangHoa {
	private String tgBaohanh, congsuat; // thoi gian bao hanh, cong suat

	public HangDienMay() {
		super();
		tgBaohanh = "5 nam";
		congsuat = "10kw";
	}

	public HangDienMay(String maHangHoa, String tenHangHoa, int slTon, double donGia, double Gia, String tgBaohanh,
			String congsuat) {
		super(maHangHoa, tenHangHoa, slTon, donGia, Gia);
		this.tgBaohanh = tgBaohanh;
		this.congsuat = congsuat;
	}

	public HangDienMay(HangDienMay obj) {
		super(obj.maHanghoa, obj.tenHanghoa, obj.slTon, obj.donGia, obj.Gia);
		tgBaohanh = obj.tgBaohanh;
		congsuat = obj.congsuat;
	}

	public void inPut() {
		Scanner x = new Scanner(System.in);
		super.inPut();
		System.out.printf("Nhap Thoi Gian Bao Hanh :");
		tgBaohanh = x.nextLine();
		System.out.printf("\nNhap Cong Suat :");
		congsuat = x.nextLine();
	}

	public void outPut() {
		super.outPut();
		System.out.printf("\nTHOI GIAN BAO HANH :" + tgBaohanh + "\tCONG SUAT :" + congsuat + "\tTONG GIA = " + donGia);
		if (slTon < 3) {
			System.out.printf("\nBan Duoc !!");
		}
	}

	public double TinhGia() {
		return donGia = slTon * (Gia + Gia * 0.1);
	}
}
