package Pion;

import java.util.ArrayList;

import Application.Plateau;

public class Joueur extends Pion{

	@Override
	public void attaquer(int direction) {
		ArrayList<Pion> ListRobots = Plateau.getListePion(); // Instanciation de la collection de robots
		
		switch (direction){
		case 0: //Attaque ˆ l'Est
			for(int i=0 ; i < ListRobots.size(); i++){
				Robot robot = (Robot) ListRobots.get(i); // Instanciation d'un objet Robot depuis la collection
				if(robot.getX() - this.getX() < 4 && robot.getX() - this.getX() > 0){
					Plateau.getListePion().remove(i);
				}
			}
			break;
		case 1://Attaque ˆ l'Ouest
			for(int i=0 ;i<ListRobots.size();i++){
				Robot robot = (Robot) ListRobots.get(i);
				if(robot.getX() - this.getX() < 0 && robot.getX() - this.getX() > -4){
					Plateau.getListePion().remove(i);
				}
			}
			break;
		case 2://Attaque au Nord
			for(int i=0 ;i<ListRobots.size();i++){
				Robot robot = (Robot) ListRobots.get(i);
				if(robot.getY() - this.getY() < 4 && robot.getY() - this.getY() > 0){
					Plateau.getListePion().remove(i);
				}
			}
			break;
		case 3://Attaque au Sud
			for(int i=0 ;i<ListRobots.size();i++){
				Robot robot = (Robot) ListRobots.get(i);
				if(robot.getY() - this.getY() < 0 && robot.getY() - this.getY() > -4){
					Plateau.getListePion().remove(i);
				}
			}
			break;
		}	
	}

	@Override
	public void deplacer(int to_x, int to_y) {
		if (this.rayonPion(to_x, to_y)){
			this.setX(to_x);
			this.setY(to_y);
		}
	}


}
