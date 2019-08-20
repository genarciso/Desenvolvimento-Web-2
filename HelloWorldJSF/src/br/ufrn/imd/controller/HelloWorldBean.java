package br.ufrn.imd.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloWorldBean {
	public String getWorld() {
		return "Olá JSF!";
	}
}
