package com.example.download

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var teste = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        download("https://releases.ubuntu.com/22.04/ubuntu-22.04-desktop-amd64.iso","/data/data/com.example.download/ubuntu.iso")
    }

    fun download(url:String, path:String){

        DownloadUtil.download(url, path, object : DownloadListener {
            override fun onStart() {
                println("Download: iniciei!")

            }

            override fun onProgress(progress: Int) {
                val prog = progress.toFloat()/100
                println("Download: progress: $prog")
            }

            override fun onFinish(path: String?) {
                println("Download: finish: $path")
            }

            override fun onFail(errorInfo: String?) {
                println("Download: deu merda meu parceiro: $errorInfo")
            }
        })
    }


}