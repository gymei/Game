public class Spielfeld {
	public int[] hintergrund_Farbe = {0,0,0};
	public int[] farbe_Punkte = {255,255,255};
	public int[] farbe_Waende = {24,30,182};
	public int raster_Groesse = 30;
	
	// 0 = leeres Feld; 1 = Wand; 2 = Punkt; 3 = Hurensohnfeld 
	protected int[][] playGround = {
			       {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			       {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1},
			       {1,2,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1,1,1,2,1},
			       {1,2,2,2,2,2,2,2,2,2,1,2,1,2,2,2,2,1,2,2,2,2,2,2,2,2,2,2,2,2,1},
			       {1,2,1,1,1,1,1,1,1,2,1,2,1,2,1,1,2,1,2,1,1,1,1,2,1,1,1,1,1,2,1},
			       {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1},
			       {1,2,1,2,1,1,2,1,2,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,2,1},
			       {1,2,1,2,1,1,2,1,2,1,2,2,2,2,2,2,2,2,2,1,1,2,1,2,2,2,2,2,2,2,1},
			       {1,1,1,2,2,2,2,1,2,2,2,2,1,1,3,3,1,1,2,2,2,2,1,2,1,1,1,2,1,2,1},
			       {1,2,1,2,1,1,2,1,2,1,1,2,1,2,2,2,2,1,2,1,1,2,1,2,2,2,1,2,1,2,1},
			       {1,2,1,2,2,2,2,1,2,1,1,2,1,1,1,1,1,1,2,1,1,2,1,2,2,2,2,2,2,2,1},
			       {1,2,2,2,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1,1,1,1,1,1,1,2,1},
			       {1,2,1,1,1,1,1,2,1,2,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,1},
			       {1,2,2,2,2,2,2,2,1,2,1,1,1,1,1,1,2,2,2,2,2,2,2,1,1,1,1,1,1,2,1},
			       {1,2,1,1,1,1,1,1,1,2,2,2,2,2,1,1,2,1,1,1,1,1,2,2,2,1,2,2,2,2,1},
			       {1,2,2,2,2,2,2,2,2,2,1,1,1,2,1,1,2,1,1,1,1,1,2,1,2,1,2,1,1,1,1},
			       {1,2,1,1,2,1,2,1,1,2,2,2,1,2,2,2,2,1,1,2,2,2,2,1,2,2,2,2,2,2,1},
			       {1,2,1,1,1,1,1,1,1,2,1,1,1,2,2,2,2,1,1,2,1,1,1,1,1,1,1,1,1,2,1},
			       {1,2,1,1,1,1,1,1,1,2,1,1,1,2,2,2,2,1,1,2,1,1,1,1,1,1,1,1,1,2,1},
			       {1,2,2,2,2,2,2,2,2,2,2,2,2,2,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1},
			       {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			       {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
	}; 
	
	// Getter Methoden unnötig wenn Variablen eh public sind
	public int[] get_Hintergrundfarbe() {return hintergrund_Farbe;}
	public int[] get_farbe_Punkte() {return farbe_Punkte;}
	public int[] get_farbe_Waende() {return farbe_Waende;}
}
