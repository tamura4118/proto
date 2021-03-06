package com.chavot.model;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "user")
public class User {

    private String id;
    private String name;
    private String address;
    private String test;

    public User(){

    }

    public User(String name, String address){
        this.test = name;
        this.address = address;
    }

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    public String getId()
    {
        return id;
    }

    @DynamoDBAttribute
    public String getName()
    {
        return name;
    }

    @DynamoDBAttribute
    public String getAddress()
    {
        return address;
    }

    @DynamoDBAttribute
    public String getTest()
    {
        return test;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }
}