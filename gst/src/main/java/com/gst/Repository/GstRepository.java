package com.gst.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gst.Entity.Gst;

public interface GstRepository extends JpaRepository<Gst, Integer>{
	
	@Query(value="select tax_percentage from gst where hsn=?",nativeQuery=true)
	public int getTaxByHsn(int hsn);

}