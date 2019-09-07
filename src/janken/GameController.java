package janken;

/**
 * GameController Class
 * ゲームをコントロールする
 * @author user
 *
 */
public class GameController {
	private Hand myHand;;
	private Hand opponentHand;
	private Rule rule;

	/**
	 * コンストラクタ
	 */
	public GameController() {
		this.rule = new Rule();
		this.myHand = new Hand();
		this.opponentHand = new Hand();
	}

	/**
	 * start method
	 * ゲームを開始する
	 */
	public void start() {
		System.out.println("じゃんけんを始めます。");

		do {
			myHand.setHand();
			opponentHand.setRandomHand();
			rule.showHands(myHand, opponentHand);
		}while(rule.isDraw(myHand, opponentHand));

		rule.showResult(myHand, opponentHand);
	}

	/**
	 * end method
	 * ゲームを終了する
	 */
	public void end() {
		System.out.println("じゃんけんを終了します。");

	}
}
