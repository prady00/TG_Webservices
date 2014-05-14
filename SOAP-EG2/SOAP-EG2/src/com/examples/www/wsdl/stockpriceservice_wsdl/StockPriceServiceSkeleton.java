
/**
 * StockPriceServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package com.examples.www.wsdl.stockpriceservice_wsdl;

import stockpriceservice.examples.StockPriceResponse;
    /**
     *  StockPriceServiceSkeleton java skeleton for the axisService
     */
    public class StockPriceServiceSkeleton implements StockPriceServiceSkeletonInterface{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param stockPrice0 
             * @return stockPriceResponse1 
         */
        
                 public stockpriceservice.examples.StockPriceResponse stockPrice
                  (
                  stockpriceservice.examples.StockPrice stockPrice0
                  )
            {
				StockPriceResponse stockPriceResponse = new StockPriceResponse();
				
				if(stockPrice0.getCompany().equals("Orange")){
					stockPriceResponse.setPrice(22.5);
				}else{
					stockPriceResponse.setPrice(22.4);					
				}
				
				return stockPriceResponse ;
                                	 
        }
     
    }
    