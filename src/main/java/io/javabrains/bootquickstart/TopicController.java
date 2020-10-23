package io.javabrains.bootquickstart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
    //wnat instance of topic service 
    //when spring create this classes .will check it instance and dependencies 
    @Autowired //will mark topservice as dependency injection 
    private topicService topicservice ; 

    //get request , default 
    @RequestMapping("/topics")
    public List<topic> getAllTopics(){//this will convert the list to json and send back as http responds 
       return topicservice.getAllTopics() ;//will return list in the  method topicService ; 
    }
    @RequestMapping("/topics/{id}")//using a token to get id , spring will match it with topic list 
    public topic getTopic(@PathVariable String id){//using the annotation PathVariable , will grab get id from the mapping 
       return topicservice.getTopic(id); 
    }

    //post request , need method for post request 
    @RequestMapping(method = RequestMethod.POST, value="/topics")
    public void addTopic(@RequestBody topic topic ){//this method will get called when there is a post request
         topicservice.addTopic(topic); 

    }

    @RequestMapping(method = RequestMethod.PUT, value="/topics/{id}")
    public void updateTopic(@RequestBody topic topic,@PathVariable String id ){//this method will get called when there is a post request
         topicservice.updateTopic(topic,id); 

    }

    @RequestMapping(method = RequestMethod.DELETE, value="/topics/{id}")
    public void deleteTopic(@PathVariable String id ){//this method will get called when there is a delete request
         topicservice.deleteTopic(id); 

    }

}
