package com.example.assignment3;

import com.example.assignment3.Course.Course;
import com.example.assignment3.Course.CourseService;
import com.example.assignment3.Employee.Employee;
import com.example.assignment3.Employee.EmployeeService;
import com.example.assignment3.Information.Information;
import com.example.assignment3.Information.InformationService;
import com.example.assignment3.Post.Post;
import com.example.assignment3.Post.PostService;
import com.example.assignment3.Service.Service;
import com.example.assignment3.Service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    private final InformationService informationService;
    private final PostService postService;
    private final CourseService courseService;
    private final ServiceService serviceService;
    private final EmployeeService employeeService;

    @Autowired
    public Controller(InformationService informationService, PostService postService,
                      CourseService courseService, ServiceService serviceService,
                      EmployeeService employeeService) {
        this.informationService = informationService;
        this.postService = postService;
        this.courseService = courseService;
        this.serviceService = serviceService;
        this.employeeService = employeeService;
    }

    @RequestMapping("/home")
    public String toWelcome (Model model) {
        Information information = informationService.getLatestInformation();
        List<Post> postList = postService.getThreeLatestPosts();
        List<Course> courseList = courseService.getThreeLatestCourses();
        model.addAttribute("info", information);
        model.addAttribute("postList", postList);
        model.addAttribute("courseList", courseList);
        return "page-welcome";
    }

    @RequestMapping("/service")
    public String toService (Model model) {
        List<Post> postList = postService.getAllPosts();
        model.addAttribute("postList", postList);
        return "page-service";
    }

    @RequestMapping("/price")
    public String toPrice (Model model) {
        List<Service> serviceList = serviceService.getAllServices();
        List<Course> courseList = courseService.getAllCourses();
        model.addAttribute("serviceList", serviceList);
        model.addAttribute("courseList", courseList);
        return "page-price";
    }

    @RequestMapping("/employee")
    public String toEmployee (Model model) {
        List<Employee> employeeList = employeeService.getAllEmployee();
        model.addAttribute("employeeList", employeeList);
        return "page-employee";
    }

    @RequestMapping("/contact")
    public String toContact (Model model) {
        String[] weekdays = {"Monday", "Friday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Information information = informationService.getLatestInformation();
        model.addAttribute("information", information);
        model.addAttribute("weekdays", weekdays);
        return "page-contact";
    }
}
