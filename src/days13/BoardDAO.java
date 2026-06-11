package days13;

public class BoardDAO {

	// Double-Checked Locking(DCL) 방식에서 필수 ( 이중 잠금 확인 )
	private static volatile BoardDAO boardDAO = null;

	private BoardDAO() {

	}

	public static  BoardDAO getInstance() {
		if (boardDAO == null) {
			synchronized (BoardDAO.class) {
				boardDAO = new BoardDAO();
			}
		}
		return boardDAO;
	}

	/*
	public static synchronized BoardDAO getInstance() {
					//ㄴ 동기화 (스레드)
		if (boardDAO == null) {
			boardDAO = new BoardDAO();
		}
		return boardDAO;
	}
	 */

	// 게시판 CRUD

	public void create() {
		System.out.println("게시글 작성...");
	}
	public void read() {
		System.out.println("게시글 보기...");
	}
	public void update() {
		System.out.println("게시글 수정...");
	}
	public void delete() {
		System.out.println("게시글 삭제...");
	}

}
