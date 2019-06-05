package com.Implement;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.Interface.Interface;
import com.pojoclass.ProjectAllocationPojo;
import com.pojoclass.ProjectReportPojo;
import com.pojoclass.ShiftAllocationPojo;
import com.pojoclass.UserRegisterPojo;

public class Implement implements Interface{

	
	Transaction transaction;
	
	Query query,query1;
	
	@SuppressWarnings("deprecation")
	Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
	@Override
	public int register(UserRegisterPojo ur) {
		// TODO Auto-generated method stub
		
		transaction=session.beginTransaction();
		
		int i =(Integer) session.save(ur);
		
		System.out.println("i ="+i);
		
		transaction.commit();
		
		return i;
	}
	
	@Override
	public int UpdateKey(UserRegisterPojo ur) {
		
		// TODO Auto-generated method stub
		System.out.println("1");
		transaction =session.beginTransaction();
		System.out.println("2");
		String hql="Update UserRegisterPojo set SecretKey=:SecretKey "+"WHERE EmpId=:EmpId";
		System.out.println("3");
		query =session.createQuery(hql);
		System.out.println("4");
		query.setParameter("SecretKey", ur.getSecretKey());
		query.setParameter("EmpId", ur.getEmpId());
		System.out.println("5");
		int i =query.executeUpdate();
		System.out.println("6");
		System.out.println("Key Update i ="+i);
		
		transaction.commit();
				
		return i;
	}
	
	@Override
	public List login(UserRegisterPojo ur) {
		// TODO Auto-generated method stub
		
		transaction =session.beginTransaction();
		
		query =session.createQuery("from UserRegisterPojo where EmpId= :EmpId and Password= :Password");
		
		query.setParameter("EmpId", ur.getEmpId());
		query.setParameter("Password", ur.getPassword());
		
		List list =query.list();
		
		transaction.commit();
		
		return list;
	}

	@Override
	public int projectAllocation(ProjectAllocationPojo pap) {
		// TODO Auto-generated method stub
		
		transaction =session.beginTransaction();
		
		int i =(Integer)session.save(pap);
		
		System.out.println("projectAllocation implement i ="+i);
		
		transaction.commit();
		
		return i;
	}

	@Override
	public int shiftAllocation(ShiftAllocationPojo sa) {
		// TODO Auto-generated method stub
		
		transaction =session.beginTransaction();
		
		int i =(Integer) session.save(sa);
		
		System.out.println("shiftAllocation implement i ="+i);
		
		transaction.commit();
		
		return i;
	}

	@Override
	public int shiftUpdate(ShiftAllocationPojo sa) {
		
		// TODO Auto-generated method stub
		
		transaction =session.beginTransaction();
		
		query =session.createQuery("Update ShiftAllocationPojo set ShiftName=:ShiftName where EmployeeeID=:EmployeeeID");
		
		query.setParameter("ShiftName", sa.getShiftName());
		
		query.setParameter("EmployeeeID", sa.getEmpID());
		
		int i =query.executeUpdate();
		
		System.out.println("shiftUpdate i ="+i);
		
		transaction.commit();
				
		return i;
	}
	
	

	@Override
	public int ProjectReport(ProjectReportPojo prp) {
		// TODO Auto-generated method stub
		
        transaction =session.beginTransaction();
		
		int i =(Integer) session.save(prp);
		
		System.out.println("shiftAllocation implement i ="+i);
		
		transaction.commit();
		
		return i;
	}

	@Override
	public int Performence(com.pojoclass.PerformencePojo p) {
		// TODO Auto-generated method stub
		
		transaction =session.beginTransaction();
		
		int i =(Integer) session.save(p);
		
		transaction.commit();
		
		return i;
	}

	@Override
	public List getUsername(UserRegisterPojo ur) {
		// TODO Auto-generated method stub
		
        transaction =session.beginTransaction();
		
		query =session.createQuery("from UserRegisterPojo where EmpId= :EmpId and Password= :Password");
		
		query.setParameter("EmpId", ur.getEmpId());
		query.setParameter("Password", ur.getPassword());
		
		List list =query.list();
		
		transaction.commit();
		
		return list;
	}

	@Override
	public int DeleteEmp(UserRegisterPojo ur){
		
		transaction =session.beginTransaction();
		query=session.createQuery("");
		query.setParameter(arg0, arg1);
		int i=query.executeUpdate();
		System.out.println("Rows affected: " + i);
		return i;
	}
	
	
}
