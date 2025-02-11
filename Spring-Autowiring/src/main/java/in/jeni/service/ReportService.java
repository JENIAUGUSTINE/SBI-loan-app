package in.jeni.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.jeni.dep.ReportDao;

@Service
public class ReportService {
	private ReportDao Dao;
	
	@Autowired
	public ReportService(ReportDao Dao) {
		System.out.println("cons csalled");
		this.Dao=Dao;
		// TODO Auto-generated constructor stub
	}
	
	public void setDao(ReportDao Dao) {
		System.out.println("Setter method");
		this.Dao=Dao;
	}

public void GenerateData() {
	Dao.getData();
	System.out.println("Method generaTED");
}
}
