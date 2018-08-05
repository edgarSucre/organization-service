package com.thoughtmechanix.organizationservice.services;

import com.thoughtmechanix.organizationservice.models.Organization;
import com.thoughtmechanix.organizationservice.repository.OrganizationRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.UUID;

@Service
public class OrganizationService {

    private OrganizationRepository orgRepository;

    public OrganizationService(OrganizationRepository orgRepository) {
        this.orgRepository = orgRepository;
    }

    public Organization getOrg(String organizationId) {
        Optional<Organization> org = orgRepository.findById(organizationId);
        if (org.isPresent()) {
           return org.get();
        }
        return null;
    }

    public void saveOrg(Organization org){
        org.setId( UUID.randomUUID().toString());

        orgRepository.save(org);

    }

    public void updateOrg(Organization org){
        orgRepository.save(org);
    }

    public void deleteOrg(String organizationId){
        orgRepository.deleteById(organizationId);
    }
}