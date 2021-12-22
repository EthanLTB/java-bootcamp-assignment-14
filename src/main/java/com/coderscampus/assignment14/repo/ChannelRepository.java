package com.coderscampus.assignment14.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderscampus.assignment14.domain.Channel;
@Repository
public interface ChannelRepository extends JpaRepository<Channel, Long> {

}
