package in.jeni.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import in.jeni.AppConfig;
import in.jeni.service.ReportService;

public class Test {
 public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
ReportService rep = context.getBean(ReportService.class);
rep.GenerateData();
 }
}
