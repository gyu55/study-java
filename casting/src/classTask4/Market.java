package classTask4;

public class Market {
	String name;
	Product[] products = new Product[5];
	int productCount = 0;
	
	
	public Market() {;}

	public Market(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void register(Product product) {
		if(productCount < 5) {
			products[productCount] = product;
			System.out.println("[" + products[productCount].getName() + "]" + "상품 등록을 완료했습니다.");
			productCount++;
		}else {
			System.out.println("등록할 수 있는 상품의 개수를 초과했습니다.");
		}
	}
	
	public void memberSell(MarketMember user, Product product) {
		for(int i = 0; i < products.length; i++) {
			int memberPrice = (int)(products[i].getPrice());
			if(user.getCoupon() == 10) {
				System.out.println("쿠폰사용!\n상품 가격(회원가): 0원");
				user.setCoupon(0);
				break;
			}
			if(products[i].equals(product) && products[i].getInventory() > 0) {
				System.out.println("상품 가격(회원가): " + (int)(memberPrice - (memberPrice * user.getMemberDiscount())));
				products[i].setInventory(products[i].getInventory() - 1);
				System.out.println("해당 상품의 남은 재고: " + products[i].getInventory());
				user.setMemberPoint(user.getMemberPoint() + (products[i].getPrice() * user.getMemberPoint()));
				user.setCoupon(user.getCoupon() + 1);
				break;
			}else if(products[i].equals(product) || products[i].getInventory() < 0){
				System.out.println("해당 제품의 재고가 부족합니다. 대단히 죄송합니다.");
				break;
			}else {
				System.out.println("잘못된 접근입니다.");
				break;
			}
		}
	}
	public void nonMemberSell(MarketNonMember user, Product product) {
		for(int i = 0; i < products.length; i++) {
			int nonMemberPrice = (int)products[i].getPrice();
			if(products[i].equals(product) && products[i].getInventory() > 0) {
				if(user.getCoupon() == 10) {
					System.out.println("쿠폰사용!\n상품 가격(비회원가): 0원");
					user.setCoupon(0);
					break;
				}
				System.out.println("상품 가격(비회원가): " + (int)(nonMemberPrice - (nonMemberPrice * user.getNonMemberDiscount())));
				products[i].setInventory(products[i].getInventory() - 1);
				System.out.println("해당 상품의 남은 재고: " + products[i].getInventory());
				user.setNonMemberPoint(user.getNonMemberPoint() + (products[i].getPrice() * user.getNonMemberPoint()));
				user.setCoupon(user.getCoupon() + 1);
				break;
			}else if(products[i].equals(product) || products[i].getInventory() < 0){
				System.out.println("해당 제품의 재고가 부족합니다. 대단히 죄송합니다.");
				break;
			}else {
				System.out.println("잘못된 접근입니다.");
				break;
			}
		}
	}
	public void showMemberPoint(MarketMember user) {
		System.out.println(user.getName() + "님의 포인트 : " + (int)user.getMemberPoint());
		System.out.println("쿠폰 수량 = " + user.getCoupon());
	}
	public void showNonMemberPoint(MarketNonMember user) {
		System.out.println(user.getName() + "님의 포인트 : " + (int)user.getNonMemberPoint());
		System.out.println("쿠폰 수량 = " + user.getCoupon());
	}
}
