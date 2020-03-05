package cn.fraudmetrix.testedu;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * 第一种：一种是在测试代码和测试数据放在同一个类中
 */
public class TestDataProviderInSameClass {
    @DataProvider(name = "test1")
    public static Object[][] primeNumbers() {
        return new Object[][] { { 2, true ,"hi"}, { 6, false ,"test"}, { 19, true ,"good"},
                { 22, false ,"aha"}, { 23, true ,"loo"} };
    }

    //参数必须要一致
    @Test(dataProvider = "test1")
    public void testPrimeNumberChecker(Integer inputNumber,
                                       Boolean expectedResult, String test) {
        System.out.println(inputNumber + " " + expectedResult+" "+test);

    }
}
