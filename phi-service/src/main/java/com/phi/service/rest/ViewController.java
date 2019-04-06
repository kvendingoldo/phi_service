package com.phi.service.rest;

import com.phi.service.model.View;
import com.phi.service.repository.ViewRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewController {

    @Autowired
    ViewRepository viewRepository;

    @GetMapping("/view/index")
    public List<View> getAllViews() {
        return viewRepository.findAll();
    }

    @GetMapping("/view")
    public View getDocById(@RequestParam("viewId") String viewId) {
        return viewRepository.findOne(viewId);
    }

    @PostMapping("/view")
    public void updateDoc(@RequestBody View viewToUpdate) {
        viewRepository.save(viewToUpdate);
    }

    @DeleteMapping("/view")
    public void dropDoc(@RequestParam("viewId") String viewId) {
        viewRepository.delete(viewId);
    }

}
