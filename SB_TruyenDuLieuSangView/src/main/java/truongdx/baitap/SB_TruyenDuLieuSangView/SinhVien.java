package truongdx.baitap.SB_TruyenDuLieuSangView;

import java.time.LocalDate;

public class SinhVien {
	private String mssv;
    private String hosv;
    private String tensv;
    private String gioitinh;
    private LocalDate ngaysinh;
    private String diachi;

	public SinhVien(String mssv, String hosv, String tensv, String gioitinh, LocalDate ngaysinh, String diachi) {
		super();
		this.mssv = mssv;
		this.hosv = hosv;
		this.tensv = tensv;
		this.gioitinh = gioitinh;
		this.ngaysinh = ngaysinh;
		this.diachi = diachi;
	}

	public String getMssv() {
		return mssv;
	}

	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public String getHosv() {
		return hosv;
	}

	public void setHosv(String hosv) {
		this.hosv = hosv;
	}

	public String getTensv() {
		return tensv;
	}

	public void setTensv(String tensv) {
		this.tensv = tensv;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public LocalDate getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(LocalDate ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	
}
