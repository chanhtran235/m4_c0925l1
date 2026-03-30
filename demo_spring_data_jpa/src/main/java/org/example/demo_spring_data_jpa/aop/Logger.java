package org.example.demo_spring_data_jpa.aop;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.example.demo_spring_data_jpa.dto.StudentDto;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class Logger {
    private static int count = 0;

    //    @Before("execution(* org.example.demo_spring_data_jpa.controller.StudentController.showList(..))")
//    public void countVisit(){
//        count++;
//        // ghi vào file
//        System.out.println("-------------Số  lần ---------------------");
//        System.out.println(count);
//    }
//    @AfterThrowing("execution(* org.example.demo_spring_data_jpa.controller.StudentController.save(..))")
//    public void logAdd(JoinPoint joinPoint) {
//        System.out.println("---------------công cần ghi lại------");
//        Object[] args = joinPoint.getArgs();
//        StudentDto studentDto = (StudentDto) args[0];
//        System.out.println(studentDto.getName());
//    }

    @Around("execution(* org.example.demo_spring_data_jpa.controller.StudentController.showList(..))")
    public Object logAround(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("--------------- công việc thực hiện trước viết ở đây ------");
        Object object =null;
        try {
             object = proceedingJoinPoint.proceed();

        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        System.out.println("--------------- công việc thực hiện sau viết ở đây ------");
        return object;

    }
}
