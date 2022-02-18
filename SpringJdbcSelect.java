package com.ex;

import java.util.Iterator;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpringJdbcSelect {
JdbcTemplate jt;

public void setJt(JdbcTemplate jt) { //setter method
	this.jt = jt;
}
// DELETE
//public void delete() {
	//jt.execute("delete from student where sid=2");
//}
//INSERT
/*public void insert() {
jt.execute("insert into student values(2,'sailaxmi','java')");
} */

// UPDATE
/*public void update() {
	jt.execute("update student set sname='DSL' where sid=2");
} */

//ALL RECORDS
public void selectEx() { // method 
	List li=jt.queryForList("select * from student");// return type of queryforlist is LIST
	Iterator i=li.iterator();
	while(i.hasNext()) { //if record exist or not
		System.out.println(i.next());//it returns the next element in the collection until the hasNext() method return Ture
		
	}	
}
}
