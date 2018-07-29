package com.thoughtmechanix.organizationservice.controllers;

import com.thoughtmechanix.organizationservice.models.Organization;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="v1/organizations")
public class OrganizationController {

    @GetMapping(value = "/{organizationId}")
    public Organization getOrganization(@PathVariable("organizationId") String organizationId) {
        Organization organization = new Organization();
        organization.setName("fake Organization");
        return organization;
    }
}
