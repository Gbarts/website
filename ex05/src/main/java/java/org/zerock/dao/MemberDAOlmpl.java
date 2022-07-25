package org.zerock.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.zerock.dto.MemberDTO;

public class MemberDAOlmpl implements MemberDAO {

	@Inject
	SqlSession sql;
	@Override
	public String logincheck(MemberDTO dto) {
		// TODO Auto-generated method stub
		return sql.selectOne("member.login,check", dto);
	}

}
