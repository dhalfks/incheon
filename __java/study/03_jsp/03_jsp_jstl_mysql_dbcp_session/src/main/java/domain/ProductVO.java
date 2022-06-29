package domain;

public class ProductVO {
	private int pno;
	private String pname;
	private double price;
	private String regdate;
	private String madeby;
	
	public ProductVO() {}
	// insert
	public ProductVO(String pname, double price, String madeby) {
		this.pname = pname;
		this.price = price;
		this.madeby = madeby;
	}
	// selectList
	public ProductVO(int pno, String pname, String regdate) {
		this.pno = pno;
		this.pname = pname;
		this.regdate = regdate;
	}
	// update
	public ProductVO(int pno, String pname, double price, String madeby) {
		this(pname, price, madeby);
		this.pno = pno;
	}
	// selectOne
	public ProductVO(int pno, String pname, double price, String regdate, String madeby) {
		this(pno, pname, price, madeby);
		this.regdate = regdate;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getMadeby() {
		return madeby;
	}
	public void setMadeby(String madeby) {
		this.madeby = madeby;
	}
}
