package esp.bachir.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import esp.bachir.model.Utilisateur;
import esp.bachir.repository.RepoUser;

@RestController
@CrossOrigin(origins= "*")  //C'est pour que tous les clients angular puissent acceder a l'API
public class Controlleur {
	
	@Autowired
	private RepoUser repouser;
	
	@RequestMapping(value="/utilisateur",method=RequestMethod.GET)
	public List<Utilisateur> getUtilisateur(){
		return repouser.findAll();
	}
	
	@RequestMapping(value="/utilisateur",method=RequestMethod.POST)
	public String postUser(@RequestBody Utilisateur utilisateur){
		repouser.save(utilisateur);
		return "Utilisateur enregistré avec succes"+"\nEt on a :"+ repouser.count()+" utilisateurs";
	}
}
