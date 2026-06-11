package days21.sec06;

@FunctionalInterface // 추상메서드 하나씩밖에 못만듬
public interface Creatable2 {

	Member create(String id, String name); // 추상메서드를 만드는 인터페이스
	
}
