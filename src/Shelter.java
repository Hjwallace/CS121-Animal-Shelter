import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
public class Shelter {

	
	Queue<String> dogShelter = new LinkedList<String>();
	Queue<String> catShelter = new LinkedList<String>();
	Random rand = new Random();
	
	
	public void addAnimal(String n, String t) {
		if(t == "cat") {
			catShelter.add(n);
		}
		if(t == "dog") {
			dogShelter.add(n);
		}
	}

	public String getAnimal() {
		String animal = "";
		String type = "";
		int r = rand.nextInt(1);
		if(r == 0) {
			animal = catShelter.remove();
			type = "cat";
		}
		if(r == 1) {
			animal = dogShelter.remove();
			type = "dog";
	}
		String msg = "Name: " + animal + " || Type: " + type;
		return msg;
	}
	public String getAnimal(String t) {
		String animal = "";
		String type = "";
		if(t == "cat") {
			animal = catShelter.remove();

			type = "cat";
		}
		if(t == "dog") {
			animal = dogShelter.remove();

			type = "dog";
	}
		String msg = "Name: " + animal + " || Type: " + type;
		return msg;
	}
	
}
