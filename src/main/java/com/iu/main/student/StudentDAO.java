package com.iu.main.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iu.main.bankBook.BankBookDTO;
import com.iu.main.utill.DbConnector;

public class StudentDAO {

	public int studentAdd(StudentDTO studentDTO ) throws Exception{
		Connection con = DbConnector.getConnection();
		
		String insertsql= "INSERT INTO STUDENT VALUES (BANK_SEQ.NEXTVAL,?,?,?,?,?,?)";
		
		//3. 쿼리문 미리 전송
		PreparedStatement st = con.prepareStatement(insertsql);
		
		//4.? 값 세팅
		st.setString(1, studentDTO.getName());
		st.setInt(2, studentDTO.getKorean());
		st.setInt(3, studentDTO.getEnglish());
		st.setInt(4, studentDTO.getMath());
		st.setInt(5, studentDTO.getTotal());
		st.setDouble(6, studentDTO.getAvg());
		//5. 최종 전송 및 결과 처리
		int result = st.executeUpdate();
		return result;		
	}
	
	public StudentDTO studentDetail(StudentDTO studentDTO) throws Exception {
		Connection con = DbConnector.getConnection();
		String sql= "SELECT * FROM STUDENT WHERE STUDNUM = ?";
		
	
		PreparedStatement st = con.prepareStatement(sql);
		

		st.setLong(1, studentDTO.getStudNum());
		ResultSet rs = st.executeQuery();
		
		//한 줄 읽기
		if(rs.next()) {
			studentDTO.setStudNum(rs.getLong("STUDNUM"));
			studentDTO.setName(rs.getString("NAME"));
			studentDTO.setKorean(rs.getInt("KOREAN"));
			studentDTO.setEnglish(rs.getInt("ENGLISH"));
			studentDTO.setMath(rs.getInt("MATH"));
			studentDTO.setTotal(rs.getInt("TOTAL"));
			studentDTO.setAvg(rs.getDouble("AVERAGE"));
		}else {
			studentDTO=null;
		}
		
		return studentDTO;
	}
	
	public int studentDelete(StudentDTO studentDTO) throws Exception {
		//1. DB 연동
		Connection con = DbConnector.getConnection();
		//2. query문 작성
		String sql="DELETE STUDENT WHERE STUDNUM=?";
		//3. 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		//4. ? 세팅
		st.setLong(1, studentDTO.getStudNum());
		//5. 최종전송 및 결과 처리
		int result = st.executeUpdate();
		
		System.out.println("Db Delete");
		
		return result;
	}
}
