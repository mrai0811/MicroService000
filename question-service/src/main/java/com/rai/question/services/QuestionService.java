package com.rai.question.services;

import com.rai.question.entities.Question;

import java.util.List;

public interface QuestionService {

    Question create(Question question);

    List<Question> get();

    Question getOne(Long id);
    List<Question> getQuestionOfQuiz(Long quizId);
}
