package com.example.demo.service;

import com.example.demo.entity.Company;
import com.example.demo.repository.CompanyRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CompanyServiceImpl implements ICompanyService {
    @Autowired
    CompanyRepository companyRepository;

    @Override
    public List<Company> retrieveAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public Company retrieveCompany(Long companyId) {
        return companyRepository.findById(companyId).get();
    }

    @Override
    public Company addCompany(Company c) {
        return companyRepository.save(c);
    }

    @Override
    public void removeCompany(Long companyId) {
        companyRepository.deleteById(companyId);
    }

    @Override
    public Company modifyCompany(Company company) {
        return companyRepository.save(company);
    }
}
