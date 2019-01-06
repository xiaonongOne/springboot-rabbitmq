package com.example.demo;

import com.example.header.ApiCreditSender;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {

	@Autowired
	private ApiCreditSender sender;

	@org.junit.Test
	public void test_creditBank_type() {
		Map<String,Object> head = new HashMap<>();
		head.put("type", "cash");
		sender.creditBank(head, "银行授信(部分匹配)");
	}

	@org.junit.Test
	public void test_creditBank_all() {
		Map<String,Object> head = new HashMap<>();
		head.put("type", "cash");
		head.put("aging", "fast");
		sender.creditBank(head, "银行授信(全部匹配)");
	}

	@org.junit.Test
	public void test_creditFinance_type() {
		Map<String,Object> head = new HashMap<>();
		head.put("type", "cash");
		sender.creditFinance(head, "金融公司授信(部分匹配)");
	}

	@org.junit.Test
	public void test_creditFinance_all() {
		Map<String,Object> head = new HashMap<>();
		head.put("type", "cash");
		head.put("aging", "fast");
		sender.creditFinance(head, "金融公司授信(全部匹配)");
	}
}




