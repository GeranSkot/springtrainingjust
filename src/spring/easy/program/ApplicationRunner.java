package spring.easy.program;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.commons.logging.LogFactory;

public class ApplicationRunner {
  /**
   * Точка авхода в приложение
   *
   * @param args параметры запуска
   */
  public static void main(String[] args) {
    try {
      ApplicationContext context = new ClassPathXmlApplicationContext("C:\\repo\\SpringIntexsoftTraining\\src\\spring\\src\\application.xml");
      IUserService userService = context.getBean(IUserService.class);
      IRollService rollService = context.getBean(IRollService.class);
      IWriterService writerService = context.getBean(WriterService.class);
      System.out.println("Конец работы");
    } catch (BeansException e) {
      System.out.println("Initialization error of context");
    }
  }
}
