package cn.fraudmetrix.testedu;

import org.testng.annotations.Test;
/**
 * 第二种，测试代码和测试数据不在同一个类中
 */
public class TestDataProviderNotSameClass {
    @Test(dataProvider="NoNameMethod",dataProviderClass=DataProviderMethod.class)
    public void doTestNG(String testdatas) {
        System.out.println("未指定名称，数据源名为方法名NoNameMethod:"+testdatas);
    }

    @Test(dataProvider="dataprovider1",dataProviderClass=DataProviderMethod.class)
    public void doTestNG1(String testdatas){
        System.out.println("指定名称，数据源名称选择了dataprovider1:"+testdatas);
    }

    @Test(dataProvider="dataprovider2",dataProviderClass=DataProviderMethod.class)
    public void doTestNG2(String testdatas){
        System.out.println("指定名称，数据源名称选择了dataprovider2:"+testdatas);
    }
}
