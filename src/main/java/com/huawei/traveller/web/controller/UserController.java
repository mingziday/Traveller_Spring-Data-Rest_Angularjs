package com.huawei.traveller.web.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.huawei.traveller.common.Page;
import com.huawei.traveller.domain.User;
import com.huawei.traveller.service.UserService;


@Controller
@Scope("request")
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;
    /*
    @RequestMapping(value = "/indexlist", method = RequestMethod.GET)
    public @ResponseBody List<User> usersList() {
        logger.error("get json user list0");
        return userService.findAll();
    }
    */
    /*
    // 学员登录
    // question1:单独的入参校验如何做？
    // question2:记录session？先不记录
	// question3：跳会原页面?
	// question4: 携带error信息返回？
    @RequestMapping(value = "/login",method=RequestMethod.POST)
    public String stuLogin(
        @RequestParam(value="nameOrEmail") String nameOrEmail, 
        @RequestParam(value="password") String password,
        Model model){
        Student stuInstance = null;
        if (nameOrEmail.indexOf("@") > 0){
            stuInstance = userService.getUserByEmailAndPwd(nameOrEmail,password);
        }
        else{
            stuInstance = userService.getUserByNameAndPwd(nameOrEmail,password);
        }
        
        //如果没有找到用户，则返回error信息；否则跳到首页
        //如果用redirect会不能展示错误
        if (null == stuInstance)
        {
            model.addAttribute("errorMsg","loginError");
            return "forward:/login.jsp";
        }
        else
        {
            return "redirect:/index.jsp";
        }

    }
	// 显示所有学员分页,page会进行默认转换
	// TODO 解决page的默认值
	@RequestMapping(value = "/list/{page}", method = RequestMethod.GET)  
	public ModelAndView stuList(@PathVariable("page") int page) {
		ModelAndView mav = new ModelAndView();
		Page<Student> pageList = userService.getSutdentPage(page);
		mav.addObject("listStudent", pageList.getRecords());
		mav.setViewName("/student/list"); 
		return  mav;
	}
	// 显示学员信息
	@RequestMapping(value = "/detail/{stuId}", method = RequestMethod.GET)  
	public ModelAndView StuDetail(@PathVariable("stuId") int stuId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("detailStudent", userService.getUser(stuId));
		mav.setViewName("/student/detail");
		return mav;
	}
	// 增加新学员
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String StuInitCreationForm(Map<String, Object> model) {
        Student student = new Student();
        model.put("student", student);//这是什么原因？
        model.put("isnew", true);
        return "/student/createOrUpdateForm";
    }
    // TODO 返回stuId的做法
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String stuSave(@Valid @ModelAttribute Student student,BindingResult result) {
    	 if (result.hasErrors()) {
             return "owners/createOrUpdateOwnerForm";
         } 
    	 else
    	 {
            userService.saveStudent(student);
            return "redirect:/student/detail/" + student.getStuId();
    	 }
    }
    // 修改学员信息
    @RequestMapping(value = "/edit/{stuId}", method = RequestMethod.GET)
    public String initUpdateOwnerForm(@PathVariable("stuId") int stuId, Model model) {
        Student student = this.userService.getUser(stuId);
        model.addAttribute(student);
        return "/student/createOrUpdateForm";
    }
    // PUT 和 POST什么区别,这里为什么用PUT
    @RequestMapping(value = "/edit/{stuId}", method = RequestMethod.POST)
    public String processUpdateOwnerForm(Student student) {
    	 userService.updateStudent(student);
         return "redirect:/student/detail/" + student.getStuId();
        
    }
    
    */
}
