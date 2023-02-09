package com.springboot.api.dto;

public class MemberDto {
    private String name;
    private String email;
    private String org;

    private String age;

    public String marry;

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail() {return email;}

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getAge(){return age;}
    public void setAge(String age){this.age=age;}

    public String getMarry(){return marry;}
    public void setMarry(String marry){this.marry=marry;}

    public String getOrg()
    {
        return org;
    }

    public void setOrg(String org)
    {
        this.org = org;
    }



    @Override
    public String toString()
    {
        return "MemberDto{" + "name='" + name + '\''+
                ", email ='" + email +'\''+
                ", org = '" + org + '\'' +
                ", age = '" + age + '\'' +
                ", marry = '"+marry + '\'' +
                '}';
    }

}
