package com.dino.dynamicappicon.util

import android.content.ComponentName
import android.content.Context
import android.content.pm.PackageManager
import com.dino.dynamicappicon.enums.AppIconType

object AppIconChangeHelper {

    fun changeEnabledComponent(
        context: Context,
        appIconType: AppIconType,
    ) {
        val packageManager = context.packageManager
        packageManager.setComponentEnabledSetting(
            ComponentName(context, appIconType.alias),
            PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
            PackageManager.DONT_KILL_APP
        )

        AppIconType.entries
            .filter { it != appIconType }
            .forEach {
                packageManager.setComponentEnabledSetting(
                    ComponentName(context, it.alias),
                    PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                    PackageManager.DONT_KILL_APP
                )
            }
    }
}