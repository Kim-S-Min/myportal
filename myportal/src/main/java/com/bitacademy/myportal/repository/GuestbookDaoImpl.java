package com.bitacademy.myportal.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bitacademy.myportal.vo.GuestbookVo;

@Repository	//	이름을 명시하지 않으면 클래스 이름을 기반으로 자동으로 명명된다
//	-> guestbookDaoImpl 이름을 bean에 등록
//	@Repository("guestbookDao")
public class GuestbookDaoImpl implements GuestbookDao {

	@Override
	public List<GuestbookVo> selectAll() {
		//	가상 데이터: 단순 텍스트 출력이라 한글은 ???로 표시된다
		//		-> encoding이 적용되는 출력은 JSP파일에서 출력을 하면 된다
		//	TODO: 실제 DB와 연결해보자
		List<GuestbookVo> list = new ArrayList<>();
		//	Long no, String name, String password, String content, Date regDate
		list.add(new GuestbookVo(1L, "홍길동", "1234", "왔다갑니다", new Date()));
		list.add(new GuestbookVo(2L, "장길산", "pass", "저두요", new Date()));
		list.add(new GuestbookVo(3L, "전우치", "test", "반갑습니다", new Date()));
		return list;
	}

	@Override
	public int insert(GuestbookVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(GuestbookVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
