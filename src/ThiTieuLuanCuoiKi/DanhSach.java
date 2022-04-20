package ThiTieuLuanCuoiKi;

import java.util.ArrayList;
import java.util.*;
import java.util.*;

public class DanhSach {
    ArrayList<HangHoa> ds;
    Scanner x = new Scanner(System.in);

    public DanhSach() {
        ds = null;
        ds = new ArrayList<HangHoa>();
    }

    public void adds(HangHoa x) {
        ds.add(x);
    }

    public void inPutDanhSach(int x) {
        HangHoa a;
        if (x == 1) {
            a = new HangThucPham();
            a.inPut();
            ds.add(a);
        } else if (x == 2) {
            a = new HangDienMay();
            a.inPut();
            ds.add(a);
        } else if (x == 3) {
            a = new HangSanhSu();
            a.inPut();
            ds.add(a);
        }
    }

    public void outPutDanhSach(int x) {
        if (x == 1) {
            for (int i = 0; i < ds.size(); i++) {
                if (ds.get(i) instanceof HangThucPham) {
                    ds.get(i).outPut();
                }
            }
        } else if (x == 2) {
            for (int i = 0; i < ds.size(); i++) {
                if (ds.get(i) instanceof HangDienMay) {
                    ds.get(i).outPut();
                }
            }
        } else if (x == 3) {
            for (int i = 0; i < ds.size(); i++) {
                if (ds.get(i) instanceof HangSanhSu) {
                    ds.get(i).outPut();
                }
            }
        }
    }

    public void Xoa_Suu() {
        String k = x.nextLine();
        for (int i = 0; i < ds.size(); i++) {

        }
    }

    public void TimKiem() {
        String k = x.nextLine();
        for (int i = 0; i < ds.size(); i++) {
        }
    }
}