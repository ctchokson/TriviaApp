package com.example.jettrivia.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.jettrivia.component.Questions


@Composable
fun TriviaHome(viewModel: QuestionsViewModel = hiltViewModel(), modifier: Modifier = Modifier){
    Questions(viewModel = viewModel, modifier)
}