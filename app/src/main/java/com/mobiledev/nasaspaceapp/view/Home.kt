package com.mobiledev.nasaspaceapp.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.mobiledev.nasaspaceapp.R

class HomeFragment : Fragment() {

    private lateinit var web3D: WebView
    companion object {
        private const val LOCALHOST_URL = "https://dumitrux.github.io/solar-system-threejs/"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        web3D = view.findViewById(R.id.web3D)
        web3D.settings.javaScriptEnabled = true
        web3D.webViewClient = WebViewClient()
        web3D.webChromeClient = WebChromeClient()
        web3D.loadUrl(LOCALHOST_URL)
        return view
    }
}
