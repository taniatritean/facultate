package org.fasttrackit;

import org.fasttrackit.repo.SectieRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ttritean
 * @since 1/8/2019
 */

@RunWith(SpringJUnit4ClassRunner.class)
public class SectieRepoTest {

    @Autowired
    private SectieRepository sectieRepository;
}
