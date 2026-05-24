package com.example.mylab.data

import androidx.annotation.DrawableRes
import com.example.mylab.R

data class Book(
    val id: String,
    val title: String,
    val author: String,
    val year: Int,
    val pages: Int,
    val description: String,
    @DrawableRes val imageRes: Int
)

val books = listOf(
    Book(
        id = "1",
        title = "Виноваты звёзды",
        author = "Джон Грин",
        year = 2012,
        pages = 320,
        description = "История любви Хейзел и Огастуса, которые встретились в группе поддержки больных раком.",
        imageRes = R.drawable.book1
    ),
    Book(
        id = "2",
        title = "Дневник памяти",
        author = "Николас Спаркс",
        year = 1996,
        pages = 288,
        description = "Классическая история любви Ноя и Элли, которые преодолели все преграды.",
        imageRes = R.drawable.book2
    ),
    Book(
        id = "3",
        title = "P.S. Я люблю тебя",
        author = "Сесилия Ахерн",
        year = 2004,
        pages = 512,
        description = "После смерти мужа Холли получает от него письма, которые помогают ей жить дальше.",
        imageRes = R.drawable.book3
    ),
    Book(
        id = "4",
        title = "До встречи с тобой",
        author = "Джоджо Мойес",
        year = 2012,
        pages = 528,
        description = "Лу Кларк становится сиделкой парализованного Уилла Трейнора.",
        imageRes = R.drawable.book4
    ),
    Book(
        id = "5",
        title = "Один день",
        author = "Дэвид Николлс",
        year = 2009,
        pages = 448,
        description = "История Эммы и Декстера на протяжении 20 лет.",
        imageRes = R.drawable.book5
    )
)