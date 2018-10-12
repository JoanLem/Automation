package stepDefinitions;

import cucumber.api.java8.En;
import pageObjects.Home;

public class prueba implements En{
	Home home;
	public prueba () {
		Given("Lanzo chrome", () -> {
			home = new Home();
		});

		Given("Busco {string}", (String textToSearch) -> {
			home.searchText(textToSearch);
		});

		When("Click en buscar", () -> {
			home.clickSearch();
		});
	}
}