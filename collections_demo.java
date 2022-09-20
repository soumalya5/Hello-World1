package co.selenium.webdriver;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.*;

class set_demo {
	private Set<String> s= new LinkedHashSet<String>();
	private String name;
	set_demo(Set<String> a,String name){
		this.s.addAll(a);
		this.name=name;
	}
	public void getData(){
		System.out.println(this.name);
		for(String i:this.s){
			System.out.println(i);
		}
	}
	
}
class map_demo extends set_demo{
	private Map<String, Integer> m= new TreeMap<String, Integer>();
	map_demo(Set<String> a, String name, Map<String,Integer> m1){
		super(a,name);
		this.m.putAll(m1);
	}
	public void getData(){
		super.getData();
		for(Map.Entry<String, Integer> k: m.entrySet()){
			System.out.println(k.getKey()+" "+k.getValue());
			
		}
	}
}

public class collections_demo {
	
	public static void main(String[] args){
		
		List<String> a=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of entry in set");
		int n=sc.nextInt();
		String str="";
		for(int i=0;i<n; i++){
			System.out.println("Enter str for list");
			str=sc.nextLine();
			if(!a.contains(str)){
				a.add(str);
			}
		}
		System.out.println(a);
		Set<String> s1=new LinkedHashSet(a);
		Map<String,Integer> m= new TreeMap(){{put("a",1); put("b",2); put("c", 3); }};
		map_demo x=new map_demo(s1, "Soumalya", m);
		x.getData();
	}

}