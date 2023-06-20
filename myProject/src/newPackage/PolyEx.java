package newPackage;

import java.util.Vector;

public class PolyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		
		Tv t = new Tv();
		Computer com = new Computer();
		MobilePhone m = new MobilePhone();
		
		c.buy(t);
		c.buy(com);
		c.buy(m);
		c.summary();
		System.out.println("=====================================");
		c.refund(com);
		c.summary();
	}

}


class Product {
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product() {
		price = 0;
		bonusPoint = 0;
	}
}

class Tv extends Product {
	
	Tv() { super(100); }
	//public String toString() { return "Tv"; }	
}

class Computer extends Product {
	
	Computer() { super(200); }
	//public String toString() { return "Computer"; }	
}

class MobilePhone extends Product {
	
	MobilePhone() { super(150); }
	//public String toString() { return "MobilePhone"; }	
}

class Customer {
	int money = 1000;
	int bonusPoint = 0;
	
	Vector item = new Vector();
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("돈이 부족하여 살 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p + "을 구입하였습니다.");
	}
	
	void refund(Product p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "를 반품하였습니다.");
		} else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("구입한 제품이 없습니다.");
		}
		
		for(int i = 0; i < item.size(); i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p.toString() : ", " + p;
		}
		System.out.println("구입하신 상품의 총 금액은 " + sum + " 입니다.");
		System.out.println("구입하신 제품 목록은 " + itemList + " 입니다.");
	}
	
	
}











