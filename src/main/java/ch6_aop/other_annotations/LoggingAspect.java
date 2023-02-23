package ch6_aop.other_annotations;

import org.aspectj.lang.annotation.*;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

  private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

//  @Before()
//  @AfterThrowing
//  @After()
  @AfterReturning(value = "@annotation(ToLog)", returning = "returnedValue")
  public void log(Object returnedValue) {

    logger.info("Method executed and returned " + returnedValue);
  }

  public void setLogger(Logger logger) {

    this.logger = logger;
  }
}
