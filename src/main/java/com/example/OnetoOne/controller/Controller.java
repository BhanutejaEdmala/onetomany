package com.example.OnetoOne.controller;

import com.example.OnetoOne.entities.Address;
import com.example.OnetoOne.entities.Student;
import com.example.OnetoOne.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    ServiceImpl service;
    @RequestMapping("/add")
    public String add(@RequestParam String id, @RequestParam String name,  ModelMap m){
        m.put("r",service.save(id,name));
        m.put("id",id);
        return "res";
    }
    @RequestMapping("/")
    public String open(){
        return "input";
    }
    @RequestMapping("/sa/{id}")
    public String oppen(@PathVariable String id ,ModelMap m){
        m.put("id",id);
        return "sadd";
    }
    @RequestMapping("/sadd")
    public String sadd(@RequestParam String id,@RequestParam String state,@RequestParam String dist,ModelMap m){
      String s = service.sadd(id,state,dist);
      m.put("s",s);
        m.put("id",id);
      return "sarslt";
    }
@RequestMapping("/dform")
    public String dForm(){
        return "sdel";
}
@RequestMapping("/del")
public String del(@RequestParam String id,ModelMap m){
     String s = service.deleteStudent(id);
     m.put("r",s);
        return "res";
}
    @RequestMapping("/ldel/{id}")
    public String dell(@PathVariable String id,ModelMap m){
        String s = service.deleteStudent(id);
        //m.put("r",s);
        return "redirect:/views";
    }
@RequestMapping("/views")
public String viewS(ModelMap m){
    List<Student> sl = service.veiwS();
    m.put("sl",sl);
    return "views";
}
    @RequestMapping("/viewa")
    public String viewA(ModelMap m){
        List<Address> sl = service.veiwA();
        m.put("sl",sl);
        return "viewA";
    }
    @RequestMapping("/spadd/{id}")
    public String lspadd(@PathVariable String id, ModelMap m){
        List<Address> al = service. sAdd(id);
        m.put("al",al);
        return "lspadd";
    }
    @RequestMapping("/luform")
    public String lupd(@RequestParam String v1,@RequestParam String v2, ModelMap m){
        m.put("id",v1);
        m.put("name",v2);
        return "lupd";
    }
    @RequestMapping("/lupd")
    public String pupd(String id,String name,ModelMap m){
        String s = service.lupd(id,name);
        m.put("r",s);
        return "res";
    }
    @RequestMapping("/laupd")
    public String adupd(@RequestParam String v1,@RequestParam String v2,ModelMap m){
        m.put("v1",v1);
        m.put("v2",v2);
        return "lauform";
    }
    @RequestMapping("/aupd")
    public String aupd(@RequestParam String state,@RequestParam String dist,ModelMap m){
        String r = service.aupd(state,dist);
        m.put("r",r);
        return "res";
    }
    @RequestMapping("ladel")
    public String ladel(@RequestParam String v1){
        String s = service.aDel(v1);
        return "redirect:/viewa";
    }
}