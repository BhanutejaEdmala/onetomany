package com.example.OnetoOne.service;

import com.example.OnetoOne.entities.Address;
import com.example.OnetoOne.entities.Student;
import com.example.OnetoOne.repositories.AddRepo;
import com.example.OnetoOne.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceImpl implements com.example.OnetoOne.service.Service {
    @Autowired
    StudentRepo srepo;
    @Autowired
    AddRepo arepo;

        public String save(String a,String b){
            Student s = new Student();
            if(srepo.existsById(a))
                return "Already Exists";
            s.setId(a);
            s.setName(b);
           srepo.save(s);
            return "Saved";
        }

    @Override
    public String sadd(String a, String b, String c) {
        if(!(srepo.existsById(a)))
            return "No Record Present With Given Id";
        else {
            List<Address> al = new ArrayList<>();
            Address ad = new Address();
            ad.setState(b);
            ad.setDist(c);
            ad.setStudent(srepo.findById(a).get());
            al.add(ad);
            Student s = srepo.findById(a).get();
            s.setAddresses(al);
            srepo.save(s);
            return "Added";
        }
    }

    @Override
    public String deleteStudent(String a) {
      if(!(srepo.existsById(a)))
          return "Student Doesn't Exist";
      else{
          srepo.delete(srepo.findById(a).get());
          return "Deleted";
      }
    }
   public List veiwS(){
            List<Student> sl= srepo.findAll();
            return sl;
   }
    public List veiwA(){
        List<Address> al= arepo.findAll();
        return al;
    }
    public List sAdd(String a){
          List<Address> al = arepo.findAll();
          List<Address> sl = new ArrayList<>();
          if(srepo.existsById(a)){
          for(Address e : al){
              if(e.getStudent().getId().equals(a))
                  sl.add(e);
          }
          return sl;}
          else
              return null;
    }
    public String lupd(String a,String b){
            if(srepo.existsById(a)){
                Student de = srepo.findById(a).get();
                de.setName(b);
              srepo.save(de);
              return "Updated";
            }
            else
                return "No Record Found";
    }
    public String aupd(String a ,String b){
            Address ad= arepo.findById(a).get();
            ad.setDist(b);
            arepo.save(ad);
            return "Updated Succesfully";
    }
    public String aDel(String a){
            arepo.delete(arepo.findById(a).get());
            return "Deleted";
    }

}
