/* Assignment 9.1: Program to create a class HDTV with the properties:
	• Brandname
	• Size
   Create Another class having an ArrayList and add 3 objects of HDTV into it.
   Display HDTV objects in sorted order of size (Use Comparator)
*/

import java.util.*;	// import utility for arraylist
class SizeComparator implements Comparator {	// sizeComparator class implements interface Comparator

	public int compare(Object o1, Object o2) {
		HDTV h1 = (HDTV)o1;
		HDTV h2 = (HDTV)o2;

		if(h1.size == h2.size){
		return 0;
		}
		else if(h1.size > h2.size) {
		return 1;
		}
		else {
		return -1;
		}
	}
}

class HDTV {	
	String brandname;
	int size;

	public HDTV(String brandname, int size){	// HDTV constructor to assign value passed
	 	this.brandname = brandname;
		this.size = size;
	}
}

class TVTest {

	public static void main(String[] args) {

		// Object of HDTV
		HDTV t1 = new HDTV("Samsung",55);	
		HDTV t2 = new HDTV("SONY",36);
		HDTV t3 = new HDTV("Toshiba",42);

		ArrayList<HDTV> al = new ArrayList<HDTV>();	// Array list of generic type HDTV object

		// Add to list
 		al.add(t1);
 		al.add(t2);
 		al.add(t3);

		Collections.sort(al,new SizeComparator()); 	// Collection inbuilt sort used by using arraylist and user defined size comparator class

		Iterator itr = al.iterator();	// Iterator to fetch in iterations.

 		while (itr.hasNext()){	// Check if an entry exist
			HDTV h = (HDTV)itr.next();	// fetch next
			System.out.println(h.brandname + " " + h.size);	// print
		}
 	}
}