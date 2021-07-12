package ntt.global.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LuvAopExpressions
{
    @Pointcut("execution(public *  ntt.global.aopdemo.*.*.* (..))")
    public void forDaoPackage(){}

    @Pointcut("execution(public *  ntt.global.aopdemo.dao.AccountDAO.get*(..))")
    public void forGetter(){}

    @Pointcut("execution(public *  ntt.global.aopdemo.dao.AccountDAO.set*(..))")
    public void forSetter(){}

    @Pointcut("forDaoPackage() && !(forSetter() || forGetter())")
    public void forAllExcludeGetterAndSetter(){}
}
