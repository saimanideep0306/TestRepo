//Bike_Car_code
package Manideep;

public class Main{
	    public int no_of_wheels;
	    public int no_of_seats;
	    public void setCar(int No_of_wheels,int no_of_seats)
	    {
	        this.no_of_wheels=No_of_wheels;
	        this.no_of_seats=no_of_seats;
	    }
	    public void setBike(int No_of_wheels,int No_of_seats)
	    {
	        this.no_of_seats=No_of_seats;
	        this.no_of_wheels=No_of_wheels;
	    }
	    public void getCar()
	    {
	                               System.out.println("No_of_wheels_for_car:---"+no_of_wheels);
			System.out.println("No_of_seat_for_car:---"+no_of_seats);
	    }
	    public void getBike()
	    {
	                                System.out.println("No_of_wheels_for_bike:---"+no_of_wheels);
			System.out.println("No_of_seats_for_bike:---"+no_of_seats);
	    }
		public static void main(String[] args) {
			Main c=new Main();
			Main b=new Main();
			c.setCar(4,16);
			b.setBike(2,4);
			c.getCar();
			b.getBike();
			
		}
	}