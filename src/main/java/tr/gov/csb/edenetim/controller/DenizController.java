package tr.gov.csb.edenetim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.gov.csb.edenetim.model.DenizModel;
import tr.gov.csb.edenetim.service.DenizService;

import java.util.List;

@RestController
public class DenizController {

    @Autowired
    private DenizService denizService;

    @RequestMapping(path = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<DenizModel>> list() {
        return new ResponseEntity<>(denizService.list(), HttpStatus.OK);
    }

    @RequestMapping(path = "/save", method = RequestMethod.POST)
    public ResponseEntity<DenizModel> save(@RequestBody DenizModel model) {
        return new ResponseEntity<>(denizService.save(model), HttpStatus.OK);
    }

    @RequestMapping(path = "/get", method = RequestMethod.GET)
    public ResponseEntity<DenizModel> get(@RequestParam("id") Long id) {
        return new ResponseEntity<>(denizService.get(id), HttpStatus.OK);
    }

    @RequestMapping(path = "/delete", method = RequestMethod.GET)
    public ResponseEntity<Boolean> delete(@RequestParam("id") Long id) {
        return new ResponseEntity<>(denizService.delete(id), HttpStatus.OK);
    }

    @RequestMapping(path = "/download", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Resource> download(@RequestParam("id") Long id) {
        Resource tutanak = denizService.getTutanak(id);
        if (tutanak != null) {
            String filename = tutanak.getDescription();
            filename = filename.substring(filename.indexOf('[') + 1, filename.indexOf(']'));
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + filename + "\"")
                    .body(tutanak);
        }

        return ResponseEntity.notFound().build();
    }

    //TODO ahmet: upload metodu
}