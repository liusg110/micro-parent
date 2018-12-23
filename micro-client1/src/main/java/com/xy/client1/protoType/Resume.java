package com.xy.client1.protoType;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: 原型模式，要使用Object的clone()方法，首先要实现对应的接口
 * @date ${date} ${time}
 * ${tags}
 */

/*问题：为什么要实现Cloneable才可以使用clone方法？背后的设计意图是什么？*/
public class Resume implements Cloneable{
    private String name;
    private String birthday;
    private String sex;
    private String school;
    private String timeArea;
    private String company;


    public Resume() {
        System.out.println("-------执行了空构造器");
    }

    /**
     * 构造函数：初始化简历赋值姓名
     */
    public Resume(String name){
        this.name = name;
    }

    /**
     * @desc 设定个人基本信息
     * @param birthday 生日
     * @param sex 性别
     * @param school 毕业学校
     * @return void
     */
    public void setPersonInfo(String birthday,String sex,String school){
        this.birthday = birthday;
        this.sex = sex;
        this.school = school;
    }

    /**
     * @desc 设定工作经历
     * @param timeArea 工作年限
     * @param company 所在公司
     * @return void
     */
    public void setWorkExperience(String timeArea,String company){
        this.timeArea = timeArea;
        this.company = company;
    }

    /**
     * 克隆该实例
     */
    public Object clone(){

        //fixme 此处为浅克隆，基本数据类型没问题，对于引用数据类型需要在后面加上对应的逻辑来实现深克隆
        //在克隆java对象的时候不会调用构造器
        //java提供一种叫浅拷贝（shallow copy）的默认方式实现clone，创建好对象的副本后然后通过赋值拷贝内容，
        // 意味着如果你的类包含引用类型，那么原始对象和克隆都将指向相同的引用内容，这是很危险的，
        // 因为发生在可变的字段上任何改变将反应到他们所引用的共同内容上。
        // 为了避免这种情况，需要对引用的内容进行深度克隆。

        Resume resume = null;
        try {
            resume = (Resume) super.clone();
            //fixme clone()方法，背后会判断是否继承了规定的接口，并调用native方法实现对象的创建，不走Java构造器
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return resume;
    }



    public void display(){
        System.out.println("姓名：" + name);
        System.out.println("生日:" + birthday + ",性别:" + sex + ",毕业学校：" + school);
        System.out.println("工作年限:" + timeArea + ",公司:" + company);
    }

}
