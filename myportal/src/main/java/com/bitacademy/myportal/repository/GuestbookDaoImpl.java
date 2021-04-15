package com.bitacademy.myportal.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitacademy.myportal.vo.GuestbookVo;

@Repository	//	이름을 명시하지 않으면 클래스 이름을 기반으로 자동으로 명명된다
//	-> guestbookDaoImpl 이름을 bean에 등록
//	@Repository("guestbookDao")
public class GuestbookDaoImpl implements GuestbookDao {
	
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<GuestbookVo> selectAll() {
		//	TODO: 예외전환 처리
		List<GuestbookVo> list = sqlSession.selectList("guestbook.selectAll");
		System.out.println("방명록: " + list);
		return list;
	}

	@Override
	public int insert(GuestbookVo vo) {
		int insertedCount = sqlSession.insert("guestbook.insert", vo);
		return insertedCount;
	}

	@Override
	public int delete(GuestbookVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
