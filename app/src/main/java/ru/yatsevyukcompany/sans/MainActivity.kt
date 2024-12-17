package ru.yatsevyukcompany.sans

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val SayBtn = findViewById<Button>(R.id.buttonSay)
        val SayTxt = findViewById<TextView>(R.id.textViewSay)

        SayBtn.setOnClickListener{
            val phrases = listOf(
            "Умирают только геи...."                    ,
            "Папирус... находит сложности в интересных местах. Вчера он загнал себя в тупик пытаясь «решить» гороскоп.",
            "Что ж, попытка не пытка, я всегда знал что мы не были настоящими друзьями, не говори это другим сансам, ладно?",
            "Однажды ты сделал всё, как надо.",
            "Какой прекрасный день.\n" +
                    "Птицы поют, цветы цветут...\n" +
                    "В такие дни дети, как ты\n" +
                    "Должны гореть в аду.",
            "Да тебя слили!!! Если мы действительно друзья, ты не станешь сюда возвращаться.",
            "Должен сказать, что я неплохо справляюсь. Смотри, ты здесь, и даже ни разу не умер!... Хватит так смотреть, я что, неправ?",
            "Какой чудесный на улице день: птички поют, цветочки благоухают. В такие дни дети, как ты, ДОЛЖНЫ ГОРЕТЬ В АДУ!",
                "Иногда, неплохо иметь кого-то, кто заставляет тебя не лениться.",
                "Так что, эм, эй... Даже если мы тут внизу не сдаемся, то и ты не смей сдаваться, где бы ты ни был, окей?",
                "Ха! Никогда не понимал, почему люди не используют в начале самую сильную атаку.",
                "Давай-ка позовём всех твоих друзей на большую шумную вечеринку. Там будет пирог, и хот-доги, и... хммм... стоп... что-то не так. У тебя нет друзей.")

            val shuffledList = phrases.shuffled()


            SayTxt.text = shuffledList[0]


        }

    }
}