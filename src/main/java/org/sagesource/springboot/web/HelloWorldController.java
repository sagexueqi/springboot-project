package org.sagesource.springboot.web;

import org.springframework.web.bind.annotation.*;

/**
 * <p>Hello World Controller</p>
 * <pre>
 *     author      XueQi
 *     date        2017/3/8
 *     email       qi.xue@ucarinc.com
 * </pre>
 */
@RestController
@RequestMapping("/springboot")
public class HelloWorldController {

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String sayWorld(@PathVariable("name") String name) {
		return "Hello " + name;
	}
}
