package module.entity;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
							+ itemSorter.getSubErrorType().getId() + ","
							+ itemSorter.getSorter().getId() + ","
							+ "\"" + itemSorter.getRemediation() + "\"" + ")");
				}
				else
					itemSorter.setId((Long.valueOf(rs.getInt("id"))));
			}

		} catch (SQLException e) {
			e.printStackTrace();
			}
	}
	
	public ArrayList<Sorter> getSorters(){
		ArrayList<Sorter> sorters = new ArrayList<Sorter>();
		try {
			this.stm = this.conn.createStatement();
			ResultSet rs = this.stm.executeQuery("select * from sorter");
			if (rs.next()){
				sorters.add(new Sorter(rs.getLong("id"), rs.getString("description"), null));
			}
				
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return sorters;
	}

	public Sorter getSorter(Long id) {
		Sorter s = new Sorter(null, null, new ArrayList<ItemSorter>());
		try {
			this.stm = this.conn.createStatement();
			ResultSet rs = this.stm.executeQuery("select * from sorter WHERE id = " + id);
			if (rs.next()){
				s = new Sorter(rs.getLong("id"), rs.getString("description"), null);
				s.setItensSorter(getItensSorter(s));
			}
				
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return s;
	}
	
	public ArrayList<ItemSorter> getItensSorter(Sorter sorter){
		ArrayList<ItemSorter> it = new ArrayList<ItemSorter>();
		ResultSet rs1;
		try {
			this.stm = this.conn.createStatement();
			rs1 = this.stm.executeQuery("select * from itemsorter WHERE id_sorter = " + sorter.getId());
			while (rs1.next()){
				it.add(new ItemSorter(rs1.getLong("id"), 
						sorter, 
						getErrorType(rs1.getLong("id_errortype")), 
						getSubErrorType(rs1.getLong("id_suberrortype")), 
						getMERFunction(rs1.getLong("id_merfunction")),
						rs1.getString("remediation")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return it;
	}
	
	public ErrorType getErrorType(Long id_errortype){
		ErrorType e = null;
		ResultSet rs;
		try {
			this.stm = this.conn.createStatement();
			rs = this.stm.executeQuery("select * from errortype WHERE id = " + id_errortype);
			if (rs.next()){
				e = new ErrorType(rs.getLong("id"), rs.getString("description"), null);
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return e;
	}
	
	public SubErrorType getSubErrorType(Long id_suberrortype){
		SubErrorType se = null;
		ResultSet rs, rs1;
		try {
			this.stm = this.conn.createStatement();
			rs = this.stm.executeQuery("select * from suberrortype WHERE id = " + id_suberrortype);
			if (rs.next()){
				this.stm = this.conn.createStatement();
				rs1 = this.stm.executeQuery("select * from errortype WHERE id = " + rs.getLong("id_errortype"));
				se = new SubErrorType(rs.getLong("id"), rs.getString("description"), (rs1.next())? new ErrorType(rs1.getLong("id"), rs1.getString("description"), null) : null);
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return se;
	}

	public MERFunction getMERFunction(Long id_merfunction){
		MERFunction mf = null;
		ResultSet rs;
		try {
			this.stm = this.conn.createStatement();
			rs = this.stm.executeQuery("select * from merfunction WHERE id = " + id_merfunction);
			if (rs.next()){
				mf = new MERFunction(rs.getLong("id"), rs.getString("description"));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return mf;
	}

	public Criterion getCriterion(Long id_criterion){
		Criterion c = null;
		ResultSet rs;
		try {
			this.stm = this.conn.createStatement();
			rs = this.stm.executeQuery("select * from criterion WHERE id = " + id_criterion);
			if (rs.next()){
				c = new Criterion(rs.getLong("id"), rs.getString("description"));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return c;
	}
	public ItemSorter getItemSorter(Long id_sorter, Long id_errortype, Long id_suberrortype){
		ItemSorter is = null;
		ResultSet rs;
		try {
			this.stm = this.conn.createStatement();
			String strAux = (id_suberrortype == null) ? " id_suberrortype is null " : " id_suberrortype = " + id_suberrortype; 
			rs = this.stm.executeQuery("select * from itemsorter WHERE id_sorter = " + id_sorter +
										" AND id_errortype = " + id_errortype + 
										" AND " + strAux);
			if (rs.next()){
				is = new ItemSorter(rs.getLong("id"), getSorter(rs.getLong("id_sorter")), getErrorType(rs.getLong("id_errortype")),
									getSubErrorType(rs.getLong("id_suberrortype")), getMERFunction(rs.getLong("id_merfunction")), rs.getString("remediation"));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return is;
	}
	
		
	
	public ArrayList<ErrorType> getErrorsTypesBySorter(Long id_sorter){
		ResultSet rs;
		ArrayList<ErrorType> ets = new ArrayList<ErrorType>();
		try {
			this.stm = this.conn.createStatement();
			rs = this.stm.executeQuery("SELECT a.id_errortype, b.description from itemsorter a join errortype b on a.id_errortype = b.id where a.id_sorter = " 
										+ id_sorter + " group by a.id_errortype, b.description");
			while (rs.next()){
				ets.add(new ErrorType(rs.getLong("id_errortype"), rs.getString("description"), null));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return ets;

	}
	
	public ArrayList<SubErrorType> getSubErrorsTypesByErrorType(Long id_errortype){
		ResultSet rs;
		ArrayList<SubErrorType> sets = new ArrayList<SubErrorType>();
		try {
			this.stm = this.conn.createStatement();
			rs = this.stm.executeQuery("SELECT * FROM suberrortype WHERE id_errortype = " + id_errortype); 
			while (rs.next()){
				sets.add(new SubErrorType(rs.getLong("id"), rs.getString("description"), null));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return sets;

	}
	
	public void save(MultipleExternalRepresentation mer){
		String strDescription = null;
		try {
			this.stm = this.conn.createStatement();
			if (mer.getDescription() == null)
				strDescription = "null";
			else
				strDescription = mer.getDescription();
			
			if (mer.getId() == null) {
				ResultSet rs = this.stm.executeQuery("select max(id) FROM mer");
				mer.setId((Long.valueOf(rs.getInt("max(id)") + 1)));
			}
			
			//this.stm.executeUpdate("INSERT INTO mer VALUES (" +
				//				mer.getId() + ", " +
					//			strDescription + ", " +
						//		mer.getComplexity() + "," +
							//	mer.getImage() + ")");
			
			PreparedStatement prepStmt = null;
			try{
	            prepStmt= conn.prepareStatement("insert into mer VALUES (?,?,?,?)");
	            prepStmt.setLong(1, mer.getId());
	            prepStmt.setString(2, strDescription);
	            prepStmt.setLong(3, mer.getComplexity());
	            prepStmt.setBytes(4, mer.getImage());
	            prepStmt.executeUpdate();
			}catch(Exception e){
	            e.printStackTrace();
	        }finally{
	            try {
	                prepStmt.close();
	            } catch (Exception e) {
	            }
	        }
			
			for (MERFunction mf: mer.getMerFunctions()){
				this.stm.executeUpdate("INSERT INTO mer_merfunction VALUES (" +
								mer.getId() + ", " +
								mf.getId() + ")");
			}
			
			for (TypeMER tm: mer.getTypeMers()){
				this.stm.executeUpdate("INSERT INTO mer_type VALUES (" +
								mer.getId() + ", " +
								tm.getId() + ")");
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
			}
		
	}
	
	public MultipleExternalRepresentation getMER(Long id){
	        MultipleExternalRepresentation mer = null;
	        
	        Statement stmt=null;
	        try{
	            stmt=conn.createStatement();
	            ResultSet rs=stmt.executeQuery("select * from mer where id="+id);
	            if(rs.next()){
	            	mer = new MultipleExternalRepresentation();
	                mer.setImage(rs.getBytes("image"));
	                //img=Toolkit.getDefaultToolkit().createImage(imgArr);
	                mer.setId(rs.getLong("id"));
	                mer.setComplexity(rs.getInt("complexity"));
	                mer.setDescription(rs.getString("description"));
	                mer.setMerFunctions(new ArrayList<MERFunction>());
	                mer.setTypeMers(new ArrayList<TypeMER>());
	            }
	            rs.close();
	            
	            stmt=conn.createStatement();
	            rs=stmt.executeQuery("SELECT * FROM mer_merfunction join merfunction on id_merfunction = id where id_mer ="+id);
	            while(rs.next()){
	            	mer.getMerFunctions().add(new MERFunction(rs.getLong("id"), rs.getString("description")));
	            }
	            rs.close();
	            
	            stmt=conn.createStatement();
	            rs=stmt.executeQuery("SELECT * FROM mer_type join type on id_type = id where id_mer ="+id);
	            while(rs.next()){
	            	mer.getTypeMers().add(new TypeMER(rs.getLong("id"), rs.getString("description")));
	            }
	            rs.close();
	            
	        }catch(Exception e){
	            e.printStackTrace();

	        }
	        
	        return mer;
	}
	
	public ArrayList<MultipleExternalRepresentation> getMers(){
		ArrayList<MultipleExternalRepresentation> mers = new ArrayList<MultipleExternalRepresentation>();
		Statement stmt=null;

        try {
			stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select id from mer");
			while(rs.next()){
				mers.add(getMER(rs.getLong("id")));
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return mers;
	}

	public ArrayList<Criterion> getCriterions(){
		ArrayList<Criterion> criterions = new ArrayList<Criterion>();
		try {
			this.stm = this.conn.createStatement();
			ResultSet rs = this.stm.executeQuery("select * from criterion");
			if (rs.next()){
				criterions.add(new Criterion(rs.getLong("id"), rs.getString("description")));
			}
				
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return criterions;
	}

}
