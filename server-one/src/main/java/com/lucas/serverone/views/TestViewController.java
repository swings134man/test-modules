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

    @GetMapping("/view3")
    public String view3(Model model) {
//        String tag = "<h1>View3</h1>";
        String tag = "&lt;h1&gt;View3&lt;/h1&gt;"; // 이스케이프 한 내용은 HTML로 렌더링되지 않음 -> Text 출력


        model.addAttribute("value", tag);
        return "test2";
    }

}
