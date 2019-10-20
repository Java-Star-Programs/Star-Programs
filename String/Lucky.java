package luckydraw;

public class Lucky {

	
	public static void draw()
	{
		try
		{
			
		
		String names[]= {"rajinnikanth","ramgopalvermaseshu","srinivasan","david"};
		
		
		for(int i=0;i<names.length;i++)
		{
			
			int total=names[i].length();
			//System.out.println(total);
			
	
			if(names[i].length()<names[i+1].length())
			{
				
			System.out.println(names[i+1]);
			}
			
			else if(names[i].length()>names[i+1].length())
			{
			System.out.println(names[i]);
			}
			
		}
	}
	
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println();
			
		}
	}	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lucky l=new Lucky();
		l.draw();

	}

}
