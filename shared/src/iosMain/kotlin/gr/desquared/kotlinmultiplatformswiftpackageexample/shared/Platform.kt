package gr.desquared.kotlinmultiplatformswiftpackageexample.shared


import platform.UIKit.UIDevice

actual class Platform actual constructor() {
    actual val platform: String = "Hien dep trai " + UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}