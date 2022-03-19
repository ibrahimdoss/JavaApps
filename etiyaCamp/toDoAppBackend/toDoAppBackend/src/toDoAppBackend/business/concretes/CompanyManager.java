package toDoAppBackend.business.concretes;

import java.util.List;

import toDoAppBackend.business.abstracts.CompanyService;
import toDoAppBackend.dataAccess.abstracts.CompanyDao;
import toDoAppBackend.entities.concretes.Company;

public class CompanyManager implements CompanyService{

	CompanyDao companyDao;
	
	public CompanyManager(CompanyDao companyDao) {
		super();
		this.companyDao = companyDao;
	}

	@Override
	public void add(Company company) {
		this.companyDao.add(company);
		
	}

	@Override
	public List<Company> getAll() {
		
		return this.companyDao.getAll();
	}

	@Override
	public void update(Company company) {
		this.companyDao.delete(company);
		
	}

	@Override
	public void delete(Company company) {
		this.companyDao.delete(company);
		
	}

}
