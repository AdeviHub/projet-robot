package Pion;

import java.util.ArrayList;

import Application.Plateau;

public abstract class Pion {

	
	protected int x;
	protected int y;


	public int getX(){
		return this.x; 
	}


	public int getY(){
		return this.y; 
	}

	public void setX(int x){
		this.x=x; 
	}


	public void setY(int y){
		this.y=y; 
	}

	public boolean rayonPion(int to_x, int to_y){
		ArrayList<Pion> ListRobots = Plateau.getListePion(); // Instanciation de la collection de robots
		for(int i=0 ; i < ListRobots.size(); i++){
			Pion pion = ListRobots.get(i); // Instanciation d'un objet Robot depuis la collection
			if(to_x == pion.getX() && to_y == this.getY()){
				return false;
			}
		}
		return true;
	}

	public abstract void deplacer(int to_x, int to_y);

	
	public abstract void attaquer(int direction);
}
