

import java.util.Random;

public class HasQuarterState implements State {
	GumballMachine gumballMachine;
 
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertCoins(int coin) {
		System.out.println("You can't insert another quarter");
	}
 
	public void insertCoins(int coin1, int coin2) {
		System.out.println("You can't insert more than two quarters");
	}
	
	public void insertCoins(int[] coins) {
		System.out.println("You can't insert more than 50 cents");
	}
	
	public void ejectCoin() {
		System.out.println("Coin(s) returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
