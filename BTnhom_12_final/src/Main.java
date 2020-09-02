/*******************************************
/** Mô tả chức năng: dùng để nhập xuất thông tin của thí sinh và tìm kiếm thông tin của thí sinh bằng số báo danh
/** Tham số: TS 
/** người viết:  Nguyễn Ra Băng DTH195127
/** 				Nguyễn Thị Kim Ngân DTH195
/**				Thái Ngô Hoàng Khang DTH195144
/**ngày viết
*********************************************/
import java.util.Scanner;

public class Main {
	// hàm xuất thông tin của thí sinh
	 public static void Xuat(KhoiThi ts)
	{
		System.out.printf("----thong tin thi sinh----\n");
		System.out.printf("--SBD cua thi sinh: %d\n",ts.getSoBaoDanh());
		System.out.printf("--Ten thi sinh: %s\n",ts.getHoTen());
		System.out.printf("--Tuoi cua thi sinh: %d\n",ts.getTuoi());
		System.out.printf("--Dia Chi cua thi sinh: %s\n",ts.getDiaChi());
		System.out.printf("--Vung uu tien cua thi sinh: %d\nkhoi thi %s",ts.getUutien(),ts.getChonkhoi());
		//câu lệnh dùng để so sánh các khối thi
		if(ts.getChonkhoi().equals("A")|| ts.getChonkhoi().equals("a"))
		{
			System.out.println("--Thi sinh thi khoi A gom cac mon " +ts.getKhoiA());
		}
		if(ts.getChonkhoi().equals("B")|| ts.getChonkhoi().equals("b"))
		{
			System.out.println("--Thi sinh thi khoi B gom cac mon " +ts.getKhoiB());
		}
		if(ts.getChonkhoi().equals("C")|| ts.getChonkhoi().equals("c"))
		{
			System.out.println("--Thi sinh thi khoi C gom cac mon " +ts.getKhoiC());
		}
		
	}
	 // hàm nhập thông tin thí sinh theo cấu trúc mảng
	public static void NhapDS( int n, KhoiThi[] TS) {
		for (int i=0; i<n ; i++)
		{	
			
			System.out.printf("-------Nhap thong tin Thi sinh Thu --------\n");
			// khai báo các biến tạm
			int sBD; String hoTen;int tuoi; String diachi;int uutien;String khoithi;
			Scanner in = new Scanner(System.in);
			System.out.printf("----Nhap thong tin thi sinh----\n");
			System.out.printf("--Nhap Ten thi sinh:");
			hoTen = in.nextLine();
			System.out.printf("--Nhap tuoi cua thi sinh");
			tuoi = in.nextInt();
			System.out.printf("--Nhap SBD cua thi sinh:");
			sBD = in.nextInt();
			in.nextLine();
			System.out.printf("--Nhap Dia Chi cua thi sinh:");
			diachi = in.nextLine();
			System.out.printf("--Nhap Khoi Thi cua thi sinh:");
			khoithi = in.next();
			System.out.printf("--Nhap Vung uu tien cua thi sinh:");
			uutien = in.nextInt();
			System.out.printf("---------------------------------------------\n");
			TS[i] =  new KhoiThi(sBD,hoTen,tuoi,diachi,uutien,khoithi);
		}
	}	

	//hàm xuất danh thông tin của thí sinh theo danh sách
public static void XuatDS(int n, KhoiThi[] TS) {
		for (int i=0; i<n ; i++)
		{
			System.out.printf("-------thong tin Thi sinh Thu --------\n");
			Xuat(TS[i]);
			
			System.out.printf("---------------------------------------------\n");
		}
	}
//hàm tìm thông tin thí sinh theo số báo danh
public static void findsBD(int n,KhoiThi[] ts,int X){
	for (int i=0; i<n; i++)
	{
		if(ts[i].getSoBaoDanh() == X)
		{
			Xuat(ts[i]);
		}
	}
	
}
//hàm main
	public static void main(String[] args) {
		KhoiThi[] ts = new KhoiThi[100];
		int n ;
		System.out.printf("Nhap so luong Thi sinh: ");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		NhapDS(n,ts);
		XuatDS(n,ts);
		int x;
		System.out.printf("Nhap so bao danh cua thi sinh can tim: ");
		x = in.nextInt();
		findsBD(n, ts, x);
	}

}
