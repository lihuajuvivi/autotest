package cn.fraudmetrix.testedu;

import cn.fraudmetrix.varys.share.object.response.AdminPartnerVO;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Map;

public class TestAdminApi extends TestDubboBase{


        //提供测试数据
        @DataProvider
        public static Object[][] SetPartnerCode(){
            return new Object[][]{
                    {"vivi"},
                    {"NotExistPartnerCode"}
            };
        }

        @Test(dataProvider = "SetPartnerCode")
        public void queryPartnerByCodeExist(String var){
            AdminPartnerVO result=adminApi.queryPartnerByCode(var);

        }

}
