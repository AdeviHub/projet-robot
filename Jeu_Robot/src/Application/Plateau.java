package Application;

import java.util.ArrayList;
import Pion.Pion;

public class Plateau {

	private static ArrayList<Pion> ListePion = new ArrayList<Pion>();
	private static int tailleX = 20;
	private static int tailleY = 20;
	
	public Plateau(){
		
	}

	public static ArrayList<Pion> getListePion() {
		return ListePion;
	}

	public static void setListePion(ArrayList<Pion> listePion) {
		ListePion = listePion;
	}

	public static int getTailleX() {
		return tailleX;
	}

	public static void setTailleX(int tailleX) {
		Plateau.tailleX = tailleX;
	}

	public static int getTailleY() {
		return tailleY;
	}

	public static void setTailleY(int tailleY) {
		Plateau.tailleY = tailleY;
	}
	
}
