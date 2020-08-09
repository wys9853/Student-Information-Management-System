package com.dao;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import bean.DbConnect;
import bean.Student;
public class StudentDAO implements IStudentDAO{
	protected static final String FIELDS_INSERT="id,name,sex,age,weight,hight";
	protected static String INSERT_SQL="insert into student("+FIELDS_INSERT+")"+" values(?,?,?,?,?,?)";
	protected static String SELECT_SQL="select "+FIELDS_INSERT+" from student where id=?";
	protected static String UPDATE_SQL="update student set "+"id=?,name=?,sex=?,age=?,weight=?,hight=? where id=?";
	protected static String DELETE_SQL="delete from student where id=?";
	public Student create (Student stu) throws Exception{
		Connection con=null;
		PreparedStatement prepStmt=null;
		ResultSet rs=null;
		try {
			con=DbConnect.getDBconnect();
			prepStmt=con.prepareStatement(INSERT_SQL);
			prepStmt.setInt(1, stu.getId());
			prepStmt.setString(2, stu.getName());
			prepStmt.setString(3, stu.getSex());
			prepStmt.setInt(4, stu.getAge());
			prepStmt.setFloat(5, stu.getWeight());
			prepStmt.setFloat(6, stu.getHight());
			prepStmt.executeUpdate();
		}catch(Exception e) {
		}finally {
			DbConnect.closeDB(con,prepStmt,rs);
		}
		return stu;
	}
	public void remove(Student stu) throws Exception{
		Connection con=null;
		PreparedStatement prepStmt=null;
		ResultSet rs=null;
		try {
			con=DbConnect.getDBconnect();
			prepStmt=con.prepareStatement(DELETE_SQL);
			prepStmt.setInt(1, stu.getId());
			prepStmt.executeUpdate();
		}catch(Exception e) {
		}finally {
			DbConnect.closeDB(con,prepStmt,rs);
		}
	}
	public Student find(Student stu) throws Exception{
		Connection con=null;
		PreparedStatement prepStmt=null;
		ResultSet rs=null;
		Student stu2=null;
		try {
			con=DbConnect.getDBconnect();
			prepStmt=con.prepareStatement(SELECT_SQL);
			prepStmt.setInt(1, stu.getId());
			rs=prepStmt.executeQuery();
			if(rs.next()) {
				stu2=new Student();
				stu2.setId(rs.getInt(1));
				stu2.setName(rs.getString(2));
				stu2.setSex(rs.getString(3));
				stu2.setAge(rs.getInt(4));
				stu2.setWeight(rs.getFloat(5));
				stu2.setHight(rs.getFloat(6));
			}
		}catch(Exception e) {
		}finally {
			DbConnect.closeDB(con,prepStmt,rs);
		}
		return stu2;
	}
	public List<Student> findAll() throws Exception{
		Connection con=null;
		PreparedStatement prepStmt=null;
		ResultSet rs=null;
		List<Student> student=new ArrayList<Student>();
		con=DbConnect.getDBconnect();
		prepStmt=con.prepareStatement("select * from student");
		rs=prepStmt.executeQuery();
		while(rs.next()) {
			Student stu2=new Student();
			stu2.setId(rs.getInt(1));
			stu2.setName(rs.getString(2));
			stu2.setSex(rs.getString(3));
			stu2.setAge(rs.getInt(4));
			stu2.setWeight(rs.getFloat(5));
			stu2.setHight(rs.getFloat(6));
			student.add(stu2);
		}
		DbConnect.closeDB(con, prepStmt, rs);
		return student;
	}
	public void update(Student stu) throws Exception {
		Connection con=null;
		PreparedStatement prepStmt=null;
		ResultSet rs=null;
		try {
			con=DbConnect.getDBconnect();
			prepStmt=con.prepareStatement(UPDATE_SQL);
			prepStmt.setInt(1, stu.getId());
			prepStmt.setString(2, stu.getName());
			prepStmt.setString(3, stu.getSex());
			prepStmt.setInt(4, stu.getAge());
			prepStmt.setFloat(5, stu.getWeight());
			prepStmt.setFloat(6, stu.getHight());
			prepStmt.setFloat(7, stu.getId());
			int rowCount=prepStmt.executeUpdate();
			if(rowCount==0) {
				throw new Exception("Update Error:Student Id:"+stu.getId());
			}
		}catch(Exception e) {
		}finally {
			DbConnect.closeDB(con, prepStmt, rs);
		}
	}
}