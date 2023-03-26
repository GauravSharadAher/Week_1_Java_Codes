import java.util.*;
public class BankAccount {
	
	String name;
	float balance;
	int accNo;
	static int iRate;
	int pincode;
	int count=100;
	
	{
		count=count+1;
		accNo=count;
	}

	public BankAccount(String name, int accNo, float balance, int pincode) {
		super();
		this.name = name;
		this.balance = balance;
		this.accNo = accNo;
		this.pincode = pincode;
	}
	
	public BankAccount() {
		balance=0;
	}
	
	public void depositMoney() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter account no: ");
		accNo=in.nextInt();
		System.out.println("Enter Amount to deposit : ");
		float depo = in.nextFloat();
		balance = depo+balance;
		System.out.println("Money deposited Sucessfully!! in " + accNo + " Account number");
		System.out.println(balance + " added in your Account");
	}
	
	
	public void withdrawMoney() {
		Scanner in = new Scanner(System.in);
		float sub;
		System.out.println("Enter account no: ");
		accNo=in.nextInt();
		System.out.println("Enter Amount  to withdraw : ");
		sub=in.nextFloat();
		if(balance<0 || sub>balance) {
			System.out.println("Insufficent fund!! , Please deposit some money");
			System.out.println("Current balance " + balance);
		}else {
			balance=balance-sub;
			System.out.println(sub + " withdrawn Sucessfully  from Account no" +accNo);
			System.out.println("Current balance " + balance);
		}
	}
	
	public void createAccount() {
		Scanner in = new Scanner(System.in);
		System.out.println("*****WELCOME TO OUR BANK*******8");
		System.out.print("Enter your name: ");
		name=in.nextLine();
		System.out.print("Enter pincode: " );
		pincode = in.nextInt();
		balance=0;
		System.out.println("Account created!! Sucessfully");
		System.out.println("Thankyou for Creating Account");
	
	}
		
	public void displayInfo() {
		int input=1;
		Scanner in = new Scanner(System.in);
		System.out.println("Name " + name);
		System.out.println("Account number " + accNo);
		System.out.println("Pincode " + pincode);
		System.out.println();
		System.out.println("To check Balance Press the  1");
		if(input==in.nextInt()) {
			System.out.println("Available Balance : " + balance);
		}else {
			System.out.println("Invalid input");
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount a = new BankAccount();
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println();
			System.out.println("*******Welcome to our bank*******");
			System.out.println("1.Create Account");
			System.out.println("2.Display information");
			System.out.println("3.Deposit Money");
			System.out.println("4.Withdraw Money");
			System.out.println("5.Exit");
			int input;
			switch(input=in.nextInt()) {
			case 1:
					a.createAccount();
					break;
			case 2:
//				if(input==1) {
//					System.out.println("Create Account first:");
//					break;
//				}else {
					a.displayInfo();
					break;
					//}
			case 3:
//				if(input=1) {
//					System.out.println("Create Account first:");
//					break;
//					}else {
					a.depositMoney();
					break;
					//}
				
			case 4:
//				if(input!=1) {
//					System.out.println("Create Account first:");
//					break;
//				}else {
					a.withdrawMoney();
					break;
					//}
			case 5 :
				System.out.println("Bank Exit,Thankyou visit again");
				System.exit(0);
				break;
			default:
					System.out.println("Invaild input");
		}
	

		}
		}
	}
