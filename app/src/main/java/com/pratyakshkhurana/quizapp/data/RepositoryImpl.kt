package com.pratyakshkhurana.quizapp.data

import com.pratyakshkhurana.quizapp.Question
import com.pratyakshkhurana.quizapp.domain.Repository

class RepositoryImpl : Repository {

    override fun fetchData(): ArrayList<Question> {
        val allQuestions = ArrayList<Question>()
        val q1 = Question(
            1,
            "Who invented C++ ?",
            "Dennis Ritchie",
            "Ken Thompson",
            "Brian Kernighan",
            "Bjarne Stroustrup",
            4
        )
        val q2 = Question(
            2,
            "Which of the following is the correct for including a user defined header files in C++ ?",
            "#include [userdefined]",
            "#include “userdefined”",
            "#include <userdefined.h>",
            "#include <userdefined>",
            2
        )
        val q3 = Question(
            3,
            "Which of the following is used for comments in C++ ?",
            "/* comment */",
            " // comment */",
            "// comment",
            "both // comment or /* comment */",
            4
        )
        val q4 = Question(
            4,
            "Which of the following is a correct identifier in C++ ?",
            " VAR_1234",
            " `$`var_name",
            "7VARNAME",
            " 7var_name",
            1
        )
        val q5 = Question(
            5,
            "Which of the following is not a type of Constructor in C++ ?",
            "Default constructor",
            "Parameterized constructor",
            "Copy constructor",
            "Friend constructor",
            4
        )
        val q6 = Question(
            6,
            "What is the size of wchar_t in C++ ?",
            "Based on the number of bits in the system",
            "2 or 4",
            "4",
            "2",
            1
        )
        val q7 = Question(
            7,
            "Which keyword is used to define the macros in C++ ?",
            "#macro",
            "#define",
            "macro",
            "define",
            2
        )
        val q8 = Question(
            8,
            "What is Inheritance in C++ ?",
            "Deriving new classes from existing classes",
            "Overloading of classes",
            "Classes with same names",
            "Wrapping of data into a single class",
            1
        )
        val q9 = Question(
            9,
            " Which of the following symbol is used to declare the preprocessor directives in C++ ?",
            "%",
            "^",
            "#",
            "*",
            3
        )
        val q10 = Question(
            10,
            "Which of the following constructors are provided by the C++ compiler if not defined in a class ?",
            "Copy constructor",
            "Default constructor",
            "Assignment constructor",
            "All of the mentioned",
            4
        )
        allQuestions.add(q1)
        allQuestions.add(q2)
        allQuestions.add(q3)
        allQuestions.add(q4)
        allQuestions.add(q5)
        allQuestions.add(q6)
        allQuestions.add(q7)
        allQuestions.add(q8)
        allQuestions.add(q9)
        allQuestions.add(q10)

        return allQuestions
    }
}