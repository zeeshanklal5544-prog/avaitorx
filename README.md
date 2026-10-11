# Aviator Trends Analyzer

Native Android app for **on-device, historical** multiplier collection and analysis. It does not predict future multipliers, automate betting, or interact with wagering controls.

## Features
- OCR-only multiplier collection through user-authorized screen capture; **no manual-entry feature**.
- Local persistent history with duplicate suppression for repeated OCR frames.
- Mean, median, min/max, and multiplier bucket distributions.
- Explicit MediaProjection consent flow and foreground notification service.
- Draggable floating overlay entry point with clear monitoring status.
- OCR-ready multiplier parser with decimal-comma support.
- No screenshots, credentials, or account data are uploaded.

## Build
Install Android Studio or SDK 35. Run `gradle wrapper --gradle-version 8.10.2` once, then `./gradlew assembleDebug`. APK: `app/build/outputs/apk/debug/app-debug.apk`.

If local Android SDK tooling is unavailable, push this project to GitHub. The included workflow builds the debug APK and exposes it as a downloadable artifact.

## Permissions
Tap **Open floating overlay**, then enable “Display over other apps”. Tap **Grant screen capture & start monitoring** and accept Android’s system consent dialog. Results are intended to enter the history only through the authorized OCR monitoring flow.

## Limitations
This compact MVP keeps persistence dependency-free for reliable offline builds. A production release should replace the JSON store with Room migrations and connect ML Kit’s TextRecognizer to an ImageReader frame pipeline with a tuned region of interest and uncertain-result review. Never treat historical statistics as a guarantee or safe betting signal.
