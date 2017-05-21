package arvostelut.controller;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import arvostelut.bean.Arvostelu;
import arvostelut.dao.ArvosteluDAO;

@RestController
public class ArvosteluRestController {

	@Inject
	public ArvosteluDAO dao;
	
	public ArvosteluDAO getDao(){
		return dao;
	}
	public void setDao(ArvosteluDAO dao){
		this.dao = dao;
	}

	@RequestMapping(value="/kaikki", method=RequestMethod.POST)
	public ResponseEntity <Arvostelu> talleta(@RequestBody Arvostelu ar) {
		dao.talleta(ar);
				
		return new ResponseEntity<Arvostelu>(ar, HttpStatus.OK);		
	}

	@RequestMapping(value="/kaikki", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity <List<Arvostelu>> haeKaikkiJSON() {
		List<Arvostelu> arvostelut = dao.haeKaikki();
				
		return new ResponseEntity <List<Arvostelu>>(arvostelut, HttpStatus.OK);	
	}
}
