package www.WBG.com;

import java.util.Scanner;

/*
  	�ۼ��� : 1219
  	Ű����� �Է� �����ϰ� �����Ͽ��� ���� �������� �̸��� �Է��� �� �ִ� ����� �־���.
  	�����ڴ� �ܾ Ű����� �Է��� �����ϸ�, ���� �ܾ��� �� ������ ������ �ε��� ����� �־���.
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
