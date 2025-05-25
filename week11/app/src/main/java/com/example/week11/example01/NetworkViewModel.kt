package com.example.week11.example01

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.jsoup.Jsoup

class NewsViewModel : ViewModel() {

    private val _newsList = mutableStateListOf<NewsData>()
    val newsList = _newsList

    private val _isLoading = mutableStateOf(false)
    val isLoading = _isLoading

    fun fetchNews() {
        _isLoading.value = true
        viewModelScope.launch {
            try {
                val fetchedNews = getNews()
                _newsList.clear()
                _newsList.addAll(fetchedNews)
            } catch (e: Exception) {
                Log.e("error", "fetch 관련 오류 발생", e)
            } finally{
                _isLoading.value = false
            }
        }
    }

    private suspend fun getNews(): List<NewsData> = withContext(Dispatchers.IO) {
        val doc = Jsoup.connect("https://news.daum.net")
            .userAgent("Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/135.0.0.0 Mobile Safari/537.36")
            .referrer("https://www.google.com")
            .timeout(10000)
            .get()

        Log.i("jsoup", doc.text())
        Log.i("jsoup", doc.html())

        val headlines = doc.select("ul.list_newsheadline2>li")
        headlines.mapNotNull { li ->
            val a = li.selectFirst("a") ?: return@mapNotNull null
            val title = a.select("strong.tit_txt").text()
            val link = a.absUrl("href")
            NewsData(title.toString(), link)
        }
    }
}
class MelonViewModel : ViewModel() {

    private val _songList = mutableStateListOf<SongData>()
    val songList = _songList

    private val _isLoading = mutableStateOf(false)
    val isLoading = _isLoading

    fun fetchSongs() {
        _isLoading.value = true
        viewModelScope.launch {
            try {
                val fetchedSongs = getSongs()
                _songList.clear()
                _songList.addAll(fetchedSongs)
            } catch (e: Exception) {
                Log.e("error", "fetch 관련 오류 발생", e)
            } finally{
                _isLoading.value = false
            }
        }
    }

    private suspend fun getSongs(): List<SongData> = withContext(Dispatchers.IO) {
        val doc = Jsoup.connect("https://www.melon.com/chart/index.htm")
            .userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/18.5 Safari/605.1.15")
            .referrer("https://www.google.com")
            .timeout(10000)
            .get()

        Log.i("jsoup", doc.text())
        Log.i("jsoup", doc.html())

        // 멜론차트 선택자 (실제 사이트 구조 확인 필요)
        val songs = doc.select("tr.lst50, tr.lst100")
        songs.mapNotNull { tr ->
            val title = tr.select(".wrap_song_info .ellipsis.rank01 a").first()?.text() ?: ""
            val artist = tr.select(".wrap_song_info .ellipsis.rank02 a").first()?.text() ?: ""
            if (title.isNotEmpty() && artist.isNotEmpty()) {
                SongData(title, artist)
            } else null
        }
    }
}