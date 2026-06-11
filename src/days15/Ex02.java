package days15;

import java.io.Serializable;
import java.util.ArrayList;

import days12.Point;

/**
 * @author 조지훈
 * @date 2026. 6. 1. 오전 9:16:39
 * @subject 인터페이스, 클래스 사용 예제.
 * @content
 * 
 */
public class Ex02 implements Serializable { // Serializable

	public static void main(String[] args) {
		
//		ArrayList
	} // main

} // class

// (군사) 사병, 탱크, 공격기 등 장비, 단일체
abstract class Unit {

	// 필드 : 유닛의 위치
	// Point p;(days12 만들어둔 클래스 불러도됨) 집합관계 : has - a 관계
	int x;
	int y;
	int currentHP; // 현재 유닛의 체력

}

// 하늘 유닛
// 땅 유닛
// 바다 유닛 X 지금은 생성 안할 예정

class AirUnit extends Unit {

}

class GroundUnit extends Unit {

}

interface Movable {

	void move(int x, int y); // 추상 메서드 선언

}

interface Attackble {

	void attack(Unit unit); // 매개변수 다형성

}

//interface 는 다중상속가능 , interface 끼리 상속 가능.
interface Figthable extends Movable, Attackble {

}

class Fighter implements Figthable {

	@Override
	public void move(int x, int y) {
		// 구현됬다고 이해
	}

	@Override
	public void attack(Unit unit) {
		// 구현됬다고 이해
	}

}

class Tank extends GroundUnit implements Figthable, Repairable {

	@Override
	public void move(int x, int y) {
		// 움직이는 코딩
	}

	@Override
	public void attack(Unit unit) {
		// 포로 공격하는 코딩
	}

}

class Marine extends Unit implements Figthable {

	@Override
	public void move(int x, int y) {
		// 움직이는 코딩
	}

	@Override
	public void attack(Unit unit) {
		// 공격하는 코딩
	}

}

// 수송선
class Dropship extends AirUnit implements Figthable, Repairable {

	@Override
	public void move(int x, int y) {
		// 움직이는 코딩
	}

	@Override
	public void attack(Unit unit) {
		// 기관총, 미사일 등 공격가능하므로 코딩
	}

}

interface Repairable {
	// 상수, 추상메서드 선언 X
}

// 수리 , 건축 기능을 가진 클래스 (전투기능 없는 걸로)
class SCV extends GroundUnit implements Repairable {

	// 수리 메서드 : 대상 ( 수송선, 탱크, 또 다른 SCV 마린 X)
	void repair(Repairable target) { // Unit 클래스로 가면 마린은 포함되면 안되는데 포함되있음.
		if (target instanceof Tank) {
			Unit u = (Unit) target; // 다운 캐스팅
			// 탱크 수리에 필요한 처리
		} else if (target instanceof Dropship) {
			Dropship ds = (Dropship) target; // 다운 캐스팅
			// 수송선 수리에 필요한 처리
		} else {

		}

	}

	/*
	 * 체크할 유닛이 너무 많음 --> 매개변수 다형성 이용 void repair ( Dropship unit ) { // 수리할 대상 매개 변수
	 * 
	 * } void repair ( Tank unit ) { // 수리할 대상 매개 변수
	 * 
	 * } void repair ( SCV unit ) { // 수리할 대상 매개 변수
	 * 
	 * }
	 */

}
