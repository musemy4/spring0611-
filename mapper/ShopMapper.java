package com.jujumarket.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.jujumarket.domain.RegisterItemVO;
import com.jujumarket.domain.ShopVO;

public interface ShopMapper {
	//@Select("select * from m_shop where idno>0")
	public List<ShopVO> getList();
	
	public void insert(ShopVO seller);
	
	public void insertSelectKey(ShopVO seller);
	
	public ShopVO read(String idno);
	
	public int delete(String idno);
	
	public int update(ShopVO seller);
}
