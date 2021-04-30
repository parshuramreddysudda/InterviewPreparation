package springdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class StudentDatabase {

	
	static List<StudentClass> students = new ArrayList<StudentClass>();

	public  void getDetails() {

		Iterator<StudentClass> it = students.iterator();
		while (it.hasNext()) {
			StudentClass stu = it.next();
			//System.out.println(" ID :" + stu.getId() + " Name :" + stu.getName() + " Address :" + stu.getAddress());
		}
		System.out.println("Executed");

	}

	public static  void getStudent(int id) {
		if (students.get(id) == null)
			System.out.println("No movie found");
		for (StudentClass student : students) {
			if (student.getId() == id)
				System.out.println(" ID :" + student.getId() + " Name :" + student.getName() + " Address :" + student.getAddress());
		}
System.out.println("Execute");
	}

	static {
		students.add(new StudentClass(0, "Ram3925", "Hyderabad166718"));
		students.add(new StudentClass(1, "Ram4279", "Hyderabad287440"));
		students.add(new StudentClass(2, "Ram2003", "Hyderabad108510"));
		students.add(new StudentClass(3, "Ram3811", "Hyderabad97391"));
		students.add(new StudentClass(4, "Ram3106", "Hyderabad439393"));
		students.add(new StudentClass(5, "Ram1712", "Hyderabad442868"));
		students.add(new StudentClass(6, "Ram917", "Hyderabad167773"));
		students.add(new StudentClass(7, "Ram4326", "Hyderabad431667"));
		students.add(new StudentClass(8, "Ram2814", "Hyderabad74133"));
		students.add(new StudentClass(9, "Ram1084", "Hyderabad62280"));
		students.add(new StudentClass(10, "Ram261", "Hyderabad254242"));
		students.add(new StudentClass(11, "Ram3595", "Hyderabad279378"));
		students.add(new StudentClass(12, "Ram327", "Hyderabad116395"));
		students.add(new StudentClass(13, "Ram318", "Hyderabad294517"));
		students.add(new StudentClass(14, "Ram1611", "Hyderabad94546"));
		students.add(new StudentClass(15, "Ram2469", "Hyderabad412707"));
		students.add(new StudentClass(16, "Ram32", "Hyderabad171685"));
		students.add(new StudentClass(17, "Ram3721", "Hyderabad410087"));
		students.add(new StudentClass(18, "Ram3826", "Hyderabad60789"));
		students.add(new StudentClass(19, "Ram810", "Hyderabad288645"));
		students.add(new StudentClass(20, "Ram3771", "Hyderabad86919"));
		students.add(new StudentClass(21, "Ram788", "Hyderabad112593"));
		students.add(new StudentClass(22, "Ram422", "Hyderabad383557"));
		students.add(new StudentClass(23, "Ram3711", "Hyderabad1659"));
		students.add(new StudentClass(24, "Ram2990", "Hyderabad58648"));
		students.add(new StudentClass(25, "Ram726", "Hyderabad374539"));
		students.add(new StudentClass(26, "Ram4454", "Hyderabad136571"));
		students.add(new StudentClass(27, "Ram3455", "Hyderabad62150"));
		students.add(new StudentClass(28, "Ram786", "Hyderabad442327"));
		students.add(new StudentClass(29, "Ram4425", "Hyderabad75565"));
		students.add(new StudentClass(30, "Ram242", "Hyderabad334695"));
		students.add(new StudentClass(31, "Ram2516", "Hyderabad13391"));
		students.add(new StudentClass(32, "Ram1790", "Hyderabad6799"));
		students.add(new StudentClass(33, "Ram2682", "Hyderabad108555"));
		students.add(new StudentClass(34, "Ram4557", "Hyderabad280982"));
		students.add(new StudentClass(35, "Ram188", "Hyderabad401764"));
		students.add(new StudentClass(36, "Ram1232", "Hyderabad280341"));
		students.add(new StudentClass(37, "Ram263", "Hyderabad408440"));
		students.add(new StudentClass(38, "Ram1467", "Hyderabad368803"));
		students.add(new StudentClass(39, "Ram885", "Hyderabad18399"));
		students.add(new StudentClass(40, "Ram3060", "Hyderabad370774"));
		students.add(new StudentClass(41, "Ram4015", "Hyderabad211069"));
		students.add(new StudentClass(42, "Ram3492", "Hyderabad371912"));
		students.add(new StudentClass(43, "Ram1664", "Hyderabad286707"));
		students.add(new StudentClass(44, "Ram3466", "Hyderabad59812"));
		students.add(new StudentClass(45, "Ram3381", "Hyderabad442129"));
		students.add(new StudentClass(46, "Ram4031", "Hyderabad245355"));
		students.add(new StudentClass(47, "Ram769", "Hyderabad314312"));
		students.add(new StudentClass(48, "Ram932", "Hyderabad56544"));
		students.add(new StudentClass(49, "Ram1421", "Hyderabad403719"));
		students.add(new StudentClass(50, "Ram4103", "Hyderabad290156"));
		students.add(new StudentClass(51, "Ram2700", "Hyderabad210885"));
		students.add(new StudentClass(52, "Ram1301", "Hyderabad318798"));
		students.add(new StudentClass(53, "Ram1533", "Hyderabad264269"));
		students.add(new StudentClass(54, "Ram873", "Hyderabad417675"));
		students.add(new StudentClass(55, "Ram3194", "Hyderabad121323"));
		students.add(new StudentClass(56, "Ram1410", "Hyderabad327046"));
		students.add(new StudentClass(57, "Ram653", "Hyderabad429137"));
		students.add(new StudentClass(58, "Ram4019", "Hyderabad20492"));
		students.add(new StudentClass(59, "Ram1714", "Hyderabad202030"));
		students.add(new StudentClass(60, "Ram2388", "Hyderabad99918"));
		students.add(new StudentClass(61, "Ram1047", "Hyderabad55932"));
		students.add(new StudentClass(62, "Ram2886", "Hyderabad224860"));
		students.add(new StudentClass(63, "Ram1215", "Hyderabad33700"));
		students.add(new StudentClass(64, "Ram1844", "Hyderabad292771"));
		students.add(new StudentClass(65, "Ram4470", "Hyderabad165744"));
		students.add(new StudentClass(66, "Ram1237", "Hyderabad379330"));
		students.add(new StudentClass(67, "Ram4320", "Hyderabad410685"));
		students.add(new StudentClass(68, "Ram445", "Hyderabad146007"));
		students.add(new StudentClass(69, "Ram3387", "Hyderabad415259"));
		students.add(new StudentClass(70, "Ram1395", "Hyderabad435385"));
		students.add(new StudentClass(71, "Ram178", "Hyderabad395803"));
		students.add(new StudentClass(72, "Ram4286", "Hyderabad308673"));
		students.add(new StudentClass(73, "Ram1171", "Hyderabad363060"));
		students.add(new StudentClass(74, "Ram3528", "Hyderabad285378"));
		students.add(new StudentClass(75, "Ram1752", "Hyderabad377073"));
		students.add(new StudentClass(76, "Ram2949", "Hyderabad422154"));
		students.add(new StudentClass(77, "Ram1489", "Hyderabad255827"));
		students.add(new StudentClass(78, "Ram3052", "Hyderabad351492"));
		students.add(new StudentClass(79, "Ram3", "Hyderabad46782"));
		students.add(new StudentClass(80, "Ram3492", "Hyderabad46292"));
		students.add(new StudentClass(81, "Ram3946", "Hyderabad258962"));
		students.add(new StudentClass(82, "Ram3482", "Hyderabad355494"));
		students.add(new StudentClass(83, "Ram1418", "Hyderabad36145"));
		students.add(new StudentClass(84, "Ram3998", "Hyderabad270451"));
		students.add(new StudentClass(85, "Ram179", "Hyderabad44207"));
		students.add(new StudentClass(86, "Ram3326", "Hyderabad99441"));
		students.add(new StudentClass(87, "Ram675", "Hyderabad244915"));
		students.add(new StudentClass(88, "Ram2442", "Hyderabad143517"));
		students.add(new StudentClass(89, "Ram4069", "Hyderabad174137"));
		students.add(new StudentClass(90, "Ram3799", "Hyderabad4312"));
		students.add(new StudentClass(91, "Ram135", "Hyderabad63218"));
		students.add(new StudentClass(92, "Ram3791", "Hyderabad101459"));
		students.add(new StudentClass(93, "Ram4457", "Hyderabad58849"));
		students.add(new StudentClass(94, "Ram469", "Hyderabad89137"));
		students.add(new StudentClass(95, "Ram2657", "Hyderabad221042"));
		students.add(new StudentClass(96, "Ram3638", "Hyderabad50944"));
		students.add(new StudentClass(97, "Ram220", "Hyderabad22929"));
		students.add(new StudentClass(98, "Ram2331", "Hyderabad82090"));
		students.add(new StudentClass(99, "Ram591", "Hyderabad254979"));
	}

}
