package componentscan;

import com.diazcode.springin5steps.scope.JdbcConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.diazcode.springin5steps")
public class ComponentPersonDAO {
	@Autowired
	JdbcConnection jdbcConnection;
	
	public ComponentPersonDAO(JdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
	public JdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}
	
	public void setJdbcConnection(JdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
}
