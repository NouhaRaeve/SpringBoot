package com.example.demo.control;


import com.example.demo.entity.Company;
import com.example.demo.service.ICompanyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Tag(name= "Gestion company")
@RestController
@AllArgsConstructor
@RequestMapping("/company")
public class CompanyRestController {
    @Autowired
    ICompanyService companyService;
    @Operation(description = "récupérer toutes les companies de la base de données")
    @GetMapping("/retrieve-all-companies")
    public List<Company> getCompanies() {
        List<Company> listCompanies = companyService.retrieveAllCompanies();
        return listCompanies;
    }
    @Operation(description = "récupérer une company avec son id passé en url")
    @GetMapping("/retrieve-company/{company-id}")
    public Company retrieveCompany(@PathVariable("company-id") Long cId) {
        Company company = companyService.retrieveCompany(cId);
        return company;

    }
    @Operation(description = "ajouter une company à la base de données")
    @PostMapping("/add-company")
    public Company addCompany(@RequestBody Company c) {
        Company company = companyService.addCompany(c);
        return company;
    }
    @Operation(description = "supprimer une company de la base de données")
    @DeleteMapping("/remove-company/{company-id}")
    public void removeChambre(@PathVariable("company-id") Long cId) {
        companyService.removeCompany(cId);
    }
    @Operation(description = "modifier une company de la base de données")
    @PutMapping("/modify-company")
    public Company modifyChambre(@RequestBody Company c) {
        Company company = companyService.modifyCompany(c);
        return company;
    }
}
