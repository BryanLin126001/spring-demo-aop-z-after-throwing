package ntt.global.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(999)
public class MyApiAnalyticsAspect
{
//    @Before("LuvAopExpressions.forAllExcludeGetterAndSetter()")
//    public void performApiAnalytics()
//    {
//        System.out.println("=====> logging Perform API Analytics !!!");
//    }
}
