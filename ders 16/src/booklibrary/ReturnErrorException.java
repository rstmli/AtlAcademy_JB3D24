package booklibrary;

public class ReturnErrorException extends RuntimeException {
  public ReturnErrorException(String message) {
    super(message);
  }
}
