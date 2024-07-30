package com.rai.quiz.services;

import com.rai.quiz.entities.Quiz;

import java.util.List;

public interface QuizService {
    Quiz add (Quiz quiz);
    List<Quiz> get();
    Quiz get(Long id);
}
