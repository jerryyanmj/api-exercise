package hello;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping(value = "/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    /** TODO: This method should return a newly constructed Person to the API consumer.
     *        The input person's firstName and lastName are both lower case String and age is an integer.
     *        The output should have both firstName and lastName capitalized using the method in Utils class,
     *        and the age should increased by 20.
     *  For example: input {"firstName":"john", "lastName":"callahan", "age":58}
     *               output will be {"firstName":"John", "lastName":"Callahan", "age":78}
     *
     */
    @RequestMapping(value = "/my-future-info", method = RequestMethod.POST)

    public Person myName(@RequestBody Person person) {
        return new Person();
    }

    /** TODO: Consider this method is used in a lottery system which takes an array of people
     *        as input, and then randomly pick a person in the array as the luck person.
     *  For example: input [{"firstName":"john", "lastName":"callahan", "age":78},
     *                      {"firstName":"john", "lastName":"callahan", "age":18}]
     *               output will be any person in the array.
     *
     */
    @RequestMapping(value = "/next-lucky-person", method = RequestMethod.POST)
    public Person luckPerson(@RequestBody Person[] people) {
        return people[0];
    }
}