import java.util.*;
abstract class DebitPayment{
	int cardNum,cvvNum;
	String bank;
	float amount;
	abstract void showDetails();
}
class Paypal extends DebitPayment{
	String email,pw;
	void getDetails(String email,String pw,String bank,int cardNum,int cvvNum,int amount){
		this.email=email;
		this.pw=pw;
		this.bank=bank;
		this.cardNum=cardNum;
		this.cvvNum=cvvNum;
		this.amount=amount;
	}
	void showDetails(){
		System.out.println("Email: "+email+"\nBank name: "+bank+"\nCard Number:"+cardNum+"\nCVV Number:"+cvvNum);
	}
	void pay(){

	}
}
class Product{
	String name;
	float price;
	void get(String n,int p){
		name=n;
		price=p;
	}

	void show(){
		System.out.println("Product: \nName:"+name+"\nPrice:"+price);
	}
}
class Payment extends Paypal{	
	void receipt(){
		System.out.println("Billed receipt!!!");
		showDetails();
	}
}
class Test{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char ch;
		Payment obj=new Payment();
		obj.getDetails("apsarabk94@gmail.com","abc@1234587","Prabhu Bank",88129989988,12388,200000);
		obj.showDetails();
		System.out.println("Do you want to shop a product? y or n");
		ch=s.next().charAt(0);
		if(ch=='y'||ch=='Y'){
			
			Product p=new Product();
			p.get("Biscuit",20);
			p.show();
			System.out.println("Would u buy or leave? y or n");
			ch=s.next().charAt(0);
			if(ch=='y'||ch=='Y'){
				obj.receipt();
				p.show();
			}
			else{
				System.out.println("You have not buy anything.!!!");
			}
		}
		else{
			System.out.println("Please buy some product.!!");
		}
	}
}