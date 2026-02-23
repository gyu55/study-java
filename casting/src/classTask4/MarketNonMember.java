package classTask4;

public class MarketNonMember extends User{
	private double nonMemberDiscount = 0.05;
	private double nonMemberPoint = 0.05;
	
	public MarketNonMember() {;}

	public MarketNonMember(String name, String phoneNum, int money, int point, int coupon) {
		super(name, phoneNum, money, point, coupon);
	}

	public double getNonMemberDiscount() {
		return nonMemberDiscount;
	}

	public void setNonMemberDiscount(double nonMemberDiscount) {
		this.nonMemberDiscount = nonMemberDiscount;
	}

	public double getNonMemberPoint() {
		return nonMemberPoint;
	}

	public void setNonMemberPoint(double nonMemberPoint) {
		this.nonMemberPoint = nonMemberPoint;
	}
	
}
