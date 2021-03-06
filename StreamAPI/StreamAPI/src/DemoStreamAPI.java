import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStreamAPI {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		System.out.println("------- Enter list of students --------");
		Student s1=new Student(1, "Tuan", "Male", 22);
        Student s2=new Student(2, "Tan", "Male", 14);
        Student s3=new Student(3, "Hop", "Female", 13);
        Student s4=new Student(4, "Thu", "Female", 24);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
		
		/*Get students with gender is 'male'*/
		System.out.println("Get students with gender is 'male': ");
		list.stream().filter(item -> item.getGender().equalsIgnoreCase("Male") == true).forEach(System.out::println);
		/*Count student with age > 20*/
		long count = list.stream().filter(age -> age.getAge() > 20).count();
		System.out.println("Count student with age > 20: " + count);
		/*Use Stream to convert Student -> StudentDTO*/
		System.out.println("Use Stream to convert Student -> StudentDTO");
		List<StudentDTO> listDTO = list.stream().map(p -> new StudentDTO(p.getId(), p.getName(), p.getGender(), p.getAge())).collect(Collectors.toList());
		listDTO.forEach((element) -> {
			System.out.println(element);
		});
	}
}
