package model.exceptions;


/*
 * Ao personalizar um "Exception", em java tu a tua class de Exception personalizado pode herdar tanto para "Exception" quanto para "RunException"
 * 
 * A diferen�a entre elas � que se a tua class herdar do Exception, sempre que o seu programa lan�ar um "Exception" do tipo que tu personalizou,
 *  o compilador vai te obrigar a tratar a exce��o antes de tu executar o programa, j� com o "RunException" o compilador n�o ir� te alertar sobre a necessidade de tu tratar.
 * */
public class DomainException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}

}
