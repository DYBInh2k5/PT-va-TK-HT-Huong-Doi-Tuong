/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author User
 */
public class Score {
    private Student student;
    private Subject subject;
    private double score;

    public Score(Student student, Subject subject, double score) {
        this.student = student;
        this.subject = subject;
        this.score = score;
    }

    public Student getStudent() {
        return student;
    }

    public Subject getSubject() {
        return subject;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "student=" + student +
                ", subject=" + subject +
                ", score=" + score +
                '}';
    }
}
