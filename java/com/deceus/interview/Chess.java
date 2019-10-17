import java.util.*;

public class ChessMainClass
{
  
  public static void main(String[] args)
  {
    ChessOtherClass myObject = new ChessOtherClass("Hello Other Chess Class!");
    System.out.print(myObject);
  }
}


public class ChessOtherClass
{
  private String message;

  public ChessOtherClass(String input)
  {
    message = "Why, " + input + " Isn't this something?";
  }
  
  public String toString()
  {
    return message;
  }
}
