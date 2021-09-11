package org.ensias;







import org.ensias.modele.Chef;
import org.ensias.modele.ChefRepo;
import org.ensias.modele.Offre;
import org.ensias.modele.OffreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataRestApplication {
	@Autowired
	private OffreRepo offreRepo;
	@Autowired 
	private ChefRepo chefRepo;
 
	Chef chef1 = new Chef("AD452178","Ali" , "Hassan","0623547811","alihassan56@gmail.com","123456");
	Chef chef2 = new Chef("AD458978","Najat" , "Bani","0623512811","najatbani56@gmail.com","123456");
	Chef chef3 = new Chef("AD450078","Ahmed" , "Bani","0623512811","ahmedbani56@gmail.com","123456");
	Chef chef4 = new Chef("AD451278","Rachid" , "Touzani","0623002811","rachidtouzani56@gmail.com","123456");
	Chef chef5 = new Chef("AD004978","Mohammed" , "Boudra","0623545811","mohammedboudra56@gmail.com","123456");
	Chef chef6 = new Chef("AD451278","Khalid" , "Tamgrout","0623589711","khalidtamgrout56@gmail.com","123456");
	Chef chef7 = new Chef("AD458721","Fadwa" , "Tani","0623512800","fadwatani56@gmail.com","123456");
	Chef chef8 = new Chef("AD478978","Lamia" , "Amgroun","0623741011","lamiaamgroun56@gmail.com","123456");
	Chef chef9 = new Chef("AD420078","Mahmoud" , "Bani","0665512811","mahmoudbani56@gmail.com","123456");
	Chef chef10 = new Chef("AD458902","Fatima" , "Andar","0623518711","fatimaandar56@gmail.com","123456");
     
	
	


	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(){
	return args -> {
		chefRepo.save(chef1);
		chefRepo.save(chef2);
		chefRepo.save(chef3);
		chefRepo.save(chef4);
		chefRepo.save(chef5);
		chefRepo.save(chef6);
		chefRepo.save(chef7);
		chefRepo.save(chef8);
		chefRepo.save(chef9);
		chefRepo.save(chef10);
		
	offreRepo.save(new Offre("09/09/2021","20/09/2021", "BoChef", "74 Av. Abdelkrim El Khattabi, Rabat 12000", "Rabat", "Starter dish + Principal dish ==> Free Dessert","images/img-9.jpg",chef1));
	offreRepo.save(new Offre("09/09/2021","09/11/2021", "Boca Grande", "Centre commercial les ambassadeurs, Rabat 10000", "Rabat", "Free Coktails for ladies every day","images/img-01.jpg",chef1));
	offreRepo.save(new Offre("09/09/2021","19/10/2021", "Sérénia", "26 bis Rue Abou Al Mahassine Royani, Casablanca 20250", "Casablanca", "Facial treatment + Massage ==> 500DH","images/img-3.jpg",chef2));
	offreRepo.save(new Offre("09/09/2021","01/10/2021", "Dar El Bacha", "Rte Sidi Abdelaziz, Marrakech 40000", "Marrakech", "Luxury breakfast for two ==> 150DH","images/img-4.jpg",chef3));
	offreRepo.save(new Offre("09/09/2021","29/09/2021", "Marrakech Kart Racing", "Route de l'Ourika, Marrakech 40000", "Marrakech", "2 Rounds of Karting ==> 200DH","images/img-02.jpg",chef2));
	offreRepo.save(new Offre("09/09/2021","23/09/2021", "Sofitel -Rabat-", "Bp 450 Quartier Aviation, Rabat 10000", "Rabat", "Pool access + lunch => 400DH","images/img-03.jpg",chef1));
	offreRepo.save(new Offre("09/09/2021","29/09/2021", "Traditional Thai Massage", "50 Rue Jabal Oukaïmeden, Mag 2 Agdal, Rabat 10080", "Rabat", "Paid massage ==> One offered","images/img-04.png",chef3));
	offreRepo.save(new Offre("09/09/2021","30/09/2021", "Dunkin", "Nations-Unies, Al Abtal, Inaouin et Omar Ibn Al Khattab, Agdal", "Rabat", "Box of 16 donuts paid ==> 4 drinks offered by choice","images/img-05.jpg",chef5));
	offreRepo.save(new Offre("09/09/2021","29/09/2021", "MYAH BAY", "Askejour Route de l'Aéroport, Marrakech 40000", "Marrakech", "Pool access for two people ==> 350 DH","images/img-06.jpg",chef6));
	offreRepo.save(new Offre("09/09/2021","05/10/2021", "La Palette Restaurant", "24 Rue Moulay Ali, Marrakesh 40000", "Marrakech", "Dinner (Starter dish+Principal dish) for a couple ==> 400DH","images/img-07.jpg",chef7));
	offreRepo.save(new Offre("09/09/2021","19/09/2021", "Bel Ange", "12 Tarik Ben Zayd, Marrakech 40000", "Marrakech", "Hammam + Spa ==> 350DH","images/img-08.jpg",chef9));
	offreRepo.save(new Offre("11/09/2021","18/09/2021", "Boca Chica", "44 Bd de la Corniche, Casablanca", "Casablanca", "Full lunch menu by choice for one person ==> 250DH","images/img-09.jpg",chef7));
	offreRepo.save(new Offre("09/09/2021","30/09/2021", "Rick\'s Coffee", "Place du jardin public, 248 Bd Sour Jdid, Casablanca 20250", "Casablanca", "Full breakfast menu ==> 60DH","images/img-10.jpg",chef8));
	offreRepo.save(new Offre("09/09/2021","03/10/2021", "Vichy Célestins Spa Hotel", "Zahia Golf Beach, Route Côtière Km 44, Casablanca 20250", "Casablanca", "Pool access + lunch by choice ==> 500 DH","images/img-11.jpg",chef10));
	offreRepo.save(new Offre("09/09/2021","10/10/2021", "K.Beauty", "residence Sami Quartier 108 Av. Mohamed Sijilmassi, Casablanca 20250", "Casablanca", "Brushing + Manicure + Pedicure ==> 150DH","images/img-12.jpg",chef1));
	offreRepo.save(new Offre("11/09/2021","18/09/2021", "Pure Passion", "Residence N 02 m1 Complexe Marina Agadir 80010", "Agadir", "Full lunch menu by choice for one person ==> 250DH","images/img-13.jpg",chef7));
	offreRepo.save(new Offre("09/09/2021","30/09/2021", "La Rosace", "Boulevard Ben Mahfoud Al Yaâcoubi, Agadir 80000", "Agadir", "Full breakfast menu ==> 60DH","images/img-14.jpg",chef8));
	offreRepo.save(new Offre("09/09/2021","03/10/2021", "Sofitel -Agadir-", "Baie Des Palmiers Cite Founty P5, Secteur Touristique, Agadir 80010", "Agadir", "Pool access + lunch by choice ==> 500 DH","images/img-15.jpg",chef10));
	offreRepo.save(new Offre("09/09/2021","10/10/2021", "Richflor", "Av. Des Forces Armees Royales, Agadir 80000", "Agadir", "Brushing + Manicure + Pedicure ==> 150DH","images/img-16.jpg",chef1));
	
	
	
	

	};
	}

}
