/*
 * CotxeLinked.java        1.0 22/09/2015
 *
 * class CotxeLinked
 *
 * Copyright 2015 Jordi Llonch Neira <jordill14@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
import java.util.LinkedList;

public class CotxeLinked {
	public static void main(String[] args) {
		// Auto-generated method stub
		//LinkedList de cinc objectes
		LinkedList<Cotxe> car = new LinkedList<Cotxe>();
		//Afegim cinc objectes, add afegim al final
		car.add(new Cotxe("Alfa Romeo", "Giulia", 2900, 6));
		car.add(new Cotxe("Dacia", "Sandero", 1200, 4));
		car.add(new Cotxe("Ford", "Focus", 2000, 4));
		car.add(new Cotxe("Opel", "Insignia", 2200, 4));
		car.add(new Cotxe("Seat", "Ibiza", 1600, 4));
		//CotxeArrayList, add afegim al final
		car.addFirst(new Cotxe("Hyundai", "Atos",1500, 3));
		car.addLast(new Cotxe("Ford", "Focus",2000, 4));
		//LinkedList permet duplicats
		car.add(new Cotxe("Seat","Ibiza", 1600, 4));
		for (int i = 0; i < car.size(); i++) {
			System.out.println(car.get(i).toString());
		}
		System.out.println("\nHem afegit un objecte duplicat, Seat Ibiza\n");
		//Afegim un nou objecte  a la posició 1(0,"1")
		car.addFirst(new Cotxe("Audi", "A8", 4600, 8));
		System.out.println("Hem afegit el nou objecte a la posició 0 pero no a la posició 1\n");
		for (int i = 0; i < car.size(); i++) {
			System.out.println(car.get(i).toString());
		}
		//Substituim "set" un objecte per un altre de nou, amb el contains el busquem
		for (int i = 0; i < car.size(); i++) {
			if (car.get(i).getMarca().contains("Seat") && car.get(i).getModelo().contains("Ibiza")) {
				car.set(i, new Cotxe("Seat", "Mii", 1000, 3));
			}
		}
		//Eliminar el primer objecte de la llista
		car.remove();
		System.out.println("\nHem eliminat el primer objecte de la LinkedList\n");
		for (int i = 0; i < car.size(); i++) {
			System.out.println(car.get(i).toString());
		}
		//buscar posició d'un objecte "Hyundai" en concret, amb el contains el busquem i la pos + 1
		//xq comença en 0.
		for (int i = 0; i < car.size(); i++) {
			if (car.get(i).getMarca().contains("Hyundai") && car.get(i).getModelo().contains("Atos")) {
				System.out.println("\nPosició: " + (i+1));
			}
		}
	}

}
