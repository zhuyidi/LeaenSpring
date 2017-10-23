package Concert;

import org.aspectj.lang.annotation.*;

/**
 * Created by dela on 10/18/17.
 */

//@Aspect
public class Audience {
//    @Pointcut("execution(* Concert.Performance.perform(..))")
//    public void performance() {
//    }

//    @Before("performance()")
//    @Before("execution(* Concert.Performance.perform(..))")
    public void silenceCellPhone() {
        System.out.println("Sliencing cell phones");
    }

//    @Before("performance()")
//    @Before("execution(* Concert.Performance.perform(..))")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

//    @AfterReturning("performance()")
//    @AfterReturning("execution(* Concert.Performance.perform(..))")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

//    @AfterThrowing("performance()")
//    @AfterThrowing("execution(* Concert.Performance.perform(..))")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }
}