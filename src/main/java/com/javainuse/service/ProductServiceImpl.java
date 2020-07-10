package com.javainuse.service;

import org.drools.runtime.StatelessKnowledgeSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.javainuse.model.Operateur;

@Component("ProductServiceImpl")
public class ProductServiceImpl {

	@Autowired
	private ApplicationContext applicationContext;

	public void CalculateDiscount(Operateur operateur) {

		StatelessKnowledgeSession statelessKnowledgeSession = (StatelessKnowledgeSession) applicationContext
				.getBean("productSession");
		statelessKnowledgeSession.execute(operateur);
	}
}
