package deplacement;



import Application.Position;

public class Deplacement {
	TypeDeplacement deplacement;
	
	public int x;
	public int y;
	
	Deplacement() {
		
    }
	
	public Deplacement Inverse(Deplacement d){
		switch (d) {
			case NORD:
				
				return Deplacement.SUD;
				
			case EST:
				return Deplacement.OUEST;
			
			case SUD:
				return Deplacement.NORD;
	
			case OUEST:
				return Deplacement.EST;
				
			case NORD_EST:
				return Deplacement.SUD_OUEST;
			
			case NORD_OUEST:
				return Deplacement.SUD_EST;
			
			case SUD_EST:
				return Deplacement.NORD_OUEST;
			
			case SUD_OUEST:
				return Deplacement.NORD_EST;
				
			default:
				break;
		}
		return d;
	} 
	
	public Position getDeplacement(int x, int y){
		switch (this) {
			case NORD:
				return new Position(x, y + 1);
				
			case EST:
				return new Position(x + 1, y);
			
			case SUD:
				return new Position(x, y - 1);
	
			case OUEST:
				return new Position(x - 1, y);
				
			case NORD_EST:
				return new Position(x + 1, y + 1);
			
			case NORD_OUEST:
				return new Position(x - 1, y + 1);
			
			case SUD_EST:
				return new Position(x + 1, y - 1);
			
			case SUD_OUEST:
				return new Position(x - 1, y + 1);
				
			default:
				break;
		}
		return null;
	}
}
