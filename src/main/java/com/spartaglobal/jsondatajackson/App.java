package com.spartaglobal.jsondatajackson;

import jacksonDeserialisation.RatesDeserialiser;
import jacksonManualParsing.JacksonManualExample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        RatesDeserialiser ratesDeserialiser = new RatesDeserialiser("resources/rates.json");
        System.out.println(ratesDeserialiser.ratesMapped.getDate());

    }
}
