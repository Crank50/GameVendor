package springBootApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import springBootApp.entities.*;

@Controller
@RequestMapping(value="/vendors/")
public class VendorController {

    @Autowired
    private VendorDAO vendorDAO;

    @RequestMapping(value="viewAllVendors")
    public String viewAllVendors(ModelMap model) {
        model.addAttribute("vendors",vendorDAO.findAll());
        return "vendors/viewAllVendors";
    }

    @RequestMapping(value="viewVendor")
    public String viewVendor(Long vendorID, ModelMap model) {
        Vendor vendor = vendorDAO.findOne(vendorID);
        model.addAttribute("vendor",vendor);
        return "vendors/viewVendor";
    }

    @RequestMapping(value="addVendor")
    public String addVendor(ModelMap model) {
        Vendor vendor = new Vendor();
        model.addAttribute("vendor",vendor);
        return "vendors/addVendor";
    }


    @RequestMapping(value="saveNewVendor")
    public String saveNewVendor(Vendor vendor) {
//    public String saveNewCategory(@ModelAttribute("category") Category category) {
        if(vendor != null) {
            vendorDAO.save(vendor);
        } else {
            System.out.println("ERROR: did NOT save new category, category was NULL!");
        }
        return "redirect:/vendors/viewAllVendors";
    }
}