package com.springboot.app.builderPattern;

public class BuilderDemo {
    public static void main(String[] args) {
        User user = new User.UserBuilder().setId(1).setName("Fan").build();
        System.out.println(user);

        User user2 = new User.UserBuilder().setId(2).build();
        System.out.println(user2);
    }
}
class User{
    private int id;
    private String name;

    public User(UserBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static class UserBuilder{
        private int id;
        private String name;

        public UserBuilder setId(Integer id){
            this.id = id;
            return this;
        }

        public UserBuilder setName(String name){
            this.name = name;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }
}