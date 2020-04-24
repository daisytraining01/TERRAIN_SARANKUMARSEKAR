package drilltwo;
public class employee
{
private int empid;
private String ceo;
public void setempid(int empid)
{this.empid=empid;
}public void getempid()
{
System.out.println(empid);
}
public void setceo(String ceo){
this.ceo= ceo;
}public void getceo()
{
System.out.println(ceo);
}
public static void main(String args[])
{
employee navin = new employee();
navin.setceo("saran");
navin.getceo();
navin.setempid(4610);
navin.getempid();
} }
