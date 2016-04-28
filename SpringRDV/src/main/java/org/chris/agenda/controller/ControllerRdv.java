
package org.chris.agenda.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.chris.agenda.entities.Rdv;
import org.chris.agenda.metier.MetierRdv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerRdv {

	@Autowired
	private MetierRdv metier;

	@RequestMapping(value = "/index")
	public String index(Model model, Rdv rdv) {
		model.addAttribute("rdvs", metier.getAllRdv());
		return "rdv";
	}

	@RequestMapping(value = "/saveRdv")
	public String saveRdv(Model model, Rdv rdv, @RequestParam(value = "client.nomC") String nom,
			@RequestParam(value = "client.prenomC") String prenom, @RequestParam(value = "jour") String jour,
			@RequestParam(value = "praticien.idP") Long idP) {
		if (rdv.getIdR() == null) { // si form null
			model.addAttribute("rdv", new Rdv());
			Date d = new Date();
			try {

				d = new SimpleDateFormat("yyyy/MM/dd").parse(jour);
			} catch (Exception e) {
				e.getMessage();
			}

			metier.addRdv(d, nom, prenom, idP);

		} else
			metier.updateRdv(rdv);
		model.addAttribute("rdvs", metier.getAllRdv());
		return "rdv";
	}

	@RequestMapping(value = "/deleteRdv")
	public String deleteRdv(Model model, Rdv rdv, @RequestParam(value = "idR") Long idR) {
		metier.deleteRdv(idR);
		model.addAttribute("rdv", new Rdv());
		model.addAttribute("rdvs", metier.getAllRdv());
		return "rdv";
	}

	@RequestMapping(value = "/editRdv")
	public String editRdv(Model model, Rdv rdv, @RequestParam(value = "idR") Long idR) {

		model.addAttribute("rdv", metier.getRdv(idR)); // recup rdv pour le form
														// dans la liste
														// affichée
		model.addAttribute("rdvs", metier.getAllRdv());
		return "rdv";
	}

}
