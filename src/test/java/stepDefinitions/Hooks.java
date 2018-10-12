package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java8.En;
import pageObjects.Base;


public class Hooks implements En {

	public Hooks() {
		
		//Reporte
		Before(0, (Scenario scenario) -> {
			System.out.println("--------------------------------------------Iniciar reporte: " + scenario.getName());
		});
		
		//lanzar navegador
		Before(new String[] {"@browser"}, 0, 1, () -> {
			Base.initiateBrowser();
		});
		
		//Cerrar el reporte
		After(0, (Scenario scenario) -> {	
			System.out.println("After scenario : " + scenario.getName());

		});
		
		//cierra el navegador
		After(new String[] {"@browser"}, 0 , 1, (Scenario scenario) -> {
			System.out.println(scenario.getStatus());
			Base.closeBrowser();
		});
	}
}
