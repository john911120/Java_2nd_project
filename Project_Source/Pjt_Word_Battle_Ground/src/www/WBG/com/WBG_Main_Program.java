package www.WBG.com;

import java.util.Scanner;

/*
  	���� �Է��� Ű���带 ��밡���� ����� �߰��Ͽ���
  	���� ���� �ܾ�� "�Ʊ���"�̸� ���� ������ ���� �Է¹ް�
  	player�� �����ϴ� ��ü �迭�� �����ϴ� �޼ҵ带 ����� ���۷��� �迭�� ����鼭
  	��ü�� �����.
  	���۴ܾ�� ������ �����ϴ�.
  	�ۼ��� : 1219
 */

public class WBG_Main_Program {
	private Scanner scanner;
	private String startWord = "�ֹ���";
	private Make_Player[] players;
	public WBG_Main_Program() {
		scanner = new Scanner(System.in);
	}
	
	// ���� ������ ���� �Է� ������ Make_Player [] �� ����� �޼ҵ�
	private void createPlayers() {
		System.out.println("���ӿ� �����ϴ� �ο��� �� ���Դϱ�? : ");
		int nPlayers = scanner.nextInt();
		// Make_player [] ���۷��� �迭�� �����
		players = new Make_Player [nPlayers];
		// �� �������� �̸��� �Է� �޾Ƽ� player ��ü�� �����.
		for(int i = 0; i <nPlayers; i++) {
			System.out.println("�������� �̸��� �Է��ϼ��� : ");
			String name = scanner.next();
			players[i] = new Make_Player(name);
		}
	}
	
	public void run() {
		/*
		 * �����ڸ� ���� �÷��̾� �迭�� �����, startWord���� ���۵ȴ�.
		 */
		createPlayers();
		String lastWord = startWord;
		System.out.println("�����ϴ� �ܾ�� : " + lastWord + "�Դϴ�.");
		int next = 0; //�����ڵ��� ������� ����
		while(true) {
			String newWord = players[next].sayWord();
			if(!players[next].succeed(lastWord)) {
				System.out.print(players[next].getName() + "�� �����ϴ�.");
				// ������ ���� �ձ⿡ �������� ���Ѵٸ� ���ӿ��� ���ٴ� �޽����� ����ϰ� �����Ѵ�.
				break;
			}
			// ���� ������ �� ���ӿ� �����Ѵ�.
			next++;
			// next�� ������ ���� ������ �� ���� ���� �����ϴ� ���� �����ִ� ����� �߰��Ͽ���.
			next %= players.length;
			lastWord = newWord;
		}
	}
	
	public static void main(String[] args) {
		WBG_Main_Program game = new WBG_Main_Program();
		game.run();
	}

	

}
