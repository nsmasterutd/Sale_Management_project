package lovely;

public class Employee
{

	public Object getPageName(String str)
	{
		// TODO Auto-generated method stub
		
		Object ac=null;
		if(Integer.parseInt(str)%2 != 0)
		{
			
			 ac=new Account();
			
		}
		else
		{
			 ac=new Sales();
		}
		
		return ac;
	}

	

}
