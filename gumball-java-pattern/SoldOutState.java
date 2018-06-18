

public class SoldOutState implements State {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertCoins(int coin) {
		System.out.println("You can't insert a quarter, the machine is sold out");
	}
 
	public void insertCoins(int coin1, int coin2) {
		System.out.println("You can't insert two quarters, the machine is sold out");
	}
	public void insertCoins(int[] coins)
	{
		System.out.println("You can't insert 50 cents, the machine is sold out");
	}
	
	public void ejectCoin() {
		System.out.println("You can't eject, you haven't inserted sufficient coins yet");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs");
	}
 
	public void dispense() {
		System.out.println("No gumball dispensed");
	}
 
	public String toString() {
		return "sold out";
	}
}
