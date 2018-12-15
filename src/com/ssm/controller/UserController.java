package com.ssm.controller;

import com.ssm.domain.ItemsUp;
import com.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/items")
public class UserController{

    @Autowired
    public ItemsService itemsService ;
//    public Controler(ItemsServiceImp itemsServiceImp) {
//        this.itemsServiceImp = itemsServiceImp;
//    }

    @RequestMapping("/queryItems")
    public ModelAndView queryItems() throws Exception{

        //调用service查找数据库，查询商品列表，这里使用静态数据模拟
        List<ItemsUp> itemsList = itemsService.findItemsList(null);

        //返回ModelAndView
        ModelAndView modelAndView = new ModelAndView();
        //相当于request的setAttribute，在jsp页面中通过itemsList取数据
        modelAndView.addObject("itemsList",itemsList);

        //指定视图
        modelAndView.setViewName("items/itemsList");
        return modelAndView;
    }

    //商品修改页面显示
    @RequestMapping( value = "/editItems",method = {RequestMethod.GET,RequestMethod.POST})
    public String editItems(Model model, @RequestParam(value = "id",required = true ) Integer qqqid) throws Exception{
        ItemsUp itemsUp = itemsService.findItemsById(qqqid);

//        //返回ModelAndView
//        ModelAndView modelAndView = new ModelAndView();
//
//        modelAndView.addObject(itemsUp);
//
//        //商品修改页面
//        modelAndView.setViewName("items/editItems");
        model.addAttribute("itemsUp",itemsUp);
        return "items/editItems";
    }

    //商品修改的提交
    @RequestMapping("/editItemsSubmit")
    public String editItemsSubmit(Integer id,ItemsUp itemsUp) throws Exception{

        //调用service更新商品信息，页面需要将商品信息传到此方法
        itemsService.updateItems(id,itemsUp);
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("items/success");
        //重定向到商品查询列表
//        return "redirect:queryItems.action";
        //页面转发
        return "forward:queryItems.action";
//        return "items/success";
    }


}

