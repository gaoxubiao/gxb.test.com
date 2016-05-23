package com.gxb.test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.junit.Test;

public class DeEncode {
	
	public static String decodeStr(String str,String charsetType) throws UnsupportedEncodingException{
		
		
		return URLDecoder.decode(str, charsetType);
	}
	public static String encodeStr(String str,String charsetType) throws UnsupportedEncodingException{
		return URLEncoder.encode(str, charsetType);
	}
	
	
	@Test
	public void test() throws UnsupportedEncodingException{
		String testStr="这是一个测试数据aaaaatest看看12323232";
		System.err.println("编码str:"+encodeStr(testStr, "UTF-8"));
		System.err.println("解码str:"+decodeStr(testStr, "UTF-8"));
		String waitDecodeStr="%7B%22objlist%22%3A%22%5B%7B%5C%22wxxx%5C%22%3A%5B%7B%5C%22dqdz%5C%22%3A%5C%22%E9%AB%98%E6%96%B0%E8%B7%AF-%E5%BC%80%E5%8F%91%E5%8C%BA%E6%94%AF%E8%A1%8C%EF%BC%88%E6%97%A5%E7%AB%8B%EF%BC%89-CRS4%5C%22%2C%5C%22end_time%5C%22%3A%5C%2220160519124807%5C%22%2C%5C%22factgzcontent%5C%22%3A0%2C%5C%22prepairresultbz%5C%22%3A%5C%22%5C%22%2C%5C%22bankcardbz%5C%22%3A%5C%22+%5C%22%2C%5C%22prepairresult%5C%22%3A1%2C%5C%22sbid%5C%22%3A1310%2C%5C%22getmessage_time%5C%22%3A%5C%2220160519%5C%22%2C%5C%22caseid%5C%22%3A%5C%222016051901388%5C%22%2C%5C%22bankcard%5C%22%3A%5C%22%5C%22%2C%5C%22kcnumber%5C%22%3A0%7D%5D%2C%5C%22envirment_check%5C%22%3A%5B%7B%5C%22checkEleven%5C%22%3A%5C%22%E5%AE%8C%E5%A5%BD%5C%22%2C%5C%22person%5C%22%3A%5C%220%5C%22%2C%5C%22status%5C%22%3A%5C%222%5C%22%2C%5C%22remark%5C%22%3A%5C%22%E6%97%A0%5C%22%2C%5C%22checkFirst%5C%22%3A%5C%22%E5%AE%8C%E5%A5%BD%5C%22%2C%5C%22imei%5C%22%3A%5C%220%5C%22%2C%5C%22checkNine%5C%22%3A%5C%22%E5%AE%8C%E5%A5%BD%5C%22%2C%5C%22checkFive%5C%22%3A%5C%22%E5%AE%8C%E5%A5%BD%5C%22%2C%5C%22type%5C%22%3A%5C%22610%5C%22%2C%5C%22checkSeven%5C%22%3A%5C%22%E5%AE%8C%E5%A5%BD%5C%22%2C%5C%22checkThree%5C%22%3A%5C%22%E5%AE%8C%E5%A5%BD%5C%22%2C%5C%22checkTen%5C%22%3A%5C%22%E5%AE%8C%E5%A5%BD%5C%22%2C%5C%22id%5C%22%3A%5C%2219%5C%22%2C%5C%22wddz%5C%22%3A%5C%22%E9%AB%98%E6%96%B0%E8%B7%AF-%E5%BC%80%E5%8F%91%E5%8C%BA%E6%94%AF%E8%A1%8C%EF%BC%88%E6%97%A5%E7%AB%8B%EF%BC%89-CRS4%5C%22%2C%5C%22checkTwelve%5C%22%3A%5C%22%E5%AE%8C%E5%A5%BD%5C%22%2C%5C%22checkUsers%5C%22%3A%5C%22%E7%8E%8B%E7%AB%8B%E6%A1%A5%2C%E5%A7%9A%E9%87%91%E6%88%90%5C%22%2C%5C%22checkFour%5C%22%3A%5C%22%E5%AE%8C%E5%A5%BD%5C%22%2C%5C%22checkEight%5C%22%3A%5C%22%E5%AE%8C%E5%A5%BD%5C%22%2C%5C%22en_type%5C%22%3A%5C%22null%5C%22%2C%5C%22checkTwo%5C%22%3A%5C%22%E5%AE%8C%E5%A5%BD%5C%22%2C%5C%22checkDate%5C%22%3A%5C%22201605191117%5C%22%2C%5C%22checkSix%5C%22%3A%5C%22%E5%AE%8C%E5%A5%BD%5C%22%2C%5C%22sbgyh%5C%22%3A%5C%22610000400320%5C%22%2C%5C%22sbid%5C%22%3A%5C%221310%5C%22%7D%5D%7D%5D%22%2C%22cardnumber%22%3A%22898600%22%2C%22messagestring%22%3A%22%22%2C%22tradecode%22%3A%2215%22%2C%22imei%22%3A%22352482033730841%22%2C%22prefix%22%3A%22Ebring%22%7D";
		System.err.println(decodeStr(waitDecodeStr, "UTF-8"));
		
		
	}

}
