public class Main {

	public static void main(String... args){
		CustomMap root = new CustomMap("2", "Helo");
		root.insert(new CustomMap("1", "Plis work"));
		root.insert(new CustomMap("3", "Work Plis"));
		//Object reqvalue = root.search("1");
		//System.out.println(reqvalue);
		root.display();
	}
}
