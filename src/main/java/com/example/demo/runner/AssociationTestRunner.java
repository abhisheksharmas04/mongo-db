package com.example.demo.runner;

import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.document.MadelType;
import com.example.demo.document.Medal;
import com.example.demo.document.Player;
import com.example.demo.document.Sport;
import com.example.demo.service.ISportManagmanetService;

@Component
public class AssociationTestRunner implements CommandLineRunner {
	
	@Autowired
	private ISportManagmanetService service;

	@Override
	public void run(String... args) throws Exception {
		/*//Prepare object: Parent Object
		Player player = new Player();
		player.setPlayerId(new Random().nextInt());
		player.setPname("P.V. Sindu");
		player.setPaddrs("hyd");
		player.setCountry("INDIA");
		
		// child objects -1
		Sport sport1 = new Sport();
		sport1.setSid(new Random().nextLong());
		sport1.setSname("batmintion");
		sport1.setIsOlympicSport(true);
		sport1.setKitItmes(new String[] {"bat","coak", "net"});
		sport1.setTeamSport(false);
		
		Sport sport2 = new Sport();
		sport2.setSid(new Random().nextLong());
		sport2.setSname("Cricket");
		sport2.setIsOlympicSport(false);
		sport2.setKitItmes(new String[] {"bat","ball","wicket","batting kit"});
		sport2.setTeamSport(true);
		
		//child object 2
		Medal medal1 = new Medal();
		medal1.setId(UUID.randomUUID().toString().replace("-","").substring(0,10));
		medal1.setType(MadelType.BRONZE);
		medal1.setPrizeMoney(50000.0);
		medal1.setSportName("Batmintion");
		medal1.setEvenName("RIYO Olympics-2021");
		
		Medal medal2 = new Medal();
		medal2.setId(UUID.randomUUID().toString().replace("-","").substring(0,10));
		medal2.setType(MadelType.SILVER);
		medal2.setPrizeMoney(1000000.0);
		medal2.setSportName("Batmintion");
		medal2.setEvenName("RIYO Olympics-2016");
		
		// set child to parent
		player.setSports(Set.of(sport1,sport2));
		player.setMedals(Map.of("RIYO-Bronze",medal1, "Riyo-Silver", medal2));
		
		// invoke business method:
		try {
			System.out.println(service.registerPlayer(player));
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		service.getAllPlayer().forEach(player -> {
			System.out.println(player);
			Set<Sport> s = player.getSports();
			s.forEach(System.out::println);
			Map<String, Medal>m = player.getMedals();
			m.forEach((name,madel) ->{
				System.out.println("name::" + madel);
			});
			
		});

	}

}
