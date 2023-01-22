package jp.ac.uryukyu.ie.e225724;

public class Progress {
	// この辺の値は要調整
	private static final int playerCache = 500;
	private static final int dealerCache = 500;

	public static void main(String args[]) {
		Player player = new Player(new Wallet(playerCache));
		Dealer dealer = new Dealer(new Wallet(dealerCache));
		InforMation info = new InforMation();

		info.setMoney(player, dealer, 5);

		while (!(player.getWallet().isInsolvency() || dealer.getWallet().isInsolvency())) {
			Table table = new Table();
			table.setVisible(true); // Windowを開く
			for (int i = 0; i < 5; i++) {
				try { // 制限時間まで待っている
					Thread.sleep(1 * 1000);
				} catch (InterruptedException e) {
				}
				info.setMoney(player, dealer, 5 - i - 1); // 制限時間の表示を更新
			}

			table.setLock(true); // 制限時間が来たら，もう選択できない
			System.out.println("setLock(t) = " + table.getLock());

			try {
				Thread.sleep(5 * 1000);
			} catch (InterruptedException e) {
			}
			table.setVisible(false); // Windowを閉じる

			// Debug
			AnyNumMoney[] ret = table.getNumMoney(); // 賭けているデータを取得
			for (int i = 0; i < ret.length; i++) {
				System.out.println("ret: " + ret[i].num + "," + ret[i].money); // 表示しているだけ
			}
			player.setAnyNumsMoney(ret);

			Roulette roulette = new Roulette();

			// Rouletteの停止位置の決定
			int stopAddress = roulette.getIntRouletteValue();
			System.out.println("Roulette: " + stopAddress);
			// Rouletteの回転開始
			new Ball(stopAddress);

			// 掛けた場所への判定と、支払い処理
			Payment.calcEach(player, dealer, stopAddress);
			info.setMoney(player, dealer, 0);

		}

		// 7. 終了
		System.out.println("END");
		System.exit(0);

	}
}