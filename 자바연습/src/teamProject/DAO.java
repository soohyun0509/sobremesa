package teamProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	private static DAO dao= new DAO();
	public static DAO getInstance() {return dao;}
	
	
	//보드게임판 출력
	void gameBoard() {
		/* 반환 - 게임판 */
	}
	
	//플레이어 게임 현황(자산, 땅) 출력
	void status(/*플레이어*/) {
		/* 반환 - 해당 플레이어의 자산, 소유한 땅 */
	}
	

	//주사위 - 위치 업데이트
	void location(/*주사위 수, 플레이어*/) {
		/*반환 -> boolean ? */
		
	}
	
	//위치한 땅 플레이어 소유여부 확인
	void land(/*플레이어*/) {
		/* 반환 -> 땅 구매 가능 여부 */
	}
	
	//땅 구매 -플레이어 정보 업데이트
	void buy(/* 플레이어 , 위치한 땅 */) {
		/*반환 -> boolean */
	}
	
	
	//통행료로 인한 자산 변동 업데이트
	void stateUpdate(/*금액, 지출한 플레이어*/) {
		/* 반환 - boolean */
	}
	
	//출발칸 - 자산 업데이트
	void salary(/*플레이어*/) {
		/*반환 -> boolean */
	}
	
	//올림픽- 플레이어가 지정한땅 통행료 업데이트
	void olympic(/*플레이어 , 지정한 땅*/) {
		/*반환 -> boolean*/
	}

	//황금열쇠 정보 출력
	void goldKey(){
		/*반환 -> 황금열쇠 정보*/
	}
	
	
	//자산매각 - 정보 업데이트
	void sale(/*플레이어 , 선택한 땅*/) {
		/*반환 -> boolean*/
	}
	
}
/*
구현할 기능
-  보드게임판 콘솔 출력
	- 20칸
	- 출발칸 / 올림픽 / 무인도 / 황금열쇠칸
- 플레이어 2명
	- 자산설정
	- 플레이어 게임 현황 출력
- 주사위(1개)굴리기
- 주사위 굴려서 나온 수 만큼 게임말 이동
- 빈 땅에 멈추면 구매 선택 가능
- 상대방 땅에 멈추면 통행료 부과
- 출발칸 지나면 월급 +
- 올림픽 칸에 멈추면 본인이 가진 땅 중 하나를 골라 통행료 상승
- 만약 자산이 0밑으로 내려가면 가진 땅을 매각할 수 있게
- 자산이 0인데 땅도 없다면 파산하고 게임 끝
- 무인도에 멈추면 2판 멈추기 / 주사위 굴렸을때 6나오면 탈출 가능


*/