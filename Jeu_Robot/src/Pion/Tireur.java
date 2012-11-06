package Pion;

import Application.Plateau;

public class Tireur extends Robot {

	public Tireur(int x, int y){
		super(x,y);
	}
	
	@Override
	public void attaquer(int direction) {
		if(RayonJoueur()){
			for(int i = 0; i < Plateau.getListePion().size(); i++){
				Pion pion = Plateau.getListePion().get(i);
				if(pion.getClass().equals("Joueur")){
					if( ( (pion.getX()  > this.getX() + 3) && (pion.getY() == this.getY()) ) ||
						( (pion.getX()  < this.getX() - 3) && (pion.getY() == this.getY()) ) ||
						( (pion.getX()  == this.getX()) && (pion.getY() > this.getY() + 3) ) ||
						( (pion.getX()  == this.getX()) && (pion.getY() < this.getY() - 3) )){
						Plateau.getListePion().remove(i);
						return;
					}	
				}
			}
		}
	}

	@Override
	public boolean RayonJoueur(){
		for(int i = 0; i < Plateau.getListePion().size(); i++){
			Pion pion = Plateau.getListePion().get(i);
			if(pion.getClass().equals("Joueur")){
				if( ( (pion.getX()  > this.getX() + 3) && (pion.getY() == this.getY()) ) ||
					( (pion.getX()  < this.getX() - 3) && (pion.getY() == this.getY()) ) ||
					( (pion.getX()  == this.getX()) && (pion.getY() > this.getY() + 3) ) ||
					( (pion.getX()  == this.getX()) && (pion.getY() < this.getY() - 3) )){
					return true;
				}	
			}
		}
		return false;
	}
}
