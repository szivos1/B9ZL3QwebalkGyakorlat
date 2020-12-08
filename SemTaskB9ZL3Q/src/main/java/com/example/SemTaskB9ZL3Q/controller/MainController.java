package com.example.SemTaskB9ZL3Q.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.SemTaskB9ZL3Q.entity.Pool;
import com.example.SemTaskB9ZL3Q.service.PoolService;



@Controller
public class MainController {
	  @Autowired
	    private PoolService poolService;

	    @GetMapping("/pool")
	    public String index(Model model) throws IOException {
	        model.addAttribute("list", poolService.findAll());
	        return "pool";
	    }

	    @GetMapping("/poolConfig={ID}")
	    public String formUpdate(@PathVariable(value = "ID") String id, Model model) throws IOException {
	        try {
	            model.addAttribute("pool", poolService.findById(Integer.parseInt(id)));
	        } catch (NumberFormatException e) {

	        }
	        return "poolConfig";

	    }

	    @GetMapping("/poolConfig")
	    public String formInsert(Model model) throws IOException {
	        model.addAttribute("pool", new Pool());
	        return "poolConfig";
	    }

	    @PostMapping("/modify")
	    public String formSubmit(@ModelAttribute Pool pool, Model model) {
	        model.addAttribute("pool", pool);
	        poolService.save(pool);
	        return "refresh";
	    }

	    @GetMapping("/delete={ID}")
	    public String delete(@PathVariable(value = "ID") String id, Model model) throws IOException {
	        try {
	            poolService.delete(poolService.findById(Integer.parseInt(id)));
	        } catch (NumberFormatException e) {

	        }
	        return "refresh";

	    }
}