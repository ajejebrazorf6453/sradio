package com.sradio.llater.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sradio.llater.domain.AudioURL;

@Repository
public interface URLRepo extends CrudRepository<AudioURL, Long> {

    List<AudioURL> findAllByOwningUser(String owningUser);

}
