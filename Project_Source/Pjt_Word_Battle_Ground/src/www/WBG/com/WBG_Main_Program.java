package www.WBG.com;

import java.util.Scanner;

/*
  	게임 입력을 키보드를 사용가능한 기능을 추가하였고
  	게임 시작 단어는 "아구찜"이며 게임 참가자 수를 입력받고
  	player를 구성하는 객체 배열을 생성하는 메소드를 만들고 레퍼런스 배열을 만들면서
  	객체를 만든다.
  	시작단어는 수정이 가능하다.
  	작성일 : 1219
 */

public class WBG_Main_Program {
	private Scanner scanner;
	private String startWord = "휘발유";
	private Make_Player[] players;
	public WBG_Main_Program() {
		scanner = new Scanner(System.in);
	}
	
	// 게임 참가자 수를 입력 받으며 Make_Player [] 를 만드는 메소드
	private void createPlayers() {
		System.out.println("게임에 참가하는 인원은 몇 명입니까? : ");
		int nPlayers = scanner.nextInt();
		// Make_player [] 레퍼런스 배열을 만들기
		players = new Make_Player [nPlayers];
		// 각 참여자의 이름을 입력 받아서 player 객체를 만든다.
		for(int i = 0; i <nPlayers; i++) {
			System.out.println("참가자의 이름을 입력하세요 : ");
			String name = scanner.next();
			players[i] = new Make_Player(name);
		}
	}
	
	public void run() {
		/*
		 * 참가자를 위한 플레이어 배열을 만들며, startWord에서 시작된다.
		 */
		createPlayers();
		String lastWord = startWord;
		System.out.println("시작하는 단어는 : " + lastWord + "입니다.");
		int next = 0; //참가자들의 순서대로 증가
		while(true) {
			String newWord = players[next].sayWord();
			if(!players[next].succeed(lastWord)) {
				System.out.print(players[next].getName() + "이 졌습니다.");
				// 상대방이 끝말 잇기에 성공하지 못한다면 게임에서 졌다는 메시지를 출력하고 종료한다.
				break;
			}
			// 다음 참가자 가 게임에 참여한다.
			next++;
			// next가 설정한 게임 참가자 수 보다 많이 증가하는 것을 막아주는 기능을 추가하였다.
			next %= players.length;
			lastWord = newWord;
		}
	}
	
	public static void main(String[] args) {
		WBG_Main_Program game = new WBG_Main_Program();
		game.run();
	}

	

}
