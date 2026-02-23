package classTask4;

public class MarketMember extends User{
	private double memberDiscount = 0.3;
	private double memberPoint = 0.1;
	
	
	public MarketMember() {;}


	public MarketMember(double memberDiscount, double memberPoint) {
		super();
		this.memberDiscount = memberDiscount;
		this.memberPoint = memberPoint;
	}


	public double getMemberDiscount() {
		return memberDiscount;
	}


	public void setMemberDiscount(double memberDiscount) {
		this.memberDiscount = memberDiscount;
	}


	public double getMemberPoint() {
		return memberPoint;
	}


	public void setMemberPoint(double memberPoint) {
		this.memberPoint = memberPoint;
	}

}
