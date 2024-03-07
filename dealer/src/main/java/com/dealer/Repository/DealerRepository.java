package com.dealer.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dealer.Entity.DealerEntity;

public interface DealerRepository extends JpaRepository<DealerEntity,Integer>{
	
	@Query(value="select d from DealerEntity d where d.product=:product")//jpa query,this is not native query so we dont put native query = true
	public List<DealerEntity> getByProduct(@Param (value="product") String product);
	
	@Query(value="select d from DealerEntity d where d.rating>=:rate")
	public List<DealerEntity> getByRating(@Param (value="rate") float rate);

	@Query(value = "select d.name from DealerEntity d  where d.name like %:ch") // not working
	public List<DealerEntity> getNameByFirstLetter(@Param (value="ch") char ch);
	
	@Query(value="select * from dealer where name=?",nativeQuery=true)
	public List<DealerEntity> getByName(String name);
	
	}
