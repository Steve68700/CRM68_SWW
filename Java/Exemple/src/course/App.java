package course;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
			
			ArrayList<Section> sections = new ArrayList<Section>();
			ArrayList<Virage> virages = new ArrayList<Virage>();
			ArrayList<Voiture> supercar = new ArrayList<Voiture>();
			//Voiture[] supercar = new Voiture[4];
			
			Voiture gtr = new Voiture("Nissan GT-R", 0, 315, 15, 8, 15, true);
			Voiture lambo = new Voiture("Lamborghini Aventador", 0, 360, 12, 10, 10, true);
			Voiture ferrari = new Voiture("Ferrari 458", 0, 325, 10, 10, 8, true);
			Voiture porsche = new Voiture("Porsche 911 GT2 RS", 0, 340, 15, 10, 10, true);
			supercar.add(gtr);
			supercar.add(lambo);
			supercar.add(ferrari);
			supercar.add(porsche);
			
			Circuit circuit1 = new Circuit("Circuit 1");
			circuit1.createCircuit(sections, virages);

			
			for(int i = 0; i < supercar.size(); i++) {
				circuit1.course(supercar.get(i),sections, virages, 3);
			}

	}

}
