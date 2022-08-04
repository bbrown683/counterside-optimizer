package counterside.optimizer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import counterside.optimizer.types.gear.Gear;

@Controller
public class ManagementController {
    @Autowired
    @Qualifier("gearList")
    private List<Gear> gearList;

    @GetMapping("/gear")
    public String gear(Model model) {
        model.addAttribute("gearList", gearList);
        return "gear";
    }
}
