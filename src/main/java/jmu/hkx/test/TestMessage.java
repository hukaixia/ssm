package jmu.hkx.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.hkx.dao.MessageMapper;
import jmu.hkx.dao.UserMapper;
import jmu.hkx.service.MessageService;
import jmu.hkx.vo.Message;
import jmu.hkx.vo.MessageExample;
import jmu.hkx.vo.User;

public class TestMessage {

    @Test
    public void testTransfer() throws ParseException{
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        MessageMapper messageMapper=(MessageMapper) ac.getBean("messageMapper");
       // UserService userMapper=(UserService) ac.getBean("userService");
        SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  

        Date date =new Date();  
        String d = myFormatter.format(date);
        System.out.println(d);
        Message message = new Message(0,"鞋子质量如何？，容易脏吗？",d,0,2,"2017110111");
        int count = messageMapper.insertSelective(message);
        System.out.println(count);
//        System.out.println(  message.getUser().getUsername());
    }
    
    @Test
    public void TesrWithUser(){
    	  ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
    	  MessageService messageMapper=(MessageService) ac.getBean("messageService");
    	  MessageExample me = new MessageExample();
    	  me.createCriteria().andProductidEqualTo(3);
    	  List<Message> list =messageMapper.selectByExampleWithUser(me);
          for(Message m:list)
        	  System.out.println(m.toString());
    }
}
