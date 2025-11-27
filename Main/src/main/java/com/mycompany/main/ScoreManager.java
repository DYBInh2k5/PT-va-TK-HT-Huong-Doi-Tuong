/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.List;

public class ScoreManager {
    private List<Score> scores;

    public ScoreManager() {
        scores = new ArrayList<>();
    }

    public void addScore(Score score) {
        scores.add(score);
    }

    public void displayScores() {
        for (Score score : scores) {
            System.out.println(score);
        }
    }

    public void displayScoresByStudentName(String studentName) {
        boolean found = false;
        for (Score score : scores) {
            if (score.getStudent().getName().equalsIgnoreCase(studentName)) {
                System.out.println(score);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên có tên: " + studentName);
        }
    }

    public void updateScore(String studentName, String subjectCode, double newScore) {
        boolean found = false;
        for (Score score : scores) {
            if (score.getStudent().getName().equalsIgnoreCase(studentName) &&
                score.getSubject().getCode().equalsIgnoreCase(subjectCode)) {
                score = new Score(score.getStudent(), score.getSubject(), newScore);
                found = true;
                System.out.println("Điểm đã được cập nhật: " + score);
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy điểm cho sinh viên " + studentName + " trong môn " + subjectCode);
        }
    }
}