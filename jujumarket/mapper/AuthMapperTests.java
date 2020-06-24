package com.jujumarket.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jujumarket.domain.AdminVO;
import com.jujumarket.domain.AuthorityVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class AuthMapperTests {
	@Setter(onMethod_=@Autowired)
	private AuthorityMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(member->log.info(member));
	}
	
	@Test
	public void testInsert() {
		AuthorityVO auth = new AuthorityVO();
		auth.setAuthName("包府磊");
		auth.setAuthRange("AD12");
		auth.setAuthBen("驱琶1");
		mapper.insert(auth);
		log.info(auth);
	}
	
	@Test
	public void testInsertSelectKey() {
		AuthorityVO auth = new AuthorityVO();
		auth.setAuthName("包府磊");
		auth.setAuthRange("AD12");
		auth.setAuthBen("驱琶1");
		
		mapper.insertSelectKey(auth);
		log.info(auth);
	}
	
	@Test
	public void testRead() {
		AuthorityVO auth = mapper.read("29");
		log.info(auth);
	}
	
	@Test
	public void testDelete() {
		log.info("DELETE COUNT : " + mapper.delete("28"));
		
	}
	
	@Test
	public void testUpdate() {
		AuthorityVO auth = new AuthorityVO();
		auth.setAuthCode("29");
		auth.setAuthName("包府磊");
		auth.setAuthRange("AD12");
		auth.setAuthBen("驱琶1");
		
		int count = mapper.update(auth);
		
		log.info("UPDATE COUNT : " + count);
	}
}
