package io.javabrains.bootquickstart;

public class topic {
    private String id;
    private String name ; 
    private String description ; 


    public topic(){ }

    public topic( String id, String name ,String description  ){

        this.id = id;
        this.name = name ; 
        this.description = description ; 
    }

    public String getId(){
        return id ;
    }

    public void setId(){
        this.id = id ;
    }

    
    public String getName(){
        return name ;
    }

    public void setName(){
        this.name = name ;
    }

    public String getDescription(){
        return description ;
    }

    public void setDescription(){
        this.description = description ;
    }
}
