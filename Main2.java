package Manideep;
public class Main2
{
    public String check_leap(int year)
    {
        if(year%4==0  && year%100!=0)
        {
            return ("yes");
        }
    //comments
        else if (year%400==0)
        {
            return("yes");
        }
        return ("no");
    }
    public static void main(String[] args) {
		Main2 year=new Main2();
		int y=100;
		String check=year.check_leap(y);
		if(check=="yes")
		{
		    System.out.println(y+"---Is a leap year");
		}
		else{
		    System.out.println(y+"---not a leap year");
		}
}
}