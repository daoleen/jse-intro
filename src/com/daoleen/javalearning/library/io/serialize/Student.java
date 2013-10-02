package com.daoleen.javalearning.library.io.serialize;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/29/13
 * Time: 12:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Student implements Serializable {
    private String name;
    private int group;
    private float averageBall;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public float getAverageBall() {
        return averageBall;
    }

    public void setAverageBall(float averageBall) {
        this.averageBall = averageBall;
    }

    public Student() { }

    public Student(String name, int group, float averageBall) {
        this.name = name;
        this.group = group;
        this.averageBall = averageBall;
    }
}
