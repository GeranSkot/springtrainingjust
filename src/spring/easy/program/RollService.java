package spring.easy.program;

/**
 * Реализация работы сервиса
 */
public class RollService {
  private IWriterService writerService;

  /**
   * Инициализирует поле writerService
   *
   * @param writerService сервис для записи данных
   */
  public void setWriterService(IWriterService writerService) {
    this.writerService = writerService;
  }

}
