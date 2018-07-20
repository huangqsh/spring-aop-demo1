package org.huangqsh.aop.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectConfig {
	/**
	 * 
	 * 对add方法拦截
	 */
//	 第一个*表示匹配任意的方法返回值
//	 * ..(两个点)表示零个或多个，上面的第一个..表示service包及其子包
//	 * 第二个*表示所有类,第三个*表示所有方法，第二个..表示方法的任意参数个数
	@Pointcut("execution(* org.huangqsh.aop.service..*.add*(..))")
	public void checkAdd(){
		System.out.println("**************The System is Searching Information For You****************");
	}
	
	@Before("checkAdd()")
	public void beforeAdd(){
		System.out.println(">>>>>>>>　add前执行..........");
	}
	
	@After("checkAdd()")
	public void afterAdd(){
		System.out.println(">>>>>>>>　add后执行..........");
	}
	 //声明环绕通知  
    @Around("checkAdd()")  
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {  
        System.out.println("进入方法---环绕通知");  
        Object o = pjp.proceed();  
        System.out.println("退出方法---环绕通知");  
        return o;  
    }  
    
    @AfterThrowing("execution(public * org.huangqsh.aop..*.*(..))")
    public void AfterThrowing() {
        System.out.println("method AfterThrowing");

    } 
}
