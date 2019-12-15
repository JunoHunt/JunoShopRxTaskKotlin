package com.example.junoshopsrxtaskkotlin

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.act_task_two.*

class TaskTwoActivity : AppCompatActivity() {

    /***
     * Это задание имитирует загрузку родуктов, и поиск среди них.
     *
     * Вам необходимо реализовать следующее поведение:
     * 1. При старте активити сделать закрузку продуктов initProducts() в фоне
     * и после загрузки отобразить данные в act_task_two_answers_rv.
     * На время загрузки необходимо показывать прогресс
     * (можно использовать showProgress() и hideProgress())
     * 2. При вводе текста в act_task_two_query_et, если 2 секунды не было изменений,
     * то начинать поиск в массиве, который был проинициализированн в начале.
     * Условие для поиска, если название начинается с введенной строки
     * Результат поиска отобразить в act_task_two_answers_rv.
     * На время загрузки необходимо показывать прогресс
     * (можно использовать showProgress() и hideProgress())
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_task_two)
    }

    private fun initProducts(): List<String> {
        val alphabet = ArrayList<String>()
        var alphabetStart: Char = 'a'
        val alphabetEnd: Char = 'z'
        while (alphabetStart <= alphabetEnd) {
            alphabet.add(alphabetStart.toString())
            alphabetStart++
        }
        val products = ArrayList<String>()
        alphabet.forEach { let1 ->
            alphabet.forEach { let2 ->
                alphabet.forEach { let3 ->
                    alphabet.forEach { let4 ->
                        Log.d("APP_TAG", "let5 $let1$let2$let3$let4")
                        products.add("$let1$let2$let3$let4")
                    }
                }
            }
        }
        return products
    }

    private fun showProgress() {
        act_task_two_search_progress.visibility = View.VISIBLE
    }

    private fun hideProgress() {
        act_task_two_search_progress.visibility = View.GONE
    }

}