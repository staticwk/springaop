package demo.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyBook {

    //前置增强
    @Before(value = "execution(* demo.spring.aop.Book.*(..))")
    public void before() {
        System.out.println("前置增强........");
    }

    //后置增强
    @AfterReturning(value = "execution(* demo.spring.aop.Book.*(..))")
    public void after() {
        System.out.println("后置增强........");
    }

    //环绕增强
    @Around(value = "execution(* demo.spring.aop.Book.*(..))")
    public void arround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //方法之前执行的代码
        System.out.println("环绕增强 方法之前执行........");

        //执行被增强的方法
        proceedingJoinPoint.proceed();

        //方法之后执行的代码
        System.out.println("环绕增强 方法之后执行........");
    }
}
