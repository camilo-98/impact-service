package com.tourism.impactservice.repository;

import com.tourism.impactservice.domain.Host;
import com.tourism.repository.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface HostRepository extends BaseRepository<Host, UUID> {



}
