

public class GumballMachine {
 
	State soldOutState;
	State noSufficinetCoinsState;
	State hasSufficientCoinsState;
	State soldState;
 
	State state = soldOutState;
	int count = 0;
 
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noSufficinetCoinsState = new NoQuarterState(this);
		hasSufficientCoinsState = new HasQuarterState(this);
		soldState = new SoldState(this);

		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noSufficinetCoinsState;
		} 
	}
 
	public void insertCoins(int coin) {
		state.insertCoins(25);
	}
	
	public void insertCoins(int coin1, int coin2) {
		state.insertCoins(25,25);
	}
	public void insertCoins(int[] coins)
	{
		int total=0;
		for(int i=0; i<coins.length;i++)
		{
			total+=coins[i];
		}
		if(total == 50)
		state.insertCoins(coins);
	
	}
 
	public void ejectQuarter() {
		state.ejectCoin();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count = count;
		state = noSufficinetCoinsState;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noSufficinetCoinsState;
    }

    public State getHasQuarterState() {
        return hasSufficientCoinsState;
    }

    public State getSoldState() {
        return soldState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
