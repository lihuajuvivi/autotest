package cn.fraudmetrix.testedu;

        import cn.fraudmetrix.varys.share.api.inf.AdminApi;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDubboBase {
    public static AdminApi adminApi;

    static {
        //读取配置，引用服务
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring/*.xml");
        adminApi=(AdminApi)context.getBean("adminApi");

    }

}
