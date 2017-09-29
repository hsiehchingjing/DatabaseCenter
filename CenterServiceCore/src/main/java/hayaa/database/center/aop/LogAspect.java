package hayaa.database.center.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 17-9-29 下午4:53 by谢青靖（xieqj@cloud-young.com）创建
 */
@Component
@Aspect
public class LogAspect {
    @Around("execution(* hayaa.database.center.serviceImpl*.*.*(..))")
    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        logger.info("方法执行开始：{}，入参为：{}", proceedingJoinPoint.getSignature().getName(), JSON.toJSONString(proceedingJoinPoint.getArgs()));
        Object o = proceedingJoinPoint.proceed();
//        logger.info("方法执行结束：{}，出参为：{}", proceedingJoinPoint.getSignature().getName(), JSON.toJSONString(o));
        return o;
    }
}
