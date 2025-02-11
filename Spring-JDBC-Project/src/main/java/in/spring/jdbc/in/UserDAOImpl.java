package in.spring.jdbc.in;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.sql.DataSource;

import in.spring.jdbc.in.model.User;

public class UserDAOImpl implements UserDAO{
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	@Override
	public boolean save(User user) {
		String query = "insert into User (Personid, FirstName, LastName,Address,City) values (?,?,?,?,?)";
		Connection con = null;
		PreparedStatement ps = null;
		try{
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			ps.setInt(1, user.getPersonid());
			ps.setString(2, user.getFirstName());
			ps.setString(3, user.getLastName());
			ps.setString(4, user.getAddress());
			ps.setString(5, user.getCity());
			int out = ps.executeUpdate();
			if(out !=0){
				System.out.println("User saved with id="+user.getPersonid());
			}else System.out.println("User save failed with id="+user.getPersonid());
		}
		catch (SQLIntegrityConstraintViolationException e) {
            // Handle specific constraint violations, e.g., duplicate keys
            System.err.println("Error: Duplicate key or constraint violation - " + e.getMessage());
        } catch (SQLException e) {
            // Catch other SQL exceptions
            System.err.println("SQL Error: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            // Catch any other unforeseen exceptions
            System.err.println("Unexpected error: " + e.getMessage());
        } finally {
            // Close resources in the finally block
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
		return true;
	}
}

