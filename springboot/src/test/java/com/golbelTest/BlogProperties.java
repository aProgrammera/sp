package com.golbelTest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BlogProperties {
	
		@Value("${com.didispace.blog.name}")
	    private String name;
	    @Value("${com.didispace.blog.title}")
	    private String title;
	    @Value("${com.didispace.blog.bignumber}")
	    private Long randomLong;
	    
	    
		public Long getRandomLong() {
			return randomLong;
		}
		public void setRandomLong(Long randomLong) {
			this.randomLong = randomLong;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	    
	    

}
