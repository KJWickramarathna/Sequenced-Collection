import java.util.LinkedList;
import java.util.SequencedCollection;

public class Ex{
	public Ex(){
		SequencedCollection sc = new LinkedList();
		sc.addFirst(10);
		sc.addFirst(7);
		sc.addFirst(8);
		System.out.println(sc.getFirst());
		System.out.println(sc.removeLast());
		System.out.println(sc);
		System.out.println(sc.reversed());		
	}
	public static void main(String[]args){
		new Ex();
	}
}	
				