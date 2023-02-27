class Testcap
{
	public static void main(String []args)
	{
	Encapexample obj=new Encapexample();
	obj.setAccount(123456799);
	obj.setName("sow");
	System.out.println("Account :"+obj.getAccount());
	System.out.println("Name :"+obj.getName());
	}
}
class  Encapexample
{
	private int account;
	private String name;

	public int getAccount()
	{
	return account;
	}
	public String getName()
	{
	return name;
	}
	public void setAccount(int acc)
	{
	this.account=acc;
	}
	public void setName(String cha)
	{
	this.name=cha;
	}
}

