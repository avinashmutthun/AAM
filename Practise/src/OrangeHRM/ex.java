package OrangeHRM;

import java.sql.Timestamp;
import java.util.Date;

public class ex {

	public static void main(String[] args) {
		Timestamp t=new Timestamp(System.currentTimeMillis());
		
		Date d=new Date(t.getTime());
		
		System.out.println(d);
	}

}
