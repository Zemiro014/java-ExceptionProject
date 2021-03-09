package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args)
	{		
		Scanner sc = new Scanner(System.in);
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 
		 try 
		 {
			 System.out.print("Room number: ");
			 int number = sc.nextInt();
			 System.out.print("Check-In date (dd/MM/yyyy): ");
			 Date checkIn = sdf.parse(sc.next());
			 System.out.print("Check-Out date (dd/MM/yyyy): ");
			 Date checkOut = sdf.parse(sc.next());
	
			 Reservation reservation = new Reservation(number, checkIn, checkOut);
			 System.out.println("Reservation: "+reservation);
			 
			 System.out.println();
			 System.out.println("Enter data to update reservation: ");
			 System.out.print("Check-In date (dd/MM/yyyy): ");
			 checkIn = sdf.parse(sc.next());
			 System.out.print("Check-Out date (dd/MM/yyyy): ");
			 checkOut = sdf.parse(sc.next());
			 
			 reservation.updateDates(checkIn, checkOut);
			 System.out.println("Reservation: "+reservation);
		 }
		 catch(ParseException e) 
		 {
			 System.out.println("Invalid date format!");
		 }
		 catch(DomainException e) // tratando e capturando o "Exception personalizado" que � lan�ado a partir dos m�todos da class "Reservation"
		 {
			 System.out.println("Error in reservation: "+e.getMessage());
		 }
		 catch(RuntimeException e) // Tratando a exce��o usando um exception gen�rico "RuntimeException". Ele captura toda exce��o n�o previstas usando o -UpCasting-
		 {
			 System.out.println("Unexpected error !");
		 }
		 sc.close();
	}
}
