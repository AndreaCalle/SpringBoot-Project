package io.javabrains.bootquickstart;
//going to make this a business service singleton , spring will create this instance and save it into it memory 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//other contoller will depend on this business service

import org.springframework.stereotype.Service;

//declare business service
@Service
public class topicService {
    //
    List<topic> topics = new ArrayList<>(Arrays.asList(//this list will be return , spring will call this method and convert to json and return to http . spring mvc does this . 
    new topic("SPRING","SPRING FRAMWORK","DESCRIPTION"),
    new topic("SP","FRAMWORK","core DESCRIPTION"),
    new topic("SPRI","SP FRAMWORK","dell DESCRIPTION")
    ));

    public List<topic> getAllTopics(){

        return topics ; //return list of topics 
    }

    public topic getTopic(String id){
        return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get(); 

    }

    public void addTopic(topic topic ){
        topics.add(topic); 
    }
    public void updateTopic(topic topic , String id){
        for(int i = 0 ; i <topics.size(); i++){
            topic t = topics.get(i);
                if(t.getId().equals(id)){
                    topics.set(i, topic);
                    return ; 
                }
        }
    }

    public void deleteTopic(String id){
        topics.removeIf(t-> t.getId().equals(id)); 
    }
}
