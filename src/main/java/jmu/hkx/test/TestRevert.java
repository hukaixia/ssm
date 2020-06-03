package jmu.hkx.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.hkx.dao.MessageMapper;
import jmu.hkx.dao.RevertMapper;
import jmu.hkx.vo.Message;
import jmu.hkx.vo.Revert;
import jmu.hkx.vo.RevertExample;

public class TestRevert {
	    @Test
	    public void TestRevert() throws ParseException{
	        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	        RevertMapper revertMapper=(RevertMapper) ac.getBean("revertMapper");
	        SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  

	        Date date =new Date();  
	        String d = myFormatter.format(date);
	        System.out.println(d);
	        RevertExample re = new RevertExample();
	        re.createCriteria().andMessageidEqualTo(22);
	        List<Revert> reverts = revertMapper.selectByExampleWithUser(re);
	        for(Revert r: reverts)
	        System.out.println(r.getUser().toString());
//	        System.out.println(count);
//	        Revert revert = revertMapper.selectByPrimaryKey(3);
//	        System.out.println(revert.toString());
//	        System.out.println(  message.getUser().getUsername());
	    }
	    
}
