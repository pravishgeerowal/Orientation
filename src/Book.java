/**
 * 
 */

/**
 * @author pravish
 *
 */
public class Book {


		private String isbn;
		private String title;
		private int nopages;
		private String authorname;
				
		public Book () {}
		
		
		public Book (String isbn,String authorname) {
			this.isbn = isbn;
			this.authorname = authorname;
			
		}
		

		public Book (String isbn,String title,int nopages,String authorname) {
			this.isbn = isbn;
			this.title = title;
			this.nopages = nopages;
			this.authorname = authorname;
	}

		
		public String getisbn() {
			return this.isbn;
		}
		
		public String gettitle() {
			return this.title;
		}
		
		public int getnopages() {
			return this.nopages;
		}
		public String getauthorname() {
			return this.authorname; 
		}
		
		
		
		public void setisbn(String isbn) {
			this.isbn= isbn;
		}
		
		public void settitle(String title) {
			this.title = title;
		}
		
		public void setnopages(int nopages) {
			this.nopages= nopages;
		}
		
		public void setauthorname(String authorname) {
			this.authorname=authorname;
		}
		 
		
		public String toString () {
			return(this.isbn+" "+this.title+" "+this.nopages+" "+this.authorname);
		}
		
		
		
}
