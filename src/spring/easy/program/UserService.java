package spring.easy.program;

public class UserService implements IUserService{
  private final IUserService writerService;
  private final IRollService rollService;


  /**
   * Инициализирует поле writerService
   * @param writerService сервис для записи пользователей
   */
//  public void setWriterService(IUserService writerService) {
//    this.writerService = writerService;
//  }
  public UserService (IWriterService writerService){
    this.writerService = writerService;
  }

  public IRollService getRollService() {
    return rollService;
  }

}
