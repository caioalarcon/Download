package com.example.download

interface DownloadListener {
    fun onStart() // Download Start
    fun onProgress(progress: Int) // Download progress
    fun onFinish(path: String?) // Download complete
    fun onFail(errorInfo: String?) // Download failed
}