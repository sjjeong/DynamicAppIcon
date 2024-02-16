package com.dino.dynamicappicon

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.dino.dynamicappicon.enums.AppIconType
import com.dino.dynamicappicon.util.AppIconChangeHelper

@Composable
fun MainScreen() {
    val context = LocalContext.current
    Column {
        AppIconType.entries
            .forEach {
                Button(onClick = {
                    AppIconChangeHelper.changeEnabledComponent(
                        context = context,
                        appIconType = it,
                    )
                }) {
                    Text(text = it.text)
                }
            }
    }
}