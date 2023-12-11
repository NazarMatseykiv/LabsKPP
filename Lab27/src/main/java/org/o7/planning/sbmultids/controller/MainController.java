package org.o7.planning.sbmultids.controller;

import java.util.List;

import org.o7.planning.sbmultids.dao.AdvertiserDAO;
import org.o7.planning.sbmultids.dao.PublisherDAO;
import org.o7.planning.sbmultids.entity1.Publisher;
import org.o7.planning.sbmultids.entity2.Advertiser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @Autowired
    private PublisherDAO publisherDAO;

    @Autowired
    private AdvertiserDAO advertiserDAO;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homePage(Model model) {

        List<Advertiser> advertisers = advertiserDAO.listAdvertisers();
        List<Publisher> publishers = publisherDAO.listPublishers();

        model.addAttribute("advertisers", advertisers);
        model.addAttribute("publishers", publishers);
        return "home";
    }
}
