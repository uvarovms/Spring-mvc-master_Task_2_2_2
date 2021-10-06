package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import javax.servlet.http.HttpServletRequest;

@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

//    @GetMapping("/cars")
//    public String showCars((value = "count", defaultValue = "0", required = false) Model model) {
//        String counter = hsr.getParameter("count");
//        if (counter == null) {
//            counter = "0";
//        }
//        model.addAttribute("list", carService.getListCars(Integer.parseInt(counter)));
//        return "cars";
//    }

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "0", required = false) Integer count, Model model) {
        model.addAttribute("list", carService.getListCars(count));
        return "cars";
    }
}
