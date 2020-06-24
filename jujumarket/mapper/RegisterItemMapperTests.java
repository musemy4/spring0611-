package com.jujumarket.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jujumarket.domain.RegisterItemVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class RegisterItemMapperTests {

	@Setter(onMethod_ = @Autowired)
	private RegisterItemMapper mapper;
	
//	@Test
	public void testGetList() {
		mapper.getList().forEach(register -> log.info(register));
	}
	
//	@Test
	public void testInsert() {
		RegisterItemVO register = new RegisterItemVO();
		
		register.setItemName("양파");
		register.setItemContent("손질 되있음~~");
		register.setPrice(2000);
		register.setNormPrice(2100);
		register.setStock(5);
		register.setDispStat("y");
		register.setSaleStat("판매중");
		register.setItemChr("인기제품");
		register.setItemImg("양파.jpg");
		
		mapper.insert(register);
		
		log.info(register);
	}
	
//	@Test
	public void testInsertSelectKey() {
		RegisterItemVO register = new RegisterItemVO();
		
		register.setItemName("양파222");
		register.setItemContent("손질 되있음~~2222");
		register.setPrice(20000);
		register.setNormPrice(21000);
		register.setStock(50);
		register.setDispStat("n");
		register.setSaleStat("판매중");
		register.setItemChr("인기제품22");
		register.setItemImg("양파22.jpg");
		
		mapper.insertSelectKey(register);
		
		log.info(register);
	}
	
//	@Test
	public void testRead() {
		RegisterItemVO register = mapper.read("1");
	}
	
//	@Test
	public void testDelete() {
		log.info("DELETE COUNT : " + mapper.delete("2"));
	}
	
//	@Test
	public void testUpdate() {
		RegisterItemVO register = new RegisterItemVO();
		
		register.setItemCode("1");
		register.setItemName("배추 수정");
		register.setItemContent("배추 수정 되있음~~2222");
		register.setPrice(520000);
		register.setNormPrice(521000);
		register.setStock(550);
		register.setDispStat("n");
		register.setSaleStat("판매중");
		register.setItemChr("인기제품55");
		register.setItemImg("배추55.jpg");
		
		int count = mapper.update(register);
		
		log.info("UPDATE COUNT : " + count);
	}
}
