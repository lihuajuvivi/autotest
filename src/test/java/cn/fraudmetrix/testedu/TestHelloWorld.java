package cn.fraudmetrix.testedu;

import cn.fraudmetrix.edu.HelloWorld;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestHelloWorld {

    @Test(dataProvider = "dataprovider3",dataProviderClass=DataProviderMethod.class)
    public void testHelloWorld(String name){
        System.out.printf(new HelloWorld().sayHello());
    }
}
