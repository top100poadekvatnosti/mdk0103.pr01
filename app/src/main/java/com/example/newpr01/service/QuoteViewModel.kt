package com.example.newpr01.service


import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newpr01.data.Quote
import kotlinx.coroutines.launch

class QuoteViewModel: ViewModel() {
    fun createQuote(quote: Quote) {
        viewModelScope.launch {
            try {
                val addedQuote = RetrofitClient.quoteApi.addQuote(quote)
                Log.d(
                    "createQuote",
                    "Цитата -> ${addedQuote.quote}\n " +
                            "Автор -> ${addedQuote.author}\n "
                )
            } catch (ex: Exception) {
                Log.e("createQuote", ex.message.toString())
            }
        }
    }
}