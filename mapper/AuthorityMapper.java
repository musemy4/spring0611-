package com.jujumarket.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.jujumarket.domain.AdminVO;
import com.jujumarket.domain.AuthorityVO;


public interface AuthorityMapper {
	//@Select("select * from m_shop where idno>0")
	public List<AuthorityVO> getList();
	
	public void insert(AuthorityVO seller);
	
	public void insertSelectKey(AuthorityVO seller);
	
	public AuthorityVO read(String idno);
	
	public int delete(String idno);
	
	public int update(AuthorityVO seller);
}
