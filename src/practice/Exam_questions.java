package practice;

public class Exam_questions {

//    @@ -1,7 +0,0 @@
//package com.examquestions.examquestions;
//
//import java.util.Objects;
//
//public class Question {
//
//}
// 26
//src/main/java/com/examquestions/examquestions/controller/ExamController.java
//Viewed
//@@ -0,0 +1,26 @@
//package com.examquestions.examquestions.controller;
//
//import com.examquestions.examquestions.model.Question;
//import com.examquestions.examquestions.service.ExaminerService;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Collection;
//
//@RestController
//@RequestMapping
//public class ExamController {
//
//    private final ExaminerService examinerService;
//
//    public ExamController(ExaminerService examinerService) {
//        this.examinerService = examinerService;
//    }
//
//    @GetMapping("/get/{amount}")
//    Collection<Question> getAllQuestions(@PathVariable int amount) {
//        return examinerService.getQuestions(amount);
//    }
//}
// 38
//src/main/java/com/examquestions/examquestions/controller/JavaQuestionController.java
//Viewed
//@@ -0,0 +1,38 @@
//package com.examquestions.examquestions.controller;
//
//import com.examquestions.examquestions.model.Question;
//import com.examquestions.examquestions.service.QuestionService;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Collection;
//
//@RestController
//@RequestMapping("/java")
//public class JavaQuestionController {
//
//    private final QuestionService javaQuestionService;
//
//    public JavaQuestionController(QuestionService javaQuestionService) {
//        this.javaQuestionService = javaQuestionService;
//    }
//
//    @GetMapping("/add")
//    public Question add(@RequestParam String question, @RequestParam String answer) {
//        return javaQuestionService.add(question, answer);
//    }
//
//    @GetMapping("/remove")
//    public Question remove(@RequestParam String question, @RequestParam String answer) {
//        return javaQuestionService.remove(question, answer);
//    }
//
//    @GetMapping()
//    public Collection<Question> getAllQuestions() {
//        return javaQuestionService.getAll();
//    }
//
//}
//
// 18
//...main/java/com/examquestions/examquestions/exceptions/InvalidAmountQuestionsException.java
//Viewed
//@@ -0,0 +1,18 @@
//package com.examquestions.examquestions.exceptions;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//@ResponseStatus(HttpStatus.BAD_REQUEST)
//public class InvalidAmountQuestionsException extends RuntimeException{
//
//    public static String DEFAULT_MESSAGE = "Invalid amount of questions";
//
//    public InvalidAmountQuestionsException() {
//        this(DEFAULT_MESSAGE);
//    }
//
//    public InvalidAmountQuestionsException(String message) {
//        super(message);
//    }
//}
// 46
//src/main/java/com/examquestions/examquestions/model/Question.java
//Viewed
//@@ -0,0 +1,46 @@
//package com.examquestions.examquestions.model;
//
//import java.util.Objects;
//
//public class Question {
//
//    private final String question;
//    private final String answer;
//
//    public Question(String question, String answer) {
//        this.question = question;
//        this.answer = answer;
//    }
//
//    public String getQuestion() {
//        return question;
//    }
//
//    public String getAnswer() {
//        return answer;
//    }
//
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Question question1 = (Question) o;
//        return Objects.equals(question, question1.question) && Objects.equals(answer, question1.answer);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(question, answer);
//    }
//
//
//    @Override
//    public String toString() {
//        return "Question{" +
//                "question='" + question + '\'' +
//                ", answer='" + answer + '\'' +
//                '}';
//    }
//
//}
// 11
//src/main/java/com/examquestions/examquestions/service/ExaminerService.java
//Viewed
//@@ -0,0 +1,11 @@
//package com.examquestions.examquestions.service;
//
//import com.examquestions.examquestions.model.Question;
//
//import java.util.Collection;
//
//public interface ExaminerService {
//
//    Collection<Question> getQuestions(int questionsAmount);
//
//}
// 19
//src/main/java/com/examquestions/examquestions/service/QuestionService.java
//Viewed
//@@ -0,0 +1,19 @@
//package com.examquestions.examquestions.service;
//
//import com.examquestions.examquestions.model.Question;
//
//import java.util.Collection;
//
//public interface QuestionService {
//
//    Question add(String question, String answer);
//    Question remove(String question, String answer);
//
//    Collection<Question> getAll();
//
//    Question getRandomQuestion();
//
//    int getSize();
//
//
//}
// 37
//src/main/java/com/examquestions/examquestions/service/impl/ExaminerServiceImpl.java
//Viewed
//@@ -0,0 +1,37 @@
//package com.examquestions.examquestions.service.impl;
//
//import com.examquestions.examquestions.exceptions.InvalidAmountQuestionsException;
//import com.examquestions.examquestions.model.Question;
//import com.examquestions.examquestions.service.ExaminerService;
//import com.examquestions.examquestions.service.QuestionService;
//import org.springframework.stereotype.Service;
//
//import java.util.Collection;
//import java.util.HashSet;
//import java.util.Set;
//
//@Service
//public class ExaminerServiceImpl implements ExaminerService {
//
//    public final QuestionService questionService;
//
//    public ExaminerServiceImpl(QuestionService questionService) {
//        this.questionService = questionService;
//    }
//
//
//    @Override
//    public Collection<Question> getQuestions(int questionsAmount) {
//        Set<Question> questions = new HashSet<>();
//        if (questionsAmount > questionService.getAll().size()) {
//            throw new InvalidAmountQuestionsException();
//        }
//        while(questions.size() != questionsAmount) {
//            questions.add(questionService.getRandomQuestion());
//        }
//        return questions;
//    }
//
//}
//
//
// 45
//src/main/java/com/examquestions/examquestions/service/impl/JavaQuestionServiceImpl.java
//Viewed
//@@ -0,0 +1,45 @@
//package com.examquestions.examquestions.service.impl;
//
//import com.examquestions.examquestions.model.Question;
//import com.examquestions.examquestions.service.QuestionService;
//import org.springframework.stereotype.Service;
//
//import java.util.*;
//
//@Service
//public class JavaQuestionServiceImpl implements QuestionService {
//
//    private final Set<Question> questionStorage = new HashSet<>();
//    private final Random random = new Random();
//
//    @Override
//    public Question add(String question, String answer) {
//        Question newQuestion = new Question(question, answer);
//        questionStorage.add(newQuestion);
//        return newQuestion;
//
//    }
//
//    @Override
//    public Question remove(String question, String answer) {
//        Question removeQuestion = new Question(question, answer);
//        questionStorage.remove(removeQuestion);
//        return removeQuestion;
//
//    }
//
//    @Override
//    public Collection<Question> getAll() {
//        return Set.copyOf(questionStorage);
//    }
//
//    @Override
//    public Question getRandomQuestion() {
//        return List.copyOf(questionStorage).get(random.nextInt(questionStorage.size()));
//    }
//
//    @Override
//    public int getSize() {
//        return questionStorage.size();
//    }
//}
// 2
//src/main/resources/application.properties
//Viewed
//@@ -1 +1 @@
//
//server.servlet.context-path=/exam
// 27
//src/test/java/com/examquestions/examquestions/ConstantsTest.java
//Viewed
//@@ -0,0 +1,27 @@
//package com.examquestions.examquestions;
//
//import com.examquestions.examquestions.model.Question;
//
//import java.util.Collection;
//import java.util.Set;
//
//public class ConstantsTest {
//
//    public static final String QUESTION_1 = "Question one";
//    public static final String QUESTION_2 = "Question two";
//    public static final String QUESTION_3 = "Question tree";
//
//    public static final String ANSWER_1 = "Answer one";
//    public static final String ANSWER_2 = "Answer two";
//    public static final String ANSWER_3 = "Answer tree";
//
//
//    public static final Question FIRST_QUESTION_ANSWER = new Question(QUESTION_1, ANSWER_1);
//    public static final Question SECOND_QUESTION_ANSWER = new Question(QUESTION_2, ANSWER_2);
//    public static final Question THIRD_QUESTION_ANSWER = new Question(QUESTION_3, ANSWER_3);
//
//    public static final Set<Question> QUESTION_SET = Set.of(FIRST_QUESTION_ANSWER, SECOND_QUESTION_ANSWER, THIRD_QUESTION_ANSWER);
//    public static final Collection<Question> QUESTIONS_1 = Set.of(FIRST_QUESTION_ANSWER);
//
//
//}
// 42
//src/test/java/com/examquestions/examquestions/ExaminerServiceImplTest.java
//Viewed
//@@ -0,0 +1,42 @@
//package com.examquestions.examquestions;
//
//import com.examquestions.examquestions.exceptions.InvalidAmountQuestionsException;
//import com.examquestions.examquestions.service.QuestionService;
//import com.examquestions.examquestions.service.impl.ExaminerServiceImpl;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.util.Set;
//
//import static com.examquestions.examquestions.ConstantsTest.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//public class ExaminerServiceImplTest {
//
//
//    @InjectMocks
//    private ExaminerServiceImpl out;
//    @Mock
//    public QuestionService questionService;
//
//
//    @Test
//    void shouldGetAllQuestions() {
//        when(questionService.getAll()).thenReturn(QUESTIONS_1);
//        when(questionService.getRandomQuestion()).thenReturn(FIRST_QUESTION_ANSWER);
//        assertEquals(questionService.getAll(), out.getQuestions(1));
//    }
//
//    @Test
//    void shouldThrowExceptionWhenNumberOfQuestionsExceeded() {
//        when(questionService.getAll()).thenReturn(Set.of(FIRST_QUESTION_ANSWER));
//        assertThrows(InvalidAmountQuestionsException.class,() ->out.getQuestions(3));
//    }
//
//}
// 52
//src/test/java/com/examquestions/examquestions/JavaQuestionServiceImplTest.java
//Viewed
//@@ -0,0 +1,52 @@
//package com.examquestions.examquestions;
//
//import com.examquestions.examquestions.model.Question;
//import com.examquestions.examquestions.service.impl.JavaQuestionServiceImpl;
//import org.junit.jupiter.api.Test;
//
//import static com.examquestions.examquestions.ConstantsTest.*;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class JavaQuestionServiceImplTest {
//    private JavaQuestionServiceImpl out = new JavaQuestionServiceImpl();
//
//
//    @Test
//    void shouldAddQuestion() {
//        Question expected = new Question(QUESTION_1, ANSWER_1);
//        assertEquals(expected, out.add(QUESTION_1, ANSWER_1));
//        assertEquals(1, out.getAll().size());
//        assertTrue(out.getAll().contains(expected));
//    }
//
//    @Test
//    void shouldRemoveQuestion() {
//        Question expected = new Question(QUESTION_1, ANSWER_1);
//        out.add(QUESTION_1, ANSWER_1);
//        assertEquals(1, out.getAll().size());
//        assertTrue(out.getAll().contains(expected));
//        assertEquals(expected, out.remove(QUESTION_1, ANSWER_1));
//        assertEquals(0, out.getAll().size());
//
//    }
//
//    @Test
//    void shouldGetAllQuestions() {
//        out.add(QUESTION_1, ANSWER_1);
//        out.add(QUESTION_2, ANSWER_2);
//        out.add(QUESTION_3, ANSWER_3);
//        assertEquals(QUESTION_SET, out.getAll());
//
//    }
//
//    @Test
//    void getRandomQuestion() {
//        out.add(QUESTION_1, ANSWER_1);
//        assertEquals(FIRST_QUESTION_ANSWER, out.getRandomQuestion());
//
//    }
//
//
//
//package com.examquestions.examquestions.controller;
//
//import com.examquestions.examquestions.model.Question;
//import com.examquestions.examquestions.service.ExaminerService;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Collection;
//
//@RestController
//@RequestMapping
//public class ExamController {
//
//    private final ExaminerService examinerService;
//
//    public ExamController(ExaminerService examinerService) {
//        this.examinerService = examinerService;
//    }
//
//    @GetMapping("/get/{amount}")
//    Collection<Question> getAllQuestions(@PathVariable int amount) {
//        return examinerService.getQuestions(amount);
//    }
//}
// 38
//src/main/java/com/examquestions/examquestions/controller/JavaQuestionController.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,38 @@
//package com.examquestions.examquestions.controller;
//
//import com.examquestions.examquestions.model.Question;
//import com.examquestions.examquestions.service.QuestionService;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Collection;
//
//@RestController
//@RequestMapping("/java")
//public class JavaQuestionController {
//
//    private final QuestionService javaQuestionService;
//
//    public JavaQuestionController(QuestionService javaQuestionService) {
//        this.javaQuestionService = javaQuestionService;
//    }
//
//    @GetMapping("/add")
//    public Question add(@RequestParam String question, @RequestParam String answer) {
//        return javaQuestionService.add(question, answer);
//    }
//
//    @GetMapping("/remove")
//    public Question remove(@RequestParam String question, @RequestParam String answer) {
//        return javaQuestionService.remove(question, answer);
//    }
//
//    @GetMapping()
//    public Collection<Question> getAllQuestions() {
//        return javaQuestionService.getAll();
//    }
//
//}
//
// 18
//...main/java/com/examquestions/examquestions/exceptions/InvalidAmountQuestionsException.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,18 @@
//package com.examquestions.examquestions.exceptions;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//@ResponseStatus(HttpStatus.BAD_REQUEST)
//public class InvalidAmountQuestionsException extends RuntimeException{
//
//    public static String DEFAULT_MESSAGE = "Invalid amount of questions";
//
//    public InvalidAmountQuestionsException() {
//        this(DEFAULT_MESSAGE);
//    }
//
//    public InvalidAmountQuestionsException(String message) {
//        super(message);
//    }
//}
// 46
//src/main/java/com/examquestions/examquestions/model/Question.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,46 @@
//package com.examquestions.examquestions.model;
//
//import java.util.Objects;
//
//public class Question {
//
//    private final String question;
//    private final String answer;
//
//    public Question(String question, String answer) {
//        this.question = question;
//        this.answer = answer;
//    }
//
//    public String getQuestion() {
//        return question;
//    }
//
//    public String getAnswer() {
//        return answer;
//    }
//
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Question question1 = (Question) o;
//        return Objects.equals(question, question1.question) && Objects.equals(answer, question1.answer);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(question, answer);
//    }
//
//
//    @Override
//    public String toString() {
//        return "Question{" +
//                "question='" + question + '\'' +
//                ", answer='" + answer + '\'' +
//                '}';
//    }
//
//}
// 11
//src/main/java/com/examquestions/examquestions/service/ExaminerService.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,11 @@
//package com.examquestions.examquestions.service;
//
//import com.examquestions.examquestions.model.Question;
//
//import java.util.Collection;
//
//public interface ExaminerService {
//
//    Collection<Question> getQuestions(int questionsAmount);
//
//}
// 19
//src/main/java/com/examquestions/examquestions/service/QuestionService.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,19 @@
//package com.examquestions.examquestions.service;
//
//import com.examquestions.examquestions.model.Question;
//
//import java.util.Collection;
//
//public interface QuestionService {
//
//    Question add(String question, String answer);
//    Question remove(String question, String answer);
//
//    Collection<Question> getAll();
//
//    Question getRandomQuestion();
//
//    int getSize();
//
//
//}
// 37
//src/main/java/com/examquestions/examquestions/service/impl/ExaminerServiceImpl.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,37 @@
//package com.examquestions.examquestions.service.impl;
//
//import com.examquestions.examquestions.exceptions.InvalidAmountQuestionsException;
//import com.examquestions.examquestions.model.Question;
//import com.examquestions.examquestions.service.ExaminerService;
//import com.examquestions.examquestions.service.QuestionService;
//import org.springframework.stereotype.Service;
//
//import java.util.Collection;
//import java.util.HashSet;
//import java.util.Set;
//
//@Service
//public class ExaminerServiceImpl implements ExaminerService {
//
//    public final QuestionService questionService;
//
//    public ExaminerServiceImpl(QuestionService questionService) {
//        this.questionService = questionService;
//    }
//
//
//    @Override
//    public Collection<Question> getQuestions(int questionsAmount) {
//        Set<Question> questions = new HashSet<>();
//        if (questionsAmount > questionService.getAll().size()) {
//            throw new InvalidAmountQuestionsException();
//        }
//        while(questions.size() != questionsAmount) {
//            questions.add(questionService.getRandomQuestion());
//        }
//        return questions;
//    }
//
//}
//
//
// 45
//src/main/java/com/examquestions/examquestions/service/impl/JavaQuestionServiceImpl.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,45 @@
//package com.examquestions.examquestions.service.impl;
//
//import com.examquestions.examquestions.model.Question;
//import com.examquestions.examquestions.service.QuestionService;
//import org.springframework.stereotype.Service;
//
//import java.util.*;
//
//@Service
//public class JavaQuestionServiceImpl implements QuestionService {
//
//    private final Set<Question> questionStorage = new HashSet<>();
//    private final Random random = new Random();
//
//    @Override
//    public Question add(String question, String answer) {
//        Question newQuestion = new Question(question, answer);
//        questionStorage.add(newQuestion);
//        return newQuestion;
//
//    }
//
//    @Override
//    public Question remove(String question, String answer) {
//        Question removeQuestion = new Question(question, answer);
//        questionStorage.remove(removeQuestion);
//        return removeQuestion;
//
//    }
//
//    @Override
//    public Collection<Question> getAll() {
//        return Set.copyOf(questionStorage);
//    }
//
//    @Override
//    public Question getRandomQuestion() {
//        return List.copyOf(questionStorage).get(random.nextInt(questionStorage.size()));
//    }
//
//    @Override
//    public int getSize() {
//        return questionStorage.size();
//    }
//}
// 2
//src/main/resources/application.properties
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -1 +1 @@
//
//server.servlet.context-path=/exam
// 27
//src/test/java/com/examquestions/examquestions/ConstantsTest.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,27 @@
//package com.examquestions.examquestions;
//
//import com.examquestions.examquestions.model.Question;
//
//import java.util.Collection;
//import java.util.Set;
//
//public class ConstantsTest {
//
//    public static final String QUESTION_1 = "Question one";
//    public static final String QUESTION_2 = "Question two";
//    public static final String QUESTION_3 = "Question tree";
//
//    public static final String ANSWER_1 = "Answer one";
//    public static final String ANSWER_2 = "Answer two";
//    public static final String ANSWER_3 = "Answer tree";
//
//
//    public static final Question FIRST_QUESTION_ANSWER = new Question(QUESTION_1, ANSWER_1);
//    public static final Question SECOND_QUESTION_ANSWER = new Question(QUESTION_2, ANSWER_2);
//    public static final Question THIRD_QUESTION_ANSWER = new Question(QUESTION_3, ANSWER_3);
//
//    public static final Set<Question> QUESTION_SET = Set.of(FIRST_QUESTION_ANSWER, SECOND_QUESTION_ANSWER, THIRD_QUESTION_ANSWER);
//    public static final Collection<Question> QUESTIONS_1 = Set.of(FIRST_QUESTION_ANSWER);
//
//
//}
// 42
//src/test/java/com/examquestions/examquestions/ExaminerServiceImplTest.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,42 @@
//package com.examquestions.examquestions;
//
//import com.examquestions.examquestions.exceptions.InvalidAmountQuestionsException;
//import com.examquestions.examquestions.service.QuestionService;
//import com.examquestions.examquestions.service.impl.ExaminerServiceImpl;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.util.Set;
//
//import static com.examquestions.examquestions.ConstantsTest.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//public class ExaminerServiceImplTest {
//
//
//    @InjectMocks
//    private ExaminerServiceImpl out;
//    @Mock
//    public QuestionService questionService;
//
//
//    @Test
//    void shouldGetAllQuestions() {
//        when(questionService.getAll()).thenReturn(QUESTIONS_1);
//        when(questionService.getRandomQuestion()).thenReturn(FIRST_QUESTION_ANSWER);
//        assertEquals(questionService.getAll(), out.getQuestions(1));
//    }
//
//    @Test
//    void shouldThrowExceptionWhenNumberOfQuestionsExceeded() {
//        when(questionService.getAll()).thenReturn(Set.of(FIRST_QUESTION_ANSWER));
//        assertThrows(InvalidAmountQuestionsException.class,() ->out.getQuestions(3));
//    }
//
//}
// 52
//src/test/java/com/examquestions/examquestions/JavaQuestionServiceImplTest.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,52 @@
//package com.examquestions.examquestions;
//
//import com.examquestions.examquestions.model.Question;
//import com.examquestions.examquestions.service.impl.JavaQuestionServiceImpl;
//import org.junit.jupiter.api.Test;
//
//import static com.examquestions.examquestions.ConstantsTest.*;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class JavaQuestionServiceImplTest {
//    private JavaQuestionServiceImpl out = new JavaQuestionServiceImpl();
//
//
//    @Test
//    void shouldAddQuestion() {
//        Question expected = new Question(QUESTION_1, ANSWER_1);
//        assertEquals(expected, out.add(QUESTION_1, ANSWER_1));
//        assertEquals(1, out.getAll().size());
//        assertTrue(out.getAll().contains(expected));
//    }
//
//    @Test
//    void shouldRemoveQuestion() {
//        Question expected = new Question(QUESTION_1, ANSWER_1);
//        out.add(QUESTION_1, ANSWER_1);
//        assertEquals(1, out.getAll().size());
//        assertTrue(out.getAll().contains(expected));
//        assertEquals(expected, out.remove(QUESTION_1, ANSWER_1));
//        assertEquals(0, out.getAll().size());
//
//    }
//
//    @Test
//    void shouldGetAllQuestions() {
//        out.add(QUESTION_1, ANSWER_1);
//        out.add(QUESTION_2, ANSWER_2);
//        out.add(QUESTION_3, ANSWER_3);
//        assertEquals(QUESTION_SET, out.getAll());
//
//    }
//
//    @Test
//    void getRandomQuestion() {
//        out.add(QUESTION_1, ANSWER_1);
//        assertEquals(FIRST_QUESTION_ANSWER, out.getRandomQuestion());
//
//    }
//}
}
