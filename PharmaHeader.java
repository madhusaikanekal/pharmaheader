package com.comp.aem.core.models;

import java.util.List;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PharmaHeader {
	private static final Logger LOG = LoggerFactory.getLogger(PharmaHeader.class);
	
	@ChildResource
	public List<Main> headerlinks;


	public List<Main> getheaderlinks() {
		LOG.info("HeaderLinks {}", headerlinks);
		return headerlinks;
	}

	
}
