package cn.fraudmetrix.testedu;

import cn.fraudmetrix.edu.HelloWorld;
import cn.fraudmetrix.varys.share.api.inf.AdminApi;
import cn.fraudmetrix.varys.share.object.response.AdminPartnerVO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestHelloWorld {

    @Test(dataProvider = "dataprovider3",dataProviderClass=DataProviderMethod.class)
    public void testHelloWorld(String name){
        System.out.printf(new HelloWorld().sayHello());
    }

}
