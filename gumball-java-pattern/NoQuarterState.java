

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertCoins(int coin) {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
 
	public void insertCoins(int coin, int coin2) {
		System.out.println("You inserted two quarters");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
	
	public void insertCoins(int[] coins) {
		System.out.println("You inserted different denominations making 50 cents");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
	
	public void ejectCoin() {
		System.out.println("You haven't inserted sufficient coins");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no sufficient coins");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for quarter";
	}
}
