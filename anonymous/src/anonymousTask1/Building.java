package anonymousTask1;

public class Building extends FormAdapter {
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
		Starbucks jamsil = new Starbucks();
		Starbucks yeoksam = new Starbucks();
		Starbucks shinchon = new Starbucks();
		
		gangnam.register(new FormAdapter() {
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "카페라떼", "녹차라떼", "바닐라 콜드브루"};
			}
			@Override
			public void sell(String menu) {
				if(menu.equals("아메리카노")) {
					System.out.println("무료 행사");
				}else {
					System.out.println(menu + " 판매완료");
				}
			}
			
		});
		jamsil.register(new FormAdapter() {
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "디카페인 아메리카노", "에이드"};
			}
			@Override
			public void sell(String menu) {
				System.out.println(menu + " 판매완료");
			}
		});
		yeoksam.register(new FormAdapter() {
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "녹차라떼", "애플민트티"};
			}
			@Override
			public void sell(String menu) {
				if(menu.equals("아메리카노")) {
					System.out.println("무료 행사");
				}else {
					System.out.println(menu + " 판매완료");
				}
			}
			
		});
		shinchon.register(new FormAdapter() {
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "자몽허니블랙티", "자몽에이드"};
			}
			@Override
			public void sell(String menu) {
				System.out.println(menu + " 판매완료");
			}
		});
		gangnam.getMenus();
		gangnam.sell("아메리카노");
	}
}
