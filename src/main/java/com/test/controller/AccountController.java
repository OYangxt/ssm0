package com.test.controller;

import com.test.model.Account;
import com.test.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author 20190712713
 * @date 2019/10/5 16:49
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;
    /**
     * 查询所有的数据
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll(Model model) {

        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);

        return "list";
    }

    /**
     * 保存
     * @return
     */
//    @RequestMapping("/save")
//    public String save(Account account) throws IOException {
//        accountService.saveAccount(account);
//
//        return "list";
//    }

    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");

    }
}
