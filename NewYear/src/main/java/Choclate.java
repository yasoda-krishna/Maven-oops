public class Choclate implements Base {
	int we;
	Choclate(int we){
		this.we=we;
	}
	public int weight(int tw)
	{
		tw+=we;
		return  tw;
	}
	
	public int no_candy(int low,int high,int c)
	{
		if(we>=low && we<=high)
		{
			c++;
		}
	return c;	
	}

}