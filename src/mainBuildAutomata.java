import java.util.ArrayList;
import java.util.Scanner;

public abstract class mainBuildAutomata {
	static ArrayList<String[]> list = new ArrayList<String[]>();
	static String s;
	
	public static void main(String[] args) {
		
		while (true) {
			Scanner scanS = new Scanner(System.in);
			System.out.println("String: ");
			s = scanS.next();
			
			if(s.equals("end")) {
				break;
			}
			
			prepareAutomat3();
			executeAutomat();
		}
	}
	
	static void executeAutomat(){
		BuildAutomata auto = new BuildAutomata(list, s);
		
		if(auto.accepted) {
			System.out.println("'" + s + "' -> akzeptiert");
		}else {
			System.out.println("'" + s + "' -> NICHT akzeptiert");
		}
		System.out.println("");
	}
	
	static void prepareAutomat1(){
		list.clear();
		String[] arr0 = { "q0", "q0", "q2", "f" };
		list.add(arr0);
		String[] arr1 = { "q1", "q0", "q2", "t" };
		list.add(arr1);
		String[] arr2 = { "q2", "q1", "q2", "t" };
		list.add(arr2);
	}
	
	static void prepareAutomat2(){
		list.clear();
		String[] arr0 = { "q0", "q1", "q5", "f" };
		list.add(arr0);
		String[] arr1 = { "q1", "q4", "q2", "f" };
		list.add(arr1);		
		String[] arr2 = { "q2", "q3", "q1", "t" };
		list.add(arr2);
		String[] arr3 = { "q3", "q0", "q4", "t" };
		list.add(arr3);
		String[] arr4 = { "q4", "q5", "q2", "f" };
		list.add(arr4);
		String[] arr5 = { "q5", "q1", "q2", "t" };
		list.add(arr5);
	}
	
	static void prepareAutomat3(){
		list.clear();
		String[] arr0 = { "q0", "q2", "q4", "f" };
		list.add(arr0);
		String[] arr7 = { "q1", "q13", "q34", "f" };
		list.add(arr7);
		String[] arr1 = { "q2", "q3", "q3", "f" };
		list.add(arr1);
		String[] arr2 = { "q3", "q2", "q1", "t" };
		list.add(arr2);
		String[] arr3 = { "q34", "q23", "q13", "t" };
		list.add(arr3);
		String[] arr4 = { "q23", "q23", "q13", "t" };
		list.add(arr4);
		String[] arr5 = { "q13", "q123", "q134", "t" };
		list.add(arr5);
		String[] arr6 = { "q123", "q123", "q134", "t" };
		list.add(arr6);
		String[] arr8 = { "q134", "q123", "q134", "t" };
		list.add(arr8);
	}
		
	static void prepareAutomat4(){
		list.clear();
		String[] arr0 = { "q0", "q0", "q2", "q2", "f" };
		list.add(arr0);
		String[] arr1 = { "q1", "q0", "q2", "q0", "t" };
		list.add(arr1);
		String[] arr2 = { "q2", "q1", "q2", "q1", "t" };
		list.add(arr2);
	}
	
}
