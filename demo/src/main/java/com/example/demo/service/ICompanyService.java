package com.example.demo.service;

import com.example.demo.entity.Company;

import java.util.List;

public interface ICompanyService {
    public List<Company> retrieveAllCompanies();
    public Company retrieveCompany(Long companyId);
    public Company addCompany(Company c);
    public void removeCompany(Long companyId);
    public Company modifyCompany(Company company);
}
