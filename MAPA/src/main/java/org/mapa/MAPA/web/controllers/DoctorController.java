package org.mapa.MAPA.web.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.mapa.MAPA.domain.people.Person;
import org.mapa.MAPA.domain.people.SurgeryRole;
import org.mapa.MAPA.persistence.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DoctorController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/doctor/add")
    public String showAddDoctorPage(Model model){
        String html = "person/addPerson";

        model.addAttribute("surgeryRoles", SurgeryRole.values());


        return html;
    }

    @PostMapping("/doctor/add")
    public String addDoctor(HttpServletRequest request){
        Person newPerson = new Person();
        String name = request.getParameter("name");
        String surgeryRole = request.getParameter("name");
        //String boss = request.getParameter("name");

        newPerson.setUser(null);
        newPerson.setName(name);
        newPerson.setSurgeryRole(SurgeryRole.valueOf(surgeryRole));
        // newPerson.setBoss(boss);

        this.personRepository.save(newPerson);

        return "hola";
    }
}
