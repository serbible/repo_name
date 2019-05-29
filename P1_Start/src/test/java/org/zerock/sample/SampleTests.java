package org.zerock.sample;
//61
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
//@ContextConfiguration: 필요한 객체들을 스프링내에 객체로 등록 사용할 목적
//@RunWith: 테스트에 필요한 클래스 선택시 지정
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml")
@Log4j
public class SampleTests {

	@Setter(onMethod_ = @Autowired)
	private Restaurant restaurant;
	
	@Test
	public void testExist() {
		//restaurant변수 null이 아니어야 테스트 성공을 의미
		assertNotNull(restaurant);
		log.info(restaurant);
		log.info("-------------------------");
		log.info(restaurant.getChef());
	}
}
