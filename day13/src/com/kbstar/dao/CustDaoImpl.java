package com.kbstar.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.kbstar.dto.Cust;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

public class CustDaoImpl implements DAO<String, String, Cust> {

	public CustDaoImpl() {
		// Driver Loading
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버가 없습니다.");
			e.printStackTrace();
			return;
		}
		System.out.println("Driver Loading 성공");
	}

	public Connection getConnection() throws Exception {
		Connection con = null;

		Properties props = new Properties();
		String fileName = "db_info.txt";
		FileInputStream in = new FileInputStream(fileName);
		props.load(in);

		String id = props.getProperty("DB_ID");
		String pwd = props.getProperty("DB_PWD");
		String url = props.getProperty("DB_URL");
		con = DriverManager.getConnection(url, id, pwd);
		return con;
	}

	@Override
	public void insert(Cust v) throws Exception {
		try (Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.insertSql);) {
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getPwd());
			pstmt.setString(3, v.getName());
			pstmt.setInt(4, v.getAge());
			int result = pstmt.executeUpdate();
		} catch (SQLException e) {
			throw e;
//			e.printStackTrace();
		}
	}

	@Override
	public void delete(String k) throws Exception {
		try (Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.deleteSql);) {
			pstmt.setString(1, k);
			int result = pstmt.executeUpdate();
			if(result == 0) {
				throw new Exception("없는 ID입니다.");
			}
		} catch (Exception e) {
			throw e;
		}

	}

	@Override
	public void update(Cust v) throws Exception {
		try (Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.updateSql);) {
			pstmt.setString(1, v.getPwd());
			pstmt.setString(2, v.getName());
			pstmt.setInt(3, v.getAge());
			pstmt.setString(4, v.getId());
			int result = pstmt.executeUpdate();
			if(result == 0) {
				throw new Exception("없음");
			}
		} catch (SQLException e) {
			throw e;
		}
	}

	@Override
	public Cust select(String k) throws Exception {
		Cust cust = null;
		try (Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.selectSql);){
			pstmt.setString(1, k);
			try(ResultSet rset = pstmt.executeQuery()){
				rset.next();  //중요
				cust = new Cust(rset.getString("id"),rset.getString("name"),rset.getInt("age"));
				System.out.printf("id : %s, name : %s, age : %d\n",cust.getId(),cust.getName(),cust.getAge());
			}catch(SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		} return cust;
	}

	@Override
	public List<Cust> selectAll() throws Exception {
		Cust cust = new Cust();
		List<Cust> list = new ArrayList<Cust>();
				try (Connection con = getConnection();
						PreparedStatement pstmt = con.prepareStatement(Sql.selectAllSql);){
					try(ResultSet rset = pstmt.executeQuery()){
						while(rset.next()) {
							rset.next();  //중요
							cust = new Cust(rset.getString("id"),rset.getString("name"),rset.getInt("age"));
							list.add(cust);
						}

					}catch(SQLException e) {
						e.printStackTrace();
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				} 
		return list;
	}

	@Override
	public List<Cust> search(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
