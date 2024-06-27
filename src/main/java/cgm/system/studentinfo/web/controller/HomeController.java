package cgm.system.studentinfo.web.controller;

import cgm.system.studentinfo.bl.service.StudentService;
import cgm.system.studentinfo.persistance.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    private StudentService studentService;

    @GetMapping (value = "/")
    public String home(Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return "index";
    }

    @PostMapping("/addStudent")
    public String addStudent(Student student){
        studentService.doSaveStudent(student);
        return "redirect:/";
    }

    public String deleteStudent(@RequestParam Long id){
        studentService.doDeleteStudent(id);
        return "redirect:/";
    }
}




