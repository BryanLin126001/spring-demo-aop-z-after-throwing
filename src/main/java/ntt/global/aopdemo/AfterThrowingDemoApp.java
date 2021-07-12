package ntt.global.aopdemo;

import ntt.global.aopdemo.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AfterThrowingDemoApp
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

        List<Account> accountList = null;

        try
        {
            boolean tripWire = true;
            accountList = accountDAO.findAccount(true);
        }
        catch (Exception ex)
        {
            System.out.println("\n\nMain program ... caught exception: " + ex);
        }


        System.out.println("\n\nMain Program: AfterThrowingDemoApp");
        System.out.println("----");
        System.out.println(accountList);
        System.out.println("\n");

        context.close();

    }
}
