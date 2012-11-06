package deplacement;



import Application.Position;

public class Deplacement {
	TypeDeplacement deplacement;
	
	public int x;
	public int y;
	
	public Deplacement(TypeDeplacement d) {
		deplacement = d;
    }
	
	public void Inverse(){
		switch (deplacement) {
			case NORD:
				deplacement = TypeDeplacement.SUD;
				break;
			case EST:
				deplacement = TypeDeplacement.OUEST;
				break;
			case SUD:
				deplacement = TypeDeplacement.NORD;
				break;
			case OUEST:
				deplacement = TypeDeplacement.EST;
				break;
			case NORD_EST:
				deplacement = TypeDeplacement.SUD_OUEST;
				break;
			case NORD_OUEST:
				deplacement = TypeDeplacement.SUD_EST;
				break;
			case SUD_EST:
				deplacement = TypeDeplacement.NORD_OUEST;
				break;
			case SUD_OUEST:
				deplacement = TypeDeplacement.NORD_EST;
				break;
			default:
				break;
		}
	} 
	
	public Position getDeplacement(int x, int y){
		switch (deplacement) {
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
