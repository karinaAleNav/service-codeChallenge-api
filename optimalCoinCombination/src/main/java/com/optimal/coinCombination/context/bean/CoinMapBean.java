package com.optimal.coinCombination.context.bean;

import java.util.LinkedHashMap;

public class CoinMapBean {
	private LinkedHashMap<String,Integer> optComMap;
	
	public CoinMapBean(LinkedHashMap<String, Integer> optComMap){
		LinkedHashMap<String,Integer> baseMap = new LinkedHashMap<String,Integer>();
		
		baseMap.put("silverDollar",0 );
		baseMap.put("halfDollar",0);
		baseMap.put("quarter",0);
		baseMap.put("dime",0);
		baseMap.put("nickel",0);
		baseMap.put("penny",0);

		baseMap.forEach((key, value) -> optComMap.merge(key, value, (oldValue, newValue) -> oldValue + newValue));
		this.optComMap = optComMap;
		
	}

	public LinkedHashMap<String, Integer> getOptComMap() {
		
		return optComMap;
	}
	
	
}
