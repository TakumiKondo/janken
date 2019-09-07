package janken;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Hand Class
 * じゃんけんの手のオブジェクトクラス
 * @author user
 *
 */
public class Hand {
	private int hand;

	/**
	 * setHand method
	 * 手を標準入力で設定する
	 */
	public void setHand() {
		System.out.println("手を入力してください。");
		System.out.println("グー：1、チョキ：2、パー：3");

		while(true) {
			try {
				Scanner scan = new Scanner(System.in);
				this.hand = scan.nextInt();
				break;
			}catch(InputMismatchException e){
				System.out.println("数値で入力してください。");
			}
		}
	}

	/**
	 * setRandomHand method
	 * 手をランダムに設定する
	 */
	public void setRandomHand() {
		Random random = new Random();
		this.hand = random.nextInt(3)+1;
	}

	/**
	 * handName method
	 * 手の名称を返す
	 * @return
	 */
	public String handName() {
		String handName = null;

		if(this.hand == 1) handName = "グー";
		if(this.hand == 2) handName = "チョキ";
		if(this.hand == 3) handName = "パー";

		return handName;
	}

	/**
	 * hand method
	 * 手の値を返す
	 * @return
	 */
	public int hand() {
		return this.hand;
	}
}
