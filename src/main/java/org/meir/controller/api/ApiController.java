package org.meir.controller.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface ApiController<T> {

    @GetMapping("/")
    public List<T> handleGetAll();

    @GetMapping("/{id}")
    public T handleGetById(@PathVariable("id") long id);

    @PostMapping("/")
    public T handlePostObject(T object);
}
