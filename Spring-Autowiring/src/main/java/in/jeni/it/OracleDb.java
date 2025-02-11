package in.jeni.it;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import in.jeni.dep.ReportDao;

@Repository("OracleDao")
@Primary


public class OracleDb implements ReportDao{

	public void getData() {
		System.out.println("OracleDao Dao");
		// TODO Auto-generated method stub
		
	}

}
