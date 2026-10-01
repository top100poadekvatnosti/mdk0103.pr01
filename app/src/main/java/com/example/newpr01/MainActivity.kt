package com.example.newpr01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.newpr01.data.Posts
import com.example.newpr01.data.Products
import com.example.newpr01.data.Tags
import com.example.newpr01.viewmodel.PostViewModel
import com.example.newpr01.viewmodel.ProductViewModel
import com.example.newpr01.viewmodel.RecipeViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //val todoViewModel: TodoViewModel = viewModel()
            //todoViewModel.fetchTodos()
//---------------------------------------------------------------------
//            val postViewModel: PostViewModel = viewModel()
//            val post = Posts(
//                name = "Уют в каждой детали: встречайте нашу новинку!",
//                text = "Мы знаем, как важно возвращаться туда, где тепло и спокойно. Наша новая коллекция ароматических свечей из соевого воска создана именно для таких моментов.",
//                tag = listOf(Tags("декор дома"),
//                    Tags("уют в доме"),
//                    Tags("аромасвечи"),
//                    Tags("подарок девушке"),
//                    Tags("ручная работа"),
//                    Tags("новинка")
//                )
//            )
//            postViewModel.createPost(post)
//---------------------------------------------------------------------
//            val productViewModel: ProductViewModel = viewModel()
//            productViewModel.fetchAndUpdateProduct()
//---------------------------------------------------------------------
            val recipeViewModel : RecipeViewModel = viewModel()
            recipeViewModel.deleteRecipeById(30)
        }
    }
}