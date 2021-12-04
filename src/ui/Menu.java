package ui;

import java.util.Scanner;

import model.BlackSnail;
import model.Product;
import model.Season;
import model.Movie;
import model.Serie;
import model.Subscriber;

public class Menu {
	private BlackSnail bs;
	private final static Scanner sc = new Scanner(System.in);
	
	
	
	public Menu() {
		bs = new BlackSnail("129843984", "Cali colombia", "www.BlackSnail.com");
	}
	
	public void showMenu() {
		System.out.println(
			"===========================\n"+
			"   Wellcome to BlackSnail\n"+
			"===========================\n"+
			"1. Add new subscriber\n"+
			"2. Add new product\n"+
			"3. Display the name of the minor subscriber who has the highest number of hours\n"+
			"4. show active subscriber by category\n"+
			"5. Deactivate a subscriber\n"+
			"6. Display product information\n"+
			"7. Add season\n"+
			"8. Search movie\n"+
			"9. Display all series\n"+
			"0. Exit"
			);
		
		int choice = Integer.parseInt(sc.nextLine());
		
		switch (choice) {
		case 1: addSub(); break;
		case 2: addProduct(); break;
		case 3: specialSubCase(); break;
		case 4: listActiveSubs(); break;
		case 5: switchSub(); break;
		case 6: searchProduct(); break;
		case 7: addSeason(); break;
		case 8: searchMovie(); break;
		case 9: listSeries(); break;
		}
		
		if (choice != 0) {
			showMenu();
		}	
	}
	
	
	
	private void addSub() {
		System.out.println("Ingrese el nombre del subscriptor");
		String name =  sc.nextLine();
		System.out.println("Ingrese la cedula del subscriptor");
		String id = sc.nextLine();
		System.out.println("Ingrese la edad del subscriptor");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("Ingrese la cantidad de horas que el subscriptor usara el servicio");
		int hours = Integer.parseInt(sc.nextLine());
		System.out.println("Ingrese la categoria de la cuenta:  1. Normal, 2. Platinum, 3. Gold, 4. Diamond");
		int category = Integer.parseInt(sc.nextLine());
		
		
		
		
		
		bs.addSub(name, id, age, hours, true, category);
	}

	private void addProduct() {
		System.out.println(
			"1. Add movie\n"+
			"2. Add serie"
			);
		int choice = Integer.parseInt(sc.nextLine());

		switch(choice){
			case 1: addMovie(); break;
			case 2: addSerie(); break;
		}
	}
	
	private void listActiveSubs() {
		Subscriber[] a = bs.getSubs();
		int normal = 0;
		int platinum = 0;
		int golden = 0;
		int diamond = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				if (a[i].isStatus()) {
					switch(a[i].getSubscription()) {
					case 1: normal++; break;
					case 2: platinum++; break;
					case 3: golden++; break;
					case 4: diamond++; break;
					}
				}
			}else break;
		}
		System.out.println("Normal: "+normal);
		System.out.println("Platinum: "+platinum);
		System.out.println("Golden: "+golden);
		System.out.println("Diamond: "+diamond);
	}

	private void addMovie() {
		System.out.println("Type title");
		String title = sc.nextLine();
		System.out.println("Type launch date");
		String launchDate = sc.nextLine();
		System.out.println("Type name director");
		String director = sc.nextLine();
		System.out.println("Type name producer company");
		String producerCompany = sc.nextLine();
		System.out.println("Type sinopsis");
		String sinopsis = sc.nextLine();
		System.out.println("Type age limit");
		int ageLimit = Integer.parseInt(sc.nextLine());
		System.out.println(
			"Type category: \n"+
			"1. Romance \n"+
			"2. Action \n"+
			"3. Suspense \n"+
			"4. Horror \n"+
			"5. Comedy"
			);
		int category = Integer.parseInt(sc.nextLine());

		Product a = new Product(1, title);
		Movie b = new Movie(launchDate, director, producerCompany, sinopsis, ageLimit, category);

		bs.addProduct(a);
		bs.addProduct(b);
	}
	
	
	private void addSerie() {
		System.out.println("Type title");
		String title = sc.nextLine();
		System.out.println("Ingrese la fecha de l aprimera emision");
		String firstEmition = sc.nextLine();
		System.out.println("Ingrese el reparto principal");
		String mainCast = sc.nextLine();
		System.out.println("Ingrese el nombre del director");
		String director = sc.nextLine();
		System.out.println("Ingrese la sinopsis de la serie");
		String sinopsis = sc.nextLine();
		System.out.println("Ingrese la cantidad de temporadas");
		int seasons = Integer.parseInt(sc.nextLine());
		Product a = new Product(2, title);
		Serie b = new Serie(firstEmition, mainCast, director, sinopsis, seasons);
		bs.addProduct(a);
		bs.addProduct(b);
		addSeason(a);
	}
	private void addSeason(Serie a) {
		System.out.println("Ingrese el numero de la temporada");
		int number = Integer.parseInt(sc.nextLine());
		System.out.println("Ingrese el numero de episodios");
		int episodes = Integer.parseInt(sc.nextLine());
		System.out.println("Ingrese la fecha de lanzamiento");
		String launchDate = sc.nextLine();
		System.out.println("Ingrese la fecha del trailer");
		String trailerDate = sc.nextLine();
		Season x = new Season(number, episodes, launchDate, trailerDate);
		a.addSeason(x);
	}
	
	private void switchSub(){
		Subscriber[] a = bs.getSubs();
		System.out.println("Type ID subscriber");
		String id = sc.nextLine();
		int i = 0;
		boolean centinel = false;
		do{
			if (i >= 50){
				centinel = true;
				System.out.println("ID no found");
			}
			if(a[i].getId().equals(id)){
				centinel = true;
				a[i].setStatus(!a[i].isStatus());

			}
			i++;
		} while (!centinel);

	}
	
	private void specialSubCase() {
		System.out.println(bs.getSpecialCase().getName());
	}

	private void searchProduct(){
		System.out.println("Type name of product");
		String name = sc.nextLine();
		String messenge;

		Product[] a = bs.getProducts(); 

		int i = 0;
		boolean centinel = false;
		do{
			if (i >= 85){
				centinel = true;
				messenge = "Name no found";
			}

			if(a[i].getTitle().equalsIgnoreCase(name)){
				centinel = true;
				switch(a[i].getProductType()){
				case 1: 
				messenge = "Movie: "+a[i].getTitle()+"\n launchDate: "+a[i].getLaunchDate()+"\n Director: "+a[i].getDirector()+"\n ProducerCompany: "+a[i].getProducerCompany()+"\n Sinopsis: "+a[i].getSinopsis()+"\n AgeLimit: "+a[i].getAgeLimit();
				break;
				case 2:
				messenge = "Serie: "+a[i].getTitle()+"\n FirstEmition: "+a[i].getFirstEmition()+"\n MainCast: "+a[i].getMainCast()+"\n Director: "+a[i].getDirector()+"\n Sinopsis: "+a[i].getSinopsis()+"\n Seasons: "+a[i].getNumSeasons();
				break;
				}
			}
			i++;
		} while (!centinel);

		System.out.println(messenge);
	}

	private void addSeason(){
		System.out.println("Type serie name");
		String name = sc.nextLine();

		String messenge = "";

		Product[] a = bs.getProducts();

		int i = 0;
		boolean centinel = false;

		do{
			if (i >= 85){
				centinel = true;
				messenge = "Name no found";
			}

			if(a[i].getTitle().equalsIgnoreCase(name)){
				switch(a[i].getProductType()){
					case 1:
					centinel = true;
					messenge = "It isn't a series";
					break;
					case 2:
					centinel = true;
					addSeason(a[i]);
					break;
				}
			}
			i++;

		} while (!centinel);

		System.out.println(messenge);
	}

	private void searchMovie(){
		System.out.println(
			"Type category movie:\n"+
			"1. Romance \n"+
			"2. Action \n"+
			"3. Suspense \n"+
			"4. Horror \n"+
			"5. Comedy"
			);

		int category = Integer.parseInt(sc.nextLine());

		Product[] a = bs.getProducts();

		int i = 0;
		boolean centinel = false;

		do{
			if (i >= 85){
				centinel = true;
				System.out.println("Category no found");
			}

			if ((a[i].getProductType() == 1) && (a[i].getCategory() == category))
				System.out.println(a[i].getTitle()+"\n");

		} while (!centinel);
	}

	private void listSeries(){
		Product[] a = bs.getProducts();

		for(int i = 0; i < 85; i++){
			if (a[i].getProductType() == 2){
				System.out.println("Serie: "+a[i].getTitle()+"\n FirstEmition: "+a[i].getFirstEmition()+"\n MainCast: "+a[i].getMainCast()+"\n Director: "+a[i].getDirector()+"\n Sinopsis: "+a[i].getSinopsis()+"\n Seasons: "+a[i].getNumSeasons());
			}
		}
	}
	
}
