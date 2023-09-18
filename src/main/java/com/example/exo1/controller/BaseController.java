package com.example.exo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


    @Controller
    public class BaseController {
        @RequestMapping(value = "/home/person-details-first-name")
        public String personFirstName(Model model) {
            model.addAttribute("firstName", "Alexander");

            return "person/details-firstName";
        }
        @RequestMapping(value = "/home/person-details")
        public String personName(Model model) {
            model.addAttribute("firstName", "Alexander");
            model.addAttribute("lastName", "Franco");


            return "person/details";
        }

        @RequestMapping(value = "/home/person-details-list")
        public String personList(Model model) {

            List<String> persons = List.of("Alexander Franco", "Lilian ORION", "Will SUNTHER");

            model.addAttribute("persons", persons);

            return "person/details-list";
        }
    }

