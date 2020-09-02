import java.util.Scanner;

public class KhoiThi extends Student{
	// khai báo các biến trong lớp student
	private String KhoiA = "Toan, Ly, Hoa";
	private String KhoiB = "Toan, Hoa, Sinh";
	private String KhoiC = "Van, Su, Dia";
	private String Chonkhoi ;
	// khai báo hàm getter và setter
	public String getChonkhoi() {
		return Chonkhoi;
	}
	public void setChonkhoi(String chonkhoi) {
		Chonkhoi = chonkhoi;
	}
	public String getKhoiA() {
		return KhoiA;
	}
	public void setKhoiA(String khoiA) {
		KhoiA = khoiA;
	}
	public String getKhoiB() {
		return KhoiB;
	}
	public void setKhoiB(String khoiB) {
		KhoiB = khoiB;
	}
	public String getKhoiC() {
		return KhoiC;
	}
	public void setKhoiC(String khoiC) {
		KhoiC = khoiC;
	}
	//contructor không có tham số
	public KhoiThi() {
		super();
	}
	//contructor có tham số
	public KhoiThi(int sBD, String hoTen,int tuoi, String diachi,int uutien,String khoithi) {
		super(sBD,hoTen,tuoi,diachi,uutien);// biến gọi contructor của lớp cha
		
		Chonkhoi = khoithi;
	}
	

}
