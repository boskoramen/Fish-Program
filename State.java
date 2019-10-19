package Fish;

public class State {
	
	Player Yourself;
	Player currentPlayer;
	Player[] teamMates;
	Player[] opponents;
	public State(Player Yourself,Player currentPlayer, Player []teamMates,Player []opponents) {
		this.Yourself=Yourself;
		this.currentPlayer=Player;
		this.teamMates=teamMates;
		this.opponents=opponents;
	}
	public Player setCurrentPlayer(Player currentPlayer)
	{
		State.currentPlayer=currPlayer;
	}
	public Player setYourself(Player Yourself)
	{
		State.Yourself=Yourself;
	}
	public Player setteamMates(Player teamMates)
	{
		State.teamMates=teamMates;
	}
	public Player setopponents(Player opponents)
	{
		State.opponents=opponents;
	}
	public Player getYourself() 
    { 
        return Yourself; 
    } 
	public Player getCurrentPlayer() 
    { 
        return currentPlayer; 
    } 
	public Player getteamMates() 
    { 
        return teamMates; 
    } 
	public Player getopponents() 
    { 
        return opponents; 
    } 



}
