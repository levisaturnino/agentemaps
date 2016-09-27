package br.com.agentemaps.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/administrador")
public class AdministradorController {


	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap model){
		model.addAttribute("message","Hello Spring Web MVC!");
		return "administrador";
	}
	
	
/*	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public ModelAndView form(ModelMap model){
	
		PessoaBean pessoa = new PessoaBean();
		
		
		return new ModelAndView("pessoa","pessoa",pessoa);
	}*/
	
/*	
	@RequestMapping("/listpessoa")  
    public ModelAndView listPessoa(){  
        //write the code to get all employees from DAO  
        //here, we are writing manual code of list for easy understanding  
        List<Administrador> list = new ArrayList<Pessoa>();  
        
        list.add(new Pessoa("rahul","Masculino","Aluno"));  
        list.add(new Pessoa("aditya","Feminino","Professora"));  
        list.add(new Pessoa("sachin","Masculino","Aluno"));  
          
        return new ModelAndView("listpessoa","list",list);  
    }  
	
	
	
	 @RequestMapping(value = "/list", method = RequestMethod.GET)
	    public ModelAndView listForm() {
		 
		 
		 
	//        return new ModelAndView("pessoa", "pessoa", new Pessoa());
	    }
	
	
	   @RequestMapping(value = "/form", method = RequestMethod.GET)
	    public ModelAndView showForm() {
	        return new ModelAndView("addpessoa", "pessoa", new Pessoa());
	    }
	 
	    @RequestMapping(value = "/addpessoa", method = RequestMethod.POST)
	    public String submit(@Valid @ModelAttribute("pssoa")Pessoa pessoa,   		
	    		
	      BindingResult result, ModelMap model) {    	
	    	
	    	
	    	PessoaServiceImpl dao = new PessoaServiceImpl();
	    	
	    	dao.addPessoa(pessoa);
			
			EntityManager em = JPAUtil.getEntityManager();
	
			EntityTransaction tx = em.getTransaction();

			EntityTransaction tx1 = em.getTransaction();
			tx1.begin();
			em.merge(pessoa);
			tx1.commit();
			em.close();
	    	
	    	
	    	
	    	
	    	
	        if (result.hasErrors()) {
	            return "error";
	        }
	        model.addAttribute("cpf", pessoa.getCpf());
	        model.addAttribute("nome", pessoa.getNome());
	        model.addAttribute("tipoPessoa", pessoa.getTipoPessoa());
	        return "pessoaView";
	    }*/
}
