package com.optimal.coinCombination.context;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import com.optimal.coinCombination.context.bean.CoinMapBean;

public class CoinCombinationProcess {

	// las optimas combination
	private LinkedHashMap<String,Integer> coinsOptCom = new LinkedHashMap<String,Integer>();
	private LinkedHashMap<String,Integer> result=new LinkedHashMap<>();
	
	// Generar la siguiente key 
	private String getNextCoinKey(LinkedHashMap<String,BigDecimal> coinsMap,String currentKey) {
		String nextKey = "";
		Iterator<Entry<String, BigDecimal>> itr = coinsMap.entrySet().iterator(); 
        while(itr.hasNext()) 
        { 
        	 Entry<String, BigDecimal> entry = itr.next();
        	  
             if(currentKey == entry.getKey()) {
            	 nextKey = (String) itr.next().getKey();
             }    
        } 
		return nextKey;
	}
	
	
	public LinkedHashMap<String, Integer> processingChange(String key,BigDecimal amount) {
		CoinMapBean coinMapBean = null;
		
		LinkedHashMap<String,BigDecimal> coinsTypeMap = CoinCombinationConstants.getAllCoinsType();
		BigDecimal valueCoin = coinsTypeMap.get(key);
		BigDecimal moduleValue =amount.remainder(valueCoin) ;
		Integer quotient = (amount.divide(valueCoin)).intValue();
			
		if(moduleValue.compareTo(new BigDecimal("0")) == 0) {
			// setting the Map
			coinsOptCom.put(key,quotient);
			
			coinMapBean = new CoinMapBean(coinsOptCom);	
			result = coinMapBean.getOptComMap();
		}
		else {
			// setting the Map
			String nextKeysCoin = getNextCoinKey(coinsTypeMap,key);
			coinsOptCom.put(key,quotient);
			processingChange(nextKeysCoin,moduleValue);
			
			
		}
		return result;
		
	}
	
	public LinkedHashMap<String,Integer> processingChange(BigDecimal amount) {
		return processingChange("silverDollar",amount);
	}
	public LinkedHashMap<String,Integer> getCombination(BigDecimal amount) {	
		return processingChange(amount);
	}
}
