package com.jujumarket.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.jujumarket.domain.Shop_infoVO;

public interface Shop_infoMapper {
	//@Select("select * from m_shop where idno>0")
	public List<Shop_infoVO> getList();
	
	public void insert(Shop_infoVO seller);
	
	public void insertSelectKey(Shop_infoVO seller);
	
	public Shop_infoVO read(String idno);
	
	public int delete(String idno);
	
	public int update(Shop_infoVO seller);
}
