package com.rest.PoetsAccess;

import org.springframework.data.jpa.repository.JpaRepository;

interface PoetRepository extends JpaRepository<Poet, Long> {

}