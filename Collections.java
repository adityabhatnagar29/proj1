import java.util.*;
public class Collections {

	private static Object Scanner;

	public static void main(String[] args) {
	Set<Integer> s1 = new HashSet<>();
	s1.add(10);
	s1.add(45);
	s1.add(50);
	s1.add(15);
	System.out.println(s1);
	//s1.remove(s1);
    Set<Integer>s2= new LinkedHashSet<>();
    s2.add(5);
    s2.add(17);
    s2.add(60);
    s2.add(23);
    System.out.println(s2);
    Set<Integer>s3= new TreeSet<>();
    s3.add(23);
    s3.add(35);
    s3.add(41);
    s3.add(-1);
    System.out.println(s3);
    for(int i=0;i<=5;i++){
    	
    }
    
    
	}

}
