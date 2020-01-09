package www.WBG.com;

import java.util.Scanner;

/*
  	작성일 : 1219
  	키보드로 입력 가능하게 설정하였고 게임 참가자의 이름을 입력할 수 있는 기능을 넣었다.
  	참가자는 단어를 키보드로 입력이 가능하며, 최종 단어의 맨 마지막 문자의 인덱스 기능을 넣었다.
 */

public class Make_Player {
	Scanner scanner;
	private String name;
	private String word;
	public Make_Player(String name) {
		this.name = name; 
		scanner = new Scanner(System.in);
	}
	public String getName() {
		return name;
	}
	
	public String sayWord() {
		System.out.print(name+">>");
		word = scanner.next();
		return word;
	}
	
	public boolean succeed(String lastWord) {
		int lastIndex = lastWord.length()-1;
		if(lastWord.charAt(lastIndex) == word.charAt(0))
			return true;
		else
			return false;
	}
}
