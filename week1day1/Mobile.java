package week1day1;

public class Mobile {
	String mobileBrandname = "Vivo";
	char mobileLogo = 'V'; 
	short noOfmobilePiece = 1900;
	int modelNumder = 765578954;
	long mobiliemeiNumber = 7547544857854439868L;
	float mobilePrice = 10000.55F;
	boolean isDamage = false;
	private String modelNumber;
	public static void main(String[] args) {
		Mobile details = new Mobile(); 
		System.out.println("Brand Name ="+details.mobileBrandname);
		System.out.println("Mobile Logo ="+details.mobileLogo);
		System.out.println("Piece ="+details.noOfmobilePiece);
		System.out.println("Model Number ="+details.modelNumber);
		System.out.println("imei Number="+details.mobiliemeiNumber);
		System.out.println("Pice ="+details.mobilePrice);
		System.out.println("Is Damage ="+details.isDamage);
	}

}
