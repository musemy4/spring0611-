package com.jujumarket.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.jujumarket.domain.CustomerVO;
import com.jujumarket.domain.RegisterItemVO;
import com.jujumarket.domain.ShopVO;

public interface CustomerMapper {
	//@Select("select * from m_shop where idno>0")
	public List<CustomerVO> getList();
	
	public void insert(CustomerVO seller);
	
	public void insertSelectKey(CustomerVO seller);
	
	public CustomerVO read(String idno);
	
	public int delete(String idno);
	
	public int update(CustomerVO seller);
}
