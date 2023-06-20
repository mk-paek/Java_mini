package test;

public class ProductEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product<Tv, String> p1 = new Product<>();
		p1.setKind(new Tv());
		p1.setModel("Smart TV");
		Tv tv = p1.getKind();
		String tvModel = p1.getModel();
	}

}
