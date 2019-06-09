package mvcpattern.controller;

import mvcpattern.entity.Workorder;
import mvcpattern.repository.WorkorderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    private WorkorderRepository workorderRepository;

    @Autowired
    public void setWorkorderRepository(WorkorderRepository workorderRepository) {
        this.workorderRepository = workorderRepository;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Workorder workorder) {
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addNewWorkorder(Workorder workorder, BindingResult bindingResult, Model model) {
        workorderRepository.save(new Workorder(workorder.getCreationDate(), workorder.getAuthor(), workorder.getDescription()));
        model.addAttribute("workorders", workorderRepository.findAll());
        return "redirect: result";
    }

    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public String getAllWorkorders(Model model) {
        model.addAttribute("workorders", workorderRepository.findAll());
        return "result";
    }
}
