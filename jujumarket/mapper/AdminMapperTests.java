package com.jujumarket.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jujumarket.domain.AdminVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class AdminMapperTests {
	@Setter(onMethod_=@Autowired)
	private AdminMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(member->log.info(member));
	}
	
	@Test
	public void testInsert() {
		AdminVO admin = new AdminVO();
		admin.setPwd("1234");
		admin.setAuthcode("AD12");
		
		mapper.insert(admin);
		log.info(admin);
	}
	
	@Test
	public void testInsertSelectKey() {
		AdminVO admin = new AdminVO();
		admin.setPwd("1234");
		admin.setAuthcode("AD12");
		
		mapper.insertSelectKey(admin);
		log.info(admin);
	}
	
	@Test
	public void testRead() {
		AdminVO admin = mapper.read("25");
		log.info(admin);
	}
	
	@Test
	public void testDelete() {
		log.info("DELETE COUNT : " + mapper.delete("22"));
		
	}
	
	@Test
	public void testUpdate() {
		AdminVO admin = new AdminVO();
		admin.setIdno("24");
		admin.setPwd("4321");
		admin.setAuthcode("AD123");
		int count = mapper.update(admin);
		
		log.info("UPDATE COUNT : " + count);
	}
}
