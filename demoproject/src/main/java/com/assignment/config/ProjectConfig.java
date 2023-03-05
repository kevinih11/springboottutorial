package com.assignment.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/* basePackages is a configurable attribute that can be set to an array of package names,
   It is possible to name this attribute differently, but it is a convention to use basePackages
   for clarity and consistency with the Spring framework.
*/

// 1st approach - using string style to scan beans:
//   good if you need to scan all beans, bad if you only need ot scan some of them
@ComponentScan(basePackages = {"com.assignment.implementation",
        "com.assignment.services"})
//2nd approach - using class name to scan beans
//    good that make sure when class name accidentally changed, will have compiling error
@ComponentScan(basePackages = {"com.assignment.beans"})

public class ProjectConfig {

}
