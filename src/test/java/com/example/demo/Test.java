package com.example.springboot-rabbitmq;

import com.example.fanout.FanoutSender;
import com.example.many.NeoSender;
import com.example.many.NeoSender2;
import com.example.object.ObjectSender;
import com.example.rabbbit.HelloSender;
import com.example.topic.TopicSender;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {


	@Autowired
	private HelloSender helloSender;

	@Autowired
	private NeoSender neoSender;

	@Autowired
	private NeoSender2 neoSender2;

	@Autowired
	private ObjectSender objectSender;

	@Autowired
	private TopicSender topicSender;

	@Autowired
	private FanoutSender fanoutSender;


	// 发送单条消息
	/*@org.junit.Test
	public void contextLoads() {
		helloSender.send();
	}*/
	// 发送多个用户
	/*@org.junit.Test
	public void oneToMany() {
		for (int i=0;i<100;i++){
			neoSender.send(i);
		}
	}
*/
	// manyToMany 多对多
	/*@org.junit.Test
	public void manyToMany() {
		for (int i=0;i<100;i++){
			neoSender.send(i);
			neoSender2.send(i);
		}
	}*/
	// 发送对象
	/*@org.junit.Test
	public void sendObj() {
		User user = new User();
		user.setId(1);
		user.setUsername("admin");
		user.setPassword("1234");
		objectSender.send(user);
	}*/

	// Topic 测试
/*	@org.junit.Test
	public void send1() {
		topicSender.send1();
	}
	*/
/*	@org.junit.Test
	public void send2() {
		topicSender.send2();
	}
*/
	@org.junit.Test
	public void sendFanout () {
		fanoutSender.send();
	}



}

