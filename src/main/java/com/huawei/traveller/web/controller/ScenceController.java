package com.huawei.traveller.web.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.huawei.traveller.common.Page;
import com.huawei.traveller.dao.ScenceRepository;
import com.huawei.traveller.domain.Scence;
import com.huawei.traveller.service.ScenceService;

@RepositoryRestController
public class ScenceController {
    private static final Logger logger = LoggerFactory.getLogger(ScenceController.class);

    private final ScenceRepository repository;

    @Autowired
    public ScenceController(ScenceRepository repo) { 
        repository = repo;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/scanners/search/listProducers") 
    public @ResponseBody List<String> getProducers() {
        // List<String> producers = repository.findFirst4ByOrderByRegdateDesc();

        //
        // do some intermediate processing, logging, etc. with the producers
        //

        return null; // or some filtered/altered/mapped version
    }

}