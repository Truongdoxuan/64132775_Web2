package truongdx.baitap.TongHopGK.Models;

public class SinhVien {
	private String mssv;
    private String hotensv;
    private Double diemTB;
	
    public SinhVien(String mssv, String hotensv, Double diemTB) {
		super();
		this.mssv = mssv;
		this.hotensv = hotensv;
		this.diemTB = diemTB;
	}

	public String getMssv() {
		return mssv;
	}

	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public String getHotensv() {
		return hotensv;
	}

	public void setHotensv(String hotensv) {
		this.hotensv = hotensv;
	}

	public Double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(Double diemTB) {
		this.diemTB = diemTB;
	}
	  
}
