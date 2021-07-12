package ntt.global.aopdemo.aspect;

import ntt.global.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

@Aspect
@Component
@Order(-999)
public class MyDemoLoggingAspect
{
    @AfterThrowing(pointcut = "execution(* ntt.global.aopdemo.dao.AccountDAO.findAccount(..))", throwing = "ex")
    public void afterThrowingFindAccountsAdvice(JoinPoint joinPoint, Throwable ex)
    {
        System.out.println("======> " + joinPoint.getSignature().toShortString());
        System.out.println("======> the exception is: " + ex);
    }


    @AfterReturning(pointcut = "execution(* ntt.global.aopdemo.dao.AccountDAO.findAccount(..))", returning = "result")
    public void afterReturningFindAccountAdvice(JoinPoint joinPoint, List<Account> result)
    {
        String method = joinPoint.getSignature().toShortString();

        System.out.println("\n======> Executing @AfterReturning on method: " + method);

        System.out.println("\n======> result is: " + result);
        result.add(new Account("tony", "lead"));
        convertAccountNamesToUpperCase(result);
        System.out.println("\n======> result is: " + result);
    }

    private void convertAccountNamesToUpperCase(List<Account> result)
    {
        result.forEach(x -> x.setName(x.getName().toUpperCase()));
    }

//    @AfterReturning("execution(* ntt.global.aopdemo.dao.AccountDAO.findAccount(..))")
//    public void afterReturningFindAccountAdviceWithoutReturning(JoinPoint joinPoint)
//    {
//        String method = joinPoint.getSignature().toShortString();
//
//        System.out.println("\n======> Executing @AfterReturning without returning on method: " + method);
//
//    }



//    @Before("LuvAopExpressions.forAllExcludeGetterAndSetter()")
//    public void beforeAddAccountAdvice(JoinPoint joinPoint)
//    {
//        System.out.println("=====> logging before method running !!!");
//
//        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
//
//        System.out.println("Signature: " + methodSignature);
//
//        Object[] args = joinPoint.getArgs();
//        for(Object arg : args)
//        {
//            System.out.println("arg: " + arg);
//            if(arg instanceof Account)
//            {
//                Account account = (Account) arg;
//                System.out.println("name: " + account.getName());
//                System.out.println("level: " + account.getLevel());
//            }
//        }
//    }

}
