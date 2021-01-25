package com.example.triviazilla

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(1, "Which country consumes the most chocolate per capita? Hint: Favarger chocolates are from here.",
        R.drawable.ques1,
            "Argentina",
            "Australia",
            "Switzerland",
            "India",
            3
        )
        questionsList.add(que1)

        val que2 = Question(2, "How many of the speeches in Shakespeare's plays are recited by women?",
            R.drawable.ques2,
            "33%",
            "17%",
            "52%",
            "68%",
            2
        )
        questionsList.add(que2)

        val que3 = Question(3, "In which country was the largest-known Tyrannosaurus rex skeleton found?",
            R.drawable.ques3,
            "Argentina",
            "Australia",
            "Canada",
            "Germany",
            3
        )
        questionsList.add(que3)

        val que4 = Question(4, "Which country has the oldest continuously used national flag?",
            R.drawable.ques4,
            "Denmark",
            "Australia",
            "Switzerland",
            "Argentina",
            1
        )
        questionsList.add(que4)

        val que5 = Question(5, "Which country has the most fresh water?",
            R.drawable.ques5,
            "India",
            "Australia",
            "Spain",
            "Brazil",
            4
        )
        questionsList.add(que5)

        val que6 = Question(6, "How many kinds of apples are grown around the world?",
            R.drawable.ques6,
            "125",
            "1278",
            "4000",
            "7500",
            4
        )
        questionsList.add(que6)

        val que7 = Question(7, "What country is nicknamed the 'Land of a Thousand Smiles?'",
            R.drawable.ques7,
            "Thailand",
            "China",
            "India",
            "Ethipoia",
            1
        )
        questionsList.add(que7)

        val que8 = Question(8, "Name the number that is three more than one-fifth of one-tenth of one-half of 5,000.",
            R.drawable.ques8,
            "503",
            "103",
            "53",
            "108",
            3
        )
        questionsList.add(que8)

        val que9 = Question(9, "What's the oldest continuously inhabited city in the world?",
            R.drawable.ques9,
            "Istanbul, Turkey",
            "Athens, Greece",
            "Jerusalem",
            "Damascus, Syria",
            4
        )
        questionsList.add(que9)

        val que10 = Question(10, "Which of these cars did James Bond did not drive in any of the James Bond films?",
            R.drawable.ques10,
            "Bentley",
            "Toyota",
            "Acura",
            "Mercury",
            3
        )
        questionsList.add(que10)

        return questionsList
    }
}