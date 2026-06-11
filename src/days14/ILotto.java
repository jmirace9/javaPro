package days14;

public interface ILotto {

//	public final static int LENGTH = 6;
	int LENGTH = 6; // 그냥 만들어도 public final static 이 있고 생략된것임
	
	// 추상 매서드
	public abstract void fillLotto(int [] lotto); // 그냥 만들어도 public abstract 이 있고 생략된것임
	void dispLotto(int [] lotto);
	void isDuplicateLotto(int [] lotto);

}
