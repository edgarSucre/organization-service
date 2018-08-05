package com.thoughtmechanix.organizationservice.controllers;


import com.thoughtmechanix.organizationservice.models.Organization;
import com.thoughtmechanix.organizationservice.services.OrganizationService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping(value="v1/organizations")
public class OrganizationController {

    private OrganizationService orgService;

    public OrganizationController(OrganizationService orgService) {
        this.orgService = orgService;
    }

    @GetMapping(value="/{organizationId}")
    public Organization getOrganization( @PathVariable("organizationId") String organizationId) {
        return orgService.getOrg(organizationId);
    }

    @PutMapping(value="/{organizationId}")
    public void updateOrganization( @PathVariable("organizationId") String orgId, @RequestBody Organization org) {
        orgService.updateOrg( org );
    }

    @PostMapping()
    public void saveOrganization(@RequestBody Organization org) {
        orgService.saveOrg( org );
    }

    @DeleteMapping(value="/{organizationId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOrganization( @PathVariable("orgId") String orgId) {
        orgService.deleteOrg( orgId );
    }
}