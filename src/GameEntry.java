
public class GameEntry {
private long score=0;
private String player;

public GameEntry(String name, long score){
	player=name;
	this.score=score;
}

public GameEntry(String name){
	player=name;
}

public String getName(){
	return player;
}

public long getScore(){
	return score;
}

public void setScore(long newScore){
	score=newScore;
}
}
