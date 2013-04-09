package com.ninebuy.cms.model



import grails.test.mixin.*

import org.junit.*

import com.ninebuy.api.TaobaoApi

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(User)
class UserTests {

    void testSomething() {
       def api=new TaobaoApi()
	   def i=0
	   api.searchTaoke("米折网专享", 1, 80, "asc").each{
		    println "原价:${it.price}:现价${it.promotionPrice}"
			i++
		     
	   }
	  println i  
    }
}
