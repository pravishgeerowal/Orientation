import java.util.Scanner;


/**
 * 
 */

/**
 * @author pravish
 *
 */
public class TestBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String inputisbn,inputtitle,inputauthorname; 
		  int inputnopages;
		  
		  Book b1 = new Book();
		  
		  Scanner myScanner = new Scanner(System.in);
		  System.out.println("Enter isbn of book 1:");
		  inputisbn = myScanner.next();
		  
		  System.out.println("Enter title of book 1:");
		  inputtitle = myScanner.next();
		  
		  System.out.println("Enternopages of book 1:");
		  inputnopages = myScanner.nextInt();
		  
		  System.out.println("Enter authorname of book 1:");
		  inputauthorname = myScanner.next();;
		  
		  b1.setisbn(inputisbn);
		  b1.settitle(inputtitle);
		  b1.setnopages(inputnopages);
		  b1.setauthorname(inputauthorname);

		  
		  System.out.println("isbn of book 1:"+b1.getisbn());
		  System.out.println("title of book 1: "+b1.gettitle());
		  System.out.println("nopages of book 1:"+b1.getnopages());
		  System.out.println("authorname of book 1:"+b1.getauthorname());
		  
		  
		  System.out.println(b1.toString());
		  
		  
		  
		  
		  System.out.println("Enter isbn of book 2:");
		  inputisbn = myScanner.next();
		  
		  System.out.println("Enter authorname of book 2:");
		  inputauthorname = myScanner.next();
		  
		  Book b2 = new Book(inputisbn,inputauthorname);
		  System.out.println(b2.toString());
		  
		  
		  
		  
		  System.out.println("Enter isbn of book 3:");
		  inputisbn = myScanner.next();
		  
		  System.out.println("Enter title of book 3:");
		  inputtitle = myScanner.next();
		  
		  System.out.println("Enter nopages of book 3:");
		  inputnopages = myScanner.nextInt();
		  
		  System.out.println("Enter authorname of book 3:");
		  inputauthorname = myScanner.next();
		  
		  Book b3 = new Book(inputisbn,inputtitle,inputnopages,inputauthorname);
		  
		  System.out.println(b3.toString());
		  
		  
		  
		  
		  
				
		    
		  
		  
		  
			  
		 
		
		
		
		
		
		
	}

}
