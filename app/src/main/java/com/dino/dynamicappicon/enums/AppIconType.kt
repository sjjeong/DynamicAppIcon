package com.dino.dynamicappicon.enums

enum class AppIconType(
    val alias: String,
    val text: String,
) {
    ORIGINAL(
        alias = "com.dino.dynamicappicon.MainActivity",
        text = "오리지널 아이콘"
    ),
    TOSS(
        alias = "com.dino.dynamicappicon.MainActivityToss",
        text = "토스 아이콘"
    ),
    KAKAOTALK(
        alias = "com.dino.dynamicappicon.MainActivityKakaotalk",
        text = "카카오톡 아이콘"
    ),
}