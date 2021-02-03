package com.optimal.coinCombination.context;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

public class CoinCombinationConstants {
	private static final BigDecimal silverDollar = new BigDecimal("1.00");
	private static final BigDecimal halfDollar = new BigDecimal("0.50");
	private static final BigDecimal quarter=new BigDecimal("0.25");
	private static final BigDecimal dime=new BigDecimal("0.10");
	private static final BigDecimal nickel=new BigDecimal("0.05");
	private static final BigDecimal penny=new BigDecimal("0.01");
	
	public static final LinkedHashMap<String,BigDecimal> getAllCoinsType() {
		LinkedHashMap<String, BigDecimal> allCoinsType = new LinkedHashMap<String,BigDecimal>();
		
		allCoinsType.put("silverDollar",silverDollar );
		allCoinsType.put("halfDollar",halfDollar );
		allCoinsType.put("quarter",quarter );
		allCoinsType.put("dime",dime );
		allCoinsType.put("nickel",nickel );
		allCoinsType.put("penny",penny);
		return allCoinsType;
	}
}
