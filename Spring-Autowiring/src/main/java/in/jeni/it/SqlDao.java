package in.jeni.it;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import in.jeni.dep.ReportDao;

@Repository("Sqldao")

public class SqlDao implements ReportDao{

	public void getData() {
		System.out.println("Sqldao created");
		// TODO Auto-generated method stub
		
	}

}
