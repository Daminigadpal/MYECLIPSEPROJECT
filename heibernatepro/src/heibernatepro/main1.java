package heibernatepro;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;


public class main1 {

	public static void main(String[] args) {
		{
			SessionFactory sfactory=new Configuration().configure().buildSessionFactory();
			Session ses=sfactory.openSession();
			Transaction tx=null;
			tx=ses.beginTransaction();
			Student stu=new Student();
			stu.setNamee("Vivekeee");
			stu.setAge(71);
//			stu.setNamee("Sravani mam");
//			stu.setAge(91);
			ses.persist(stu);
			ses.flush();
			tx.commit();
			ses.close();
		}
	}
}
