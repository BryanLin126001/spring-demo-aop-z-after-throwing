package ntt.global.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyCloudAsyncAspect
{
//    @Before("LuvAopExpressions.forAllExcludeGetterAndSetter()")
//    public void logToCloudAsync()
//    {
//        System.out.println("=====> logging to Cloud in async function !!!");
//    }
}
