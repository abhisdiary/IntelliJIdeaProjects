public class ProductClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare Product object
		Product myProduct;
		
		//instantiation
		myProduct = new Product(-1.29, "pencil", 40);
		System.out.println(myProduct);

		double stockValue = myProduct.totalStockPrice();
		System.out.println(stockValue);
	}

}
