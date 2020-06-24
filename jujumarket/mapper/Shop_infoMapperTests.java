package com.jujumarket.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jujumarket.domain.RegisterItemVO;
import com.jujumarket.domain.ShopVO;
import com.jujumarket.domain.Shop_infoVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class Shop_infoMapperTests {
	@Setter(onMethod_=@Autowired)
	private Shop_infoMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(member->log.info(member));
	}
	
	@Test
	public void testInsert() {
		Shop_infoVO seller = new Shop_infoVO();
		seller.setBusinessCode("000");
		seller.setBusinessRegFile("000");
		seller.setBank("신한");
		seller.setBankaccount("000");
		seller.setThumbImg("0.jpg");
		seller.setBackImg("back0.jpg");
		seller.setAuthcode("s");
		
		mapper.insert(seller);
		log.info(seller);
	}
	
	@Test
	public void testInsertSelectKey() {
		Shop_infoVO seller = new Shop_infoVO();
		seller.setBusinessCode("000");
		seller.setBusinessRegFile("000");
		seller.setBank("신한");
		seller.setBankaccount("000");
		seller.setThumbImg("0.jpg");
		seller.setBackImg("back0.jpg");
		seller.setAuthcode("D12");
		
		mapper.insertSelectKey(seller);
		log.info(seller);
	}
	
	@Test
	public void testRead() {
		Shop_infoVO seller = mapper.read("18");
		log.info(seller);
	}
	
	@Test
	public void testDelete() {
		log.info("DELETE COUNT : " + mapper.delete("19"));
		
	}
	
	@Test
	public void testUpdate() {
		Shop_infoVO seller = new Shop_infoVO();
		seller.setIdno("20");
		seller.setBusinessCode("000ch");
		seller.setBusinessRegFile("000ch");
		seller.setBank("신한ch");
		seller.setBankaccount("000ch");
		seller.setThumbImg("0ch.jpg");
		seller.setBackImg("back0ch.jpg");
		seller.setAuthcode("D12ch");
		
		
		int count = mapper.update(seller);
		
		log.info("UPDATE COUNT : " + count);
	}
}
