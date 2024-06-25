package com.pratyakshkhurana.quizapp.domain

import com.pratyakshkhurana.quizapp.Question

interface Repository {
    fun fetchData(): ArrayList<Question>
}