package module.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import module.author.expertise.creation.sorters.entity.ErrorType;
import module.author.expertise.creation.sorters.entity.ItemSorter;
import module.author.expertise.creation.sorters.entity.Sorter;
import module.author.expertise.creation.sorters.entity.SubErrorType;

public class DBConnect {

	private Connection conn;
	private Statement stm;

	public DBConnect(String arquivo) throws SQLException, ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");
		this.conn = DriverManager.getConnection("jdbc:sqlite:" + arquivo);
		this.stm = this.conn.createStatement();
	}
	
	public void insert(Sorter sorter) {
		try {
			this.stm = this.conn.createStatement();
			if (sorter.getId() == null) {
				ResultSet rs = this.stm.executeQuery("select * from sorter WHERE description LIKE \"" + sorter.getDescription() + "\"");
				if (!rs.next()) {
					rs = this.stm.executeQuery("select max(id) FROM sorter");
					sorter.setId((Long.valueOf(rs.getInt("max(id)") + 1)));
					this.stm.executeUpdate("INSERT INTO sorter VALUES ("
							+ sorter.getId() + ","
							+ "\""+sorter.getDescription() +"\"" + ")");
				}
				else {					
					sorter.setId((Long.valueOf(rs.getInt("id"))));
				}
				
				for (ItemSorter is : sorter.getItensSorter()){
					insert(is.getErrorType());
					insert(is.getSubErrorType());
					insert(is.getMerFunction());
					insert(is);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
			}
	}

	public void insert(SubErrorType subErrorType) {
		try {
			this.stm = this.conn.createStatement();
			if (subErrorType.getId() == null) {
				if (subErrorType.getDescription() != null && !subErrorType.getDescription().equalsIgnoreCase("") && !subErrorType.getDescription().equalsIgnoreCase(" - ") && !subErrorType.getDescription().equalsIgnoreCase("-")){
					ResultSet rs = this.stm.executeQuery("select * from subErrorType WHERE id_errortype = " + subErrorType.getErrorType().getId() + " AND "
							+ "description = \"" + subErrorType.getDescription() + "\""
							+ " AND NOT (description = \" - \" OR description = \"-\" OR description = \"\")");
					if (!rs.next()) {
						rs = this.stm.executeQuery("select max(id) FROM subErrorType");
						subErrorType.setId((Long.valueOf(rs.getInt("max(id)") + 1)));
						this.stm.executeUpdate("INSERT INTO suberrortype VALUES ("
								+ subErrorType.getId() + ","
								+ "\""+subErrorType.getDescription() +"\"," 
								+ subErrorType.getErrorType().getId() + ")");
					}
					else
						subErrorType.setId((Long.valueOf(rs.getInt("id"))));
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
			}
	}

	public void insert(ErrorType errorType) {
		try {
			this.stm = this.conn.createStatement();

			if (errorType.getId() == null) {
				if (errorType.getDescription() != null && !errorType.getDescription().equalsIgnoreCase("") && !errorType.getDescription().equalsIgnoreCase(" - ") && !errorType.getDescription().equalsIgnoreCase("-")){
					ResultSet rs = this.stm.executeQuery("select * from errorType WHERE description LIKE \"" + errorType.getDescription() + "\"");
					if (!rs.next()) {
						rs = this.stm.executeQuery("select max(id) FROM errorType");
						errorType.setId((Long.valueOf(rs.getInt("max(id)") + 1)));
						this.stm.executeUpdate("INSERT INTO errortype VALUES ("
								+ errorType.getId() + ","
								+ "\""+errorType.getDescription() +"\"" + ")");
					}
					else
						errorType.setId((Long.valueOf(rs.getInt("id"))));
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
			}
	}

	public void insert(MERFunction merFunction) {
		try {
			this.stm = this.conn.createStatement();
			if (merFunction.getId() == null) {
				ResultSet rs = this.stm.executeQuery("select * from merFunction WHERE description LIKE \"" + merFunction.getDescription() + "\"");
				if (!rs.next()) {
					rs = this.stm.executeQuery("select max(id) FROM merFunction");
					merFunction.setId((Long.valueOf(rs.getInt("max(id)") + 1)));
					this.stm.executeUpdate("INSERT INTO merfunction VALUES ("
							+ merFunction.getId() + ","
							+ "\""+merFunction.getDescription() +"\"" + ")");
				}
				else
					merFunction.setId((Long.valueOf(rs.getInt("id"))));
			}

		} catch (SQLException e) {
			e.printStackTrace();
			}
	}

	public void insert(ItemSorter itemSorter) {
		try {
			this.stm = this.conn.createStatement();
			if (itemSorter.getId() == null) {
				ResultSet rs = this.stm.executeQuery("select * from itemsorter WHERE id = " + itemSorter.getId() 
													+ " AND id_errortype = " + itemSorter.getErrorType().getId()
													+ " AND id_merfunction = " + itemSorter.getMerFunction().getId());
				if (!rs.next()) {
					rs = this.stm.executeQuery("select max(id) FROM itemsorter");
					itemSorter.setId((Long.valueOf(rs.getInt("max(id)") + 1)));
					this.stm.executeUpdate("INSERT INTO itemsorter VALUES ("
							+ itemSorter.getId() + ","
							+ itemSorter.getErrorType().getId() + ","
							+ itemSorter.getMerFunction().getId() + ","
							+ "\"" + itemSorter.getRemediation() + "\"" + ")");
				}
				else
					itemSorter.setId((Long.valueOf(rs.getInt("id"))));
			}

		} catch (SQLException e) {
			e.printStackTrace();
			}
	}

	
}
