package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.Doc;

public class Main
{
    public static void main(String[] args)
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        Doctor doctor = context.getBean(Doctor.class);
//        doctor.assist();
//
//        Nurse nurse = context.getBean(Nurse.class);
//        nurse.assist();

//        Staff staff = context.getBean(Nurse.class);
//        staff.assist();

//        Doctor doctor = context.getBean(Doctor.class);
//        doctor.assist();

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
    }
}
