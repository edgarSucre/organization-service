package com.thoughtmechanix.organizationservice.repository;


import com.thoughtmechanix.organizationservice.models.Organization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends CrudRepository<Organization, String> {

}
