package org.fasttrackit;

import org.fasttrackit.model.Sectie;
import org.fasttrackit.repo.SectieRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ttritean
 * @since 1/8/2019
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = FacultateApplication.class,
        loader = SpringApplicationContextLoader.class,
        initializers = ConfigFileApplicationContextInitializer.class)

public class SectieRepoTest {

    @Autowired
    private SectieRepository sectieRepository;

    @Test
    public void testSaveSectie() {

        Sectie sectie = new Sectie();
        sectie.setName("Mate Info");
        sectie.setMaxStudentsAllowed(10);
        sectieRepository.save(sectie);

    }

}
