package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	@Select("SELECT sysdate FROM dual")
	public String getTime();
	//99
	public String getTime2();

}
