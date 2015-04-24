package module.entity;

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
				e = new ErrorType(rs.getLong("id"), rs.getString("description"), new ArrayList<SubErrorType>());
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

	public ItemSorter getItemSorter(Long id_itemsorter){
		ItemSorter is = null;
		ResultSet rs;
		try {
			this.stm = this.conn.createStatement();
		 
			rs = this.stm.executeQuery("select * from itemsorter WHERE id = " + id_itemsorter);

			if (rs.next()){
				is = new ItemSorter(rs.getLong("id"), getSorter(rs.getLong("id_sorter")), getErrorType(rs.getLong("id_errortype")),
									getSubErrorType(rs.getLong("id_suberrortype")), getMERFunction(rs.getLong("id_merfunction")), rs.getString("remediation"));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return is;
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
	            } else return null;
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
			while (rs.next()){
				criterions.add(new Criterion(rs.getLong("id"), rs.getString("description")));
			}
				
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return criterions;
	}
	
	public void save(Action action){
		String strDescription = null;
		try {
			this.stm = this.conn.createStatement();
			
			if (action.getId() == null) {
				ResultSet rs = this.stm.executeQuery("select max(id) FROM action");
				action.setId((Long.valueOf(rs.getInt("max(id)") + 1)));
			}
			
			PreparedStatement prepStmt = null;
			
			try{
	            prepStmt= conn.prepareStatement("insert into action VALUES (?,?,?,?,?,?,?,?,?,?)");
	            prepStmt.setLong(1, action.getId());
	            prepStmt.setString(2, action.getAnswer().getValue());
	            prepStmt.setLong(3, action.getGoal().getId());
	            prepStmt.setBoolean(4, action.getCorrect());
	            prepStmt.setDate(5, new java.sql.Date(action.getDate().getTime()));
	            if (action.getRemediation() != null)
	            	prepStmt.setLong(6, action.getRemediation().getId());
	            if (action.getMer() != null)
	            	prepStmt.setLong(7, action.getMer().getId());
	            prepStmt.setLong(8, action.getStudent().getId());
	            prepStmt.setInt(9, action.getAttempt());
	            if (action.getMerFunction() != null)
	            	prepStmt.setLong(10,  action.getMerFunction().getId());

	            prepStmt.executeUpdate();
	            
	            for (String r : action.getRegrasAcionadas()){
	            	PreparedStatement prepStmt2 = conn.prepareStatement("insert into rule_action values (?,?)");
	            	prepStmt2.setLong(1, action.getId());
	            	prepStmt2.setString(2, r);
	            	prepStmt2.executeUpdate();
	            	prepStmt2.close();
	            }
	            
	            
			}catch(Exception e){
	            e.printStackTrace();
	        }finally{
	            try {
	                prepStmt.close();
	            } catch (Exception e) {
	            }
	        }

			
			

		} catch (SQLException e) {
			e.printStackTrace();
			}
		
	}

	public void save(Goal goal){
		String strDescription = null;
		try {
			this.stm = this.conn.createStatement();
			
			if (goal.getId() == null) {
				ResultSet rs = this.stm.executeQuery("select max(id) FROM goal");
				goal.setId((Long.valueOf(rs.getInt("max(id)") + 1)));
			}
			
			PreparedStatement prepStmt = null;
			
			try{
	            prepStmt= conn.prepareStatement("insert into goal VALUES (?,?,?,?,?,?,?,?)");
	            prepStmt.setLong(1, goal.getId());
	            prepStmt.setString(2, goal.getDescription());
	            prepStmt.setBoolean(3, goal.getSatisfied());
	            if (goal.getSubGoal() != null)
	            	prepStmt.setLong(4, goal.getSubGoal().getId());
	            if (goal.getSuperGoal() != null)
	            	prepStmt.setLong(5, goal.getSuperGoal().getId());
	            prepStmt.setLong(6, goal.getPath().getId());
	            prepStmt.setString(7, goal.getAnswer().getValue());
	            prepStmt.setString(8, goal.getComponent());
	            
	            prepStmt.executeUpdate();
	            
	            
	            
			}catch(Exception e){
	            e.printStackTrace();
	            System.exit(1);
	        }finally{
	            try {
	                prepStmt.close();
	            } catch (Exception e) {
	            }
	        }
			
			

		} catch (SQLException e) {
			e.printStackTrace();
			}
		
	}

	
	public void save(Remediation remediation){
		String strDescription = null;
		try {
			this.stm = this.conn.createStatement();
			
			if (remediation.getId() == null) {
				ResultSet rs = this.stm.executeQuery("select max(id) FROM remediation");
				remediation.setId((Long.valueOf(rs.getInt("max(id)") + 1)));
			}
			
			PreparedStatement prepStmt = null;
			
			try{
	            prepStmt= conn.prepareStatement("insert into remediation VALUES (?,?,?,?,?,?,?,?)");
	            prepStmt.setLong(1, remediation.getId());
	            prepStmt.setLong(2, remediation.getGoal().getId());
	            prepStmt.setLong(3, remediation.getItemSorter().getId());
	            prepStmt.setLong(4, remediation.getCriterion().getId());
	            if (remediation.getAttempts() != null)
	            	prepStmt.setInt(5, remediation.getAttempts());
	            prepStmt.setString(6, remediation.getWrongAnswer());
	            prepStmt.setString(7, remediation.getRelatedError());
	            if (remediation.getMer() != null)
	            	prepStmt.setLong(8, remediation.getMer().getId());

	            prepStmt.executeUpdate();
	            
	            
	            
			}catch(Exception e){
	            e.printStackTrace();
	        }finally{
	            try {
	                prepStmt.close();
	            } catch (Exception e) {
	            }
	        }
			
			

		} catch (SQLException e) {
			e.printStackTrace();
			}
		
	}

	
	public void save(Path path){
		String strDescription = null;
		try {
			this.stm = this.conn.createStatement();
			
			if (path.getId() == null) {
				ResultSet rs = this.stm.executeQuery("select max(id) FROM path");
				path.setId((Long.valueOf(rs.getInt("max(id)") + 1)));
			}
			
			PreparedStatement prepStmt = null;
			
			try{
	            prepStmt= conn.prepareStatement("insert into path VALUES (?,?, ?)");
	            prepStmt.setLong(1, path.getId());
	            prepStmt.setString(2, path.getDescription());
	            prepStmt.setLong(3, path.getExercise().getId());

	            prepStmt.executeUpdate();
	            
	            for (Goal g: path.getGoals())
	            	save(g);
	            
			}catch(Exception e){
	            e.printStackTrace();
	        }finally{
	            try {
	                prepStmt.close();
	            } catch (Exception e) {
	            }
	        }
			
			

		} catch (SQLException e) {
			e.printStackTrace();
			}
		
	}

	public void save(Exercise exercise){

		try {
			this.stm = this.conn.createStatement();
			
			if (exercise.getId() == null) {
				ResultSet rs = this.stm.executeQuery("select max(id) FROM exercise");
				exercise.setId((Long.valueOf(rs.getInt("max(id)") + 1)));
			}
			
			PreparedStatement prepStmt = null;
			
			try{
	            prepStmt= conn.prepareStatement("insert into exercise VALUES (?,?)");
	            prepStmt.setLong(1, exercise.getId());
	            prepStmt.setString(2, exercise.getEnunciate());


	            prepStmt.executeUpdate();
	            
	            for (Path path : exercise.getPaths())
	            	save(path);
	            for (ExerciseInitialState eis: exercise.getInitialState())
	            	save(eis);
	            
			}catch(Exception e){
	            e.printStackTrace();
	        }finally{
	            try {
	                prepStmt.close();
	            } catch (Exception e) {
	            }
	        }
			
			

		} catch (SQLException e) {
			e.printStackTrace();
			}
		
	}

	public void save(ExerciseInitialState eis){

		try {
			this.stm = this.conn.createStatement();
			
			
			PreparedStatement prepStmt = null;
			
			try{
	            prepStmt= conn.prepareStatement("insert into exercise_initialstate VALUES (?,?,?)");
	            prepStmt.setLong(1, eis.getExercise().getId());
	            prepStmt.setString(2, eis.getComponent());
	            prepStmt.setString(3, eis.getValue());


	            prepStmt.executeUpdate();
	            
			}catch(Exception e){
	            e.printStackTrace();
	        }finally{
	            try {
	                prepStmt.close();
	            } catch (Exception e) {
	            }
	        }
			
			

		} catch (SQLException e) {
			e.printStackTrace();
			}
		
	}

	public ArrayList<Action> getActions(){
		ArrayList<Action> actions = new ArrayList<Action>();
		Statement stmt=null;

        try {
			stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select id from action");
			while(rs.next()){
				actions.add(getAction(rs.getLong("id")));
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return actions;
	}

	public Action getAction(Long id){
        Action action = null;
        
        Statement stmt=null;
        try{
            stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from action where id="+id);
            if(rs.next()){
            	action = new Action();
            	action.setId(rs.getLong("id"));
            	action.setCorrect(rs.getBoolean("correct"));
            	action.setAnswer(action.getCorrect() ? new CorrectAnswer(rs.getString("answer")) : new WrongAnswer(rs.getString("answer")));
            	action.setAttempt(rs.getInt("attempt"));
            	action.setDate(rs.getDate("date"));
            	action.setGoal(getGoal(rs.getLong("id_goal"), false));
            	action.setMer(getMER(rs.getLong("id_mer")));
            	action.setRegrasAcionadas(new ArrayList<String>());
            	action.setStudent(getStudent(rs.getLong("id_student")));
            	action.setRemediation(getRemediation(rs.getLong("id_remediation")));
            	action.setMerFunction(getMERFunction(rs.getLong("id_merfunction")));
            } else return null;
            rs.close();
            
            stmt=conn.createStatement();
            rs=stmt.executeQuery("SELECT * FROM rule_action where id_action ="+id);
            while(rs.next()){
            	action.getRegrasAcionadas().add(rs.getString("rule"));
            }
            rs.close();
            
        }catch(Exception e){
            e.printStackTrace();

        }
        
        return action;
}
	
	public Student getStudent(Long id_student) {

		Student student = null;
        Statement stmt=null;
        try{
            stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from goal where id="+id_student);
            if(rs.next()){
            	student = new Student(rs.getLong("id"),rs.getString("name"));

            } else return null;
            rs.close();
            
                        
        }catch(Exception e){
            e.printStackTrace();

        }

		return student;
	}

	public ArrayList<Exercise> getExercises(){
		ArrayList<Exercise> exercises = new ArrayList<Exercise>();
		try {
			this.stm = this.conn.createStatement();
			ResultSet rs = this.stm.executeQuery("select * from exercise");
			if (rs.next()){
				exercises.add(getExercise(rs.getLong("id")));
			}
				
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return exercises;
	}

	public Exercise getExercise(Long id_exercise) {

		Exercise exercise = null;
		
        Statement stmt=null;
        try{
            stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from exercise where id="+id_exercise);
            if(rs.next()){
            	exercise = new Exercise(rs.getLong("id"),rs.getString("enunciate"), getPathsByExercise(id_exercise), null );
            	for (Path p: exercise.getPaths()) p.setExercise(exercise);
            	exercise.setInitialState(getInitialState(exercise));
            } else return null;
            rs.close();
            
                        
        }catch(Exception e){
            e.printStackTrace();

        }

		return exercise;
	}
	
	public Path getPath(Long id_path) {

		Path path = null;
        Statement stmt=null;
        try{
            stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from path where id="+id_path);
            if(rs.next()){
            	path = new Path(rs.getLong("id"),null, rs.getString("description"), getGoalsByPath(id_path));
            	for (Goal g : path.getGoals()) g.setPath(path);
            } else return null;
            rs.close();
            
                        
        }catch(Exception e){
            e.printStackTrace();

        }

		return path;
	}

	public Goal getGoal(Long id, boolean bringSubSuper){
        Goal goal = null;
        
        Statement stmt=null;
        try{
            stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from goal where id=" + id);
            if(rs.next()){
            	goal = new Goal();
                goal.setId(rs.getLong("id"));
                //if (goal.getId().equals(0L)) return null;
                goal.setComponent(rs.getString("component"));
                //goal.setPath(getPath(rs.getLong("id_path")));
                goal.setAnswer(new CorrectAnswer(rs.getString("answer")));
                goal.setSatisfied(rs.getBoolean("satisfied"));
                goal.setDescription(rs.getString("description"));
                //goal.setActions(getActionsByGoal(rs.getLong("id")));
                if (bringSubSuper) {
                	Long i = rs.getLong("id_subgoal");
                	if (i.equals(0L)) 
                		goal.setSubGoal(null); 
                	else 
                		goal.setSubGoal(getGoal(i, false));
                	i = rs.getLong("id_supergoal");
                	if (i.equals(0L)) 
                		goal.setSuperGoal(null); 
                	else 
                		goal.setSuperGoal(getGoal(i, false));                	
                } else {
                	goal.setSubGoal(new Goal(rs.getLong("id_subgoal")));
                	goal.setSuperGoal(new Goal(rs.getLong("id_supergoal")));
                }
                	
                //goal.setRemediations(getRemediationsByGoal(rs.getLong("id")));

            } 
            rs.close();
            
                        
        }catch(Exception e){
            e.printStackTrace();

        }
        
        return goal;
}

	
	public ArrayList<Action> getActionsByGoal(long id_goal) {

		ArrayList<Action> actions = new ArrayList<Action>();
		try {
			this.stm = this.conn.createStatement();
			ResultSet rs = this.stm.executeQuery("select * from action where id_goal = " + id_goal);
			while (rs.next()){
				actions.add(getAction(rs.getLong("id")));
			}
				
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return actions;

	}

	public ArrayList<Goal> getGoalsByPath(long id_path) {

		ArrayList<Goal> goals = new ArrayList<Goal>();
		try {
			this.stm = this.conn.createStatement();
			ResultSet rs = this.stm.executeQuery("select * from goal where id_path = " + id_path);
			while (rs.next()){
				goals.add(getGoal(rs.getLong("id"), false));
			}
				
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return goals;

	}

	public ArrayList<Path> getPathsByExercise(long id_exercise) {

		ArrayList<Path> paths = new ArrayList<Path>();
		try {
			this.stm = this.conn.createStatement();
			ResultSet rs = this.stm.executeQuery("select * from path where id_exercise = " + id_exercise);
			while (rs.next()){
				paths.add(getPath(rs.getLong("id")));
			}
				
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return paths;

	}

	public ArrayList<ExerciseInitialState> getInitialState(Exercise exercise) {

		ArrayList<ExerciseInitialState> initialState = new ArrayList<ExerciseInitialState>();
		try {
			this.stm = this.conn.createStatement();
			ResultSet rs = this.stm.executeQuery("select * from exercise_initialstate  where id_exercise = " + exercise.getId());
			while (rs.next()){
				initialState.add(new ExerciseInitialState(exercise, rs.getString("component"), rs.getString("value")));
			}
				
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return initialState;

	}

	public ArrayList<Remediation> getRemediationsByGoal(long id_goal) {

		ArrayList<Remediation> remediations = new ArrayList<Remediation>();
		try {
			this.stm = this.conn.createStatement();
			ResultSet rs = this.stm.executeQuery("select * from remediation where id_goal = " + id_goal);
			while (rs.next()){
				remediations.add(getRemediation(rs.getLong("id")));
			}
				
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return remediations;

	}


	public Remediation getRemediation(Long id){
        Remediation remediation = null;
        
        Statement stmt=null;
        try{
            stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from remediation where id="+id);
            if(rs.next()){
            	remediation = new Remediation();
                remediation.setId(rs.getLong("id"));
                remediation.setAttempts(rs.getInt("attempts"));
                remediation.setCriterion(getCriterion(rs.getLong("id_criterion")));
                remediation.setGoal(getGoal(rs.getLong("id_goal"), false));
                remediation.setItemSorter(getItemSorter(rs.getLong("id_itemsorter")));
                remediation.setRelatedError(rs.getString("relatederror"));
                remediation.setWrongAnswer(rs.getString("wronganswer"));
                remediation.setMer(getMER(rs.getLong("id_mer")));
                

            }
            rs.close();
            
                        
        }catch(Exception e){
            e.printStackTrace();

        }
        
        return remediation;
}
	
	public ArrayList<MultipleExternalRepresentation> getMersByMerFunction(Long id_merfunction){
		ArrayList<MultipleExternalRepresentation> mers = new ArrayList<MultipleExternalRepresentation>();
		Statement stmt=null;

        try {
			stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select id_mer from mer_merfunction where id_merfunction = " + id_merfunction);
			while(rs.next()){
				mers.add(getMER(rs.getLong("id_mer")));
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return mers;
	}

	public ArrayList<MultipleExternalRepresentation> getMersBySuccess(Long id_merfunction){
		ArrayList<MultipleExternalRepresentation> mers = new ArrayList<MultipleExternalRepresentation>();
		Statement stmt=null;

        try {
			stmt=conn.createStatement();

			ResultSet rs=stmt.executeQuery("SELECT b.id, count(a.id) as success FROM mer b left join action a on a.id_mer = b.id " +
					 " where a.correct = 'true' " +
			" and id_merfunction = " + id_merfunction +
					" group by b.id " +
					" order by success ");
			
			while(rs.next()){
				mers.add(getMER(rs.getLong("b.id")));
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return mers;
	}
	
	
}
