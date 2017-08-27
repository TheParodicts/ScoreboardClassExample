
public class Main {
	public static void main(String[] args) {
		GameEntry a= new GameEntry("John Wick", 589555);
		GameEntry b= new GameEntry("Frank Marsh", 150);
		GameEntry c= new GameEntry("Wade Wilson", 8008135);
		GameEntry d= new GameEntry("Rick Sanchez", 137);
		GameEntry e= new GameEntry("Morty Smith", 88);
		GameEntry f= new GameEntry("Pickle Rick", 7984);
		GameEntry g= new GameEntry("Douglas Adams", 42);
		GameEntry h= new GameEntry("Vegeta", 10000);
		
		Scoreboard scoreboard = new Scoreboard(8);
		
		scoreboard.add(a);
		scoreboard.add(b);
		scoreboard.add(c);
		scoreboard.add(d);
		scoreboard.add(e);
		scoreboard.add(f);
		scoreboard.add(g);
		scoreboard.add(h);

		scoreboard.printBoard();


		
	}
}
