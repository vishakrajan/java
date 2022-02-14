package Main;

public class Retail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p = 2;
		double pe = 6;
		double b = 1;
		double pzp = 5;
		double pzpe = 10;
		double pzb = 50;
		double disprz = (p*pzp + pe*pzpe +b*pzb) * 0.5 ;
		double fnlamnt = disprz + disprz*0.1;
		System.out.println(disprz);
		System.out.println(fnlamnt);
	}
	//john walks into a stationary shop to buy 2 pencils, 
	//6 pens and a book. The price of a pen is 10,
	//pencil is 5 and book is 50. There is 10% discount 
	//on all the items and 5% sales tax. Write a program
	//to compute the net amount payable by John.
	//Write a java program to input a number and 
	//print whether the number is even or odd
}

		
