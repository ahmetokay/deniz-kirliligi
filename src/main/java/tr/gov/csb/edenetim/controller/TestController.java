package tr.gov.csb.edenetim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tr.gov.csb.edenetim.model.DenizModel;
import tr.gov.csb.edenetim.service.DenizService;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private DenizService denizService;


    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public List<DenizModel> all() {
        return denizService.list();
    }
}