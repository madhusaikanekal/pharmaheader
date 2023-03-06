package com.comp.aem.core.models;

import javax.annotation.Resource;

import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;



@Model(adaptables=Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class Main {
	
	@ValueMapValue
	private String text;
	
	@ValueMapValue
	private String headerlinks;

	public String getText() {
		return text;
	}

	

	public String getHeaderlinks() {
		return headerlinks;
	}

	
	
	
	
	
	
	

}
