package test;


public class Student {
    private String name;
    private String sex;
    private int age;

    public Student(){
        System.out.println("你好");
    }
    public Student(String name, String sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
        System.out.println("我是" + name + ",性别" + sex + ",今年" + age + "岁了");
    }
}

