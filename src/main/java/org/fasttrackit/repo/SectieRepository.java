package org.fasttrackit.repo;

import org.fasttrackit.model.Sectie;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author ttritean
 * @since 1/8/2019
 */
public interface SectieRepository extends
        PagingAndSortingRepository<Sectie, Long> {
}
