package framework;
import java.util.*;
public class Create {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Customlist<Integer> list=new Customlist<Integer>();
		System.out.println("Initial list:");
		System.out.println(list);
		
		System.out.println("Number of elements you want to add??");
		int num=sc.nextInt();
		System.out.println("enter elements:");
		for(int i=0;i<num;i++) {
			int add=sc.nextInt();
			list.add(add);
		}
		System.out.println("List after adding elements:");
		System.out.println(list);
		
		System.out.println("enter index to be removed:");
		int rmvElement;
		rmvElement=sc.nextInt();
		list.remove(rmvElement);
		System.out.println("List after removing elements:"+list);
		
		System.out.println("enter an index to know the value:");
		int ind=sc.nextInt();
		System.out.println("value in list at index "+ind+":"+list.fetch(ind));
		
		System.out.println("Final List size="+list.size());
		
		sc.close();
	}
}
