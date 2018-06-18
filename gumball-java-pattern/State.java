

public interface State {
 
	public void insertCoins(int coin);
	public void insertCoins(int coin1, int coin2);
	public void insertCoins(int[] coins);
	public void ejectCoin();
	public void turnCrank();
	public void dispense();
}
