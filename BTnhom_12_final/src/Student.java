import java.util.Scanner;
import java.io.*;
import java.lang.*;
/**
 * @author NBHunter
 *
 */
public class Student {
	// khai báo các biến trong lớp student
	private int soBaoDanh;
	private String HoTen;
	private int Tuoi;
	private String DiaChi;
	private int Uutien;
    
    
	
    // khai báo hàm getter và setter
	public int getSoBaoDanh() {
		return soBaoDanh;
	}

	public void setSoBaoDanh(int soBaoDanh) {
		this.soBaoDanh = soBaoDanh;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public int getTuoi() {
		return Tuoi;
	}

	public void setTuoi(int tuoi) {
		Tuoi = tuoi;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public int getUutien() {
		return Uutien;
	}

	public void setUutien(int uutien) {
		Uutien = uutien;
	}
	//constructor khong co tham so
	public Student() {
		super();
	}
	//contructor co tham số
	public Student(int sBD, String hoTen,int tuoi, String diachi,int uutien)
	{
		super ();
		soBaoDanh = sBD;
		HoTen = hoTen;
		Tuoi = tuoi;
		DiaChi = diachi;
		Uutien = uutien;
	}
	
}