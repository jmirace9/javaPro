package days14;

public class Ex07 {

	public static void main(String[] args) {



	} // main

} // class

abstract class Player{

	// 필드
	boolean pause;  // 작동 중지
	int currentPos; // 현재 위치

	// 생성자
	public Player() {}

	// 추상 메서드 선언
	abstract void play(int pos);
	abstract void stop();

}

// The type AudioPlayer must implement the inherited abstract method Player.stop()
abstract class AudioPlayer extends Player{
	
	// 필드 : pause, currentPos
	// 생성자 물려받지않음
	// 추상메서드 : play, stop
	
	@Override
	void play(int pos) {
		System.out.println("> 추상 메서드를 오버라이딩 완료!!!");
	}

//	@Override
//	void stop() {
//
//	}

class CDPlayer extends AudioPlayer{

	@Override
	void stop() {
		System.out.println("> 추상 메서드를 오버라이딩 완료!!!");
		
	}
	
}

}







