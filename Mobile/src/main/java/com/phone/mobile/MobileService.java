package com.phone.mobile;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MobileService {
	@Autowired
	MobileDao mobiledao;
	public String saveMobileData(Mobile m) {
		return mobiledao.saveMobileData(m);
	}

	public String saveAllMobileData(List<Mobile> m) {
		return mobiledao.saveAllMobileData(m);
	}

	public List<Mobile> findAllMobileData() {
		return mobiledao.findAllMobileData();
	}

	public Optional<Mobile> findMobileDataById(int a) {		
		return mobiledao.findMobileDataById(a);
	}

	public String deleteMobileDataById(int a) {
		
		return mobiledao.deleteMobileDataById(a);
	}

	public List<Integer> getDiscountPrice() {
		List<Mobile> allDetails=mobiledao.findAllMobileData();
		List<Integer> discountValues=allDetails.stream().map(x->(x.getPrice()-x.getPrice()*x.getDiscount()/100)).collect(Collectors.toList());
		return discountValues;
	}

	public List<String> getUniqueBrandName() {
		List<Mobile> allDetails=mobiledao.findAllMobileData();
		List<String> uniqueBrand=allDetails.stream().map(x->x.getBrandname()).distinct().collect(Collectors.toList());
		return uniqueBrand;
	}

	public Optional<Mobile> secondHighestPrice() {
		List<Mobile> allDetails=mobiledao.findAllMobileData();
		Optional<Mobile> secondHighest=allDetails.stream().sorted(Comparator.comparingInt(Mobile::getPrice).reversed()).skip(1).limit(1).findFirst();
		return secondHighest;
	}

	public List<String> takeBrandMiddleLetter() {
		
		
		List<Mobile> allDetails=mobiledao.findAllMobileData();
		List<String> result=new ArrayList<>();
			for(int i=0;i<allDetails.size();i++) {
				int s=allDetails.get(i).getBrandname().length()/2;
				int length=allDetails.get(i).getBrandname().length();
				if(length%2==0) {
					result.add(allDetails.get(i).getBrandname().substring(s-1,s+1));
				}
				else {
					result.add(allDetails.get(i).getBrandname().substring(s,s+1));
				}
			}
			return result;
		
//		
//		List<Mobile> allDetails=mobiledao.findAllMobileData();
//		List<String> brandNames=allDetails.stream().map(x->x.getBrandname()).collect(Collectors.toList());
//		List<String> result=new ArrayList<>();
//				brandNames.stream().forEach(x->{
//			if(x.length()%2==0) {
//				result.add(x.substring(x.length()/2-1,x.length()/2+1));
//			}else {
//				result.add(x.substring(x.length()/2-1,x.length()/2));
//			}
//		});
				
				
				
//		List<String> result1=brandNames.stream().filter(x->(x.length()%2)==0).map(x->(x.substring(x.length()/2-1, x.length()/2+1))).collect(Collectors.toList());
//		List<String> result2=brandNames.stream().filter(x->(x.length()%2)!=0).map(x->(x.substring(x.length()/2-1, x.length()/2))).collect(Collectors.toList());
//		List<String> result=new ArrayList<>();
//		for (String a : result1) {
//			result.add(a);
//        }
//		for (String a : result2) {
//			result.add(a);
//        }
//		
//		return result;
	}

	public List<Mobile> getByPrice(int sal1, int sal2) {
		
		return mobiledao.getByPrice(sal1,sal2);
	}

	public List<Mobile> getNameByStartLetter(char ch) {
		
		return mobiledao.getNameByStartLetter(ch);
	}
	
	public List<Mobile> getFilterByPrice(int price,String ram){
		return mobiledao.getFilterByPrice(price,ram);
	}
	
	
	
}

