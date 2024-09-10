package com.example.alltestspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.alltestspring.entity.User;
import com.example.alltestspring.service.UserService;


@Controller
public class UserController {
    @RequestMapping(value = "/", method=RequestMethod.GET)
    public String thymeleafCheck(Model model) {

        model.addAttribute("message","Hello World");
        return "search.html";
    }
    
    /**
   * ユーザー情報 Service
   */
  @Autowired
  UserService userService;

  /**
   * ユーザー情報一覧画面を表示
   * @param model Model
   * @return ユーザー情報一覧画面のHTML
   */
  @RequestMapping(value = "/user/list", method = RequestMethod.GET)
  public String displayList(Model model) {
    List<User> userlist = userService.searchAll();
    model.addAttribute("userlist", userlist);
    return "user/list.html";
  }
}
