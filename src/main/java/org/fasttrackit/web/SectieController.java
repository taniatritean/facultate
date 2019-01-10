package org.fasttrackit.web;

import org.fasttrackit.model.Sectie;
import org.fasttrackit.repo.SectieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ttritean
 * @since 1/8/2019
 */
@RestController
public class SectieController {


    @Autowired
    private SectieRepository sectieRepository;

    @RequestMapping(path = "/facultate/sectie", method = RequestMethod.POST)
    public void saveSectie(@RequestBody Sectie sectie) {

        //TODO - normally we should call service layer that exposes DTOs - the servcie layer should call the repository
        sectieRepository.save(sectie);


    }

    @RequestMapping(path = "/facultate/sectie/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Sectie getSectieById(@PathVariable long id) {
        return sectieRepository.findOne(id);
    }


}


