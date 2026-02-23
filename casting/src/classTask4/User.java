package classTask4;

public class User {
	private String name;
	private String phoneNum;
	private int money;
	private int point;
	private int coupon;
	
	public User() {;}

	public User(String name, String phoneNum, int money, int point, int coupon) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
		this.money = money;
		this.point = point;
		this.coupon = coupon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getCoupon() {
		return coupon;
	}

	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}
}
