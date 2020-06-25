package com.example.app.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class ContactIdGnerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		// TODO Auto-generated method stub
		String prifix="CO";
		String suffix="";
		//int seqval=0;
		try {
			Connection con=session.connection();
			Statement stmt=con.createStatement();
			String sql="select contact_id_seq.nextval from dual";
			ResultSet rs=stmt.executeQuery(sql);
			if(rs.next()) {
			int	seqval=rs.getInt(1);			
				suffix= String.valueOf(seqval);
			}
		}
		catch(Exception e){
			e.printStackTrace(); 
		}
		return prifix + suffix;
	}

}
