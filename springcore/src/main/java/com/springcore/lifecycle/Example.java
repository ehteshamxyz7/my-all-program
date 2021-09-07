package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	
private String Subject;

public String getSubject() {
	return Subject;
}

public void setSubject(String subject) {
	Subject = subject;
}

public Example() {
	super();
}

@Override
public String toString() {
	return "Example [Subject=" + Subject + "]";
}
@PostConstruct
public void start() {
	System.out.println("starting method");
}
@PreDestroy
public void end() {
	System.out.println("ending method");
}
}
