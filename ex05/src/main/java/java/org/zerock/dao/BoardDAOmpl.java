package org.zerock.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.BoardVO;
@Repository
public class BoardDAOmpl implements BoardDAO {

	@Inject
	private SqlSession sql;
	
	@Override
	public void insert(BoardVO vo) throws Exception {
		sql.insert("BoardMapper.insert", vo);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		sql.update("BoardMapper.update", vo);
	}

	@Override
	public void delete(Long bno) throws Exception {
		sql.delete("BoardMapper.delete", bno);
	}

}
