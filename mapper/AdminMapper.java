package com.jujumarket.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.jujumarket.domain.AdminVO;


public interface AdminMapper {
	//@Select("select * from m_shop where idno>0")
	public List<AdminVO> getList();
	
	public void insert(AdminVO seller);
	
	public void insertSelectKey(AdminVO seller);
	
	public AdminVO read(String idno);
	
	public int delete(String idno);
	
	public int update(AdminVO seller);
}
