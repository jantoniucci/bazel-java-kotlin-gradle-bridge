package demo;

public class App {
  public static void main(String[] argv){
    System.out.println("* Running hello world app:");
    final String s  = (new Greeter()).getGreeting();
    System.out.println("Greeting: "+s);
  }
}

/*
    final String s  = demo.C2Kt.getName(
    	(new Greeter()).getGreeting(), 
    	22
    );
*/