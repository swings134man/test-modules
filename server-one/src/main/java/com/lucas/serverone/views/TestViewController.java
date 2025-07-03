package com.lucas.serverone.views;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @package : com.lucas.serverone.views
 * @name : TestViewController.java
 * @date : 2025. 7. 3. 오후 5:31
 * @author : lucaskang(swings134man)
 * @Description: View Model Test Controller
**/
@Controller
@Slf4j
public class TestViewController {


    @GetMapping("/view")
    public String viewTest(@RequestParam(value = "value") String value, Model model) {
        model.addAttribute("value", value);

        return "test";
    }


    @GetMapping("/view2")
    @ResponseBody
    public void bodyFromParam(@RequestParam(value = "value") String value) {
        log.info("value : {}", value);
    }

}
