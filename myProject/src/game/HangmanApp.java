package game;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class HangmanApp {

	private final int HIDDENCHAR = 5;  // 숨길 글자 수
	private StringBuffer hiddenWord;   // 숨긴 글자를 가진 단어
	private String newWord;
	private Scanner scanner;
	private int failCount;
	
	public HangmanApp() {
		scanner = new Scanner(System.in);
	}
	
	public void run() {
		System.out.println("지금부터 행맨 게임을 시작합니다.");
		Words words = new Words("words.txt");  // 
		
		while(true) {
			newWord = words.getRandomWord();
			if(newWord == null) break;
			makeHidden();
			
			go();
			
			System.out.println("다음 게임을 계속하시겠습니까?(y/n)?");
			String answer = scanner.next();
			if(answer.equals("n"))
				break;
		}
	}
	
	private void makeHidden() {
		hiddenWord = new StringBuffer(newWord);
		Random r = new Random();
		
		for(int k = 0; k < HIDDENCHAR; k++) {
			int index = r.nextInt(newWord.length());
			char c = newWord.charAt(index);
			for(int i = 0; i < newWord.length(); i++) {
				if(hiddenWord.charAt(i) == c)
					hiddenWord.setCharAt(i, '_');
			}
		}
	}
	
	private void go() {
		failCount = 0;
		char key;
		
		do {
			if(failCount == 6) {
				System.out.println("6번 실패하였습니다.");
				break;
			}
			System.out.println(hiddenWord);
			System.out.println(">>");
			String text = scanner.next();
			key = text.charAt(0);
		} while(!isComplete(key));
		System.out.println(newWord);
	}
	
	private boolean isComplete(char key) {
		boolean hit = false;
		
		for(int i = 0; i < newWord.length(); i++) {
			if(hiddenWord.charAt(i) == '_' && newWord.charAt(i) == key) {
				hiddenWord.setCharAt(i, key);
				hit = true;
			}
		}
		if(!hit)
			failCount++;
		for(int i =0; i< newWord.length(); i++) {
			if(hiddenWord.charAt(i) == '_')
				return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HangmanApp app = new HangmanApp();
		app.run();
	}

}

class Words {
	Vector<String> wordVector = new Vector<String>();
	
	public Words(String fileName) {
		try {
			Scanner scanner = new Scanner(new FileReader(fileName));
			while(scanner.hasNext()) {
				String word = scanner.nextLine();
				wordVector.add(word);
			}
			scanner.close();
		}
		catch(FileNotFoundException e) {
			System.out.println(" 파일을 찾을 수 없습니다.");
			System.exit(0);
		}
	}
	
	public String getRandomWord() {
		final int WORDMAX = wordVector.size();   // 총 단어으 ㅣ갯수
		int index = (int)(Math.random()*WORDMAX);
		return wordVector.get(index);
	}
}