package com.phone.mobile;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MobileRepository extends JpaRepository<Mobile, Integer>{
	
	
	@Query(value="select * from mobile where price>=? and price<=?",nativeQuery=true)//native query
	public List<Mobile> getByPrice(int price1,int price2);
	
	@Query(value="select * from mobile where brandname like ?%",nativeQuery=true)//native query
	public List<Mobile> getNameByStartLetter(char ch);
	
	@Query(value="select * from mobile where price<=? and ram=:?",nativeQuery=true)//native query
	public List<Mobile> getFilterByPrice(int price,String ram);

}
