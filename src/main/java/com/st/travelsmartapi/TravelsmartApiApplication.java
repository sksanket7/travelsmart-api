package com.st.travelsmartapi;

import com.st.travelsmartapi.entity.UserData;
import com.st.travelsmartapi.entity.UserRole;
import com.st.travelsmartapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Iterator;
import java.util.List;

@SpringBootApplication
public class TravelsmartApiApplication implements CommandLineRunner /*extends SpringBootServletInitializer */{

	@org.springframework.beans.factory.annotation.Autowired(required=true)
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	private UserRepository repositery;


	public static void main(String[] args) {
       SpringApplication.run(TravelsmartApiApplication.class, args);
		System.out.println("this is my API");
	}

	@Override
	public void run(String... args) throws Exception {
		/*repositery.save(new UserData("prince",bCryptPasswordEncoder.encode("12345")));
		repositery.save(new UserData("silu",bCryptPasswordEncoder.encode("123")));
		repositery.save(new UserData("akash",bCryptPasswordEncoder.encode("123")));
		repositery.save(new UserData("rupam",bCryptPasswordEncoder.encode("123")));*/
		repositery.save(new UserData("006", bCryptPasswordEncoder.encode("1234"),
				"sanket", "karvekar", "default", "sksanket7@gmail.com", "9870552471",
				"flat number: 431, B wing, Silver line Society", "Silverline Society, " +
				"Sector 17, Kharghar, Navi Mumbai, Pin 410210", "410210",
				"Navi MUmbai", "Raigar", "Maharashtra", "India", bCryptPasswordEncoder.encode("QHDRT6691N"),
				bCryptPasswordEncoder.encode("123456789365125"), "12/01/2022", "10003" +
				"23" +
				"65", "active", new UserRole("CM", "customer")));

		List<UserData> user=repositery.findAll();

		Iterator<UserData> itr=user.iterator();
		while(itr.hasNext()) {
			System.out.println("User Data: "+itr.next());
		}
	}

	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(TravelsmartApiApplication.class);
	}*/

}
