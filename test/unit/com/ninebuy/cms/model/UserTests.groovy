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
	   api.searchTaoke("������ר��", 1, 80, "asc").each{
		    println "ԭ��:${it.price}:�ּ�${it.promotionPrice}"
			i++
		     
	   }
	  println i  
    }
}
