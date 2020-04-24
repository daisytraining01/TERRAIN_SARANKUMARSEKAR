package drilltwo;
public class redmi1
{
public void call()
{
System.out.println("call");
}
public void text()
{
System.out.println("text");

}

 static class redmi2 extends redmi1
{
public void fingerprint()
{
System.out.println("lock/unlock");
}

public static void main (String args[])

{
redmi2 obj= new redmi2();
obj.fingerprint();
obj.call();
obj.text();

}
}
}