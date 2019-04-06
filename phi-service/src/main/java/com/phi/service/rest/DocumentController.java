package com.phi.service.rest;

import com.phi.service.model.Document;
import com.phi.service.repository.DocumentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentController {

    @Autowired
    DocumentRepository documentRepository;

    @GetMapping("/doc/index")
    public List<Document> getAllDocs() {
        return documentRepository.findAll();
    }

    @GetMapping("/doc")
    public Document getDocById(@RequestParam("docId") String docId) {
        return documentRepository.findOne(docId);
    }

    @PostMapping("/doc")
    public void updateDoc(@RequestBody Document docToUpdate) {
        documentRepository.save(docToUpdate);
    }

    @DeleteMapping("/doc")
    public void dropDoc(@RequestParam("docId") String docId) {
        documentRepository.delete(docId);
    }

}
