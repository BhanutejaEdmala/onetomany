package com.example.OnetoOne;

import com.example.OnetoOne.entities.Address;
import com.example.OnetoOne.entities.Laptop;
import com.example.OnetoOne.entities.Student;
import com.example.OnetoOne.repositories.AddRepo;
import com.example.OnetoOne.repositories.LaptopRepo;
import com.example.OnetoOne.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@SpringBootApplication
public class OnetoOneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OnetoOneApplication.class, args);
	}
@Autowired
	AddRepo arepo;
	@Autowired
	LaptopRepo lrepo;
	@Autowired
	StudentRepo srepo;
	@Override
	@Transactional
	public void run(String... args) throws Exception {
//		Address a = arepo.findById("ts").get();
//		System.out.println(a.getStudent());
		//Student s = srepo.findById("17").get();
//		s.setName("klassen");
//		Address c = new Address();
//		c.setState("rajastan");
//		c.setDist("jaipur");
//		c.setStudent(s);
//		Address d = new Address();
//		d.setState("odissa");
//		d.setDist("bhubaneshwar");
//		d.setStudent(s);
//		List<Address> x = new ArrayList<>();
//		x.add(c);
//		x.add(d);
//		s.setAddresses(x);
//		srepo.save(s);
//		System.out.println("Saved");
//		Student s2 = new Student();
//		s2.setId("45");
//		s2.setName("Rohit");
//		Laptop l = new Laptop();
//		l.setLid("209");
//		l.setLname("sony");
//		s.setLaptop(l);
//		l.setStudent(s);
//		Address  add = new Address();
//		add.setState("australia");
//		add.setDist("sydney");
//		add.setStudent(s2);
//		Address  add2 = new Address();
//		add2.setState("england");
//		add2.setDist("london");
//		add2.setStudent(s2);
//		Address  add3 = new Address();
//		add3.setState("southafrica");
//		add3.setDist("capetown");
//		add3.setStudent(s2);
//		ArrayList<Address> sl = new ArrayList<>();
//		sl.add(add);
//		sl.add(add2);
//		sl.add(add3);
//		s2.setAddresses(sl);
//		srepo.save(s2);
//		srepo.delete(s);
//		Student f = new Student();
//		f.setId("222");
//		f.setName("smith");
		//srepo.save(f);
//		Student s = srepo.findById("222").get();
//		List<Address> a =new ArrayList<>();
//		Address a1 = new Address();
//		a1.setState("japan");
//		a1.setDist("tokyo");
//		a1.setStudent(srepo.findById("222").get());
//		a.add(a1);
//		s.setAddresses(a);
//		srepo.save(s);
//		Student r = srepo.findById("222").get();
//		System.out.println(r.getAddresses());
//		Optional<Student> optionalStudent = srepo.findById("777");
//		if (optionalStudent.isPresent()) {
//			Student oldStudent = optionalStudent.get();
//
//			// Create a new Student entity with the updated ID
//			Student newStudent = new Student();
//			newStudent.setId("888");
//			newStudent.setName(oldStudent.getName());
//			newStudent.setLaptop(oldStudent.getLaptop());
//			newStudent.setAddresses(oldStudent.getAddresses());
//
//			// Save the new Student entity
//			srepo.save(newStudent);
//
//			// Optionally, you can delete the old student
//			srepo.delete(oldStudent);
//
//			System.out.println("Done");
//		} else {
//			System.out.println("Student with ID '777' not found.");
//		}


	}
}
