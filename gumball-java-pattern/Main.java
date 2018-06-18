

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);

		System.out.println(gumballMachine);

		gumballMachine.insertCoins(25);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertCoins(25,25);
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
		
		int[] coins = { 10,5,10,5,10,10};
		gumballMachine.insertCoins(coins);
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
		
		int[] coinList = { 10,5,10,5,10};
		gumballMachine.insertCoins(coinList);
		gumballMachine.turnCrank();
		

		System.out.println(gumballMachine);
	}
}
