
public class Scoreboard {
private GameEntry[] board;  
private int currentSize = 0;
private int maxSize;

/**
 * Creates new Scoreboard with a GameEntry array of size "size".
 * @param size - desired size of GameEntry array .
 */
public Scoreboard(int size){
	 board= new GameEntry[size]; 
	 maxSize=size;
}

/**
 * Creates Scoreboard of size 15.
 */
public Scoreboard(){
	this(15);
}

/**
 * Adds new GameEntry to the Scoreboard. Places it in the proper index, based on score, highest to lowest.
 * @param newEntry - the GameEntry to be added.
 */
public void add(GameEntry newEntry){
	if(currentSize==0){
		board[0]=newEntry;
		currentSize++;
		System.out.println("{"+newEntry.getName() + " added.}");
		return;
	}	
	else for(int i=0; i<=currentSize; i++){
		if(board[i]==null){
			board[i]=newEntry;
			currentSize++;
			System.out.println("{"+newEntry.getName() + " added.}");
			return;
		}
		else if(board[i].getScore() < newEntry.getScore()){
				if(currentSize<maxSize){ currentSize++;}
				GameEntry temp = board[i];
				board[i]= newEntry;
				System.out.println("{"+newEntry.getName() + " added.}");
				for(int j=i+1; j<board.length; j++){
					GameEntry temp2 =board[j];
					board[j]=temp;
					temp=temp2;
					}
				return;
				}
		}
			
	}

public void remove(int index){
	if(currentSize==0){
		System.out.println("|| Scoreboard is empty.||");
		return;
	}
	if(index<1 || index >maxSize){
		System.out.println("|| Index out of bounds. ||");
		return;
	}
	for(int i=index-1; i<board.length-1; i++){
		board[i]=board[i+1];
	}
	board[maxSize-1]=null;
	currentSize--;
	return;
}

public void showRank(int index){
	index=index-1;
	if(index<1|| index>maxSize){
		System.out.println("|| Index out of range.||");
		return;
	}
	else if(board[index]==null){
		System.out.println("||Rank currently empty.||");
	}
	else
	System.out.println("Rank:" +(index+1)+": Player: "+board[index].getName() +", Score: "+board[index].getScore());
	
}

public void showPlayer(String player){
	for(GameEntry i: board){
		if(i.getName().equals(player)){
			System.out.println("Player: "+i.getName()+", Score: "+i.getScore());
			return;
		}
	}
	System.out.println("Player not found.");
	return;
}

public void printBoard(){
	System.out.println("====================================================");
	System.out.println("||Rank||       Player       ||        Score       ||");
	System.out.println("====================================================");
	int rank=1;
	if (currentSize==0){
		System.out.println("||                   NO ENTRIES                  ||");
		System.out.println("====================================================");
		return;}
	else for(int i=0; i<currentSize; i++){
		System.out.print("|| "+rank+ " ||     ");
		System.out.print( board[i].getName()+"     ||      ");
		System.out.println(board[i].getScore() +"     ||");
		System.out.println("====================================================");
		rank++;
	}
	System.out.println();
	return;
	
}
}