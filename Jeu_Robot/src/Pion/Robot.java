package Pion;

//souihi.sami@gmail.com [INGESUP_ING2A]

import deplacement.Deplacement;
import deplacement.TypeDeplacement;
import Application.Plateau;
import Application.Position;

public abstract class Robot extends Pion {

	private int randomX = (int)(Math.random() * (20-0)) + 0;
	private int randomY = (int)(Math.random() * (20-0)) + 0;
	private Deplacement deplacement;
	
	@Override
	public abstract void attaquer(int direction);


	public Robot(int x , int y) {
		super.setX(x) ;
		super.setY(y) ;
		deplacement = new Deplacement(TypeDeplacement.SUD_EST);
		
	}

	public void addRobot(Robot robot){
		Plateau.getListePion().add(robot);
	}

	public void chercher() {

	}

	public void suivre() {

	}

	public void deplacer(int to_x, int to_y){
		if(( (to_x - 1) > 0)  && (to_y + 1 < Plateau.getTailleY())){
			if(!rayonPion(to_x, to_y)){
				this.setX(to_x);
				this.setY(to_y);
			}
		}
		else{
			deplacement.Inverse();
			Position p = deplacement.getDeplacement(to_x, to_y);
			deplacer(p.getX(), p.getY());
		}
	}

	public abstract boolean RayonJoueur();
	
	
	public void rayonJoueur(int x , int y){	

		if(x == super.getX()){ // joueur sur la même ligne
			if(x-super.getX() < 4  && x-super.getX() > 0){ // Joueur sur la droite
				this.suivre(); 
			}
			else if(x-super.getX() < 0  && x-super.getX() > -4){ // Joueur sur la gauche
				this.suivre(); 
			}
		}
		else if(y == super.getY()){ // joueur sur la même colonne
			if(y-super.getY() < 4  && y-super.getY() > 0){ // Joueur en haut
				this.suivre(); 
			}
			else if(y-super.getY() < 0  && y-super.getY() > -4){ // Joueur en bas
				this.suivre(); 
			}
		}
		else{
			this.chercher();
		}

	}
	
}
