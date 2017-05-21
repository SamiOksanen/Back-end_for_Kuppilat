package arvostelut.controller;

import java.util.List;

import javax.inject.Inject;
import javax.swing.text.html.parser.Entity;
import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import arvostelut.bean.Arvostelu;
import arvostelut.dao.ArvosteluDAO;

@Controller
@RequestMapping(value="/arvostelut")
public class ArvosteluController {

	@Inject
	public ArvosteluDAO dao;
	
	public ArvosteluDAO getDao(){
		return dao;
	}
	public void setDao(ArvosteluDAO dao){
		this.dao = dao;
	}
	
		@RequestMapping (value="lista", method=RequestMethod.GET)
		public String getDetails(Model model){
			List<Arvostelu> arvostelut = dao.haeKaikki();
			model.addAttribute("arvostelut", arvostelut);
			
			return "arvo/lista";
		}
}
