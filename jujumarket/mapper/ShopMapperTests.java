package com.jujumarket.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jujumarket.domain.RegisterItemVO;
import com.jujumarket.domain.ShopVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ShopMapperTests {
	@Setter(onMethod_=@Autowired)
	private ShopMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(member->log.info(member));
	}
	
	@Test
	public void testInsert() {
		ShopVO seller = new ShopVO();
		seller.setShopname("상인2");
		seller.setCustomnum(0);
		seller.setPwd("1234");
		seller.setShopaddr("상인2의 주소");
		seller.setContact1("010-0000-0000");
		seller.setContact2("02-0000-0000");
		
		
	}
	
	@Test
	public void testInsertSelectKey() {
		ShopVO seller = new ShopVO();
		seller.setShopname("상인3");
		seller.setCustomnum(0);
		seller.setPwd("1234");
		seller.setShopaddr("상인3의 주소");
		seller.setContact1("010-0000-0000");
		seller.setContact2("02-0000-0000");
		
		
		log.info(seller);
	}
	
	@Test
	public void testRead() {
		ShopVO seller = mapper.read("5");
		log.info(seller);
	}
	
	@Test
	public void testDelete() {
		log.info("DELETE COUNT : " + mapper.delete("3"));
		
	}
	
	@Test
	public void testUpdate() {
		ShopVO seller = new ShopVO();
		
		seller.setIdno("1");
		seller.setShopname("상인5");
		seller.setCustomnum(0);
		seller.setPwd("1234");
		seller.setShopaddr("상인5의 주소");
		seller.setContact1("010-0005-0000");
		seller.setContact2("02-0005-0000");
		
		int count = mapper.update(seller);
		
		log.info("UPDATE COUNT : " + count);
	}
}
