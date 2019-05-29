package org.zerock.sample;
//70
import org.springframework.stereotype.Component;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
//@RequiredArgsConstructor:클래스내의 변수중에서  특정한 변수에 대해서 생성자를 만들때
//                        NonNull이나 final이 붙은 변수에 대해서만 적용
@Component
@ToString
@Getter
@RequiredArgsConstructor
public class SampleHotel3 {
   
	@NonNull
	private Chef chef;

//	public SampleHotel2(Chef chef) {
//		this.chef = chef;
//	}
	
	
}
