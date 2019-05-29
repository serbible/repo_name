package org.zerock.sample;
//69
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
//@AllArgsConstructor:클래스내에서 변수로 선언된 것에 대해서 생성자 만들때 파라미터 변수로 모두 사용.
@Component
@ToString
@Getter
@AllArgsConstructor
public class SampleHotel2 {
   
	private Chef chef;

//	public SampleHotel2(Chef chef) {
//		this.chef = chef;
//	}
	
	
}
