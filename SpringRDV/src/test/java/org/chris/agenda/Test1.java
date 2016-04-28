package org.chris.agenda;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.chris.agenda.entities.Rdv;
import org.chris.agenda.metier.MetierRdv;
import org.chris.agenda.metier.MetierRdvImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
	
		ClassPathXmlApplicationContext cpac =
				new ClassPathXmlApplicationContext(new String("applicationcontext.xml"));
		MetierRdv metier =(MetierRdv) cpac.getBean("metier");
		//Rdv rdv = metier.addRdv(new Date(), "test2", "test2", 2L);
		for(int i =0;i<15;++i){
		Rdv rdv =metier.addRdv(new Date(), "charge", "charge", 2L);
		
		List<Rdv> l =new ArrayList<Rdv>();
		l.add(rdv);
		}
		//assertTrue(l.size()>0);
	
    }

}
