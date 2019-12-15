package com.example.junoshopsrxtaskkotlin

import android.os.Bundle
import android.util.Patterns
import androidx.appcompat.app.AppCompatActivity

class TaskOneActivity : AppCompatActivity() {

    /**
     * В этом задании вам необходимо реализовать валидацию
     * полей для авторизации с помощью RxJava
     * Необходимл реализовать следующее поведение:
     * Кнопка act_task_one_login_btn становиться активной только если:
     * текст из act_task_one_email_et проходит проверку isEmailValid
     * и текст из act_task_one_password_et проходит проверку isPasswordValid
     *
     * Дополнительно: показывать ошибку в случае если поле не проходит проверку
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_task_one)
    }

    private fun isEmailValid(email: String): Boolean =
        Patterns.EMAIL_ADDRESS.matcher(email).matches()


    private fun isPasswordValid(password: String): Boolean =
        password.length > 4
}