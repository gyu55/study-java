package classTask4;

public class MarketNonMember extends User{
	private double nonMemberDiscount = 0.05;
	private double nonMemberPoint = 0.05;
	
	public MarketNonMember() {;}

	public MarketNonMember(double nonMemberDiscount, double nonMemberPoint) {
		super();
		this.nonMemberDiscount = nonMemberDiscount;
		this.nonMemberPoint = nonMemberPoint;
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
