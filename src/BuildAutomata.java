import java.util.ArrayList;

public class BuildAutomata {
	ArrayList<String[]> list = new ArrayList<String[]>();
	String s;
	int numOfChars = 0;
	boolean accepted = false;

	// input alphabet = a,b,c,d,...,x,y,z
	BuildAutomata(ArrayList<String[]> pList, String pS) {
		list = pList;
		s = pS;
		numOfChars = (list.get(0).length - 2);
		accepted = automata();
	}

	boolean automata() {
		Integer current = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < numOfChars; j++) {
				if (s.charAt(i) == (char) (j + 97)) {
					current = searchForString(list.get(current)[j + 1]);
				}
			}
		}
		if (list.get(current)[(list.get(1).length) - 1].equals("t")) {
			return true;
		}
		return false;
	}

	int searchForString(String pS) {
		try {
			pS = pS.substring(1);
		} catch (Exception e) {
			System.out.println("Fehlersenke erreicht");
		}
		for (int i = 0; i < list.size(); i++) {
			String temp = list.get(i)[0].substring(1);
			if (temp.equals(pS)) {
				return i;
			}
		}
		System.out.println("Fehler");
		return 0;
	}
}
