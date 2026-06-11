package days21.sec06;

/**
 * @author 조지훈
 * @date 2026. 6. 10. 오전 10:34:50
 * @subject 메서드 참조
 * 			생성자 참조
 * 				ㄴ 생성자 참조하는 의미는 객체를 생성하는 의미이고
 * 				ㄴ 람다식이 단순히 객체를 생성하고 리턴한다면
 * 					-> 생성자 참조로 대치할 수 있다.
 * 				ㄴ 예) (a,b) -> {return new 클래스명(a,b);}
 * 				클래스명::new 
 * @content 
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
		Person p = new Person();
		
		// [0]
//		Member m2 = p.getMember2(new Creatable2() {
//								  ㄴ new 치고 ctrl+space로 인터페이스 호출
//			@Override
//			public Member create(String id, String name) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//		})
		
		// [1]
//		Member m2 = p.getMember2( (id,name)->{
//			return new Member(id,name);
//		});
		
		// [2]
//		Member m2 = p.getMember2( (id,name)-> new Member(id,name) );
		
		// [3]
		Member m2 = p.getMember2( Member:: new );
		System.out.println(m2);
		
		
		
		/*
		//[1]
//		Person p = new Person();
//		Member m1 = p.getMember1((id)->{
//			return new Member(id);
//		});
		
		// [2]
//		Member m1 = p.getMember1( (id)->	new Member(id) );
		
		//[3] 생성자 참조
		Member m1 = p.getMember1( Member:: new );
		System.out.println(m1);
		*/
		
	} // main

}
