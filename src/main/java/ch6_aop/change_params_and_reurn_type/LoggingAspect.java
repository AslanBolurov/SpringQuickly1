package ch6_aop.change_params_and_reurn_type;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

  private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

  @Around("execution(* ch6_aop.change_params_and_reurn_type.service.*.*(..))")
  public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
    String methodName = joinPoint.getSignature().getName();
    Object [] arguments = joinPoint.getArgs();

    logger.info("Method " + methodName +
        " with parameters " + Arrays.asList(arguments) +
        " will execute");

    Comment comment=new Comment();
    comment.setAuthor("Natasha");
    comment.setText("Some other text!");
    Object [] newArgs={comment};


    Object returnedByMethod = joinPoint.proceed(newArgs);

    logger.info("Method executed and returned " + returnedByMethod);

    return "FAILED";
  }

  public void setLogger(Logger logger) {
    this.logger = logger;
  }
}
