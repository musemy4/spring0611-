package com.jujumarket.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jujumarket.domain.AdminVO;
import com.jujumarket.domain.CustomerVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class CustomerMapperTests {
	@Setter(onMethod_=@Autowired)
	private CustomerMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(member->log.info(member));
	}
	
	@Test
	public void testInsert() {
		CustomerVO cu = new CustomerVO();
		cu.setContact("010-111-1111");
		cu.setPwd("1234");
		cu.setAuthcode("AD12");
		
		mapper.insert(cu);
		log.info(cu);
	}
	
	@Test
	public void testInsertSelectKey() {
		CustomerVO cu = new CustomerVO();
		cu.setContact("010-111-1111");
		cu.setPwd("1234");
		cu.setAuthcode("AD12");
		
		mapper.insertSelectKey(cu);
		log.info(cu);
	}
	
	@Test
	public void testRead() {
		CustomerVO cu = mapper.read("30");
		log.info(cu);
	}
	
	@Test
	public void testDelete() {
		log.info("DELETE COUNT : " + mapper.delete("31"));
		
	}
	
	@Test
	public void testUpdate() {
		CustomerVO cu = new CustomerVO();
		cu.setIdno("32");
		cu.setContact("010-111-1111");
		cu.setPwd("1234");
		cu.setAuthcode("AD12");
		
		int count = mapper.update(cu);
		
		log.info("UPDATE COUNT : " + count);
	}
}
