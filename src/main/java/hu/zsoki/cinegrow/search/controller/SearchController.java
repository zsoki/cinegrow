package hu.zsoki.cinegrow.search.controller;

import hu.zsoki.cinegrow.search.model.request.SearchRequest;
import hu.zsoki.cinegrow.search.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SearchController {

    private SearchService searchService;

    @Autowired
    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @PostMapping("search")
    public ResponseEntity<?> search(@RequestBody SearchRequest searchRequest) {
        return ResponseEntity.ok(searchService.search(searchRequest));
    }

    @GetMapping("title/{title}")
    public ResponseEntity<?> getByTitle(@PathVariable("title") String title) {
        return ResponseEntity.ok(searchService.getByTitle(title));
    }

    @GetMapping("id/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") String id) {
        return ResponseEntity.ok(searchService.getById(id));
    }

}